package com.graphql.example;

import org.hamcrest.Matcher;

public class Conditions {

    public static BodyCondition body(String jsonPath, Matcher<?> matcher) {
        return new BodyCondition(jsonPath, matcher);
    }
}
