package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class RocketSecondStage implements java.io.Serializable {

    private Integer burn_time_sec;
    private Integer engines;
    private Double fuel_amount_tons;
    private RocketSecondStagePayloads payloads;
    private Force thrust;

    public RocketSecondStage() {
    }

    public RocketSecondStage(Integer burn_time_sec, Integer engines, Double fuel_amount_tons, RocketSecondStagePayloads payloads, Force thrust) {
        this.burn_time_sec = burn_time_sec;
        this.engines = engines;
        this.fuel_amount_tons = fuel_amount_tons;
        this.payloads = payloads;
        this.thrust = thrust;
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

    public RocketSecondStagePayloads getPayloads() {
        return payloads;
    }
    public void setPayloads(RocketSecondStagePayloads payloads) {
        this.payloads = payloads;
    }

    public Force getThrust() {
        return thrust;
    }
    public void setThrust(Force thrust) {
        this.thrust = thrust;
    }



    public static RocketSecondStage.Builder builder() {
        return new RocketSecondStage.Builder();
    }

    public static class Builder {

        private Integer burn_time_sec;
        private Integer engines;
        private Double fuel_amount_tons;
        private RocketSecondStagePayloads payloads;
        private Force thrust;

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

        public Builder setPayloads(RocketSecondStagePayloads payloads) {
            this.payloads = payloads;
            return this;
        }

        public Builder setThrust(Force thrust) {
            this.thrust = thrust;
            return this;
        }


        public RocketSecondStage build() {
            return new RocketSecondStage(burn_time_sec, engines, fuel_amount_tons, payloads, thrust);
        }

    }
}
