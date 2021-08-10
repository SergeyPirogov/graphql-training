package com.graphql.example.generated;

/**
 * insert data into the table: "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public interface Insert_usersMutationResolver {

    /**
     * insert data into the table: "users"
     */
    Users_mutation_response insert_users(@javax.validation.constraints.NotNull java.util.List<Users_insert_input> objects, Users_on_conflict on_conflict) throws Exception;

}
