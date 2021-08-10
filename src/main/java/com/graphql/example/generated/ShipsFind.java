package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class ShipsFind implements java.io.Serializable {

    private Integer abs;
    private Boolean active;
    private Integer attempted_landings;
    private Integer Class;
    private Integer course_deg;
    private String home_port;
    private String id;
    private Integer imo;
    private Double latitude;
    private Double longitude;
    private String mission;
    private Integer mmsi;
    private String model;
    private String name;
    private String role;
    private Integer speed_kn;
    private String status;
    private Integer successful_landings;
    private String type;
    private Integer weight_kg;
    private Integer weight_lbs;
    private Integer year_built;

    public ShipsFind() {
    }

    public ShipsFind(Integer abs, Boolean active, Integer attempted_landings, Integer Class, Integer course_deg, String home_port, String id, Integer imo, Double latitude, Double longitude, String mission, Integer mmsi, String model, String name, String role, Integer speed_kn, String status, Integer successful_landings, String type, Integer weight_kg, Integer weight_lbs, Integer year_built) {
        this.abs = abs;
        this.active = active;
        this.attempted_landings = attempted_landings;
        this.Class = Class;
        this.course_deg = course_deg;
        this.home_port = home_port;
        this.id = id;
        this.imo = imo;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mission = mission;
        this.mmsi = mmsi;
        this.model = model;
        this.name = name;
        this.role = role;
        this.speed_kn = speed_kn;
        this.status = status;
        this.successful_landings = successful_landings;
        this.type = type;
        this.weight_kg = weight_kg;
        this.weight_lbs = weight_lbs;
        this.year_built = year_built;
    }

    public Integer getAbs() {
        return abs;
    }
    public void setAbs(Integer abs) {
        this.abs = abs;
    }

    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getAttempted_landings() {
        return attempted_landings;
    }
    public void setAttempted_landings(Integer attempted_landings) {
        this.attempted_landings = attempted_landings;
    }

    public void setClass(Integer Class) {
        this.Class = Class;
    }

    public Integer getCourse_deg() {
        return course_deg;
    }
    public void setCourse_deg(Integer course_deg) {
        this.course_deg = course_deg;
    }

    public String getHome_port() {
        return home_port;
    }
    public void setHome_port(String home_port) {
        this.home_port = home_port;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Integer getImo() {
        return imo;
    }
    public void setImo(Integer imo) {
        this.imo = imo;
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

    public String getMission() {
        return mission;
    }
    public void setMission(String mission) {
        this.mission = mission;
    }

    public Integer getMmsi() {
        return mmsi;
    }
    public void setMmsi(Integer mmsi) {
        this.mmsi = mmsi;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSpeed_kn() {
        return speed_kn;
    }
    public void setSpeed_kn(Integer speed_kn) {
        this.speed_kn = speed_kn;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSuccessful_landings() {
        return successful_landings;
    }
    public void setSuccessful_landings(Integer successful_landings) {
        this.successful_landings = successful_landings;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Integer getWeight_kg() {
        return weight_kg;
    }
    public void setWeight_kg(Integer weight_kg) {
        this.weight_kg = weight_kg;
    }

    public Integer getWeight_lbs() {
        return weight_lbs;
    }
    public void setWeight_lbs(Integer weight_lbs) {
        this.weight_lbs = weight_lbs;
    }

    public Integer getYear_built() {
        return year_built;
    }
    public void setYear_built(Integer year_built) {
        this.year_built = year_built;
    }



    public static ShipsFind.Builder builder() {
        return new ShipsFind.Builder();
    }

    public static class Builder {

        private Integer abs;
        private Boolean active;
        private Integer attempted_landings;
        private Integer Class;
        private Integer course_deg;
        private String home_port;
        private String id;
        private Integer imo;
        private Double latitude;
        private Double longitude;
        private String mission;
        private Integer mmsi;
        private String model;
        private String name;
        private String role;
        private Integer speed_kn;
        private String status;
        private Integer successful_landings;
        private String type;
        private Integer weight_kg;
        private Integer weight_lbs;
        private Integer year_built;

        public Builder() {
        }

        public Builder setAbs(Integer abs) {
            this.abs = abs;
            return this;
        }

        public Builder setActive(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder setAttempted_landings(Integer attempted_landings) {
            this.attempted_landings = attempted_landings;
            return this;
        }

        public Builder setClass(Integer Class) {
            this.Class = Class;
            return this;
        }

        public Builder setCourse_deg(Integer course_deg) {
            this.course_deg = course_deg;
            return this;
        }

        public Builder setHome_port(String home_port) {
            this.home_port = home_port;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setImo(Integer imo) {
            this.imo = imo;
            return this;
        }

        public Builder setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setMission(String mission) {
            this.mission = mission;
            return this;
        }

        public Builder setMmsi(Integer mmsi) {
            this.mmsi = mmsi;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder setSpeed_kn(Integer speed_kn) {
            this.speed_kn = speed_kn;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setSuccessful_landings(Integer successful_landings) {
            this.successful_landings = successful_landings;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setWeight_kg(Integer weight_kg) {
            this.weight_kg = weight_kg;
            return this;
        }

        public Builder setWeight_lbs(Integer weight_lbs) {
            this.weight_lbs = weight_lbs;
            return this;
        }

        public Builder setYear_built(Integer year_built) {
            this.year_built = year_built;
            return this;
        }


        public ShipsFind build() {
            return new ShipsFind(abs, active, attempted_landings, Class, course_deg, home_port, id, imo, latitude, longitude, mission, mmsi, model, name, role, speed_kn, status, successful_landings, type, weight_kg, weight_lbs, year_built);
        }

    }
}
