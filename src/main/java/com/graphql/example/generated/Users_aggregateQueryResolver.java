package com.graphql.example.generated;

/**
 * fetch aggregated fields from the table: "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public interface Users_aggregateQueryResolver {

    /**
     * fetch aggregated fields from the table: "users"
     */
    @javax.validation.constraints.NotNull
    Users_aggregate users_aggregate(@javax.validation.constraints.NotNull java.util.List<Users_select_column> distinct_on, Integer limit, Integer offset, @javax.validation.constraints.NotNull java.util.List<Users_order_by> order_by, Users_bool_exp where) throws Exception;

}
