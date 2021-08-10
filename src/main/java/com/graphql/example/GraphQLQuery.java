package com.graphql.example;

public class GraphQLQuery {

    private String query;
    private Object variables;

    public GraphQLQuery(String query, Object variables) {
        this.query = query;
        this.variables = variables;
    }

    public GraphQLQuery(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public Object getVariables() {
        return variables;
    }
}
