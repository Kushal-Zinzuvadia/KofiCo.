package com.example.kofico.models;

import java.util.Objects;

public class item {
    private String name;
    private String rating;
    private String price;
    private String imgUrl;

    // No-argument constructor
    public item() {
        this("", "", "", "");
    }

    // Constructor with all fields
    public item(String name, String rating, String price, String imgUrl) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.imgUrl = imgUrl;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
