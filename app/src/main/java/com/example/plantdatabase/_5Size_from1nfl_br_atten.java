package com.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class _5Size_from1nfl_br_atten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._5activity_size_from1nfl_br_atten);
    }


    public void large (View view){
        Intent intent  = new Intent(this, _6Live_from_1_la_nfl_br_atten.class);
        startActivity(intent);
    }

    public void small (View view){
        Intent intent = new Intent(this, _6Live_from_1_sm_nfl_br_atten.class);
        startActivity(intent);
    }


}