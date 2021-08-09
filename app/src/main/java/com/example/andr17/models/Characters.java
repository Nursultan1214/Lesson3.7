package com.example.andr17.models;

import java.io.Serializable;

public class Characters implements Serializable {
    private int image;
    private String status;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Characters(int image, String status, String name) {
        this.image = image;
        this.status = status;
        this.name = name;
    }

    private String name;
}
