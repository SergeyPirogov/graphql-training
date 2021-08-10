package com.graphql.example;

import com.graphql.example.generated.Info;
import com.graphql.example.pojo.GraphQLResponse;
import com.google.common.io.Resources;
import io.restassured.common.mapper.TypeRef;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

import static com.google.common.io.Resources.getResource;
import static com.graphql.example.Conditions.body;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GraphQLTest {

//    private AssertableResponse query(String name) {
//        String string = null;
//        try {
//            string = Resources.toString(getResource(name + ".gql"), Charset.defaultCharset());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        GraphQLQuery query = new GraphQLQuery();
//        query.setQuery(string);
//
//        return AssertableResponse.response(given().
//                contentType(ContentType.JSON).
//                filters(new RequestLoggingFilter(), new ResponseLoggingFilter()).
//                body(query).
//                when().
//                post("https://api.spacex.land/graphql/"));
//    }
//
//    private AssertableResponse query(String name, Object variables) {
//        String string = null;
//        try {
//            string = Resources.toString(getResource(name + ".gql"), Charset.defaultCharset());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        GraphQLQuery query = new GraphQLQuery();
//        query.setQuery(string);
//        query.setVariables(variables);
//
//        return AssertableResponse.response(given().
//                contentType(ContentType.JSON).
//                body(query).
//                when().
//                post("https://api.spacex.land/graphql/").andReturn());
//    }
//
//
//    @Test
//    void testCanGetCompany() throws IOException {
//        var response = query("company");
//        response.assertThat(body("data.company.ceo", equalTo("Elon Musk")));
//        GraphQLResponse<Info> info = response.as(new TypeRef<>() {
//        });
//        System.out.println();
//    }
//
//    @Test
//    void testCanGetUsersList() {
//        Map<String, Integer> variables = Map.of("limit", 1);
//        var response = query("users", variables);
//        String body = response.body();
//        System.out.println(response);
//    }
}



