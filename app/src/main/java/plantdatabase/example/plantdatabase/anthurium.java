package plantdatabase.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import plantdatabase.example.plantdatabase.R;

public class anthurium extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anthurium);
    }

    public void GoOnline (View view){
        Uri webpage = Uri.parse("https://en.wikipedia.org/wiki/Anthurium");
        Intent website = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(website);
    }


}