package com.graphql.example.tests.clean;

import com.graphql.example.GraphQLClient;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static com.graphql.example.GqlUtils.readGql;
import static java.util.Map.of;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FirstGraphQLTestClient {

    private final GraphQLClient graphQLClient = new GraphQLClient("https://api.spacex.land/graphql/");

    @Test
    void testCanGetCeoWithQuery() {
        var query = readGql("company.gql");
        graphQLClient.execute(query).then()
                .body("data.company.ceo", equalTo("Elon Musk"));
    }

    @Test
    void testCanGetCeoWithQueryGql() {
        graphQLClient.executeGql("company.gql").then()
                .body("data.company.ceo", equalTo("Elon Musk"));
    }

    @Test
    void testCanGetUsersList() {
        Map<String, Integer> variables = of("limit", 1);
        List<Object> users = graphQLClient.executeGql("users.gql", variables).then()
                .extract().jsonPath().getList("data.users");
        assertThat(users.size(), equalTo(1));
    }

    @Test
    void testCanGetUseByName() {
        Map<?, ?> variables = of("where",
                of("name",
                        of("_like", "%Mask")));

        List<Object> users = graphQLClient.executeGql("user_by_condition.gql", variables).then()
                .extract().jsonPath().getList("data.users");
        assertThat(users.size(), equalTo(1));
    }
}
