package com.graphql.example.generated;

/**
 * input type for inserting array relation for remote table "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Users_arr_rel_insert_input implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<Users_insert_input> data;
    private Users_on_conflict on_conflict;

    public Users_arr_rel_insert_input() {
    }

    public Users_arr_rel_insert_input(java.util.List<Users_insert_input> data, Users_on_conflict on_conflict) {
        this.data = data;
        this.on_conflict = on_conflict;
    }

    public java.util.List<Users_insert_input> getData() {
        return data;
    }
    public void setData(java.util.List<Users_insert_input> data) {
        this.data = data;
    }

    public Users_on_conflict getOn_conflict() {
        return on_conflict;
    }
    public void setOn_conflict(Users_on_conflict on_conflict) {
        this.on_conflict = on_conflict;
    }



    public static Users_arr_rel_insert_input.Builder builder() {
        return new Users_arr_rel_insert_input.Builder();
    }

    public static class Builder {

        private java.util.List<Users_insert_input> data;
        private Users_on_conflict on_conflict;

        public Builder() {
        }

        public Builder setData(java.util.List<Users_insert_input> data) {
            this.data = data;
            return this;
        }

        public Builder setOn_conflict(Users_on_conflict on_conflict) {
            this.on_conflict = on_conflict;
            return this;
        }


        public Users_arr_rel_insert_input build() {
            return new Users_arr_rel_insert_input(data, on_conflict);
        }

    }
}
