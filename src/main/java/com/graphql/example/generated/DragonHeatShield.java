package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class DragonHeatShield implements java.io.Serializable {

    private String dev_partner;
    private String material;
    private Double size_meters;
    private Integer temp_degrees;

    public DragonHeatShield() {
    }

    public DragonHeatShield(String dev_partner, String material, Double size_meters, Integer temp_degrees) {
        this.dev_partner = dev_partner;
        this.material = material;
        this.size_meters = size_meters;
        this.temp_degrees = temp_degrees;
    }

    public String getDev_partner() {
        return dev_partner;
    }
    public void setDev_partner(String dev_partner) {
        this.dev_partner = dev_partner;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getSize_meters() {
        return size_meters;
    }
    public void setSize_meters(Double size_meters) {
        this.size_meters = size_meters;
    }

    public Integer getTemp_degrees() {
        return temp_degrees;
    }
    public void setTemp_degrees(Integer temp_degrees) {
        this.temp_degrees = temp_degrees;
    }



    public static DragonHeatShield.Builder builder() {
        return new DragonHeatShield.Builder();
    }

    public static class Builder {

        private String dev_partner;
        private String material;
        private Double size_meters;
        private Integer temp_degrees;

        public Builder() {
        }

        public Builder setDev_partner(String dev_partner) {
            this.dev_partner = dev_partner;
            return this;
        }

        public Builder setMaterial(String material) {
            this.material = material;
            return this;
        }

        public Builder setSize_meters(Double size_meters) {
            this.size_meters = size_meters;
            return this;
        }

        public Builder setTemp_degrees(Integer temp_degrees) {
            this.temp_degrees = temp_degrees;
            return this;
        }


        public DragonHeatShield build() {
            return new DragonHeatShield(dev_partner, material, size_meters, temp_degrees);
        }

    }
}
