package plantdatabase.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import plantdatabase.example.plantdatabase.R;

public class _6Live_from_2_sm_yfl_br_atten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._6activity_live_from_2_sm_yfl_br_atten);
    }
    public void hang(View view) {
        Intent intent = new Intent(this, snapdragon.class);
        startActivity(intent);

    }

    public void sit(View view) {
        Intent intent = new Intent(this, kalanchoe.class);
        startActivity(intent);

    }
}