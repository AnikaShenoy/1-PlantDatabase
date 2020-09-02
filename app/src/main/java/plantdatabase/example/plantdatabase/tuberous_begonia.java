package plantdatabase.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import plantdatabase.example.plantdatabase.R;

public class tuberous_begonia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuberous_begonia);
    }

    public void launchWebsite (View view){
        Uri webpage = Uri.parse("https://en.wikipedia.org/wiki/Begonia_%C3%97_tuberhybrida");
        Intent webIntent = new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(webIntent);
    }
}