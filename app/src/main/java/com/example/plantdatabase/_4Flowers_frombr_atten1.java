package com.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class _4Flowers_frombr_atten1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._4activity_flowers_frombr_atten1);
    } 

    public void yesFlowers (View view){
        Intent intent  = new Intent(this, _5Size_from1yfl_br_atten.class);
        startActivity(intent);
    }

    public void noFlowers (View view){
        Intent intent = new Intent(this, _5Size_from1nfl_br_atten.class);
        startActivity(intent);
    }



}