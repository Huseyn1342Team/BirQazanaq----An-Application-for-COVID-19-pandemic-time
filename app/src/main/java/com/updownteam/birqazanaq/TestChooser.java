package com.updownteam.birqazanaq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class TestChooser extends AppCompatActivity {
    private RelativeLayout Korona;
    private RelativeLayout Diabet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_test_chooser);
        Korona = (RelativeLayout)findViewById(R.id.korona);
        Diabet =(RelativeLayout)findViewById(R.id.diabet);
        Korona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(TestChooser.this,ChooseAnalyze.class);
                startActivity(i);
            }
        });
        Diabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TestChooser.this,DiabetTest.class);
                startActivity(i);
            }
        });
    }
}
