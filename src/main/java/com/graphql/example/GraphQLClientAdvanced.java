package com.graphql.example;

import com.graphql.example.advanced.GraphQLResponse;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static com.graphql.example.GqlUtils.readGql;
import static io.restassured.RestAssured.given;

public class GraphQLClientAdvanced {

    private final String url;
    private final RequestSpecification requestSpecification = given().
            contentType(ContentType.JSON)
            .filters(new ResponseLoggingFilter());

    public GraphQLClientAdvanced(String url) {
        this.url = url;
    }

    private Response runQuery(GraphQLQuery query) {
        return requestSpecification
                .body(query)
                .post(url);
    }

    public GraphQLResponse executeGql(String name) {
        var query = readGql(name);
        return new GraphQLResponse(runQuery(query));
    }

    public GraphQLResponse executeGql(String name, Object variables) {
        var query = readGql(name, variables);
        return new GraphQLResponse(runQuery(query));
    }
}
