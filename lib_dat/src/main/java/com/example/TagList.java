package com.example;

/**
 * Created by Jernej on 26. 02. 2017.
 */

import java.util.ArrayList;

public class TagList {
    private ArrayList<Tag> list;

    public TagList() {
        list = new ArrayList<>();
        list.add(new Tag("Recekliranje"));
        list.add(new Tag("Plastika"));
        list.add(new Tag("Steklo"));
        list.add(new Tag("Biološko"));
        list.add(new Tag("Obleke"));
        list.add(new Tag("Neutralno"));


    }

    public ArrayList<Tag> getList() {
        return list;
    }

    public void setList(ArrayList<Tag> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "TagList{" +
                "list=" + list +
                '}';
    }


}
