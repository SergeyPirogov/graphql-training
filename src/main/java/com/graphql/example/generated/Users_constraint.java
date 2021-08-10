package com.graphql.example.generated;

/**
 * unique or primary key constraints on table "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public enum Users_constraint {

    /**
     * unique or primary key constraint
     */
    users_pkey("users_pkey");

    private final String graphqlName;

    private Users_constraint(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
