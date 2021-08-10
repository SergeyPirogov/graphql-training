package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class PayloadOrbitParams implements java.io.Serializable {

    private Double apoapsis_km;
    private Double arg_of_pericenter;
    private Double eccentricity;
    private String epoch;
    private Double inclination_deg;
    private Double lifespan_years;
    private Double longitude;
    private Double mean_anomaly;
    private Double mean_motion;
    private Double periapsis_km;
    private Double period_min;
    private Double raan;
    private String reference_system;
    private String regime;
    private Double semi_major_axis_km;

    public PayloadOrbitParams() {
    }

    public PayloadOrbitParams(Double apoapsis_km, Double arg_of_pericenter, Double eccentricity, String epoch, Double inclination_deg, Double lifespan_years, Double longitude, Double mean_anomaly, Double mean_motion, Double periapsis_km, Double period_min, Double raan, String reference_system, String regime, Double semi_major_axis_km) {
        this.apoapsis_km = apoapsis_km;
        this.arg_of_pericenter = arg_of_pericenter;
        this.eccentricity = eccentricity;
        this.epoch = epoch;
        this.inclination_deg = inclination_deg;
        this.lifespan_years = lifespan_years;
        this.longitude = longitude;
        this.mean_anomaly = mean_anomaly;
        this.mean_motion = mean_motion;
        this.periapsis_km = periapsis_km;
        this.period_min = period_min;
        this.raan = raan;
        this.reference_system = reference_system;
        this.regime = regime;
        this.semi_major_axis_km = semi_major_axis_km;
    }

    public Double getApoapsis_km() {
        return apoapsis_km;
    }
    public void setApoapsis_km(Double apoapsis_km) {
        this.apoapsis_km = apoapsis_km;
    }

    public Double getArg_of_pericenter() {
        return arg_of_pericenter;
    }
    public void setArg_of_pericenter(Double arg_of_pericenter) {
        this.arg_of_pericenter = arg_of_pericenter;
    }

    public Double getEccentricity() {
        return eccentricity;
    }
    public void setEccentricity(Double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public String getEpoch() {
        return epoch;
    }
    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public Double getInclination_deg() {
        return inclination_deg;
    }
    public void setInclination_deg(Double inclination_deg) {
        this.inclination_deg = inclination_deg;
    }

    public Double getLifespan_years() {
        return lifespan_years;
    }
    public void setLifespan_years(Double lifespan_years) {
        this.lifespan_years = lifespan_years;
    }

    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getMean_anomaly() {
        return mean_anomaly;
    }
    public void setMean_anomaly(Double mean_anomaly) {
        this.mean_anomaly = mean_anomaly;
    }

    public Double getMean_motion() {
        return mean_motion;
    }
    public void setMean_motion(Double mean_motion) {
        this.mean_motion = mean_motion;
    }

    public Double getPeriapsis_km() {
        return periapsis_km;
    }
    public void setPeriapsis_km(Double periapsis_km) {
        this.periapsis_km = periapsis_km;
    }

    public Double getPeriod_min() {
        return period_min;
    }
    public void setPeriod_min(Double period_min) {
        this.period_min = period_min;
    }

    public Double getRaan() {
        return raan;
    }
    public void setRaan(Double raan) {
        this.raan = raan;
    }

    public String getReference_system() {
        return reference_system;
    }
    public void setReference_system(String reference_system) {
        this.reference_system = reference_system;
    }

    public String getRegime() {
        return regime;
    }
    public void setRegime(String regime) {
        this.regime = regime;
    }

    public Double getSemi_major_axis_km() {
        return semi_major_axis_km;
    }
    public void setSemi_major_axis_km(Double semi_major_axis_km) {
        this.semi_major_axis_km = semi_major_axis_km;
    }



    public static PayloadOrbitParams.Builder builder() {
        return new PayloadOrbitParams.Builder();
    }

    public static class Builder {

        private Double apoapsis_km;
        private Double arg_of_pericenter;
        private Double eccentricity;
        private String epoch;
        private Double inclination_deg;
        private Double lifespan_years;
        private Double longitude;
        private Double mean_anomaly;
        private Double mean_motion;
        private Double periapsis_km;
        private Double period_min;
        private Double raan;
        private String reference_system;
        private String regime;
        private Double semi_major_axis_km;

        public Builder() {
        }

        public Builder setApoapsis_km(Double apoapsis_km) {
            this.apoapsis_km = apoapsis_km;
            return this;
        }

        public Builder setArg_of_pericenter(Double arg_of_pericenter) {
            this.arg_of_pericenter = arg_of_pericenter;
            return this;
        }

        public Builder setEccentricity(Double eccentricity) {
            this.eccentricity = eccentricity;
            return this;
        }

        public Builder setEpoch(String epoch) {
            this.epoch = epoch;
            return this;
        }

        public Builder setInclination_deg(Double inclination_deg) {
            this.inclination_deg = inclination_deg;
            return this;
        }

        public Builder setLifespan_years(Double lifespan_years) {
            this.lifespan_years = lifespan_years;
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setMean_anomaly(Double mean_anomaly) {
            this.mean_anomaly = mean_anomaly;
            return this;
        }

        public Builder setMean_motion(Double mean_motion) {
            this.mean_motion = mean_motion;
            return this;
        }

        public Builder setPeriapsis_km(Double periapsis_km) {
            this.periapsis_km = periapsis_km;
            return this;
        }

        public Builder setPeriod_min(Double period_min) {
            this.period_min = period_min;
            return this;
        }

        public Builder setRaan(Double raan) {
            this.raan = raan;
            return this;
        }

        public Builder setReference_system(String reference_system) {
            this.reference_system = reference_system;
            return this;
        }

        public Builder setRegime(String regime) {
            this.regime = regime;
            return this;
        }

        public Builder setSemi_major_axis_km(Double semi_major_axis_km) {
            this.semi_major_axis_km = semi_major_axis_km;
            return this;
        }


        public PayloadOrbitParams build() {
            return new PayloadOrbitParams(apoapsis_km, arg_of_pericenter, eccentricity, epoch, inclination_deg, lifespan_years, longitude, mean_anomaly, mean_motion, periapsis_km, period_min, raan, reference_system, regime, semi_major_axis_km);
        }

    }
}
