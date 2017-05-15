package com.example.jernej.trashcan_locator;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.DataAll;
import com.example.Lokacija;

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
            lokacijaList = new ArrayList<>();
            if(!load())
                all = DataAll.scenarijA();
             save();
        }

        public ArrayList<Lokacija> getLokacijaList() {
            return lokacijaList;
        }

        public void setLokacijaList(ArrayList<Lokacija> lokacijaList) {
            this.lokacijaList = lokacijaList;
            all=new DataAll(lokacijaList);
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
    }


