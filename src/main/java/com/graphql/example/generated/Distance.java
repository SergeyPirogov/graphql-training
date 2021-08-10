package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Distance implements java.io.Serializable {

    private Double feet;
    private Double meters;

    public Distance() {
    }

    public Distance(Double feet, Double meters) {
        this.feet = feet;
        this.meters = meters;
    }

    public Double getFeet() {
        return feet;
    }
    public void setFeet(Double feet) {
        this.feet = feet;
    }

    public Double getMeters() {
        return meters;
    }
    public void setMeters(Double meters) {
        this.meters = meters;
    }



    public static Distance.Builder builder() {
        return new Distance.Builder();
    }

    public static class Builder {

        private Double feet;
        private Double meters;

        public Builder() {
        }

        public Builder setFeet(Double feet) {
            this.feet = feet;
            return this;
        }

        public Builder setMeters(Double meters) {
            this.meters = meters;
            return this;
        }


        public Distance build() {
            return new Distance(feet, meters);
        }

    }
}
