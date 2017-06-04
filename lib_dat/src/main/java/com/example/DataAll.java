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
    public static SimpleDateFormat dt = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    //http://stackoverflow.com/questions/4772425/change-date-format-in-a-java-string
    private TagList tags;
    private ArrayList<Lokacija> lokacijaList;

    public Lokacija getLocationByID(String ID) {
        for (Lokacija l: lokacijaList) { //TODO this solution is relatively slow! If possible don't use it!
            // if (l.getId() == ID) return l; //NAPAKA primerja reference
            if (l.getId().equals(ID)) return l;
        }
        return null;
    }

    public DataAll() {
        tags = new TagList();
        lokacijaList = new ArrayList<>();

    }

    public Lokacija addLocation(String name, double x, double y, Tag tags) {
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
        TagList neke = new TagList();
        tmp = da.addLocation("Pobrezje 113", 46.3778083,15.8874182, neke.getPrvi());

        tmp = da.addLocation("Pobrezje 115",46.3778083,15.8874182,  neke.getPrvi());

        tmp = da.addLocation("Pobrezje 114", 46.3778083,15.8874182,  neke.getPrvi());


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
