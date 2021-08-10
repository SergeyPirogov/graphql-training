package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class ShipLocation implements java.io.Serializable {

    private Double latitude;
    private Double longitude;

    public ShipLocation() {
    }

    public ShipLocation(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }



    public static ShipLocation.Builder builder() {
        return new ShipLocation.Builder();
    }

    public static class Builder {

        private Double latitude;
        private Double longitude;

        public Builder() {
        }

        public Builder setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }


        public ShipLocation build() {
            return new ShipLocation(latitude, longitude);
        }

    }
}
