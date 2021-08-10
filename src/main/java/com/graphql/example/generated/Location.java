package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Location implements java.io.Serializable {

    private Double latitude;
    private Double longitude;
    private String name;
    private String region;

    public Location() {
    }

    public Location(Double latitude, Double longitude, String name, String region) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.region = region;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }



    public static Location.Builder builder() {
        return new Location.Builder();
    }

    public static class Builder {

        private Double latitude;
        private Double longitude;
        private String name;
        private String region;

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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = region;
            return this;
        }


        public Location build() {
            return new Location(latitude, longitude, name, region);
        }

    }
}
