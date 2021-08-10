package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class PayloadsFind implements java.io.Serializable {

    private Double apoapsis_km;
    private String customer;
    private Double eccentricity;
    private String epoch;
    private Double inclination_deg;
    private Double lifespan_years;
    private Double longitude;
    private String manufacturer;
    private Double mean_motion;
    private String nationality;
    private Integer norad_id;
    private String orbit;
    private String payload_id;
    private String payload_type;
    private Double periapsis_km;
    private Double period_min;
    private Double raan;
    private String reference_system;
    private String regime;
    private Boolean reused;
    private Double semi_major_axis_km;

    public PayloadsFind() {
    }

    public PayloadsFind(Double apoapsis_km, String customer, Double eccentricity, String epoch, Double inclination_deg, Double lifespan_years, Double longitude, String manufacturer, Double mean_motion, String nationality, Integer norad_id, String orbit, String payload_id, String payload_type, Double periapsis_km, Double period_min, Double raan, String reference_system, String regime, Boolean reused, Double semi_major_axis_km) {
        this.apoapsis_km = apoapsis_km;
        this.customer = customer;
        this.eccentricity = eccentricity;
        this.epoch = epoch;
        this.inclination_deg = inclination_deg;
        this.lifespan_years = lifespan_years;
        this.longitude = longitude;
        this.manufacturer = manufacturer;
        this.mean_motion = mean_motion;
        this.nationality = nationality;
        this.norad_id = norad_id;
        this.orbit = orbit;
        this.payload_id = payload_id;
        this.payload_type = payload_type;
        this.periapsis_km = periapsis_km;
        this.period_min = period_min;
        this.raan = raan;
        this.reference_system = reference_system;
        this.regime = regime;
        this.reused = reused;
        this.semi_major_axis_km = semi_major_axis_km;
    }

    public Double getApoapsis_km() {
        return apoapsis_km;
    }
    public void setApoapsis_km(Double apoapsis_km) {
        this.apoapsis_km = apoapsis_km;
    }

    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
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

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getMean_motion() {
        return mean_motion;
    }
    public void setMean_motion(Double mean_motion) {
        this.mean_motion = mean_motion;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getNorad_id() {
        return norad_id;
    }
    public void setNorad_id(Integer norad_id) {
        this.norad_id = norad_id;
    }

    public String getOrbit() {
        return orbit;
    }
    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public String getPayload_id() {
        return payload_id;
    }
    public void setPayload_id(String payload_id) {
        this.payload_id = payload_id;
    }

    public String getPayload_type() {
        return payload_type;
    }
    public void setPayload_type(String payload_type) {
        this.payload_type = payload_type;
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

    public Boolean getReused() {
        return reused;
    }
    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    public Double getSemi_major_axis_km() {
        return semi_major_axis_km;
    }
    public void setSemi_major_axis_km(Double semi_major_axis_km) {
        this.semi_major_axis_km = semi_major_axis_km;
    }



    public static PayloadsFind.Builder builder() {
        return new PayloadsFind.Builder();
    }

    public static class Builder {

        private Double apoapsis_km;
        private String customer;
        private Double eccentricity;
        private String epoch;
        private Double inclination_deg;
        private Double lifespan_years;
        private Double longitude;
        private String manufacturer;
        private Double mean_motion;
        private String nationality;
        private Integer norad_id;
        private String orbit;
        private String payload_id;
        private String payload_type;
        private Double periapsis_km;
        private Double period_min;
        private Double raan;
        private String reference_system;
        private String regime;
        private Boolean reused;
        private Double semi_major_axis_km;

        public Builder() {
        }

        public Builder setApoapsis_km(Double apoapsis_km) {
            this.apoapsis_km = apoapsis_km;
            return this;
        }

        public Builder setCustomer(String customer) {
            this.customer = customer;
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

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder setMean_motion(Double mean_motion) {
            this.mean_motion = mean_motion;
            return this;
        }

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder setNorad_id(Integer norad_id) {
            this.norad_id = norad_id;
            return this;
        }

        public Builder setOrbit(String orbit) {
            this.orbit = orbit;
            return this;
        }

        public Builder setPayload_id(String payload_id) {
            this.payload_id = payload_id;
            return this;
        }

        public Builder setPayload_type(String payload_type) {
            this.payload_type = payload_type;
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

        public Builder setReused(Boolean reused) {
            this.reused = reused;
            return this;
        }

        public Builder setSemi_major_axis_km(Double semi_major_axis_km) {
            this.semi_major_axis_km = semi_major_axis_km;
            return this;
        }


        public PayloadsFind build() {
            return new PayloadsFind(apoapsis_km, customer, eccentricity, epoch, inclination_deg, lifespan_years, longitude, manufacturer, mean_motion, nationality, norad_id, orbit, payload_id, payload_type, periapsis_km, period_min, raan, reference_system, regime, reused, semi_major_axis_km);
        }

    }
}
