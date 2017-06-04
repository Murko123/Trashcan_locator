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
    String fileName;


    public Lokacija(String name, double x, double y, String fileName) {
        this.id = UUID.randomUUID().toString().replaceAll("-", "");
        this.name = name;
        this.x = x;
        this.y = y;

        this.fileName = fileName;

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
                ", fileName='" + fileName + '\'' +
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


}
