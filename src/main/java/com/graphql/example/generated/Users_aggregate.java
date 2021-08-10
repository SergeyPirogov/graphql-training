package com.graphql.example.generated;

/**
 * aggregated selection of "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Users_aggregate implements java.io.Serializable {

    private Users_aggregate_fields aggregate;
    @javax.validation.constraints.NotNull
    private java.util.List<Users> nodes;

    public Users_aggregate() {
    }

    public Users_aggregate(Users_aggregate_fields aggregate, java.util.List<Users> nodes) {
        this.aggregate = aggregate;
        this.nodes = nodes;
    }

    public Users_aggregate_fields getAggregate() {
        return aggregate;
    }
    public void setAggregate(Users_aggregate_fields aggregate) {
        this.aggregate = aggregate;
    }

    public java.util.List<Users> getNodes() {
        return nodes;
    }
    public void setNodes(java.util.List<Users> nodes) {
        this.nodes = nodes;
    }



    public static Users_aggregate.Builder builder() {
        return new Users_aggregate.Builder();
    }

    public static class Builder {

        private Users_aggregate_fields aggregate;
        private java.util.List<Users> nodes;

        public Builder() {
        }

        public Builder setAggregate(Users_aggregate_fields aggregate) {
            this.aggregate = aggregate;
            return this;
        }

        public Builder setNodes(java.util.List<Users> nodes) {
            this.nodes = nodes;
            return this;
        }


        public Users_aggregate build() {
            return new Users_aggregate(aggregate, nodes);
        }

    }
}
