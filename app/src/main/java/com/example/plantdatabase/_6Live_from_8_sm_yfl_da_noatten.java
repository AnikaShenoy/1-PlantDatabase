package com.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class _6Live_from_8_sm_yfl_da_noatten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._6activity_live_from_8_sm_yfl_da_noatten);
    }
    public void hang(View view) {
        Intent intent = new Intent(this, _7activity_result_from_8_sm_yfl_da_noatten_hang.class);
        startActivity(intent);

    }

    public void sit(View view) {
        Intent intent = new Intent(this, _7activity_result_from_8_sm_yfl_da_noatten_sit.class);
        startActivity(intent);

    }
}