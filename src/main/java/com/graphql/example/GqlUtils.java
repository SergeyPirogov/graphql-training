package com.graphql.example;

import com.google.common.io.Resources;

import java.io.IOException;
import java.nio.charset.Charset;

import static com.google.common.io.Resources.getResource;

public class GqlUtils {

    public static GraphQLQuery readGql(String name) {
        try {
            return gql(Resources.toString(getResource(name + ".gql"), Charset.defaultCharset()));
        } catch (IOException e) {
            throw new RuntimeException("Unable to read " + name);
        }
    }

    public static GraphQLQuery readGql(String name, Object variables) {
        try {
            return gql(Resources.toString(getResource(name + ".gql"), Charset.defaultCharset()), variables);
        } catch (IOException e) {
            throw new RuntimeException("Unable to read " + name);
        }
    }

    public static GraphQLQuery gql(String queryString) {
        return new GraphQLQuery(queryString);
    }

    public static GraphQLQuery gql(String queryString, Object variables) {
        return new GraphQLQuery(queryString, variables);
    }
}
