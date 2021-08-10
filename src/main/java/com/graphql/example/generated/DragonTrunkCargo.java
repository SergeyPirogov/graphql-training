package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class DragonTrunkCargo implements java.io.Serializable {

    private Integer solar_array;
    private Boolean unpressurized_cargo;

    public DragonTrunkCargo() {
    }

    public DragonTrunkCargo(Integer solar_array, Boolean unpressurized_cargo) {
        this.solar_array = solar_array;
        this.unpressurized_cargo = unpressurized_cargo;
    }

    public Integer getSolar_array() {
        return solar_array;
    }
    public void setSolar_array(Integer solar_array) {
        this.solar_array = solar_array;
    }

    public Boolean getUnpressurized_cargo() {
        return unpressurized_cargo;
    }
    public void setUnpressurized_cargo(Boolean unpressurized_cargo) {
        this.unpressurized_cargo = unpressurized_cargo;
    }



    public static DragonTrunkCargo.Builder builder() {
        return new DragonTrunkCargo.Builder();
    }

    public static class Builder {

        private Integer solar_array;
        private Boolean unpressurized_cargo;

        public Builder() {
        }

        public Builder setSolar_array(Integer solar_array) {
            this.solar_array = solar_array;
            return this;
        }

        public Builder setUnpressurized_cargo(Boolean unpressurized_cargo) {
            this.unpressurized_cargo = unpressurized_cargo;
            return this;
        }


        public DragonTrunkCargo build() {
            return new DragonTrunkCargo(solar_array, unpressurized_cargo);
        }

    }
}
