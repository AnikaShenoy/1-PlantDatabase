package com.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class _6Live_from_5_sm_nfl_da_atten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._6activity_live_from_5_sm_nfl_da_atten);
    }
    public void hang(View view) {
        Intent intent = new Intent(this, _7activity_result_from_5_sm_nfl_da_atten_hang.class);
        startActivity(intent);

    }

    public void sit(View view) {
        Intent intent = new Intent(this, chinese_evergreen.class);
        startActivity(intent);

    }
}