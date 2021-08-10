package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Landpad implements java.io.Serializable {

    private String attempted_landings;
    private String details;
    private String full_name;
    private String id;
    private String landing_type;
    private Location location;
    private String status;
    private String successful_landings;
    private String wikipedia;

    public Landpad() {
    }

    public Landpad(String attempted_landings, String details, String full_name, String id, String landing_type, Location location, String status, String successful_landings, String wikipedia) {
        this.attempted_landings = attempted_landings;
        this.details = details;
        this.full_name = full_name;
        this.id = id;
        this.landing_type = landing_type;
        this.location = location;
        this.status = status;
        this.successful_landings = successful_landings;
        this.wikipedia = wikipedia;
    }

    public String getAttempted_landings() {
        return attempted_landings;
    }
    public void setAttempted_landings(String attempted_landings) {
        this.attempted_landings = attempted_landings;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public String getFull_name() {
        return full_name;
    }
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLanding_type() {
        return landing_type;
    }
    public void setLanding_type(String landing_type) {
        this.landing_type = landing_type;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSuccessful_landings() {
        return successful_landings;
    }
    public void setSuccessful_landings(String successful_landings) {
        this.successful_landings = successful_landings;
    }

    public String getWikipedia() {
        return wikipedia;
    }
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }



    public static Landpad.Builder builder() {
        return new Landpad.Builder();
    }

    public static class Builder {

        private String attempted_landings;
        private String details;
        private String full_name;
        private String id;
        private String landing_type;
        private Location location;
        private String status;
        private String successful_landings;
        private String wikipedia;

        public Builder() {
        }

        public Builder setAttempted_landings(String attempted_landings) {
            this.attempted_landings = attempted_landings;
            return this;
        }

        public Builder setDetails(String details) {
            this.details = details;
            return this;
        }

        public Builder setFull_name(String full_name) {
            this.full_name = full_name;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLanding_type(String landing_type) {
            this.landing_type = landing_type;
            return this;
        }

        public Builder setLocation(Location location) {
            this.location = location;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setSuccessful_landings(String successful_landings) {
            this.successful_landings = successful_landings;
            return this;
        }

        public Builder setWikipedia(String wikipedia) {
            this.wikipedia = wikipedia;
            return this;
        }


        public Landpad build() {
            return new Landpad(attempted_landings, details, full_name, id, landing_type, location, status, successful_landings, wikipedia);
        }

    }
}
