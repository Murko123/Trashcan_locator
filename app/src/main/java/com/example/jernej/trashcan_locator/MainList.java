package com.example.jernej.trashcan_locator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

public class MainList extends AppCompatActivity {

    private ApplicationMy app;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        app = (ApplicationMy) getApplication();
        Log.i("IZPIS",app.getDataAll().toString());

        recyclerView = (RecyclerView)findViewById(R.id.RVid);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new AdapterTrash(app.getDataAll(), this);

        recyclerView.setAdapter(adapter);
    }
}
