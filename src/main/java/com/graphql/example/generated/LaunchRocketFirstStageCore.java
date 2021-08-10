package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class LaunchRocketFirstStageCore implements java.io.Serializable {

    private Integer block;
    private Core core;
    private Integer flight;
    private Boolean gridfins;
    private Boolean land_success;
    private Boolean landing_intent;
    private String landing_type;
    private String landing_vehicle;
    private Boolean legs;
    private Boolean reused;

    public LaunchRocketFirstStageCore() {
    }

    public LaunchRocketFirstStageCore(Integer block, Core core, Integer flight, Boolean gridfins, Boolean land_success, Boolean landing_intent, String landing_type, String landing_vehicle, Boolean legs, Boolean reused) {
        this.block = block;
        this.core = core;
        this.flight = flight;
        this.gridfins = gridfins;
        this.land_success = land_success;
        this.landing_intent = landing_intent;
        this.landing_type = landing_type;
        this.landing_vehicle = landing_vehicle;
        this.legs = legs;
        this.reused = reused;
    }

    public Integer getBlock() {
        return block;
    }
    public void setBlock(Integer block) {
        this.block = block;
    }

    public Core getCore() {
        return core;
    }
    public void setCore(Core core) {
        this.core = core;
    }

    public Integer getFlight() {
        return flight;
    }
    public void setFlight(Integer flight) {
        this.flight = flight;
    }

    public Boolean getGridfins() {
        return gridfins;
    }
    public void setGridfins(Boolean gridfins) {
        this.gridfins = gridfins;
    }

    public Boolean getLand_success() {
        return land_success;
    }
    public void setLand_success(Boolean land_success) {
        this.land_success = land_success;
    }

    public Boolean getLanding_intent() {
        return landing_intent;
    }
    public void setLanding_intent(Boolean landing_intent) {
        this.landing_intent = landing_intent;
    }

    public String getLanding_type() {
        return landing_type;
    }
    public void setLanding_type(String landing_type) {
        this.landing_type = landing_type;
    }

    public String getLanding_vehicle() {
        return landing_vehicle;
    }
    public void setLanding_vehicle(String landing_vehicle) {
        this.landing_vehicle = landing_vehicle;
    }

    public Boolean getLegs() {
        return legs;
    }
    public void setLegs(Boolean legs) {
        this.legs = legs;
    }

    public Boolean getReused() {
        return reused;
    }
    public void setReused(Boolean reused) {
        this.reused = reused;
    }



    public static LaunchRocketFirstStageCore.Builder builder() {
        return new LaunchRocketFirstStageCore.Builder();
    }

    public static class Builder {

        private Integer block;
        private Core core;
        private Integer flight;
        private Boolean gridfins;
        private Boolean land_success;
        private Boolean landing_intent;
        private String landing_type;
        private String landing_vehicle;
        private Boolean legs;
        private Boolean reused;

        public Builder() {
        }

        public Builder setBlock(Integer block) {
            this.block = block;
            return this;
        }

        public Builder setCore(Core core) {
            this.core = core;
            return this;
        }

        public Builder setFlight(Integer flight) {
            this.flight = flight;
            return this;
        }

        public Builder setGridfins(Boolean gridfins) {
            this.gridfins = gridfins;
            return this;
        }

        public Builder setLand_success(Boolean land_success) {
            this.land_success = land_success;
            return this;
        }

        public Builder setLanding_intent(Boolean landing_intent) {
            this.landing_intent = landing_intent;
            return this;
        }

        public Builder setLanding_type(String landing_type) {
            this.landing_type = landing_type;
            return this;
        }

        public Builder setLanding_vehicle(String landing_vehicle) {
            this.landing_vehicle = landing_vehicle;
            return this;
        }

        public Builder setLegs(Boolean legs) {
            this.legs = legs;
            return this;
        }

        public Builder setReused(Boolean reused) {
            this.reused = reused;
            return this;
        }


        public LaunchRocketFirstStageCore build() {
            return new LaunchRocketFirstStageCore(block, core, flight, gridfins, land_success, landing_intent, landing_type, landing_vehicle, legs, reused);
        }

    }
}
