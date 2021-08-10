package com.graphql.example;

import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;


public class AssertableResponse {

    private final Response response;

    private AssertableResponse(Response response) {
        this.response = response;
    }

    public void assertThat(Condition condition) {
        condition.match(response);
    }

    public static AssertableResponse response(Response response) {
        return new AssertableResponse(response);
    }

    public String body() {
        return response.body().asPrettyString();
    }

    public <T> T as(Class<T> clazz) {
        return response.as(clazz);
    }

    public <T> T as(TypeRef<T> cls) {
        return response.as(cls);
    }

    public Response getRawResponse() {
        return response;
    }
}
