package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Capsule implements java.io.Serializable {

    private Dragon dragon;
    private String id;
    private Integer landings;
    private java.util.List<CapsuleMission> missions;
    private String original_launch;
    private Integer reuse_count;
    private String status;
    private String type;

    public Capsule() {
    }

    public Capsule(Dragon dragon, String id, Integer landings, java.util.List<CapsuleMission> missions, String original_launch, Integer reuse_count, String status, String type) {
        this.dragon = dragon;
        this.id = id;
        this.landings = landings;
        this.missions = missions;
        this.original_launch = original_launch;
        this.reuse_count = reuse_count;
        this.status = status;
        this.type = type;
    }

    public Dragon getDragon() {
        return dragon;
    }
    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
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

    public java.util.List<CapsuleMission> getMissions() {
        return missions;
    }
    public void setMissions(java.util.List<CapsuleMission> missions) {
        this.missions = missions;
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



    public static Capsule.Builder builder() {
        return new Capsule.Builder();
    }

    public static class Builder {

        private Dragon dragon;
        private String id;
        private Integer landings;
        private java.util.List<CapsuleMission> missions;
        private String original_launch;
        private Integer reuse_count;
        private String status;
        private String type;

        public Builder() {
        }

        public Builder setDragon(Dragon dragon) {
            this.dragon = dragon;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLandings(Integer landings) {
            this.landings = landings;
            return this;
        }

        public Builder setMissions(java.util.List<CapsuleMission> missions) {
            this.missions = missions;
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


        public Capsule build() {
            return new Capsule(dragon, id, landings, missions, original_launch, reuse_count, status, type);
        }

    }
}
