package com.example.jernej.trashcan_locator;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.DataAll;
import com.example.Lokacija;
import com.google.android.gms.maps.model.LatLng;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Jernej on 7. 03. 2017.
 */



    public class ApplicationMy extends Application {

    DataAll all;
    private static final String DATA_MAP = "smetidatamap";
    private static final String FILE_NAME = "smeti.json";
        ArrayList<Lokacija> lokacijaList;

        public void onCreate() {
            super.onCreate();
            if(!load())
                all=DataAll.scenarijA();
            save();


        }

    public DataAll getDataAll() {
        return all;
    }
        public ArrayList<Lokacija> getLokacijaList() {
            return lokacijaList;
        }


    public int velikost()
    {
        return lokacijaList.size();
    }



    public boolean save() {
        File file = new File(this.getExternalFilesDir(DATA_MAP), ""
                + FILE_NAME);
        Log.d("Podatki", all.toString());
        return ActivityJson.save(all,file);
    }
    public boolean load(){
        File file = new File(this.getExternalFilesDir(DATA_MAP), ""
                + FILE_NAME);
        DataAll tmp = ActivityJson.load(file);
        if (tmp!=null) all = tmp;
        else return false;
        return true;
    }
    public void removeLocationByPosition(int adapterPosition) {
        all.getLokacijaAll().remove(adapterPosition);
    }
    }


