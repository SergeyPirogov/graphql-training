package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class RocketPayloadWeight implements java.io.Serializable {

    private String id;
    private Integer kg;
    private Integer lb;
    private String name;

    public RocketPayloadWeight() {
    }

    public RocketPayloadWeight(String id, Integer kg, Integer lb, String name) {
        this.id = id;
        this.kg = kg;
        this.lb = lb;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Integer getKg() {
        return kg;
    }
    public void setKg(Integer kg) {
        this.kg = kg;
    }

    public Integer getLb() {
        return lb;
    }
    public void setLb(Integer lb) {
        this.lb = lb;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public static RocketPayloadWeight.Builder builder() {
        return new RocketPayloadWeight.Builder();
    }

    public static class Builder {

        private String id;
        private Integer kg;
        private Integer lb;
        private String name;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setKg(Integer kg) {
            this.kg = kg;
            return this;
        }

        public Builder setLb(Integer lb) {
            this.lb = lb;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public RocketPayloadWeight build() {
            return new RocketPayloadWeight(id, kg, lb, name);
        }

    }
}
