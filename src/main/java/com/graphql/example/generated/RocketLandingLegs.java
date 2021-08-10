package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class RocketLandingLegs implements java.io.Serializable {

    private String material;
    private Integer number;

    public RocketLandingLegs() {
    }

    public RocketLandingLegs(String material, Integer number) {
        this.material = material;
        this.number = number;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }



    public static RocketLandingLegs.Builder builder() {
        return new RocketLandingLegs.Builder();
    }

    public static class Builder {

        private String material;
        private Integer number;

        public Builder() {
        }

        public Builder setMaterial(String material) {
            this.material = material;
            return this;
        }

        public Builder setNumber(Integer number) {
            this.number = number;
            return this;
        }


        public RocketLandingLegs build() {
            return new RocketLandingLegs(material, number);
        }

    }
}
