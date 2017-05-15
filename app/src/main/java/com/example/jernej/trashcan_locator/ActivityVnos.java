package com.example.jernej.trashcan_locator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.Lokacija;
import com.example.Tag;
import com.example.TagList;
import com.example.Trashcan;

import java.util.ArrayList;

public class ActivityVnos extends AppCompatActivity {
ApplicationMy app;
    EditText imeK;
    EditText LokK;
    EditText OpisK;
    CheckBox Plastika;
    CheckBox Steklo;
    CheckBox Bio;
    CheckBox Obleka;
    CheckBox Neutralno;
    CheckBox Rec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vnos);
        app = (ApplicationMy)getApplication();
        imeK= (EditText)findViewById(R.id.vime);
        LokK= (EditText)findViewById(R.id.vlok);
        OpisK= (EditText)findViewById(R.id.vopis);
        Plastika = (CheckBox)findViewById(R.id.cplastika);
        Steklo = (CheckBox)findViewById(R.id.csteklo);
        Bio = (CheckBox)findViewById(R.id.cbio);
        Obleka = (CheckBox)findViewById(R.id.cobleke);
        Neutralno = (CheckBox)findViewById(R.id.cneutralno);
        Rec = (CheckBox)findViewById(R.id.crecekliranje);
        app.load();
    }

    public void koncaj(View vnos){
        finish();
    }

    public void shrani(View vnos){
        if(imeK.getText().toString().length()!=0 && LokK.getText().toString().length()!=0 && OpisK.getText().toString().length()!=0){
            ArrayList<Lokacija> lok = app.getLokacijaList();
            Trashcan can = new Trashcan(imeK.getText().toString(), OpisK.getText().toString());
            TagList tagg = new TagList();
            ArrayList<Tag> tag = new ArrayList<>();
            if(Plastika.isChecked()) tag.add(new Tag(Plastika.getText().toString()));
            if(Steklo.isChecked()) tag.add(new Tag(Steklo.getText().toString()));
            if(Bio.isChecked()) tag.add(new Tag(Bio.getText().toString()));
            if(Obleka.isChecked()) tag.add(new Tag(Obleka.getText().toString()));
            if(Neutralno.isChecked()) tag.add(new Tag(Neutralno.getText().toString()));
            if(Rec.isChecked()) tag.add(new Tag(Rec.getText().toString()));
            tagg.setList(tag);
            Lokacija data = new Lokacija(LokK.getText().toString(),can,tagg);
            lok.add(data);
            app.setLokacijaList(lok);
            Log.d("Podatki", app.getLokacijaList().toString());
            app.save();
            finish();
        }
    }

}
