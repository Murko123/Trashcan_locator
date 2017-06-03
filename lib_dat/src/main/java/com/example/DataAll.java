package com.example;
import java.util.ArrayList;
import java.util.Date;
/**
 * Created by Jernej on 26. 02. 2017.
 */


public class DataAll {

    public static final String trashid= "kosid";
     ArrayList<Lokacija> lokacijaList;



    public DataAll() {

        lokacijaList = new ArrayList<>();
    }

    public DataAll(ArrayList<Lokacija> lo) {

        lokacijaList = lo;
    }

    public void addLocation(String name, Trashcan can, TagList tagg, double x, double y) {
        Lokacija tmp = new Lokacija(name,can, tagg,x,y);
        lokacijaList.add(tmp);

    }

    public Lokacija getLok(int i){
        return lokacijaList.get(i);
    }

    public int getSize(){
        return lokacijaList.size();
    }
    @Override
    public String toString() {
        return "DataAll{" +
                ", \nlokacijaList=" + lokacijaList +
                '}';
    }

    public static DataAll scenarijA() {
        DataAll da = new DataAll();

        double a = 46.3778083;
        double b = 15.8874182;
        Trashcan can = new Trashcan("Kanta","Levo ob drevesu");
        TagList tagg = new TagList();
        da.addLocation("Pobrezje",can,tagg,a,b);
        return da;
    }
}