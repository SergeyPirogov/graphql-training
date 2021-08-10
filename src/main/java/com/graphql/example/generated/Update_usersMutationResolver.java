package com.graphql.example.generated;

/**
 * update data of the table: "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public interface Update_usersMutationResolver {

    /**
     * update data of the table: "users"
     */
    Users_mutation_response update_users(Users_set_input _set, @javax.validation.constraints.NotNull Users_bool_exp where) throws Exception;

}
