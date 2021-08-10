package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class LaunchRocketSecondStage implements java.io.Serializable {

    private Integer block;
    private java.util.List<Payload> payloads;

    public LaunchRocketSecondStage() {
    }

    public LaunchRocketSecondStage(Integer block, java.util.List<Payload> payloads) {
        this.block = block;
        this.payloads = payloads;
    }

    public Integer getBlock() {
        return block;
    }
    public void setBlock(Integer block) {
        this.block = block;
    }

    public java.util.List<Payload> getPayloads() {
        return payloads;
    }
    public void setPayloads(java.util.List<Payload> payloads) {
        this.payloads = payloads;
    }



    public static LaunchRocketSecondStage.Builder builder() {
        return new LaunchRocketSecondStage.Builder();
    }

    public static class Builder {

        private Integer block;
        private java.util.List<Payload> payloads;

        public Builder() {
        }

        public Builder setBlock(Integer block) {
            this.block = block;
            return this;
        }

        public Builder setPayloads(java.util.List<Payload> payloads) {
            this.payloads = payloads;
            return this;
        }


        public LaunchRocketSecondStage build() {
            return new LaunchRocketSecondStage(block, payloads);
        }

    }
}
