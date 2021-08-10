package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class RocketFirstStage implements java.io.Serializable {

    private Integer burn_time_sec;
    private Integer engines;
    private Double fuel_amount_tons;
    private Boolean reusable;
    private Force thrust_sea_level;
    private Force thrust_vacuum;

    public RocketFirstStage() {
    }

    public RocketFirstStage(Integer burn_time_sec, Integer engines, Double fuel_amount_tons, Boolean reusable, Force thrust_sea_level, Force thrust_vacuum) {
        this.burn_time_sec = burn_time_sec;
        this.engines = engines;
        this.fuel_amount_tons = fuel_amount_tons;
        this.reusable = reusable;
        this.thrust_sea_level = thrust_sea_level;
        this.thrust_vacuum = thrust_vacuum;
    }

    public Integer getBurn_time_sec() {
        return burn_time_sec;
    }
    public void setBurn_time_sec(Integer burn_time_sec) {
        this.burn_time_sec = burn_time_sec;
    }

    public Integer getEngines() {
        return engines;
    }
    public void setEngines(Integer engines) {
        this.engines = engines;
    }

    public Double getFuel_amount_tons() {
        return fuel_amount_tons;
    }
    public void setFuel_amount_tons(Double fuel_amount_tons) {
        this.fuel_amount_tons = fuel_amount_tons;
    }

    public Boolean getReusable() {
        return reusable;
    }
    public void setReusable(Boolean reusable) {
        this.reusable = reusable;
    }

    public Force getThrust_sea_level() {
        return thrust_sea_level;
    }
    public void setThrust_sea_level(Force thrust_sea_level) {
        this.thrust_sea_level = thrust_sea_level;
    }

    public Force getThrust_vacuum() {
        return thrust_vacuum;
    }
    public void setThrust_vacuum(Force thrust_vacuum) {
        this.thrust_vacuum = thrust_vacuum;
    }



    public static RocketFirstStage.Builder builder() {
        return new RocketFirstStage.Builder();
    }

    public static class Builder {

        private Integer burn_time_sec;
        private Integer engines;
        private Double fuel_amount_tons;
        private Boolean reusable;
        private Force thrust_sea_level;
        private Force thrust_vacuum;

        public Builder() {
        }

        public Builder setBurn_time_sec(Integer burn_time_sec) {
            this.burn_time_sec = burn_time_sec;
            return this;
        }

        public Builder setEngines(Integer engines) {
            this.engines = engines;
            return this;
        }

        public Builder setFuel_amount_tons(Double fuel_amount_tons) {
            this.fuel_amount_tons = fuel_amount_tons;
            return this;
        }

        public Builder setReusable(Boolean reusable) {
            this.reusable = reusable;
            return this;
        }

        public Builder setThrust_sea_level(Force thrust_sea_level) {
            this.thrust_sea_level = thrust_sea_level;
            return this;
        }

        public Builder setThrust_vacuum(Force thrust_vacuum) {
            this.thrust_vacuum = thrust_vacuum;
            return this;
        }


        public RocketFirstStage build() {
            return new RocketFirstStage(burn_time_sec, engines, fuel_amount_tons, reusable, thrust_sea_level, thrust_vacuum);
        }

    }
}
