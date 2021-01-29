package com.github.vasyapogoriliy.onlinestore.models;

public class Category {

    private int id;
    private String name;
    private String description;
    private String imageURL;
    private boolean isActive = true;

    public Category(int id, String name, String description, String imageURL, boolean isActive) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
