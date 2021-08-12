package com.graphql.example.tests.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphql.example.GraphQLApiService;
import com.graphql.example.GraphQLClientAdvanced;
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
import static org.hamcrest.Matchers.equalTo;

public class GraphQLApiServiceTest {

    private final GraphQLApiService api = new GraphQLApiService(new GraphQLClientAdvanced("https://api.spacex.land/graphql/"));


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
        api.getCompanyInfo()
                .then()
                .body("data.company.ceo", equalTo("Elon Musk"));
    }

    @Test
    void testCanGetUsersList() {
//        Map<String, Integer> limit = of("limit", 1);
        List<Users> users = api.getUsers(of("limit", 1));
        assertThat(users.size(), equalTo(1));
    }
}
