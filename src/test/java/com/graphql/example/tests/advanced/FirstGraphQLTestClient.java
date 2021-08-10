package com.graphql.example.tests.advanced;

import com.graphql.example.GraphQLClient;
import org.junit.jupiter.api.Test;

import static com.graphql.example.GqlUtils.readGql;
import static org.hamcrest.Matchers.equalTo;

public class FirstGraphQLTestClient {

    private final GraphQLClient graphQLClient = new GraphQLClient("https://api.spacex.land/graphql/");

    @Test
    void testCanGetCeoWithQuery() {
        var query = readGql("company");
        graphQLClient.execute(query).then()
                .body("data.company.ceo", equalTo("Elon Musk"));
    }

    @Test
    void testCanGetCeoWithQueryGql() {
        graphQLClient.executeGql("company").then()
                .body("data.company.ceo", equalTo("Elon Musk"));
    }
}
