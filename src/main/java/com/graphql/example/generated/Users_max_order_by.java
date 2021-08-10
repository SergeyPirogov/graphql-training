package com.graphql.example.generated;

/**
 * order by max() on columns of table "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Users_max_order_by implements java.io.Serializable {

    private Order_by name;
    private Order_by rocket;
    private Order_by timestamp;
    private Order_by twitter;

    public Users_max_order_by() {
    }

    public Users_max_order_by(Order_by name, Order_by rocket, Order_by timestamp, Order_by twitter) {
        this.name = name;
        this.rocket = rocket;
        this.timestamp = timestamp;
        this.twitter = twitter;
    }

    public Order_by getName() {
        return name;
    }
    public void setName(Order_by name) {
        this.name = name;
    }

    public Order_by getRocket() {
        return rocket;
    }
    public void setRocket(Order_by rocket) {
        this.rocket = rocket;
    }

    public Order_by getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Order_by timestamp) {
        this.timestamp = timestamp;
    }

    public Order_by getTwitter() {
        return twitter;
    }
    public void setTwitter(Order_by twitter) {
        this.twitter = twitter;
    }



    public static Users_max_order_by.Builder builder() {
        return new Users_max_order_by.Builder();
    }

    public static class Builder {

        private Order_by name;
        private Order_by rocket;
        private Order_by timestamp;
        private Order_by twitter;

        public Builder() {
        }

        public Builder setName(Order_by name) {
            this.name = name;
            return this;
        }

        public Builder setRocket(Order_by rocket) {
            this.rocket = rocket;
            return this;
        }

        public Builder setTimestamp(Order_by timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setTwitter(Order_by twitter) {
            this.twitter = twitter;
            return this;
        }


        public Users_max_order_by build() {
            return new Users_max_order_by(name, rocket, timestamp, twitter);
        }

    }
}
