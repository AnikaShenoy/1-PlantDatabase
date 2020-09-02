package plantdatabase.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import plantdatabase.example.plantdatabase.R;

public class _5Size_from4yfl_da_noatten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._5activity_size_from4yfl_da_noatten);
    }
    public void large (View view){
        Intent intent = new Intent(this, _6Live_from_8_la_yfl_da_noatten.class);
        startActivity(intent);
    }


    public void small (View view){
        Intent intent = new Intent(this, _6Live_from_8_sm_yfl_da_noatten.class);
        startActivity(intent);
    }



}