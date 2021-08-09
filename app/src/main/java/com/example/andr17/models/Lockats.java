package com.example.andr17.models;

public class Lockats {
    private String planetName;
    private String location;

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Lockats(String planetName, String location) {
        this.planetName = planetName;
        this.location = location;
    }
}
