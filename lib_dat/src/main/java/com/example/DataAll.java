package com.example;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Jernej on 26. 02. 2017.
 */


public class DataAll {
    public static final String LOKACIJA_ID = "lokacija_idXX";

    //http://stackoverflow.com/questions/4772425/change-date-format-in-a-java-string
    ArrayList<Tag> tags;
    private ArrayList<Lokacija> lokacijaList;

    public Lokacija getLocationByID(String ID) {
        for (Lokacija l: lokacijaList) { //TODO this solution is relatively slow! If possible don't use it!
            // if (l.getId() == ID) return l; //NAPAKA primerja reference
            if (l.getId().equals(ID)) return l;
        }
        return null;
    }

    public DataAll() {
        tags = new  ArrayList<Tag>();
        lokacijaList = new ArrayList<>();

    }

    public Lokacija addLocation(String name, double x, double y,  ArrayList<Tag>  tags) {
        Lokacija tmp = new Lokacija(name, x,y,tags);
        lokacijaList.add(tmp);
        return tmp;
    }


    @Override
    public String toString() {
        return "DataAll{" +
                ", \nlokacijaList=" + lokacijaList +
                '}';
    }
    //   public Lokacija(String name, long x, long y, String idUser, String fileName, long date) {
    public static DataAll scenarijA() {
        DataAll da = new DataAll();
        Date danes = new Date();
        Lokacija tmp;
        ArrayList<Tag> tags = new ArrayList<>();
        tags.add(new Tag("Recekliranje"));
        ArrayList<Tag> tags2 = new ArrayList<>();
        tags2.add(new Tag("Recekliranje"));
        tags2.add(new Tag("Plastika"));
        tmp = da.addLocation("Pobrezje 113", 46.3778083,15.8874182, tags );

        tmp = da.addLocation("Pobrezje 115",46.3778087,15.8874182,  tags);

        tmp = da.addLocation("Pobrezje 114", 46.3778089,15.8874182, tags2 );


        return da;
    }

    public Lokacija getLocation(int i) {
        return lokacijaList.get(i);
    }

    public List<Lokacija> getLokacijaAll() {
        return lokacijaList;
    }



    public int getLocationSize() {
        return lokacijaList.size();
    }
}
