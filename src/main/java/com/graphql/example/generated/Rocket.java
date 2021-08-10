package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Rocket implements java.io.Serializable {

    private Boolean active;
    private Integer boosters;
    private String company;
    private Integer cost_per_launch;
    private String country;
    private String description;
    private Distance diameter;
    private RocketEngines engines;
    private String first_flight;
    private RocketFirstStage first_stage;
    private Distance height;
    private String id;
    private RocketLandingLegs landing_legs;
    private Mass mass;
    private String name;
    private java.util.List<RocketPayloadWeight> payload_weights;
    private RocketSecondStage second_stage;
    private Integer stages;
    private Integer success_rate_pct;
    private String type;
    private String wikipedia;

    public Rocket() {
    }

    public Rocket(Boolean active, Integer boosters, String company, Integer cost_per_launch, String country, String description, Distance diameter, RocketEngines engines, String first_flight, RocketFirstStage first_stage, Distance height, String id, RocketLandingLegs landing_legs, Mass mass, String name, java.util.List<RocketPayloadWeight> payload_weights, RocketSecondStage second_stage, Integer stages, Integer success_rate_pct, String type, String wikipedia) {
        this.active = active;
        this.boosters = boosters;
        this.company = company;
        this.cost_per_launch = cost_per_launch;
        this.country = country;
        this.description = description;
        this.diameter = diameter;
        this.engines = engines;
        this.first_flight = first_flight;
        this.first_stage = first_stage;
        this.height = height;
        this.id = id;
        this.landing_legs = landing_legs;
        this.mass = mass;
        this.name = name;
        this.payload_weights = payload_weights;
        this.second_stage = second_stage;
        this.stages = stages;
        this.success_rate_pct = success_rate_pct;
        this.type = type;
        this.wikipedia = wikipedia;
    }

    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getBoosters() {
        return boosters;
    }
    public void setBoosters(Integer boosters) {
        this.boosters = boosters;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getCost_per_launch() {
        return cost_per_launch;
    }
    public void setCost_per_launch(Integer cost_per_launch) {
        this.cost_per_launch = cost_per_launch;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
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

    public RocketEngines getEngines() {
        return engines;
    }
    public void setEngines(RocketEngines engines) {
        this.engines = engines;
    }

    public String getFirst_flight() {
        return first_flight;
    }
    public void setFirst_flight(String first_flight) {
        this.first_flight = first_flight;
    }

    public RocketFirstStage getFirst_stage() {
        return first_stage;
    }
    public void setFirst_stage(RocketFirstStage first_stage) {
        this.first_stage = first_stage;
    }

    public Distance getHeight() {
        return height;
    }
    public void setHeight(Distance height) {
        this.height = height;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public RocketLandingLegs getLanding_legs() {
        return landing_legs;
    }
    public void setLanding_legs(RocketLandingLegs landing_legs) {
        this.landing_legs = landing_legs;
    }

    public Mass getMass() {
        return mass;
    }
    public void setMass(Mass mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<RocketPayloadWeight> getPayload_weights() {
        return payload_weights;
    }
    public void setPayload_weights(java.util.List<RocketPayloadWeight> payload_weights) {
        this.payload_weights = payload_weights;
    }

    public RocketSecondStage getSecond_stage() {
        return second_stage;
    }
    public void setSecond_stage(RocketSecondStage second_stage) {
        this.second_stage = second_stage;
    }

    public Integer getStages() {
        return stages;
    }
    public void setStages(Integer stages) {
        this.stages = stages;
    }

    public Integer getSuccess_rate_pct() {
        return success_rate_pct;
    }
    public void setSuccess_rate_pct(Integer success_rate_pct) {
        this.success_rate_pct = success_rate_pct;
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



    public static Rocket.Builder builder() {
        return new Rocket.Builder();
    }

    public static class Builder {

        private Boolean active;
        private Integer boosters;
        private String company;
        private Integer cost_per_launch;
        private String country;
        private String description;
        private Distance diameter;
        private RocketEngines engines;
        private String first_flight;
        private RocketFirstStage first_stage;
        private Distance height;
        private String id;
        private RocketLandingLegs landing_legs;
        private Mass mass;
        private String name;
        private java.util.List<RocketPayloadWeight> payload_weights;
        private RocketSecondStage second_stage;
        private Integer stages;
        private Integer success_rate_pct;
        private String type;
        private String wikipedia;

        public Builder() {
        }

        public Builder setActive(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder setBoosters(Integer boosters) {
            this.boosters = boosters;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setCost_per_launch(Integer cost_per_launch) {
            this.cost_per_launch = cost_per_launch;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
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

        public Builder setEngines(RocketEngines engines) {
            this.engines = engines;
            return this;
        }

        public Builder setFirst_flight(String first_flight) {
            this.first_flight = first_flight;
            return this;
        }

        public Builder setFirst_stage(RocketFirstStage first_stage) {
            this.first_stage = first_stage;
            return this;
        }

        public Builder setHeight(Distance height) {
            this.height = height;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLanding_legs(RocketLandingLegs landing_legs) {
            this.landing_legs = landing_legs;
            return this;
        }

        public Builder setMass(Mass mass) {
            this.mass = mass;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPayload_weights(java.util.List<RocketPayloadWeight> payload_weights) {
            this.payload_weights = payload_weights;
            return this;
        }

        public Builder setSecond_stage(RocketSecondStage second_stage) {
            this.second_stage = second_stage;
            return this;
        }

        public Builder setStages(Integer stages) {
            this.stages = stages;
            return this;
        }

        public Builder setSuccess_rate_pct(Integer success_rate_pct) {
            this.success_rate_pct = success_rate_pct;
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


        public Rocket build() {
            return new Rocket(active, boosters, company, cost_per_launch, country, description, diameter, engines, first_flight, first_stage, height, id, landing_legs, mass, name, payload_weights, second_stage, stages, success_rate_pct, type, wikipedia);
        }

    }
}
