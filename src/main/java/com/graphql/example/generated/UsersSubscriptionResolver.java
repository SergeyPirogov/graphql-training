package com.graphql.example.generated;

/**
 * fetch data from the table: "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public interface UsersSubscriptionResolver {

    /**
     * fetch data from the table: "users"
     */
    @javax.validation.constraints.NotNull
    java.util.List<Users> users(@javax.validation.constraints.NotNull java.util.List<Users_select_column> distinct_on, Integer limit, Integer offset, @javax.validation.constraints.NotNull java.util.List<Users_order_by> order_by, Users_bool_exp where) throws Exception;

}
