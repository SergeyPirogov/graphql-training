package com.graphql.example.generated;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-07-08T16:26:34+0300"
)
public class Link implements java.io.Serializable {

    private String article;
    private String reddit;
    private String wikipedia;

    public Link() {
    }

    public Link(String article, String reddit, String wikipedia) {
        this.article = article;
        this.reddit = reddit;
        this.wikipedia = wikipedia;
    }

    public String getArticle() {
        return article;
    }
    public void setArticle(String article) {
        this.article = article;
    }

    public String getReddit() {
        return reddit;
    }
    public void setReddit(String reddit) {
        this.reddit = reddit;
    }

    public String getWikipedia() {
        return wikipedia;
    }
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }



    public static Link.Builder builder() {
        return new Link.Builder();
    }

    public static class Builder {

        private String article;
        private String reddit;
        private String wikipedia;

        public Builder() {
        }

        public Builder setArticle(String article) {
            this.article = article;
            return this;
        }

        public Builder setReddit(String reddit) {
            this.reddit = reddit;
            return this;
        }

        public Builder setWikipedia(String wikipedia) {
            this.wikipedia = wikipedia;
            return this;
        }


        public Link build() {
            return new Link(article, reddit, wikipedia);
        }

    }
}
