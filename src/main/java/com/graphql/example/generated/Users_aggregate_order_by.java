package com.graphql.example.generated;

/**
 * order by aggregate values of table "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Users_aggregate_order_by implements java.io.Serializable {

    private Order_by count;
    private Users_max_order_by max;
    private Users_min_order_by min;

    public Users_aggregate_order_by() {
    }

    public Users_aggregate_order_by(Order_by count, Users_max_order_by max, Users_min_order_by min) {
        this.count = count;
        this.max = max;
        this.min = min;
    }

    public Order_by getCount() {
        return count;
    }
    public void setCount(Order_by count) {
        this.count = count;
    }

    public Users_max_order_by getMax() {
        return max;
    }
    public void setMax(Users_max_order_by max) {
        this.max = max;
    }

    public Users_min_order_by getMin() {
        return min;
    }
    public void setMin(Users_min_order_by min) {
        this.min = min;
    }



    public static Users_aggregate_order_by.Builder builder() {
        return new Users_aggregate_order_by.Builder();
    }

    public static class Builder {

        private Order_by count;
        private Users_max_order_by max;
        private Users_min_order_by min;

        public Builder() {
        }

        public Builder setCount(Order_by count) {
            this.count = count;
            return this;
        }

        public Builder setMax(Users_max_order_by max) {
            this.max = max;
            return this;
        }

        public Builder setMin(Users_min_order_by min) {
            this.min = min;
            return this;
        }


        public Users_aggregate_order_by build() {
            return new Users_aggregate_order_by(count, max, min);
        }

    }
}
