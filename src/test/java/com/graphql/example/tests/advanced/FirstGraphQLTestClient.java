package com.graphql.example.tests.advanced;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphql.example.GraphQLClientAdvanced;
import com.graphql.example.generated.Info;
import com.graphql.example.generated.Users;
import io.restassured.RestAssured;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static java.util.Map.of;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FirstGraphQLTestClient {

    private final GraphQLClientAdvanced graphQLClient = new GraphQLClientAdvanced("https://api.spacex.land/graphql/");

    @BeforeAll
    static void setUp() {
        RestAssured.config = RestAssuredConfig.config().objectMapperConfig(new ObjectMapperConfig().jackson2ObjectMapperFactory(
                (cls, charset) -> {
                    ObjectMapper om = new ObjectMapper().findAndRegisterModules();
                    om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    return om;
                }
        ));
    }

    @Test
    void testCanGetCeoWithQuery() {
        graphQLClient.executeGql("company.gql")
                .then()
                .body("data.company.ceo", equalTo("Elon Musk"));
    }

    @Test
    void testCanGetCeoWithQueryGql() {
        Info info = graphQLClient.executeGql("company.gql")
                .then()
                .asPojo(Info.class);

        assertThat(info.getCeo(), equalTo("Elon Musk"));
    }

    @Test
    void testCanGetUsersList() {
        Map<String, Integer> variables = of("limit", 1);
        List<Users> users = graphQLClient.executeGql("users.gql", variables)
                .then()
                .asList(Users.class);

        assertThat(users.size(), equalTo(1));
    }

    @Test
    void testCanGetUseByName() {
        Map<?, ?> variables = of("where",
                of("name",
                        of("_like", "%Mask")));

        List<Users> users = graphQLClient.executeGql("user_by_condition.gql", variables)
                .then()
                .asList(Users.class);
        assertThat(users.size(), equalTo(1));
    }

    @Test
    void testCanGetUseById() {
        Map<?, ?> variables = of("where",
                of("id",
                        of("_eq", "daa72c51-fd37-4aa5-924c-e3e357e4c1f4")));

        List<Users> users = graphQLClient.executeGql("user_by_condition.gql", variables)
                .then()
                .asList(Users.class);
        assertThat(users.size(), equalTo(1));
    }

    @Test
    void testCanCreateUser() {
        var params = of("data", of("name", "Sergey"));
//        {
//            "data":{
//                    "name":"Sergey"
//                }
//        }

        graphQLClient.executeGql("create_user.gql", params)
                .then()
                .body("data.insert_users.returning[0].id", not(is(emptyString())));
    }
}
