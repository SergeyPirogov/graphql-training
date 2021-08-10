package com.graphql.example;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static com.graphql.example.GqlUtils.readGql;
import static io.restassured.RestAssured.given;


public class GraphQLClient {

    private final String url;
    private final RequestSpecification requestSpecification = given().
            contentType(ContentType.JSON)
            .filters(new ResponseLoggingFilter());

    public GraphQLClient(String url) {
        this.url = url;
    }

    public Response execute(GraphQLQuery query) {
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .body(query)
                .when()
                .post(url);
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

    public Response executeGql(String name) {
        var query = readGql(name);
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .body(query)
                .when()
                .post(url);
    }

}
