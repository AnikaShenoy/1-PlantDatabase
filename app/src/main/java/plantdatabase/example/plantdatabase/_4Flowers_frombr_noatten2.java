package plantdatabase.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import plantdatabase.example.plantdatabase.R;

public class _4Flowers_frombr_noatten2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._4activity_flowers_frombr_noatten2);
    }

    public void yesFlower (View view){
        Intent intent = new Intent(this, _5Size_from2yfl_br_noatten.class);
        startActivity(intent);
    }

    public void noFlower (View view){
        Intent intent  = new Intent(this, _5Size_from2nfl_br_noatten.class);
        startActivity(intent);
    }

}