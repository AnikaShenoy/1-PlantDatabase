package plantdatabase.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import plantdatabase.example.plantdatabase.R;

public class bostonfern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bostonfern);
    }
    public void goOnline (View view){
        Uri website = Uri.parse("https://en.wikipedia.org/wiki/Nephrolepis_exaltata");
        Intent webpage = new Intent(Intent.ACTION_VIEW,website);
        startActivity(webpage);

    }
}