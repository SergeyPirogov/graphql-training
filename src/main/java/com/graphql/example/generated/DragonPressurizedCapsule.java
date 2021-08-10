package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class DragonPressurizedCapsule implements java.io.Serializable {

    private Volume payload_volume;

    public DragonPressurizedCapsule() {
    }

    public DragonPressurizedCapsule(Volume payload_volume) {
        this.payload_volume = payload_volume;
    }

    public Volume getPayload_volume() {
        return payload_volume;
    }
    public void setPayload_volume(Volume payload_volume) {
        this.payload_volume = payload_volume;
    }



    public static DragonPressurizedCapsule.Builder builder() {
        return new DragonPressurizedCapsule.Builder();
    }

    public static class Builder {

        private Volume payload_volume;

        public Builder() {
        }

        public Builder setPayload_volume(Volume payload_volume) {
            this.payload_volume = payload_volume;
            return this;
        }


        public DragonPressurizedCapsule build() {
            return new DragonPressurizedCapsule(payload_volume);
        }

    }
}
