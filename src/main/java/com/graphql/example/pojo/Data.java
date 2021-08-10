package com.graphql.example.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data<T> {

    @JsonProperty("company")
    private T company;

    public T getCompany() {
        return company;
    }
}