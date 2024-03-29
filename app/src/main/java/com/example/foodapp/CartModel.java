package com.example.foodapp;

import java.io.Serializable;

public class CartModel implements Serializable {
    int image;
    String name;
    String price;
    String time;

    public CartModel(int image, String name, String price, String time) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.time = time;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
