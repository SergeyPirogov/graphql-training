package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class CoresFind implements java.io.Serializable {

    private Integer asds_attempts;
    private Integer asds_landings;
    private Integer block;
    private String id;
    private String missions;
    private String original_launch;
    private Integer reuse_count;
    private Integer rtls_attempts;
    private Integer rtls_landings;
    private String status;
    private Boolean water_landing;

    public CoresFind() {
    }

    public CoresFind(Integer asds_attempts, Integer asds_landings, Integer block, String id, String missions, String original_launch, Integer reuse_count, Integer rtls_attempts, Integer rtls_landings, String status, Boolean water_landing) {
        this.asds_attempts = asds_attempts;
        this.asds_landings = asds_landings;
        this.block = block;
        this.id = id;
        this.missions = missions;
        this.original_launch = original_launch;
        this.reuse_count = reuse_count;
        this.rtls_attempts = rtls_attempts;
        this.rtls_landings = rtls_landings;
        this.status = status;
        this.water_landing = water_landing;
    }

    public Integer getAsds_attempts() {
        return asds_attempts;
    }
    public void setAsds_attempts(Integer asds_attempts) {
        this.asds_attempts = asds_attempts;
    }

    public Integer getAsds_landings() {
        return asds_landings;
    }
    public void setAsds_landings(Integer asds_landings) {
        this.asds_landings = asds_landings;
    }

    public Integer getBlock() {
        return block;
    }
    public void setBlock(Integer block) {
        this.block = block;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getMissions() {
        return missions;
    }
    public void setMissions(String missions) {
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

    public Integer getRtls_attempts() {
        return rtls_attempts;
    }
    public void setRtls_attempts(Integer rtls_attempts) {
        this.rtls_attempts = rtls_attempts;
    }

    public Integer getRtls_landings() {
        return rtls_landings;
    }
    public void setRtls_landings(Integer rtls_landings) {
        this.rtls_landings = rtls_landings;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getWater_landing() {
        return water_landing;
    }
    public void setWater_landing(Boolean water_landing) {
        this.water_landing = water_landing;
    }



    public static CoresFind.Builder builder() {
        return new CoresFind.Builder();
    }

    public static class Builder {

        private Integer asds_attempts;
        private Integer asds_landings;
        private Integer block;
        private String id;
        private String missions;
        private String original_launch;
        private Integer reuse_count;
        private Integer rtls_attempts;
        private Integer rtls_landings;
        private String status;
        private Boolean water_landing;

        public Builder() {
        }

        public Builder setAsds_attempts(Integer asds_attempts) {
            this.asds_attempts = asds_attempts;
            return this;
        }

        public Builder setAsds_landings(Integer asds_landings) {
            this.asds_landings = asds_landings;
            return this;
        }

        public Builder setBlock(Integer block) {
            this.block = block;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setMissions(String missions) {
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

        public Builder setRtls_attempts(Integer rtls_attempts) {
            this.rtls_attempts = rtls_attempts;
            return this;
        }

        public Builder setRtls_landings(Integer rtls_landings) {
            this.rtls_landings = rtls_landings;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setWater_landing(Boolean water_landing) {
            this.water_landing = water_landing;
            return this;
        }


        public CoresFind build() {
            return new CoresFind(asds_attempts, asds_landings, block, id, missions, original_launch, reuse_count, rtls_attempts, rtls_landings, status, water_landing);
        }

    }
}
