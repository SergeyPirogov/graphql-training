package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class DragonThrust implements java.io.Serializable {

    private Integer amount;
    private String fuel_1;
    private String fuel_2;
    private Integer pods;
    private Force thrust;
    private String type;

    public DragonThrust() {
    }

    public DragonThrust(Integer amount, String fuel_1, String fuel_2, Integer pods, Force thrust, String type) {
        this.amount = amount;
        this.fuel_1 = fuel_1;
        this.fuel_2 = fuel_2;
        this.pods = pods;
        this.thrust = thrust;
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getFuel_1() {
        return fuel_1;
    }
    public void setFuel_1(String fuel_1) {
        this.fuel_1 = fuel_1;
    }

    public String getFuel_2() {
        return fuel_2;
    }
    public void setFuel_2(String fuel_2) {
        this.fuel_2 = fuel_2;
    }

    public Integer getPods() {
        return pods;
    }
    public void setPods(Integer pods) {
        this.pods = pods;
    }

    public Force getThrust() {
        return thrust;
    }
    public void setThrust(Force thrust) {
        this.thrust = thrust;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }



    public static DragonThrust.Builder builder() {
        return new DragonThrust.Builder();
    }

    public static class Builder {

        private Integer amount;
        private String fuel_1;
        private String fuel_2;
        private Integer pods;
        private Force thrust;
        private String type;

        public Builder() {
        }

        public Builder setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }

        public Builder setFuel_1(String fuel_1) {
            this.fuel_1 = fuel_1;
            return this;
        }

        public Builder setFuel_2(String fuel_2) {
            this.fuel_2 = fuel_2;
            return this;
        }

        public Builder setPods(Integer pods) {
            this.pods = pods;
            return this;
        }

        public Builder setThrust(Force thrust) {
            this.thrust = thrust;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }


        public DragonThrust build() {
            return new DragonThrust(amount, fuel_1, fuel_2, pods, thrust, type);
        }

    }
}
