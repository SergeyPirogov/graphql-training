package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class MissionResult implements java.io.Serializable {

    private java.util.List<Mission> data;
    private Result result;

    public MissionResult() {
    }

    public MissionResult(java.util.List<Mission> data, Result result) {
        this.data = data;
        this.result = result;
    }

    public java.util.List<Mission> getData() {
        return data;
    }
    public void setData(java.util.List<Mission> data) {
        this.data = data;
    }

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }



    public static MissionResult.Builder builder() {
        return new MissionResult.Builder();
    }

    public static class Builder {

        private java.util.List<Mission> data;
        private Result result;

        public Builder() {
        }

        public Builder setData(java.util.List<Mission> data) {
            this.data = data;
            return this;
        }

        public Builder setResult(Result result) {
            this.result = result;
            return this;
        }


        public MissionResult build() {
            return new MissionResult(data, result);
        }

    }
}
