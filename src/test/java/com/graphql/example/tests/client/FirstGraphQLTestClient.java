package com.graphql.example.tests.client;

import com.graphql.example.GraphQLClient;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class FirstGraphQLTestClient {

    private final GraphQLClient graphQLClient = new GraphQLClient("https://api.spacex.land/graphql/");

    @Test
    void testCanGetCeoWithClient() {
        var query = "\"query\": {\n" +
                "    company {\n" +
                "        employees\n" +
                "        name\n" +
                "        ceo\n" +
                "        coo\n" +
                "    }\n" +
                "}";

        graphQLClient.execute(query).then()
                .body("data.company.ceo", equalTo("Elon Mask"));
    }
}
