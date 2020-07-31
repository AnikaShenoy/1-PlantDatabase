package com.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class _1MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._1activity_main);

    }

    public void aboutUs (View view){
        Intent intent = new Intent(this, _1AboutUs.class);
        startActivity(intent);

    }
    public void Light (View view) {
        Intent intent = new Intent (this, _2Light.class);
        startActivity(intent);
    }

}