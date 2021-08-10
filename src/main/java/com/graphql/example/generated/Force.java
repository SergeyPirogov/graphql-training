package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Force implements java.io.Serializable {

    private Double kN;
    private Double lbf;

    public Force() {
    }

    public Force(Double kN, Double lbf) {
        this.kN = kN;
        this.lbf = lbf;
    }

    public Double getKN() {
        return kN;
    }
    public void setKN(Double kN) {
        this.kN = kN;
    }

    public Double getLbf() {
        return lbf;
    }
    public void setLbf(Double lbf) {
        this.lbf = lbf;
    }



    public static Force.Builder builder() {
        return new Force.Builder();
    }

    public static class Builder {

        private Double kN;
        private Double lbf;

        public Builder() {
        }

        public Builder setKN(Double kN) {
            this.kN = kN;
            return this;
        }

        public Builder setLbf(Double lbf) {
            this.lbf = lbf;
            return this;
        }


        public Force build() {
            return new Force(kN, lbf);
        }

    }
}
