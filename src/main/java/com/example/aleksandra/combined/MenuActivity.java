package com.example.aleksandra.combined;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void OnCameraButtonClick(View view) {
        Intent intent = new Intent(this, Camera_Handler.class);
        startActivity(intent);
    }

    public void OnGalleryButtonClick(View view) {

    }

    public void OnMapButtonClick(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void OnScoresheetButtonClick(View view) {
        Intent intent = new Intent(this, ScoresheetActivity.class);
        startActivity(intent);
    }
}
