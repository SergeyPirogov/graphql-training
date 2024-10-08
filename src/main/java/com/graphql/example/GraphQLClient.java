package com.graphql.example;

import com.graphql.example.advanced.GraphQLResponse;
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
        return requestSpecification
                .body(query)
                .post(url);
    }

    public Response execute(String query) {
        return requestSpecification
                .body(query)
                .post(url);
    }

    public Response executeGql(String name) {
        var query = readGql(name);
        return requestSpecification
                .body(query)
                .post(url);
    }

    public Response executeGql(String name, Object variables) {
        var query = readGql(name, variables);
        return requestSpecification
                .body(query)
                .post(url);
    }
}
