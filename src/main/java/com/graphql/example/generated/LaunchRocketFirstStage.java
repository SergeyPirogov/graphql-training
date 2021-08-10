package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class LaunchRocketFirstStage implements java.io.Serializable {

    private java.util.List<LaunchRocketFirstStageCore> cores;

    public LaunchRocketFirstStage() {
    }

    public LaunchRocketFirstStage(java.util.List<LaunchRocketFirstStageCore> cores) {
        this.cores = cores;
    }

    public java.util.List<LaunchRocketFirstStageCore> getCores() {
        return cores;
    }
    public void setCores(java.util.List<LaunchRocketFirstStageCore> cores) {
        this.cores = cores;
    }



    public static LaunchRocketFirstStage.Builder builder() {
        return new LaunchRocketFirstStage.Builder();
    }

    public static class Builder {

        private java.util.List<LaunchRocketFirstStageCore> cores;

        public Builder() {
        }

        public Builder setCores(java.util.List<LaunchRocketFirstStageCore> cores) {
            this.cores = cores;
            return this;
        }


        public LaunchRocketFirstStage build() {
            return new LaunchRocketFirstStage(cores);
        }

    }
}
