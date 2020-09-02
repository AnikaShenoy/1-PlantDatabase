package plantdatabase.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import plantdatabase.example.plantdatabase.R;

public class _5Size_from2nfl_br_noatten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._5activity_size_from2nfl_br_noatten);
    }

    public void large (View view){
        Intent intent = new Intent(this, _6Live_from_3_la_nfl_br_noatten.class);
        startActivity(intent);
    }

    public void small (View view){
        Intent intent = new Intent(this, _6Live_from_3_sm_nfl_br_noatten.class);
        startActivity(intent);
    }

}