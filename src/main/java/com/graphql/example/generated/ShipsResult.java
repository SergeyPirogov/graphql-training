package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class ShipsResult implements java.io.Serializable {

    private java.util.List<Ship> data;
    private Result result;

    public ShipsResult() {
    }

    public ShipsResult(java.util.List<Ship> data, Result result) {
        this.data = data;
        this.result = result;
    }

    public java.util.List<Ship> getData() {
        return data;
    }
    public void setData(java.util.List<Ship> data) {
        this.data = data;
    }

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }



    public static ShipsResult.Builder builder() {
        return new ShipsResult.Builder();
    }

    public static class Builder {

        private java.util.List<Ship> data;
        private Result result;

        public Builder() {
        }

        public Builder setData(java.util.List<Ship> data) {
            this.data = data;
            return this;
        }

        public Builder setResult(Result result) {
            this.result = result;
            return this;
        }


        public ShipsResult build() {
            return new ShipsResult(data, result);
        }

    }
}
