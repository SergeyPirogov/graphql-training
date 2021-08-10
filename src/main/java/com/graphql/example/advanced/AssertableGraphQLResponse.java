package com.graphql.example.advanced;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.graphql.example.AssertableResponse;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.hamcrest.Matcher;

import java.util.List;

public class AssertableGraphQLResponse {

    private final Response response;

    public AssertableGraphQLResponse(Response response) {
        this.response = response;
    }

    public void body(String jsonPath, Matcher<?> matcher) {
        response.then().body(jsonPath, matcher);
    }

    public <T> List<T> asList(String jsonPath, Class<T> tClass) {
        return response.then().extract().jsonPath().getList(jsonPath, tClass);
    }

    public <T> List<T> asList(Class<T> tClass) {
        return response.then().extract().jsonPath().getList(getJsonPath(tClass), tClass);
    }

    public <T> T asPojo(Class<T> ref) {
        return response.then().extract().jsonPath().getObject(getJsonPath(ref), ref);
    }

    private String getJsonPath(Class<?> tClass) {
        JsonRootName rootName = tClass.getAnnotation(JsonRootName.class);
        String name = "data";
        if (rootName != null) {
            name += "." + rootName.value();
        } else {
            name += "." + tClass.getSimpleName().toLowerCase();
        }
        return name;
    }
}
