package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Launch implements java.io.Serializable {

    private String details;
    private String id;
    private Boolean is_tentative;
    private String launch_date_local;
    private String launch_date_unix;
    private String launch_date_utc;
    private LaunchSite launch_site;
    private Boolean launch_success;
    private String launch_year;
    private LaunchLinks links;
    private java.util.List<String> mission_id;
    private String mission_name;
    private LaunchRocket rocket;
    private java.util.List<Ship> ships;
    private String static_fire_date_unix;
    private String static_fire_date_utc;
    private LaunchTelemetry telemetry;
    private String tentative_max_precision;
    private Boolean upcoming;

    public Launch() {
    }

    public Launch(String details, String id, Boolean is_tentative, String launch_date_local, String launch_date_unix, String launch_date_utc, LaunchSite launch_site, Boolean launch_success, String launch_year, LaunchLinks links, java.util.List<String> mission_id, String mission_name, LaunchRocket rocket, java.util.List<Ship> ships, String static_fire_date_unix, String static_fire_date_utc, LaunchTelemetry telemetry, String tentative_max_precision, Boolean upcoming) {
        this.details = details;
        this.id = id;
        this.is_tentative = is_tentative;
        this.launch_date_local = launch_date_local;
        this.launch_date_unix = launch_date_unix;
        this.launch_date_utc = launch_date_utc;
        this.launch_site = launch_site;
        this.launch_success = launch_success;
        this.launch_year = launch_year;
        this.links = links;
        this.mission_id = mission_id;
        this.mission_name = mission_name;
        this.rocket = rocket;
        this.ships = ships;
        this.static_fire_date_unix = static_fire_date_unix;
        this.static_fire_date_utc = static_fire_date_utc;
        this.telemetry = telemetry;
        this.tentative_max_precision = tentative_max_precision;
        this.upcoming = upcoming;
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

    public Boolean getIs_tentative() {
        return is_tentative;
    }
    public void setIs_tentative(Boolean is_tentative) {
        this.is_tentative = is_tentative;
    }

    public String getLaunch_date_local() {
        return launch_date_local;
    }
    public void setLaunch_date_local(String launch_date_local) {
        this.launch_date_local = launch_date_local;
    }

    public String getLaunch_date_unix() {
        return launch_date_unix;
    }
    public void setLaunch_date_unix(String launch_date_unix) {
        this.launch_date_unix = launch_date_unix;
    }

    public String getLaunch_date_utc() {
        return launch_date_utc;
    }
    public void setLaunch_date_utc(String launch_date_utc) {
        this.launch_date_utc = launch_date_utc;
    }

    public LaunchSite getLaunch_site() {
        return launch_site;
    }
    public void setLaunch_site(LaunchSite launch_site) {
        this.launch_site = launch_site;
    }

    public Boolean getLaunch_success() {
        return launch_success;
    }
    public void setLaunch_success(Boolean launch_success) {
        this.launch_success = launch_success;
    }

    public String getLaunch_year() {
        return launch_year;
    }
    public void setLaunch_year(String launch_year) {
        this.launch_year = launch_year;
    }

    public LaunchLinks getLinks() {
        return links;
    }
    public void setLinks(LaunchLinks links) {
        this.links = links;
    }

    public java.util.List<String> getMission_id() {
        return mission_id;
    }
    public void setMission_id(java.util.List<String> mission_id) {
        this.mission_id = mission_id;
    }

    public String getMission_name() {
        return mission_name;
    }
    public void setMission_name(String mission_name) {
        this.mission_name = mission_name;
    }

    public LaunchRocket getRocket() {
        return rocket;
    }
    public void setRocket(LaunchRocket rocket) {
        this.rocket = rocket;
    }

    public java.util.List<Ship> getShips() {
        return ships;
    }
    public void setShips(java.util.List<Ship> ships) {
        this.ships = ships;
    }

    public String getStatic_fire_date_unix() {
        return static_fire_date_unix;
    }
    public void setStatic_fire_date_unix(String static_fire_date_unix) {
        this.static_fire_date_unix = static_fire_date_unix;
    }

    public String getStatic_fire_date_utc() {
        return static_fire_date_utc;
    }
    public void setStatic_fire_date_utc(String static_fire_date_utc) {
        this.static_fire_date_utc = static_fire_date_utc;
    }

    public LaunchTelemetry getTelemetry() {
        return telemetry;
    }
    public void setTelemetry(LaunchTelemetry telemetry) {
        this.telemetry = telemetry;
    }

    public String getTentative_max_precision() {
        return tentative_max_precision;
    }
    public void setTentative_max_precision(String tentative_max_precision) {
        this.tentative_max_precision = tentative_max_precision;
    }

    public Boolean getUpcoming() {
        return upcoming;
    }
    public void setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
    }



    public static Launch.Builder builder() {
        return new Launch.Builder();
    }

    public static class Builder {

        private String details;
        private String id;
        private Boolean is_tentative;
        private String launch_date_local;
        private String launch_date_unix;
        private String launch_date_utc;
        private LaunchSite launch_site;
        private Boolean launch_success;
        private String launch_year;
        private LaunchLinks links;
        private java.util.List<String> mission_id;
        private String mission_name;
        private LaunchRocket rocket;
        private java.util.List<Ship> ships;
        private String static_fire_date_unix;
        private String static_fire_date_utc;
        private LaunchTelemetry telemetry;
        private String tentative_max_precision;
        private Boolean upcoming;

        public Builder() {
        }

        public Builder setDetails(String details) {
            this.details = details;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIs_tentative(Boolean is_tentative) {
            this.is_tentative = is_tentative;
            return this;
        }

        public Builder setLaunch_date_local(String launch_date_local) {
            this.launch_date_local = launch_date_local;
            return this;
        }

        public Builder setLaunch_date_unix(String launch_date_unix) {
            this.launch_date_unix = launch_date_unix;
            return this;
        }

        public Builder setLaunch_date_utc(String launch_date_utc) {
            this.launch_date_utc = launch_date_utc;
            return this;
        }

        public Builder setLaunch_site(LaunchSite launch_site) {
            this.launch_site = launch_site;
            return this;
        }

        public Builder setLaunch_success(Boolean launch_success) {
            this.launch_success = launch_success;
            return this;
        }

        public Builder setLaunch_year(String launch_year) {
            this.launch_year = launch_year;
            return this;
        }

        public Builder setLinks(LaunchLinks links) {
            this.links = links;
            return this;
        }

        public Builder setMission_id(java.util.List<String> mission_id) {
            this.mission_id = mission_id;
            return this;
        }

        public Builder setMission_name(String mission_name) {
            this.mission_name = mission_name;
            return this;
        }

        public Builder setRocket(LaunchRocket rocket) {
            this.rocket = rocket;
            return this;
        }

        public Builder setShips(java.util.List<Ship> ships) {
            this.ships = ships;
            return this;
        }

        public Builder setStatic_fire_date_unix(String static_fire_date_unix) {
            this.static_fire_date_unix = static_fire_date_unix;
            return this;
        }

        public Builder setStatic_fire_date_utc(String static_fire_date_utc) {
            this.static_fire_date_utc = static_fire_date_utc;
            return this;
        }

        public Builder setTelemetry(LaunchTelemetry telemetry) {
            this.telemetry = telemetry;
            return this;
        }

        public Builder setTentative_max_precision(String tentative_max_precision) {
            this.tentative_max_precision = tentative_max_precision;
            return this;
        }

        public Builder setUpcoming(Boolean upcoming) {
            this.upcoming = upcoming;
            return this;
        }


        public Launch build() {
            return new Launch(details, id, is_tentative, launch_date_local, launch_date_unix, launch_date_utc, launch_site, launch_success, launch_year, links, mission_id, mission_name, rocket, ships, static_fire_date_unix, static_fire_date_utc, telemetry, tentative_max_precision, upcoming);
        }

    }
}
