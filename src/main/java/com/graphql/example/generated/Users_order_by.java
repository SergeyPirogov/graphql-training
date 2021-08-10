package com.graphql.example.generated;

/**
 * ordering options when selecting data from "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Users_order_by implements java.io.Serializable {

    private Order_by id;
    private Order_by name;
    private Order_by rocket;
    private Order_by timestamp;
    private Order_by twitter;

    public Users_order_by() {
    }

    public Users_order_by(Order_by id, Order_by name, Order_by rocket, Order_by timestamp, Order_by twitter) {
        this.id = id;
        this.name = name;
        this.rocket = rocket;
        this.timestamp = timestamp;
        this.twitter = twitter;
    }

    public Order_by getId() {
        return id;
    }
    public void setId(Order_by id) {
        this.id = id;
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



    public static Users_order_by.Builder builder() {
        return new Users_order_by.Builder();
    }

    public static class Builder {

        private Order_by id;
        private Order_by name;
        private Order_by rocket;
        private Order_by timestamp;
        private Order_by twitter;

        public Builder() {
        }

        public Builder setId(Order_by id) {
            this.id = id;
            return this;
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


        public Users_order_by build() {
            return new Users_order_by(id, name, rocket, timestamp, twitter);
        }

    }
}
