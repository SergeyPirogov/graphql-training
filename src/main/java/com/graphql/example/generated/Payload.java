package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Payload implements java.io.Serializable {

    private java.util.List<String> customers;
    private String id;
    private String manufacturer;
    private String nationality;
    private java.util.List<Integer> norad_id;
    private String orbit;
    private PayloadOrbitParams orbit_params;
    private Double payload_mass_kg;
    private Double payload_mass_lbs;
    private String payload_type;
    private Boolean reused;

    public Payload() {
    }

    public Payload(java.util.List<String> customers, String id, String manufacturer, String nationality, java.util.List<Integer> norad_id, String orbit, PayloadOrbitParams orbit_params, Double payload_mass_kg, Double payload_mass_lbs, String payload_type, Boolean reused) {
        this.customers = customers;
        this.id = id;
        this.manufacturer = manufacturer;
        this.nationality = nationality;
        this.norad_id = norad_id;
        this.orbit = orbit;
        this.orbit_params = orbit_params;
        this.payload_mass_kg = payload_mass_kg;
        this.payload_mass_lbs = payload_mass_lbs;
        this.payload_type = payload_type;
        this.reused = reused;
    }

    public java.util.List<String> getCustomers() {
        return customers;
    }
    public void setCustomers(java.util.List<String> customers) {
        this.customers = customers;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public java.util.List<Integer> getNorad_id() {
        return norad_id;
    }
    public void setNorad_id(java.util.List<Integer> norad_id) {
        this.norad_id = norad_id;
    }

    public String getOrbit() {
        return orbit;
    }
    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public PayloadOrbitParams getOrbit_params() {
        return orbit_params;
    }
    public void setOrbit_params(PayloadOrbitParams orbit_params) {
        this.orbit_params = orbit_params;
    }

    public Double getPayload_mass_kg() {
        return payload_mass_kg;
    }
    public void setPayload_mass_kg(Double payload_mass_kg) {
        this.payload_mass_kg = payload_mass_kg;
    }

    public Double getPayload_mass_lbs() {
        return payload_mass_lbs;
    }
    public void setPayload_mass_lbs(Double payload_mass_lbs) {
        this.payload_mass_lbs = payload_mass_lbs;
    }

    public String getPayload_type() {
        return payload_type;
    }
    public void setPayload_type(String payload_type) {
        this.payload_type = payload_type;
    }

    public Boolean getReused() {
        return reused;
    }
    public void setReused(Boolean reused) {
        this.reused = reused;
    }



    public static Payload.Builder builder() {
        return new Payload.Builder();
    }

    public static class Builder {

        private java.util.List<String> customers;
        private String id;
        private String manufacturer;
        private String nationality;
        private java.util.List<Integer> norad_id;
        private String orbit;
        private PayloadOrbitParams orbit_params;
        private Double payload_mass_kg;
        private Double payload_mass_lbs;
        private String payload_type;
        private Boolean reused;

        public Builder() {
        }

        public Builder setCustomers(java.util.List<String> customers) {
            this.customers = customers;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder setNorad_id(java.util.List<Integer> norad_id) {
            this.norad_id = norad_id;
            return this;
        }

        public Builder setOrbit(String orbit) {
            this.orbit = orbit;
            return this;
        }

        public Builder setOrbit_params(PayloadOrbitParams orbit_params) {
            this.orbit_params = orbit_params;
            return this;
        }

        public Builder setPayload_mass_kg(Double payload_mass_kg) {
            this.payload_mass_kg = payload_mass_kg;
            return this;
        }

        public Builder setPayload_mass_lbs(Double payload_mass_lbs) {
            this.payload_mass_lbs = payload_mass_lbs;
            return this;
        }

        public Builder setPayload_type(String payload_type) {
            this.payload_type = payload_type;
            return this;
        }

        public Builder setReused(Boolean reused) {
            this.reused = reused;
            return this;
        }


        public Payload build() {
            return new Payload(customers, id, manufacturer, nationality, norad_id, orbit, orbit_params, payload_mass_kg, payload_mass_lbs, payload_type, reused);
        }

    }
}
