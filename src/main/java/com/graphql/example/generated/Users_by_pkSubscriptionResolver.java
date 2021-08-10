package com.graphql.example.generated;

/**
 * fetch data from the table: "users" using primary key columns
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public interface Users_by_pkSubscriptionResolver {

    /**
     * fetch data from the table: "users" using primary key columns
     */
    Users users_by_pk(@javax.validation.constraints.NotNull String id) throws Exception;

}
