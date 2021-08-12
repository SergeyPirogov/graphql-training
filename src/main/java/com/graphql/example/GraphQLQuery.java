package com.graphql.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class GraphQLQuery {

    private final String query;
    private Object variables;

//    public GraphQLQuery(String query) {
//        this.query = query;
//    }
//
//    public String getQuery() {
//        return query;
//    }
//
//    public Object getVariables() {
//        return variables;
//    }
}
