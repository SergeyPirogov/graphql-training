package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class MissionsFind implements java.io.Serializable {

    private String id;
    private String manufacturer;
    private String name;
    private String payload_id;

    public MissionsFind() {
    }

    public MissionsFind(String id, String manufacturer, String name, String payload_id) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.name = name;
        this.payload_id = payload_id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPayload_id() {
        return payload_id;
    }
    public void setPayload_id(String payload_id) {
        this.payload_id = payload_id;
    }



    public static MissionsFind.Builder builder() {
        return new MissionsFind.Builder();
    }

    public static class Builder {

        private String id;
        private String manufacturer;
        private String name;
        private String payload_id;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPayload_id(String payload_id) {
            this.payload_id = payload_id;
            return this;
        }


        public MissionsFind build() {
            return new MissionsFind(id, manufacturer, name, payload_id);
        }

    }
}
