package com.example;

import java.util.Date;
import java.util.UUID;
/**
 * Created by Jernej on 26. 02. 2017.
 */

public class Lokacija {
    String id;
    String name;
    long x, y; //GPS
    String fileName;
    long date;
    Trashcan kos;
    TagList tag;

    public Lokacija(String name, Trashcan kos, TagList tag) {
        this.id = UUID.randomUUID().toString().replaceAll("-", "");
        this.name = name;
        this.kos = kos;
        this.tag = tag;

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


    public Trashcan getKos() {
        return kos;
    }

    public void setKos(Trashcan kos) {
        this.kos = kos;
    }

    public TagList getTag() {
        return tag;
    }

    public void setTag(TagList tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Lokacija{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", kos" + kos+
                ", tag" + tag+
                '}';
    }
}
