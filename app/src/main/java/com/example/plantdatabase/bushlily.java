package com.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class bushlily extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bushlily);
    }
    public void goOnline (View view){
        Uri website = Uri.parse("https://en.wikipedia.org/wiki/Clivia_miniata");
        Intent webpage = new Intent(Intent.ACTION_VIEW,website);
        startActivity(webpage);
    }
}