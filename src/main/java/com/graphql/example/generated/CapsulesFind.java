package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class CapsulesFind implements java.io.Serializable {

    private String id;
    private Integer landings;
    private String mission;
    private String original_launch;
    private Integer reuse_count;
    private String status;
    private String type;

    public CapsulesFind() {
    }

    public CapsulesFind(String id, Integer landings, String mission, String original_launch, Integer reuse_count, String status, String type) {
        this.id = id;
        this.landings = landings;
        this.mission = mission;
        this.original_launch = original_launch;
        this.reuse_count = reuse_count;
        this.status = status;
        this.type = type;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Integer getLandings() {
        return landings;
    }
    public void setLandings(Integer landings) {
        this.landings = landings;
    }

    public String getMission() {
        return mission;
    }
    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getOriginal_launch() {
        return original_launch;
    }
    public void setOriginal_launch(String original_launch) {
        this.original_launch = original_launch;
    }

    public Integer getReuse_count() {
        return reuse_count;
    }
    public void setReuse_count(Integer reuse_count) {
        this.reuse_count = reuse_count;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }



    public static CapsulesFind.Builder builder() {
        return new CapsulesFind.Builder();
    }

    public static class Builder {

        private String id;
        private Integer landings;
        private String mission;
        private String original_launch;
        private Integer reuse_count;
        private String status;
        private String type;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLandings(Integer landings) {
            this.landings = landings;
            return this;
        }

        public Builder setMission(String mission) {
            this.mission = mission;
            return this;
        }

        public Builder setOriginal_launch(String original_launch) {
            this.original_launch = original_launch;
            return this;
        }

        public Builder setReuse_count(Integer reuse_count) {
            this.reuse_count = reuse_count;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }


        public CapsulesFind build() {
            return new CapsulesFind(id, landings, mission, original_launch, reuse_count, status, type);
        }

    }
}
