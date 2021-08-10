package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Result implements java.io.Serializable {

    private Integer totalCount;

    public Result() {
    }

    public Result(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



    public static Result.Builder builder() {
        return new Result.Builder();
    }

    public static class Builder {

        private Integer totalCount;

        public Builder() {
        }

        public Builder setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public Result build() {
            return new Result(totalCount);
        }

    }
}
