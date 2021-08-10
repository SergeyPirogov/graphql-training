package com.graphql.example.tests.client;

import com.graphql.example.GraphQLClient;
import com.graphql.example.GraphQLQuery;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static com.graphql.example.GqlUtils.gql;
import static org.hamcrest.Matchers.equalTo;

public class FirstGraphQLTestClient {

    private final GraphQLClient graphQLClient = new GraphQLClient("https://api.spacex.land/graphql/");


    @Test
    void testCanGetCeoWithClient() {
        var query = "{\"query\": \"{ company { employees name ceo coo }}\"}";
        graphQLClient.execute(query).then()
                .body("data.company.ceo", equalTo("Elon Musk"));
    }

    @Test
    void testCanGetCeoWithQuery() {
        var query = gql("{ company { employees name ceo coo }}");
        graphQLClient.execute(query).then()
                .body("data.company.ceo", equalTo("Elon Musk"));
    }
}
