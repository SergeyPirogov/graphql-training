package com.graphql.example.generated;

/**
 * select columns of table "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public enum Users_select_column {

    /**
     * column name
     */
    id("id"),
    /**
     * column name
     */
    name("name"),
    /**
     * column name
     */
    rocket("rocket"),
    /**
     * column name
     */
    timestamp("timestamp"),
    /**
     * column name
     */
    twitter("twitter");

    private final String graphqlName;

    private Users_select_column(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
