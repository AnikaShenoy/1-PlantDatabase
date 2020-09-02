package plantdatabase.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import plantdatabase.example.plantdatabase.R;

public class _4Flowers_fromda_atten3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._4activity_flowers_fromda_atten3);
    }

    public void yesFlowers(View view){
        Intent intent  = new Intent(this, _5Size_from3yfl_da_atten.class);
        startActivity(intent);
    }

    public void noFlowers (View view){
        Intent intent = new Intent(this,_5Size_from3nfl_da_atten.class);
        startActivity(intent);
    }
}