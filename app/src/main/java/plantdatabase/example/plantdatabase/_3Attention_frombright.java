package plantdatabase.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import plantdatabase.example.plantdatabase.R;

public class _3Attention_frombright extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._3activity_attention_frombright);
    }

    public void showyFromBright (View view){
        Intent intent = new Intent (this, _4Flowers_frombr_atten1.class);
        startActivity(intent);
    }

    public void noAttention (View view){
        Intent intent = new Intent(this, _4Flowers_frombr_noatten2.class);
        startActivity(intent);

    }


}