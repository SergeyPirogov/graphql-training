package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Launchpad implements java.io.Serializable {

    private Integer attempted_launches;
    private String details;
    private String id;
    private Location location;
    private String name;
    private String status;
    private Integer successful_launches;
    private java.util.List<Rocket> vehicles_launched;
    private String wikipedia;

    public Launchpad() {
    }

    public Launchpad(Integer attempted_launches, String details, String id, Location location, String name, String status, Integer successful_launches, java.util.List<Rocket> vehicles_launched, String wikipedia) {
        this.attempted_launches = attempted_launches;
        this.details = details;
        this.id = id;
        this.location = location;
        this.name = name;
        this.status = status;
        this.successful_launches = successful_launches;
        this.vehicles_launched = vehicles_launched;
        this.wikipedia = wikipedia;
    }

    public Integer getAttempted_launches() {
        return attempted_launches;
    }
    public void setAttempted_launches(Integer attempted_launches) {
        this.attempted_launches = attempted_launches;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSuccessful_launches() {
        return successful_launches;
    }
    public void setSuccessful_launches(Integer successful_launches) {
        this.successful_launches = successful_launches;
    }

    public java.util.List<Rocket> getVehicles_launched() {
        return vehicles_launched;
    }
    public void setVehicles_launched(java.util.List<Rocket> vehicles_launched) {
        this.vehicles_launched = vehicles_launched;
    }

    public String getWikipedia() {
        return wikipedia;
    }
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }



    public static Launchpad.Builder builder() {
        return new Launchpad.Builder();
    }

    public static class Builder {

        private Integer attempted_launches;
        private String details;
        private String id;
        private Location location;
        private String name;
        private String status;
        private Integer successful_launches;
        private java.util.List<Rocket> vehicles_launched;
        private String wikipedia;

        public Builder() {
        }

        public Builder setAttempted_launches(Integer attempted_launches) {
            this.attempted_launches = attempted_launches;
            return this;
        }

        public Builder setDetails(String details) {
            this.details = details;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(Location location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setSuccessful_launches(Integer successful_launches) {
            this.successful_launches = successful_launches;
            return this;
        }

        public Builder setVehicles_launched(java.util.List<Rocket> vehicles_launched) {
            this.vehicles_launched = vehicles_launched;
            return this;
        }

        public Builder setWikipedia(String wikipedia) {
            this.wikipedia = wikipedia;
            return this;
        }


        public Launchpad build() {
            return new Launchpad(attempted_launches, details, id, location, name, status, successful_launches, vehicles_launched, wikipedia);
        }

    }
}
