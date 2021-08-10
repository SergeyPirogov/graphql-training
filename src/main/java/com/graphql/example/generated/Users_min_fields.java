package com.graphql.example.generated;

/**
 * aggregate min on columns
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Users_min_fields implements java.io.Serializable {

    private String name;
    private String rocket;
    private String timestamp;
    private String twitter;

    public Users_min_fields() {
    }

    public Users_min_fields(String name, String rocket, String timestamp, String twitter) {
        this.name = name;
        this.rocket = rocket;
        this.timestamp = timestamp;
        this.twitter = twitter;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRocket() {
        return rocket;
    }
    public void setRocket(String rocket) {
        this.rocket = rocket;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTwitter() {
        return twitter;
    }
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }



    public static Users_min_fields.Builder builder() {
        return new Users_min_fields.Builder();
    }

    public static class Builder {

        private String name;
        private String rocket;
        private String timestamp;
        private String twitter;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRocket(String rocket) {
            this.rocket = rocket;
            return this;
        }

        public Builder setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setTwitter(String twitter) {
            this.twitter = twitter;
            return this;
        }


        public Users_min_fields build() {
            return new Users_min_fields(name, rocket, timestamp, twitter);
        }

    }
}
