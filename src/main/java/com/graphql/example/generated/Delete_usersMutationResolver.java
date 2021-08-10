package com.graphql.example.generated;

/**
 * delete data from the table: "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public interface Delete_usersMutationResolver {

    /**
     * delete data from the table: "users"
     */
    Users_mutation_response delete_users(@javax.validation.constraints.NotNull Users_bool_exp where) throws Exception;

}
