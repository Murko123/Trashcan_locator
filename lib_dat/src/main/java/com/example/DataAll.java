package com.example;
import java.util.ArrayList;
import java.util.Date;
/**
 * Created by Jernej on 26. 02. 2017.
 */


public class DataAll {

    private ArrayList<Lokacija> lokacijaList;



    public DataAll() {

        lokacijaList = new ArrayList<>();
    }

    public DataAll(ArrayList<Lokacija> lo) {

        lokacijaList = lo;
    }

    public Lokacija addLocation(String name, Trashcan can, TagList tagg) {
        Lokacija tmp = new Lokacija(name,can, tagg);
        lokacijaList.add(tmp);
        return tmp;
    }


    @Override
    public String toString() {
        return "DataAll{" +
                ", \nlokacijaList=" + lokacijaList +
                '}';
    }

    public static DataAll scenarijA() {
        DataAll da = new DataAll();
        Lokacija tmp;
        Trashcan can = new Trashcan("Kanta","Levo ob drevesu");
        TagList tagg = new TagList();
        tmp = da.addLocation("Pobrezje 113", can, tagg);

        return da;
    }
}