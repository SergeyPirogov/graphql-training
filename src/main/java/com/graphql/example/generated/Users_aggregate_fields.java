package com.graphql.example.generated;

/**
 * aggregate fields of "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Users_aggregate_fields implements java.io.Serializable {

    private Users_max_fields max;
    private Users_min_fields min;

    public Users_aggregate_fields() {
    }

    public Users_aggregate_fields(Users_max_fields max, Users_min_fields min) {
        this.max = max;
        this.min = min;
    }

    public Users_max_fields getMax() {
        return max;
    }
    public void setMax(Users_max_fields max) {
        this.max = max;
    }

    public Users_min_fields getMin() {
        return min;
    }
    public void setMin(Users_min_fields min) {
        this.min = min;
    }



    public static Users_aggregate_fields.Builder builder() {
        return new Users_aggregate_fields.Builder();
    }

    public static class Builder {

        private Users_max_fields max;
        private Users_min_fields min;

        public Builder() {
        }

        public Builder setMax(Users_max_fields max) {
            this.max = max;
            return this;
        }

        public Builder setMin(Users_min_fields min) {
            this.min = min;
            return this;
        }


        public Users_aggregate_fields build() {
            return new Users_aggregate_fields(max, min);
        }

    }
}
