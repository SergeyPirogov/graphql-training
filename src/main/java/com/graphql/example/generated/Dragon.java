package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Dragon implements java.io.Serializable {

    private Boolean active;
    private Integer crew_capacity;
    private String description;
    private Distance diameter;
    private Integer dry_mass_kg;
    private Integer dry_mass_lb;
    private String first_flight;
    private DragonHeatShield heat_shield;
    private Distance height_w_trunk;
    private String id;
    private Mass launch_payload_mass;
    private Volume launch_payload_vol;
    private String name;
    private Integer orbit_duration_yr;
    private DragonPressurizedCapsule pressurized_capsule;
    private Mass return_payload_mass;
    private Volume return_payload_vol;
    private Double sidewall_angle_deg;
    private java.util.List<DragonThrust> thrusters;
    private DragonTrunk trunk;
    private String type;
    private String wikipedia;

    public Dragon() {
    }

    public Dragon(Boolean active, Integer crew_capacity, String description, Distance diameter, Integer dry_mass_kg, Integer dry_mass_lb, String first_flight, DragonHeatShield heat_shield, Distance height_w_trunk, String id, Mass launch_payload_mass, Volume launch_payload_vol, String name, Integer orbit_duration_yr, DragonPressurizedCapsule pressurized_capsule, Mass return_payload_mass, Volume return_payload_vol, Double sidewall_angle_deg, java.util.List<DragonThrust> thrusters, DragonTrunk trunk, String type, String wikipedia) {
        this.active = active;
        this.crew_capacity = crew_capacity;
        this.description = description;
        this.diameter = diameter;
        this.dry_mass_kg = dry_mass_kg;
        this.dry_mass_lb = dry_mass_lb;
        this.first_flight = first_flight;
        this.heat_shield = heat_shield;
        this.height_w_trunk = height_w_trunk;
        this.id = id;
        this.launch_payload_mass = launch_payload_mass;
        this.launch_payload_vol = launch_payload_vol;
        this.name = name;
        this.orbit_duration_yr = orbit_duration_yr;
        this.pressurized_capsule = pressurized_capsule;
        this.return_payload_mass = return_payload_mass;
        this.return_payload_vol = return_payload_vol;
        this.sidewall_angle_deg = sidewall_angle_deg;
        this.thrusters = thrusters;
        this.trunk = trunk;
        this.type = type;
        this.wikipedia = wikipedia;
    }

    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getCrew_capacity() {
        return crew_capacity;
    }
    public void setCrew_capacity(Integer crew_capacity) {
        this.crew_capacity = crew_capacity;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Distance getDiameter() {
        return diameter;
    }
    public void setDiameter(Distance diameter) {
        this.diameter = diameter;
    }

    public Integer getDry_mass_kg() {
        return dry_mass_kg;
    }
    public void setDry_mass_kg(Integer dry_mass_kg) {
        this.dry_mass_kg = dry_mass_kg;
    }

    public Integer getDry_mass_lb() {
        return dry_mass_lb;
    }
    public void setDry_mass_lb(Integer dry_mass_lb) {
        this.dry_mass_lb = dry_mass_lb;
    }

    public String getFirst_flight() {
        return first_flight;
    }
    public void setFirst_flight(String first_flight) {
        this.first_flight = first_flight;
    }

    public DragonHeatShield getHeat_shield() {
        return heat_shield;
    }
    public void setHeat_shield(DragonHeatShield heat_shield) {
        this.heat_shield = heat_shield;
    }

    public Distance getHeight_w_trunk() {
        return height_w_trunk;
    }
    public void setHeight_w_trunk(Distance height_w_trunk) {
        this.height_w_trunk = height_w_trunk;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Mass getLaunch_payload_mass() {
        return launch_payload_mass;
    }
    public void setLaunch_payload_mass(Mass launch_payload_mass) {
        this.launch_payload_mass = launch_payload_mass;
    }

    public Volume getLaunch_payload_vol() {
        return launch_payload_vol;
    }
    public void setLaunch_payload_vol(Volume launch_payload_vol) {
        this.launch_payload_vol = launch_payload_vol;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrbit_duration_yr() {
        return orbit_duration_yr;
    }
    public void setOrbit_duration_yr(Integer orbit_duration_yr) {
        this.orbit_duration_yr = orbit_duration_yr;
    }

    public DragonPressurizedCapsule getPressurized_capsule() {
        return pressurized_capsule;
    }
    public void setPressurized_capsule(DragonPressurizedCapsule pressurized_capsule) {
        this.pressurized_capsule = pressurized_capsule;
    }

    public Mass getReturn_payload_mass() {
        return return_payload_mass;
    }
    public void setReturn_payload_mass(Mass return_payload_mass) {
        this.return_payload_mass = return_payload_mass;
    }

    public Volume getReturn_payload_vol() {
        return return_payload_vol;
    }
    public void setReturn_payload_vol(Volume return_payload_vol) {
        this.return_payload_vol = return_payload_vol;
    }

    public Double getSidewall_angle_deg() {
        return sidewall_angle_deg;
    }
    public void setSidewall_angle_deg(Double sidewall_angle_deg) {
        this.sidewall_angle_deg = sidewall_angle_deg;
    }

    public java.util.List<DragonThrust> getThrusters() {
        return thrusters;
    }
    public void setThrusters(java.util.List<DragonThrust> thrusters) {
        this.thrusters = thrusters;
    }

    public DragonTrunk getTrunk() {
        return trunk;
    }
    public void setTrunk(DragonTrunk trunk) {
        this.trunk = trunk;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getWikipedia() {
        return wikipedia;
    }
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }



    public static Dragon.Builder builder() {
        return new Dragon.Builder();
    }

    public static class Builder {

        private Boolean active;
        private Integer crew_capacity;
        private String description;
        private Distance diameter;
        private Integer dry_mass_kg;
        private Integer dry_mass_lb;
        private String first_flight;
        private DragonHeatShield heat_shield;
        private Distance height_w_trunk;
        private String id;
        private Mass launch_payload_mass;
        private Volume launch_payload_vol;
        private String name;
        private Integer orbit_duration_yr;
        private DragonPressurizedCapsule pressurized_capsule;
        private Mass return_payload_mass;
        private Volume return_payload_vol;
        private Double sidewall_angle_deg;
        private java.util.List<DragonThrust> thrusters;
        private DragonTrunk trunk;
        private String type;
        private String wikipedia;

        public Builder() {
        }

        public Builder setActive(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder setCrew_capacity(Integer crew_capacity) {
            this.crew_capacity = crew_capacity;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDiameter(Distance diameter) {
            this.diameter = diameter;
            return this;
        }

        public Builder setDry_mass_kg(Integer dry_mass_kg) {
            this.dry_mass_kg = dry_mass_kg;
            return this;
        }

        public Builder setDry_mass_lb(Integer dry_mass_lb) {
            this.dry_mass_lb = dry_mass_lb;
            return this;
        }

        public Builder setFirst_flight(String first_flight) {
            this.first_flight = first_flight;
            return this;
        }

        public Builder setHeat_shield(DragonHeatShield heat_shield) {
            this.heat_shield = heat_shield;
            return this;
        }

        public Builder setHeight_w_trunk(Distance height_w_trunk) {
            this.height_w_trunk = height_w_trunk;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLaunch_payload_mass(Mass launch_payload_mass) {
            this.launch_payload_mass = launch_payload_mass;
            return this;
        }

        public Builder setLaunch_payload_vol(Volume launch_payload_vol) {
            this.launch_payload_vol = launch_payload_vol;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOrbit_duration_yr(Integer orbit_duration_yr) {
            this.orbit_duration_yr = orbit_duration_yr;
            return this;
        }

        public Builder setPressurized_capsule(DragonPressurizedCapsule pressurized_capsule) {
            this.pressurized_capsule = pressurized_capsule;
            return this;
        }

        public Builder setReturn_payload_mass(Mass return_payload_mass) {
            this.return_payload_mass = return_payload_mass;
            return this;
        }

        public Builder setReturn_payload_vol(Volume return_payload_vol) {
            this.return_payload_vol = return_payload_vol;
            return this;
        }

        public Builder setSidewall_angle_deg(Double sidewall_angle_deg) {
            this.sidewall_angle_deg = sidewall_angle_deg;
            return this;
        }

        public Builder setThrusters(java.util.List<DragonThrust> thrusters) {
            this.thrusters = thrusters;
            return this;
        }

        public Builder setTrunk(DragonTrunk trunk) {
            this.trunk = trunk;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setWikipedia(String wikipedia) {
            this.wikipedia = wikipedia;
            return this;
        }


        public Dragon build() {
            return new Dragon(active, crew_capacity, description, diameter, dry_mass_kg, dry_mass_lb, first_flight, heat_shield, height_w_trunk, id, launch_payload_mass, launch_payload_vol, name, orbit_duration_yr, pressurized_capsule, return_payload_mass, return_payload_vol, sidewall_angle_deg, thrusters, trunk, type, wikipedia);
        }

    }
}
