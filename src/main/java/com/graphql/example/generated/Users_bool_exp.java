package com.graphql.example.generated;

/**
 * Boolean expression to filter rows from the table "users". All fields are combined with a logical 'AND'.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Users_bool_exp implements java.io.Serializable {

    private java.util.List<Users_bool_exp> _and;
    private Users_bool_exp _not;
    private java.util.List<Users_bool_exp> _or;
    private Uuid_comparison_exp id;
    private String_comparison_exp name;
    private String_comparison_exp rocket;
    private Timestamptz_comparison_exp timestamp;
    private String_comparison_exp twitter;

    public Users_bool_exp() {
    }

    public Users_bool_exp(java.util.List<Users_bool_exp> _and, Users_bool_exp _not, java.util.List<Users_bool_exp> _or, Uuid_comparison_exp id, String_comparison_exp name, String_comparison_exp rocket, Timestamptz_comparison_exp timestamp, String_comparison_exp twitter) {
        this._and = _and;
        this._not = _not;
        this._or = _or;
        this.id = id;
        this.name = name;
        this.rocket = rocket;
        this.timestamp = timestamp;
        this.twitter = twitter;
    }

    public java.util.List<Users_bool_exp> get_and() {
        return _and;
    }
    public void set_and(java.util.List<Users_bool_exp> _and) {
        this._and = _and;
    }

    public Users_bool_exp get_not() {
        return _not;
    }
    public void set_not(Users_bool_exp _not) {
        this._not = _not;
    }

    public java.util.List<Users_bool_exp> get_or() {
        return _or;
    }
    public void set_or(java.util.List<Users_bool_exp> _or) {
        this._or = _or;
    }

    public Uuid_comparison_exp getId() {
        return id;
    }
    public void setId(Uuid_comparison_exp id) {
        this.id = id;
    }

    public String_comparison_exp getName() {
        return name;
    }
    public void setName(String_comparison_exp name) {
        this.name = name;
    }

    public String_comparison_exp getRocket() {
        return rocket;
    }
    public void setRocket(String_comparison_exp rocket) {
        this.rocket = rocket;
    }

    public Timestamptz_comparison_exp getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Timestamptz_comparison_exp timestamp) {
        this.timestamp = timestamp;
    }

    public String_comparison_exp getTwitter() {
        return twitter;
    }
    public void setTwitter(String_comparison_exp twitter) {
        this.twitter = twitter;
    }



    public static Users_bool_exp.Builder builder() {
        return new Users_bool_exp.Builder();
    }

    public static class Builder {

        private java.util.List<Users_bool_exp> _and;
        private Users_bool_exp _not;
        private java.util.List<Users_bool_exp> _or;
        private Uuid_comparison_exp id;
        private String_comparison_exp name;
        private String_comparison_exp rocket;
        private Timestamptz_comparison_exp timestamp;
        private String_comparison_exp twitter;

        public Builder() {
        }

        public Builder set_and(java.util.List<Users_bool_exp> _and) {
            this._and = _and;
            return this;
        }

        public Builder set_not(Users_bool_exp _not) {
            this._not = _not;
            return this;
        }

        public Builder set_or(java.util.List<Users_bool_exp> _or) {
            this._or = _or;
            return this;
        }

        public Builder setId(Uuid_comparison_exp id) {
            this.id = id;
            return this;
        }

        public Builder setName(String_comparison_exp name) {
            this.name = name;
            return this;
        }

        public Builder setRocket(String_comparison_exp rocket) {
            this.rocket = rocket;
            return this;
        }

        public Builder setTimestamp(Timestamptz_comparison_exp timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setTwitter(String_comparison_exp twitter) {
            this.twitter = twitter;
            return this;
        }


        public Users_bool_exp build() {
            return new Users_bool_exp(_and, _not, _or, id, name, rocket, timestamp, twitter);
        }

    }
}
