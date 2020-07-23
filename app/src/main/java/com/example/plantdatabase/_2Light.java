package com.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class _2Light extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._2activity_light);
    }

    public void brightoption (View view){
        Intent intent = new Intent(this, _3Attention_frombright.class);
        startActivity(intent);
    }

    public void darkoption (View view){
        Intent intent  = new Intent(this, _3Attention_fromdark.class);
        startActivity(intent);
    }

}