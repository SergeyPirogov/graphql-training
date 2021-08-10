package com.graphql.example;

import io.restassured.response.Response;

abstract class Condition {
    abstract void match(Response response);
}
