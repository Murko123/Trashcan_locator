package com.example.jernej.trashcan_locator;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.DataAll;
import com.example.Lokacija;

/**
 * Created by Jernej on 3. 06. 2017.
 */





public class AdapterTrash extends RecyclerView.Adapter<AdapterTrash.ViewHolder>{
    private DataAll all;
    Activity ac;

    //Konstruktor
    public AdapterTrash(DataAll all, Activity ac){
        super();
        this.all = all;
        this.ac = ac;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        //content_activity_events
        private TextView imekos;

        public ViewHolder(View view){
            super(view);
            imekos = (TextView)view.findViewById(R.id.textView9);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lkos, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    private static void startActivityEvent(String kosid, Activity ac){

        Intent intent = new Intent(ac.getBaseContext(), ActivityMain.class);
        intent.putExtra(DataAll.trashid,kosid);
        ac.startActivity(intent);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position){
        final Lokacija current = all.getLok(position);
        Log.i("IZPIS2",current.toString());
        String name = current.getName();


        //Nastavim vsebino v ViewHolderu
        holder.imekos.setText(name);


        holder.imekos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                AdapterTrash.startActivityEvent(current.getId(), ac);
            }
        });

    }


    @Override
    public int getItemCount(){
        return all.getSize();
    }
}