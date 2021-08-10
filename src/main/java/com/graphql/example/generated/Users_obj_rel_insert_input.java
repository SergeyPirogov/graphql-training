package com.graphql.example.generated;

/**
 * input type for inserting object relation for remote table "users"
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Users_obj_rel_insert_input implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private Users_insert_input data;
    private Users_on_conflict on_conflict;

    public Users_obj_rel_insert_input() {
    }

    public Users_obj_rel_insert_input(Users_insert_input data, Users_on_conflict on_conflict) {
        this.data = data;
        this.on_conflict = on_conflict;
    }

    public Users_insert_input getData() {
        return data;
    }
    public void setData(Users_insert_input data) {
        this.data = data;
    }

    public Users_on_conflict getOn_conflict() {
        return on_conflict;
    }
    public void setOn_conflict(Users_on_conflict on_conflict) {
        this.on_conflict = on_conflict;
    }



    public static Users_obj_rel_insert_input.Builder builder() {
        return new Users_obj_rel_insert_input.Builder();
    }

    public static class Builder {

        private Users_insert_input data;
        private Users_on_conflict on_conflict;

        public Builder() {
        }

        public Builder setData(Users_insert_input data) {
            this.data = data;
            return this;
        }

        public Builder setOn_conflict(Users_on_conflict on_conflict) {
            this.on_conflict = on_conflict;
            return this;
        }


        public Users_obj_rel_insert_input build() {
            return new Users_obj_rel_insert_input(data, on_conflict);
        }

    }
}
