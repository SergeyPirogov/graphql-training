package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public interface CapsulesUpcomingQueryResolver {

    java.util.List<Capsule> capsulesUpcoming(CapsulesFind find, Integer limit, Integer offset, String order, String sort) throws Exception;

}
