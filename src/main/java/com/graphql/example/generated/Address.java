package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Address implements java.io.Serializable {

    private String address;
    private String city;
    private String state;

    public Address() {
    }

    public Address(String address, String city, String state) {
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }



    public static Address.Builder builder() {
        return new Address.Builder();
    }

    public static class Builder {

        private String address;
        private String city;
        private String state;

        public Builder() {
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }


        public Address build() {
            return new Address(address, city, state);
        }

    }
}
