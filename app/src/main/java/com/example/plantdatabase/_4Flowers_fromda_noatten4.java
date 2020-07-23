package com.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class _4Flowers_fromda_noatten4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._4activity_flowers_fromda_noatten4);
    }

    public void yesFlowers (View view){
        Intent intent = new Intent(this, _5Size_from4yfl_da_noatten.class);
        startActivity(intent);
    }

    public void noFlowers(View view){
        Intent intent  = new Intent(this, _5Size_from4nfl_da_noatten.class);
        startActivity(intent);
    }


}