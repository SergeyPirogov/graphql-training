package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class DragonTrunk implements java.io.Serializable {

    private DragonTrunkCargo cargo;
    private Volume trunk_volume;

    public DragonTrunk() {
    }

    public DragonTrunk(DragonTrunkCargo cargo, Volume trunk_volume) {
        this.cargo = cargo;
        this.trunk_volume = trunk_volume;
    }

    public DragonTrunkCargo getCargo() {
        return cargo;
    }
    public void setCargo(DragonTrunkCargo cargo) {
        this.cargo = cargo;
    }

    public Volume getTrunk_volume() {
        return trunk_volume;
    }
    public void setTrunk_volume(Volume trunk_volume) {
        this.trunk_volume = trunk_volume;
    }



    public static DragonTrunk.Builder builder() {
        return new DragonTrunk.Builder();
    }

    public static class Builder {

        private DragonTrunkCargo cargo;
        private Volume trunk_volume;

        public Builder() {
        }

        public Builder setCargo(DragonTrunkCargo cargo) {
            this.cargo = cargo;
            return this;
        }

        public Builder setTrunk_volume(Volume trunk_volume) {
            this.trunk_volume = trunk_volume;
            return this;
        }


        public DragonTrunk build() {
            return new DragonTrunk(cargo, trunk_volume);
        }

    }
}
