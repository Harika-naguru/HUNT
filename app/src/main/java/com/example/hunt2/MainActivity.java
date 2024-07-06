package com.example.bottomnavyt;

/*import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;*/

/*public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap myMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this::onMapReady);
    }

    public void onMapReady(@NonNull GoogleMap googlemap){
        myMap = googlemap;

        LatLng sydney = new LatLng( 34 , 151);
        myMap.addMarker(new MarkerOptions().position(sydney).title("sydney"));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}*/


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  ActivityMainBinding binding
 @Override
   protected void onCreate(Bundle savedInstancestate){
      super.onCreate(savedInstancestate);
      binding = ActivityMainBinding.inflate(getLayoutInflater());
      setContentView(binding.getRoot());
      binding.bottomNavigationView
 }

}
