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

    @Override
    public String toString() {
        return "TagList{" +
                "list=" + list +
                '}';
    }


}


