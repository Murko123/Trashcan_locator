package com.example;

import java.util.Date;
import java.util.UUID;
/**
 * Created by Jernej on 26. 02. 2017.
 */

public class Lokacija {
    String id;
    String name;
    double x, y; //GPS


    Tag tags;



    public Lokacija(String name, double x, double y, Tag tags) {
        this.id = UUID.randomUUID().toString().replaceAll("-", "");
        this.name = name;
        this.x = x;
        this.y = y;
        this.tags = tags;



    }

    @Override
    public String toString() {
        return name + " " +id;
    }
    public String toStringFull() {
        return "Lokacija{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", tags=" + tags +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Tag getTags() {
        return tags;
    }

    public String getTagss() {
        return tags.toString();
    }

    public void setTags(Tag tags) {
        this.tags = tags;
    }




}
