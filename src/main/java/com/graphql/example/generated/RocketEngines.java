package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class RocketEngines implements java.io.Serializable {

    private String engine_loss_max;
    private String layout;
    private Integer number;
    private String propellant_1;
    private String propellant_2;
    private Force thrust_sea_level;
    private Double thrust_to_weight;
    private Force thrust_vacuum;
    private String type;
    private String version;

    public RocketEngines() {
    }

    public RocketEngines(String engine_loss_max, String layout, Integer number, String propellant_1, String propellant_2, Force thrust_sea_level, Double thrust_to_weight, Force thrust_vacuum, String type, String version) {
        this.engine_loss_max = engine_loss_max;
        this.layout = layout;
        this.number = number;
        this.propellant_1 = propellant_1;
        this.propellant_2 = propellant_2;
        this.thrust_sea_level = thrust_sea_level;
        this.thrust_to_weight = thrust_to_weight;
        this.thrust_vacuum = thrust_vacuum;
        this.type = type;
        this.version = version;
    }

    public String getEngine_loss_max() {
        return engine_loss_max;
    }
    public void setEngine_loss_max(String engine_loss_max) {
        this.engine_loss_max = engine_loss_max;
    }

    public String getLayout() {
        return layout;
    }
    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPropellant_1() {
        return propellant_1;
    }
    public void setPropellant_1(String propellant_1) {
        this.propellant_1 = propellant_1;
    }

    public String getPropellant_2() {
        return propellant_2;
    }
    public void setPropellant_2(String propellant_2) {
        this.propellant_2 = propellant_2;
    }

    public Force getThrust_sea_level() {
        return thrust_sea_level;
    }
    public void setThrust_sea_level(Force thrust_sea_level) {
        this.thrust_sea_level = thrust_sea_level;
    }

    public Double getThrust_to_weight() {
        return thrust_to_weight;
    }
    public void setThrust_to_weight(Double thrust_to_weight) {
        this.thrust_to_weight = thrust_to_weight;
    }

    public Force getThrust_vacuum() {
        return thrust_vacuum;
    }
    public void setThrust_vacuum(Force thrust_vacuum) {
        this.thrust_vacuum = thrust_vacuum;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }



    public static RocketEngines.Builder builder() {
        return new RocketEngines.Builder();
    }

    public static class Builder {

        private String engine_loss_max;
        private String layout;
        private Integer number;
        private String propellant_1;
        private String propellant_2;
        private Force thrust_sea_level;
        private Double thrust_to_weight;
        private Force thrust_vacuum;
        private String type;
        private String version;

        public Builder() {
        }

        public Builder setEngine_loss_max(String engine_loss_max) {
            this.engine_loss_max = engine_loss_max;
            return this;
        }

        public Builder setLayout(String layout) {
            this.layout = layout;
            return this;
        }

        public Builder setNumber(Integer number) {
            this.number = number;
            return this;
        }

        public Builder setPropellant_1(String propellant_1) {
            this.propellant_1 = propellant_1;
            return this;
        }

        public Builder setPropellant_2(String propellant_2) {
            this.propellant_2 = propellant_2;
            return this;
        }

        public Builder setThrust_sea_level(Force thrust_sea_level) {
            this.thrust_sea_level = thrust_sea_level;
            return this;
        }

        public Builder setThrust_to_weight(Double thrust_to_weight) {
            this.thrust_to_weight = thrust_to_weight;
            return this;
        }

        public Builder setThrust_vacuum(Force thrust_vacuum) {
            this.thrust_vacuum = thrust_vacuum;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }


        public RocketEngines build() {
            return new RocketEngines(engine_loss_max, layout, number, propellant_1, propellant_2, thrust_sea_level, thrust_to_weight, thrust_vacuum, type, version);
        }

    }
}
