package com.example.jernej.trashcan_locator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void vnoselementov(View vnos){
        Intent ime = new Intent(this,ActivityVnos.class);
        startActivity(ime);
    }

    public void prikazmape(View vnos){
        Intent ime = new Intent(this,ActivityMaps.class);
        startActivity(ime);
    }



}
