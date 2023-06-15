package com.atul.bookMyShow.model;

import java.util.List;

public class Theater {
    int id;
    String city;
    List<Hall> halls;

    public Theater(int id, String city, List<Hall> halls) {
        this.id = id;
        this.city = city;
        this.halls = halls;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Hall> getHalls() {
        return halls;
    }

    public void setHalls(List<Hall> halls) {
        this.halls = halls;
    }
}
