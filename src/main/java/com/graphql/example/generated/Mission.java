package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Mission implements java.io.Serializable {

    private String description;
    private String id;
    private java.util.List<String> manufacturers;
    private String name;
    private java.util.List<Payload> payloads;
    private String twitter;
    private String website;
    private String wikipedia;

    public Mission() {
    }

    public Mission(String description, String id, java.util.List<String> manufacturers, String name, java.util.List<Payload> payloads, String twitter, String website, String wikipedia) {
        this.description = description;
        this.id = id;
        this.manufacturers = manufacturers;
        this.name = name;
        this.payloads = payloads;
        this.twitter = twitter;
        this.website = website;
        this.wikipedia = wikipedia;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public java.util.List<String> getManufacturers() {
        return manufacturers;
    }
    public void setManufacturers(java.util.List<String> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<Payload> getPayloads() {
        return payloads;
    }
    public void setPayloads(java.util.List<Payload> payloads) {
        this.payloads = payloads;
    }

    public String getTwitter() {
        return twitter;
    }
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWikipedia() {
        return wikipedia;
    }
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }



    public static Mission.Builder builder() {
        return new Mission.Builder();
    }

    public static class Builder {

        private String description;
        private String id;
        private java.util.List<String> manufacturers;
        private String name;
        private java.util.List<Payload> payloads;
        private String twitter;
        private String website;
        private String wikipedia;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setManufacturers(java.util.List<String> manufacturers) {
            this.manufacturers = manufacturers;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPayloads(java.util.List<Payload> payloads) {
            this.payloads = payloads;
            return this;
        }

        public Builder setTwitter(String twitter) {
            this.twitter = twitter;
            return this;
        }

        public Builder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public Builder setWikipedia(String wikipedia) {
            this.wikipedia = wikipedia;
            return this;
        }


        public Mission build() {
            return new Mission(description, id, manufacturers, name, payloads, twitter, website, wikipedia);
        }

    }
}
