package com.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class chinese_evergreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinese_evergreen);
    }

    public void launchWebsite (View view){
        Uri webpage = Uri.parse("https://en.wikipedia.org/wiki/Aglaonema");
        Intent webIntent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(webIntent);
    }
}