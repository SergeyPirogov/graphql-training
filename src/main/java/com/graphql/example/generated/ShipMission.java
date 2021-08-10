package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class ShipMission implements java.io.Serializable {

    private String flight;
    private String name;

    public ShipMission() {
    }

    public ShipMission(String flight, String name) {
        this.flight = flight;
        this.name = name;
    }

    public String getFlight() {
        return flight;
    }
    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public static ShipMission.Builder builder() {
        return new ShipMission.Builder();
    }

    public static class Builder {

        private String flight;
        private String name;

        public Builder() {
        }

        public Builder setFlight(String flight) {
            this.flight = flight;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public ShipMission build() {
            return new ShipMission(flight, name);
        }

    }
}
