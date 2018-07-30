package com.example.vardan.week4exercices2drawer.model;

public class ListModel {

    private String title;
    private String[] imageUrl;
    private String description;
    private String videoUrl;
    private int rating;
    private String category;
    private Boolean liked;
    private Boolean toBasket;

    public ListModel(String title, String[] imageUrl, String description, String videoUrl, int rating, String category, Boolean liked, Boolean toBasket) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
        this.videoUrl = videoUrl;
        this.rating = rating;
        this.category = category;
        this.liked = liked;
        this.toBasket = toBasket;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String[] imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getLiked() {
        return liked;
    }

    public void setLiked(Boolean liked) {
        this.liked = liked;
    }

    public Boolean getToBasket() {
        return toBasket;
    }

    public void setToBasket(Boolean toBasket) {
        this.toBasket = toBasket;
    }
}