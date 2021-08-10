package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class History implements java.io.Serializable {

    private String details;
    private String event_date_unix;
    private String event_date_utc;
    private Launch flight;
    private String id;
    private Link links;
    private String title;

    public History() {
    }

    public History(String details, String event_date_unix, String event_date_utc, Launch flight, String id, Link links, String title) {
        this.details = details;
        this.event_date_unix = event_date_unix;
        this.event_date_utc = event_date_utc;
        this.flight = flight;
        this.id = id;
        this.links = links;
        this.title = title;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public String getEvent_date_unix() {
        return event_date_unix;
    }
    public void setEvent_date_unix(String event_date_unix) {
        this.event_date_unix = event_date_unix;
    }

    public String getEvent_date_utc() {
        return event_date_utc;
    }
    public void setEvent_date_utc(String event_date_utc) {
        this.event_date_utc = event_date_utc;
    }

    public Launch getFlight() {
        return flight;
    }
    public void setFlight(Launch flight) {
        this.flight = flight;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Link getLinks() {
        return links;
    }
    public void setLinks(Link links) {
        this.links = links;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }



    public static History.Builder builder() {
        return new History.Builder();
    }

    public static class Builder {

        private String details;
        private String event_date_unix;
        private String event_date_utc;
        private Launch flight;
        private String id;
        private Link links;
        private String title;

        public Builder() {
        }

        public Builder setDetails(String details) {
            this.details = details;
            return this;
        }

        public Builder setEvent_date_unix(String event_date_unix) {
            this.event_date_unix = event_date_unix;
            return this;
        }

        public Builder setEvent_date_utc(String event_date_utc) {
            this.event_date_utc = event_date_utc;
            return this;
        }

        public Builder setFlight(Launch flight) {
            this.flight = flight;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLinks(Link links) {
            this.links = links;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }


        public History build() {
            return new History(details, event_date_unix, event_date_utc, flight, id, links, title);
        }

    }
}
