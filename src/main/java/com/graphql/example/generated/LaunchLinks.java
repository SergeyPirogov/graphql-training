package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class LaunchLinks implements java.io.Serializable {

    private String article_link;
    private java.util.List<String> flickr_images;
    private String mission_patch;
    private String mission_patch_small;
    private String presskit;
    private String reddit_campaign;
    private String reddit_launch;
    private String reddit_media;
    private String reddit_recovery;
    private String video_link;
    private String wikipedia;

    public LaunchLinks() {
    }

    public LaunchLinks(String article_link, java.util.List<String> flickr_images, String mission_patch, String mission_patch_small, String presskit, String reddit_campaign, String reddit_launch, String reddit_media, String reddit_recovery, String video_link, String wikipedia) {
        this.article_link = article_link;
        this.flickr_images = flickr_images;
        this.mission_patch = mission_patch;
        this.mission_patch_small = mission_patch_small;
        this.presskit = presskit;
        this.reddit_campaign = reddit_campaign;
        this.reddit_launch = reddit_launch;
        this.reddit_media = reddit_media;
        this.reddit_recovery = reddit_recovery;
        this.video_link = video_link;
        this.wikipedia = wikipedia;
    }

    public String getArticle_link() {
        return article_link;
    }
    public void setArticle_link(String article_link) {
        this.article_link = article_link;
    }

    public java.util.List<String> getFlickr_images() {
        return flickr_images;
    }
    public void setFlickr_images(java.util.List<String> flickr_images) {
        this.flickr_images = flickr_images;
    }

    public String getMission_patch() {
        return mission_patch;
    }
    public void setMission_patch(String mission_patch) {
        this.mission_patch = mission_patch;
    }

    public String getMission_patch_small() {
        return mission_patch_small;
    }
    public void setMission_patch_small(String mission_patch_small) {
        this.mission_patch_small = mission_patch_small;
    }

    public String getPresskit() {
        return presskit;
    }
    public void setPresskit(String presskit) {
        this.presskit = presskit;
    }

    public String getReddit_campaign() {
        return reddit_campaign;
    }
    public void setReddit_campaign(String reddit_campaign) {
        this.reddit_campaign = reddit_campaign;
    }

    public String getReddit_launch() {
        return reddit_launch;
    }
    public void setReddit_launch(String reddit_launch) {
        this.reddit_launch = reddit_launch;
    }

    public String getReddit_media() {
        return reddit_media;
    }
    public void setReddit_media(String reddit_media) {
        this.reddit_media = reddit_media;
    }

    public String getReddit_recovery() {
        return reddit_recovery;
    }
    public void setReddit_recovery(String reddit_recovery) {
        this.reddit_recovery = reddit_recovery;
    }

    public String getVideo_link() {
        return video_link;
    }
    public void setVideo_link(String video_link) {
        this.video_link = video_link;
    }

    public String getWikipedia() {
        return wikipedia;
    }
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }



    public static LaunchLinks.Builder builder() {
        return new LaunchLinks.Builder();
    }

    public static class Builder {

        private String article_link;
        private java.util.List<String> flickr_images;
        private String mission_patch;
        private String mission_patch_small;
        private String presskit;
        private String reddit_campaign;
        private String reddit_launch;
        private String reddit_media;
        private String reddit_recovery;
        private String video_link;
        private String wikipedia;

        public Builder() {
        }

        public Builder setArticle_link(String article_link) {
            this.article_link = article_link;
            return this;
        }

        public Builder setFlickr_images(java.util.List<String> flickr_images) {
            this.flickr_images = flickr_images;
            return this;
        }

        public Builder setMission_patch(String mission_patch) {
            this.mission_patch = mission_patch;
            return this;
        }

        public Builder setMission_patch_small(String mission_patch_small) {
            this.mission_patch_small = mission_patch_small;
            return this;
        }

        public Builder setPresskit(String presskit) {
            this.presskit = presskit;
            return this;
        }

        public Builder setReddit_campaign(String reddit_campaign) {
            this.reddit_campaign = reddit_campaign;
            return this;
        }

        public Builder setReddit_launch(String reddit_launch) {
            this.reddit_launch = reddit_launch;
            return this;
        }

        public Builder setReddit_media(String reddit_media) {
            this.reddit_media = reddit_media;
            return this;
        }

        public Builder setReddit_recovery(String reddit_recovery) {
            this.reddit_recovery = reddit_recovery;
            return this;
        }

        public Builder setVideo_link(String video_link) {
            this.video_link = video_link;
            return this;
        }

        public Builder setWikipedia(String wikipedia) {
            this.wikipedia = wikipedia;
            return this;
        }


        public LaunchLinks build() {
            return new LaunchLinks(article_link, flickr_images, mission_patch, mission_patch_small, presskit, reddit_campaign, reddit_launch, reddit_media, reddit_recovery, video_link, wikipedia);
        }

    }
}
