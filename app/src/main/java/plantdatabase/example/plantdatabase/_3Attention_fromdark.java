package plantdatabase.example.plantdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import plantdatabase.example.plantdatabase.R;

public class _3Attention_fromdark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout._3activity_attention_fromdark);
    }

    public void attentionDark (View view){
        Intent intent  = new Intent(this, _4Flowers_fromda_atten3.class);
        startActivity(intent);
    }

    public void noAttentionDark (View view){
        Intent intent = new Intent(this, _4Flowers_fromda_noatten4.class);
        startActivity(intent);
    }


}