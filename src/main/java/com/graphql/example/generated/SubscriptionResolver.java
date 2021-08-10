package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public interface SubscriptionResolver {

    /**
     * fetch data from the table: "users"
     */
    @javax.validation.constraints.NotNull
    java.util.List<Users> users(@javax.validation.constraints.NotNull java.util.List<Users_select_column> distinct_on, Integer limit, Integer offset, @javax.validation.constraints.NotNull java.util.List<Users_order_by> order_by, Users_bool_exp where) throws Exception;

    /**
     * fetch aggregated fields from the table: "users"
     */
    @javax.validation.constraints.NotNull
    Users_aggregate users_aggregate(@javax.validation.constraints.NotNull java.util.List<Users_select_column> distinct_on, Integer limit, Integer offset, @javax.validation.constraints.NotNull java.util.List<Users_order_by> order_by, Users_bool_exp where) throws Exception;

    /**
     * fetch data from the table: "users" using primary key columns
     */
    Users users_by_pk(@javax.validation.constraints.NotNull String id) throws Exception;

}
