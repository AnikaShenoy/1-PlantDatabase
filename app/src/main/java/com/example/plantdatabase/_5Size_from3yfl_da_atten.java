package com.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class _5Size_from3yfl_da_atten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._5activity_size_from3yfl_da_atten);
    }

    public void large (View view){
        Intent intent = new Intent(this, _6Live_from_6_la_yfl_da_atten.class);
        startActivity(intent);
    }

    public void small (View view){
        Intent intent = new Intent(this, _6Live_from_6_sm_yfl_da_atten.class);
        startActivity(intent);
    }
}