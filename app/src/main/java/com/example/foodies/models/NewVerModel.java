package com.example.foodies.models;

import android.view.View;

import com.example.foodies.adapters.NewVerAdapter;

public class NewVerModel {
    int image;
    String name;
    String description;
    String rating;
    String timing;

    public NewVerModel(int image, String name, String description, String rating, String timing) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.timing = timing;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }
    }

