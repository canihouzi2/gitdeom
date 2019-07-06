package com.bawei.jinhao2019732.bean;

/*
 *@Auther:Lenovo
 *@Date: 2019/7/3
 *@Time: 10:38:43
 *@Description:
 * */public class Bean1 {
     private String imageUrl;
     private String publishAt;
     private String title;

    public Bean1() {
    }

    public Bean1(String imageUrl, String publishAt, String title) {
        this.imageUrl = imageUrl;
        this.publishAt = publishAt;
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPublishAt() {
        return publishAt;
    }

    public void setPublishAt(String publishAt) {
        this.publishAt = publishAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "imageUrl='" + imageUrl + '\'' +
                ", publishAt='" + publishAt + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
