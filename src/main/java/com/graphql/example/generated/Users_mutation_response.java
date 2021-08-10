package com.graphql.example.generated;

/**
 * response of any mutation on the table "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Users_mutation_response implements java.io.Serializable {

    private int affected_rows;
    @javax.validation.constraints.NotNull
    private java.util.List<Users> returning;

    public Users_mutation_response() {
    }

    public Users_mutation_response(int affected_rows, java.util.List<Users> returning) {
        this.affected_rows = affected_rows;
        this.returning = returning;
    }

    /**
     * number of affected rows by the mutation
     */
    public int getAffected_rows() {
        return affected_rows;
    }
    /**
     * number of affected rows by the mutation
     */
    public void setAffected_rows(int affected_rows) {
        this.affected_rows = affected_rows;
    }

    /**
     * data of the affected rows by the mutation
     */
    public java.util.List<Users> getReturning() {
        return returning;
    }
    /**
     * data of the affected rows by the mutation
     */
    public void setReturning(java.util.List<Users> returning) {
        this.returning = returning;
    }



    public static Users_mutation_response.Builder builder() {
        return new Users_mutation_response.Builder();
    }

    public static class Builder {

        private int affected_rows;
        private java.util.List<Users> returning;

        public Builder() {
        }

        /**
         * number of affected rows by the mutation
         */
        public Builder setAffected_rows(int affected_rows) {
            this.affected_rows = affected_rows;
            return this;
        }

        /**
         * data of the affected rows by the mutation
         */
        public Builder setReturning(java.util.List<Users> returning) {
            this.returning = returning;
            return this;
        }


        public Users_mutation_response build() {
            return new Users_mutation_response(affected_rows, returning);
        }

    }
}
