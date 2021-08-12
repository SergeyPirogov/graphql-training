package com.graphql.example;

import com.google.common.io.Resources;
import io.qameta.allure.Step;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Objects;

import static com.google.common.io.Resources.getResource;

public class GqlUtils {

    public static GraphQLQuery readGql(String name) {
        return gql(readFile(name));
    }

    public static GraphQLQuery readGql(String name, Object variables) {
        return gql(readFile(name), variables);
    }

    private static String readFile(String name) {
//        try {
//            return Resources.toString(getResource(name), Charset.defaultCharset());
//        } catch (IOException e) {
//            throw new RuntimeException("Unable to read " + name);
//        }

        URL url = GqlUtils.class
                .getClassLoader()
                .getResource(name);

        File file = new File(Objects.requireNonNull(url).getFile());
        try {
            return new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            throw new RuntimeException("Unable to read " + name);
        }
    }

    @Step
    public static GraphQLQuery gql(String queryString) {
        return new GraphQLQuery(queryString);
    }

    public static GraphQLQuery gql(String queryString, Object variables) {
        return new GraphQLQuery(queryString, variables);
    }
}
