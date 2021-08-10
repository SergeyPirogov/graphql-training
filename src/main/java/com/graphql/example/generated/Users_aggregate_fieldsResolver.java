package com.graphql.example.generated;

/**
 * Resolver for users_aggregate_fields
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public interface Users_aggregate_fieldsResolver {

    Integer count(Users_aggregate_fields users_aggregate_fields, @javax.validation.constraints.NotNull java.util.List<Users_select_column> columns, Boolean distinct) throws Exception;

}
