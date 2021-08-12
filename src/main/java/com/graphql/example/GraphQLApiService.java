package com.graphql.example;

import com.graphql.example.advanced.GraphQLResponse;
import com.graphql.example.generated.Users;

import java.util.List;
import java.util.Map;

public class GraphQLApiService {

    private GraphQLClientAdvanced graphQLClient;

    public GraphQLApiService(GraphQLClientAdvanced graphQLClient) {
        this.graphQLClient = graphQLClient;
    }

    public GraphQLResponse getCompanyInfo() {
        return graphQLClient.executeGql("company.gql");
    }

    public List<Users> getUsers(Map<String, Integer> limit) {
        return graphQLClient.executeGql("users.gql", limit)
                .then()
                .asList(Users.class);
    }
}
