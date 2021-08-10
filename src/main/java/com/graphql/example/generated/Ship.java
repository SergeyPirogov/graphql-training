package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Ship implements java.io.Serializable {

    private Integer abs;
    private Boolean active;
    private Integer attempted_landings;
    private Integer Class;
    private Integer course_deg;
    private String home_port;
    private String id;
    private String image;
    private Integer imo;
    private java.util.List<ShipMission> missions;
    private Integer mmsi;
    private String model;
    private String name;
    private ShipLocation position;
    private java.util.List<String> roles;
    private Double speed_kn;
    private String status;
    private Integer successful_landings;
    private String type;
    private String url;
    private Integer weight_kg;
    private Integer weight_lbs;
    private Integer year_built;

    public Ship() {
    }

    public Ship(Integer abs, Boolean active, Integer attempted_landings, Integer Class, Integer course_deg, String home_port, String id, String image, Integer imo, java.util.List<ShipMission> missions, Integer mmsi, String model, String name, ShipLocation position, java.util.List<String> roles, Double speed_kn, String status, Integer successful_landings, String type, String url, Integer weight_kg, Integer weight_lbs, Integer year_built) {
        this.abs = abs;
        this.active = active;
        this.attempted_landings = attempted_landings;
        this.Class = Class;
        this.course_deg = course_deg;
        this.home_port = home_port;
        this.id = id;
        this.image = image;
        this.imo = imo;
        this.missions = missions;
        this.mmsi = mmsi;
        this.model = model;
        this.name = name;
        this.position = position;
        this.roles = roles;
        this.speed_kn = speed_kn;
        this.status = status;
        this.successful_landings = successful_landings;
        this.type = type;
        this.url = url;
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

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    public Integer getImo() {
        return imo;
    }
    public void setImo(Integer imo) {
        this.imo = imo;
    }

    public java.util.List<ShipMission> getMissions() {
        return missions;
    }
    public void setMissions(java.util.List<ShipMission> missions) {
        this.missions = missions;
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

    public ShipLocation getPosition() {
        return position;
    }
    public void setPosition(ShipLocation position) {
        this.position = position;
    }

    public java.util.List<String> getRoles() {
        return roles;
    }
    public void setRoles(java.util.List<String> roles) {
        this.roles = roles;
    }

    public Double getSpeed_kn() {
        return speed_kn;
    }
    public void setSpeed_kn(Double speed_kn) {
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

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
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



    public static Ship.Builder builder() {
        return new Ship.Builder();
    }

    public static class Builder {

        private Integer abs;
        private Boolean active;
        private Integer attempted_landings;
        private Integer Class;
        private Integer course_deg;
        private String home_port;
        private String id;
        private String image;
        private Integer imo;
        private java.util.List<ShipMission> missions;
        private Integer mmsi;
        private String model;
        private String name;
        private ShipLocation position;
        private java.util.List<String> roles;
        private Double speed_kn;
        private String status;
        private Integer successful_landings;
        private String type;
        private String url;
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

        public Builder setImage(String image) {
            this.image = image;
            return this;
        }

        public Builder setImo(Integer imo) {
            this.imo = imo;
            return this;
        }

        public Builder setMissions(java.util.List<ShipMission> missions) {
            this.missions = missions;
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

        public Builder setPosition(ShipLocation position) {
            this.position = position;
            return this;
        }

        public Builder setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setSpeed_kn(Double speed_kn) {
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

        public Builder setUrl(String url) {
            this.url = url;
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


        public Ship build() {
            return new Ship(abs, active, attempted_landings, Class, course_deg, home_port, id, image, imo, missions, mmsi, model, name, position, roles, speed_kn, status, successful_landings, type, url, weight_kg, weight_lbs, year_built);
        }

    }
}
