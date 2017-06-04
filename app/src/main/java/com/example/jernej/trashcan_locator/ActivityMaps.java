package com.example.jernej.trashcan_locator;

import android.content.pm.PackageManager;
import android.location.Location;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.Lokacija;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class ActivityMaps extends FragmentActivity implements OnMapReadyCallback {
    ApplicationMy app;
    private GoogleMap mMap;

    private GPSTracker gpsTracker;
    private Location mLocation;
    double latitude, longitude;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        gpsTracker = new GPSTracker(getApplicationContext());
        mLocation = gpsTracker.getLocation();

        latitude = mLocation.getLatitude();
        longitude = mLocation.getLongitude();







        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    //markerji
    @Override
    public void onMapReady(GoogleMap googleMap) {
        app = (ApplicationMy)getApplication();
        app.load();


        mMap = googleMap;

        Bundle extras= getIntent().getExtras();
        if(extras!=null){
            LatLng mojalok2 = new LatLng(extras.getDouble("Longitude"), extras.getDouble("Latitude"));
            mMap.addMarker(new MarkerOptions()
                    .position(mojalok2)
                    .title("Tukaj je kos!")
                    .icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_GREEN )));
        }

        // Add a marker in Sydney and move the camera
        LatLng mojalok = new LatLng(latitude, longitude);

        mMap.addMarker(new MarkerOptions().position(mojalok).title("Tukaj ste vi!"));
        CameraUpdate yourLocation = CameraUpdateFactory.newLatLngZoom(mojalok, 18);
        mMap.animateCamera(yourLocation);

    }
}

