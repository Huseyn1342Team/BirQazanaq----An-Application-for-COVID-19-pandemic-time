package com.updownteam.birqazanaq;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.net.Inet4Address;

public class Protect_activity extends AppCompatActivity {
    private String user;
    private int p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protect_activity);
        final String StringCategory = getIntent().getStringExtra("category");

        Button VS = (Button)this.findViewById(R.id.StartVS);
        VS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(StringCategory.matches("hearthrate")){
                    Intent i =new Intent(Protect_activity.this,HearthRate_1.class);
                    startActivity(i);
                }
                if(StringCategory.matches("saturation")){
                    Intent i =new Intent(Protect_activity.this,Saturation_1.class);
                    startActivity(i);
                }
                if(StringCategory.matches("respiration")){
                    Intent i =new Intent(Protect_activity.this,Respiration_1.class);
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}