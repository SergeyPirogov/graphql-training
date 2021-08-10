package com.graphql.example.generated;

/**
 * column ordering options
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public enum Order_by {

    /**
     * in the ascending order, nulls last
     */
    asc("asc"),
    /**
     * in the ascending order, nulls first
     */
    asc_nulls_first("asc_nulls_first"),
    /**
     * in the ascending order, nulls last
     */
    asc_nulls_last("asc_nulls_last"),
    /**
     * in the descending order, nulls first
     */
    desc("desc"),
    /**
     * in the descending order, nulls first
     */
    desc_nulls_first("desc_nulls_first"),
    /**
     * in the descending order, nulls last
     */
    desc_nulls_last("desc_nulls_last");

    private final String graphqlName;

    private Order_by(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
