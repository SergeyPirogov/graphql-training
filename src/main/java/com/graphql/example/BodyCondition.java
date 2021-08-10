package com.graphql.example;

import io.restassured.response.Response;
import org.hamcrest.Matcher;

class BodyCondition extends Condition {

    private final String jsonPath;
    private final Matcher<?> matcher;

    BodyCondition(String jsonPath, Matcher<?> matcher) {
        this.jsonPath = jsonPath;
        this.matcher = matcher;
    }

    @Override
    void match(Response response) {
        response.then().assertThat().
                body(jsonPath, matcher);
    }
}
