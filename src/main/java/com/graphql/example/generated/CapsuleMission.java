package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class CapsuleMission implements java.io.Serializable {

    private Integer flight;
    private String name;

    public CapsuleMission() {
    }

    public CapsuleMission(Integer flight, String name) {
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



    public static CapsuleMission.Builder builder() {
        return new CapsuleMission.Builder();
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


        public CapsuleMission build() {
            return new CapsuleMission(flight, name);
        }

    }
}
