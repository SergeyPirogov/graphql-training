package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class LaunchSite implements java.io.Serializable {

    private String site_id;
    private String site_name;
    private String site_name_long;

    public LaunchSite() {
    }

    public LaunchSite(String site_id, String site_name, String site_name_long) {
        this.site_id = site_id;
        this.site_name = site_name;
        this.site_name_long = site_name_long;
    }

    public String getSite_id() {
        return site_id;
    }
    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getSite_name() {
        return site_name;
    }
    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getSite_name_long() {
        return site_name_long;
    }
    public void setSite_name_long(String site_name_long) {
        this.site_name_long = site_name_long;
    }



    public static LaunchSite.Builder builder() {
        return new LaunchSite.Builder();
    }

    public static class Builder {

        private String site_id;
        private String site_name;
        private String site_name_long;

        public Builder() {
        }

        public Builder setSite_id(String site_id) {
            this.site_id = site_id;
            return this;
        }

        public Builder setSite_name(String site_name) {
            this.site_name = site_name;
            return this;
        }

        public Builder setSite_name_long(String site_name_long) {
            this.site_name_long = site_name_long;
            return this;
        }


        public LaunchSite build() {
            return new LaunchSite(site_id, site_name, site_name_long);
        }

    }
}
