package com.example.android17.Models;

import java.io.Serializable;

public class FirstModel implements Serializable {

    private int image;
    private String status,sureName;


    public FirstModel(int image, String status, String sureName) {
        this.image = image;
        this.status = status;
        this.sureName = sureName;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
}
