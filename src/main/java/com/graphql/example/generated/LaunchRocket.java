package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class LaunchRocket implements java.io.Serializable {

    private LaunchRocketFairings fairings;
    private LaunchRocketFirstStage first_stage;
    private Rocket rocket;
    private String rocket_name;
    private String rocket_type;
    private LaunchRocketSecondStage second_stage;

    public LaunchRocket() {
    }

    public LaunchRocket(LaunchRocketFairings fairings, LaunchRocketFirstStage first_stage, Rocket rocket, String rocket_name, String rocket_type, LaunchRocketSecondStage second_stage) {
        this.fairings = fairings;
        this.first_stage = first_stage;
        this.rocket = rocket;
        this.rocket_name = rocket_name;
        this.rocket_type = rocket_type;
        this.second_stage = second_stage;
    }

    public LaunchRocketFairings getFairings() {
        return fairings;
    }
    public void setFairings(LaunchRocketFairings fairings) {
        this.fairings = fairings;
    }

    public LaunchRocketFirstStage getFirst_stage() {
        return first_stage;
    }
    public void setFirst_stage(LaunchRocketFirstStage first_stage) {
        this.first_stage = first_stage;
    }

    public Rocket getRocket() {
        return rocket;
    }
    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public String getRocket_name() {
        return rocket_name;
    }
    public void setRocket_name(String rocket_name) {
        this.rocket_name = rocket_name;
    }

    public String getRocket_type() {
        return rocket_type;
    }
    public void setRocket_type(String rocket_type) {
        this.rocket_type = rocket_type;
    }

    public LaunchRocketSecondStage getSecond_stage() {
        return second_stage;
    }
    public void setSecond_stage(LaunchRocketSecondStage second_stage) {
        this.second_stage = second_stage;
    }



    public static LaunchRocket.Builder builder() {
        return new LaunchRocket.Builder();
    }

    public static class Builder {

        private LaunchRocketFairings fairings;
        private LaunchRocketFirstStage first_stage;
        private Rocket rocket;
        private String rocket_name;
        private String rocket_type;
        private LaunchRocketSecondStage second_stage;

        public Builder() {
        }

        public Builder setFairings(LaunchRocketFairings fairings) {
            this.fairings = fairings;
            return this;
        }

        public Builder setFirst_stage(LaunchRocketFirstStage first_stage) {
            this.first_stage = first_stage;
            return this;
        }

        public Builder setRocket(Rocket rocket) {
            this.rocket = rocket;
            return this;
        }

        public Builder setRocket_name(String rocket_name) {
            this.rocket_name = rocket_name;
            return this;
        }

        public Builder setRocket_type(String rocket_type) {
            this.rocket_type = rocket_type;
            return this;
        }

        public Builder setSecond_stage(LaunchRocketSecondStage second_stage) {
            this.second_stage = second_stage;
            return this;
        }


        public LaunchRocket build() {
            return new LaunchRocket(fairings, first_stage, rocket, rocket_name, rocket_type, second_stage);
        }

    }
}
