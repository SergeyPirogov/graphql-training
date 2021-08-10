package com.graphql.example;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;


public class GraphQLClient {

    private final String url;
    private final RequestSpecification requestSpecification = given().
            contentType(ContentType.JSON)
            .filters(new ResponseLoggingFilter());

    public GraphQLClient(String url) {
        this.url = url;
    }

    public AssertableResponse execute(GraphQLQuery query) {
        return AssertableResponse.response(requestSpecification.
                body(query).
                post(url));
    }

    public Response execute(String query) {
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .body(query)
                .when()
                .post(url);
    }

}
