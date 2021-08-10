package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class CoreMission implements java.io.Serializable {

    private Integer flight;
    private String name;

    public CoreMission() {
    }

    public CoreMission(Integer flight, String name) {
        this.flight = flight;
        this.name = name;
    }

    public Integer getFlight() {
        return flight;
    }
    public void setFlight(Integer flight) {
        this.flight = flight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public static CoreMission.Builder builder() {
        return new CoreMission.Builder();
    }

    public static class Builder {

        private Integer flight;
        private String name;

        public Builder() {
        }

        public Builder setFlight(Integer flight) {
            this.flight = flight;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public CoreMission build() {
            return new CoreMission(flight, name);
        }

    }
}
