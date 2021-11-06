package com.updownteam.birqazanaq;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.slice.SliceItem;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class Statistics extends AppCompatActivity {
    private String Death,Recover,Infected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        MobileAds.initialize(this,getString(R.string.app_id));
        AdView ad1 = (AdView)this.findViewById(R.id.ad1);
        AdView ad2 = (AdView)this.findViewById(R.id.ad2);
        AdRequest request1 = new AdRequest.Builder().build();
        AdRequest request2 = new AdRequest.Builder().build();
        ad1.loadAd(request1);
        ad2.loadAd(request2);
        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference();
        db1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                TextView DeathNumber = (TextView)findViewById(R.id.deathnumber);
                TextView InfectedNumber = (TextView)findViewById(R.id.infectednumber);
                TextView RecoverNumber =(TextView)findViewById(R.id.recovernumber);
                DeathNumber.setText(dataSnapshot.child("Statistika").child("deathnumber").getValue().toString()+" ölən");
                InfectedNumber.setText(dataSnapshot.child("Statistika").child("infectednumber").getValue().toString()+" yoluxan");
                RecoverNumber.setText(dataSnapshot.child("Statistika").child("recovernumber").getValue().toString()+" sağalan");
                Death = dataSnapshot.child("Statistika").child("death").getValue().toString();
                Recover = dataSnapshot.child("Statistika").child("recover").getValue().toString();
                Infected = dataSnapshot.child("Statistika").child("infected").getValue().toString();
                PieChartView pieChartView = findViewById(R.id.chart);
                PieChartView pieChartView1 = findViewById(R.id.chart2);
                PieChartView pieChartView2 = findViewById(R.id.chart3);
                //
                List<SliceValue> pieData = new ArrayList<>();
                List<SliceValue> pieData1 = new ArrayList<>();
                List<SliceValue> pieData2 = new ArrayList<>();
                //
                pieData.add(new SliceValue(Integer.valueOf(Death), Color.BLUE).setLabel(dataSnapshot.child("Statistika").child("deathfaiz").getValue().toString()));
                pieData.add(new SliceValue(100-Integer.valueOf(Death), Color.BLACK).setLabel(""));
                //
                pieData1.add(new SliceValue(Integer.valueOf(Recover), Color.BLUE).setLabel(dataSnapshot.child("Statistika").child("recoverfaiz").getValue().toString()));
                pieData1.add(new SliceValue(100-Integer.valueOf(Recover), Color.BLACK).setLabel(""));
                //
                pieData2.add(new SliceValue(Integer.valueOf(Infected),Color.BLUE).setLabel("100%"));
                //
                PieChartData pieChartData = new PieChartData(pieData);
                PieChartData pieChartData1 = new PieChartData(pieData1);
                //
                PieChartData pieChartData2 = new PieChartData(pieData2);
                //
                pieChartData2.setHasCenterCircle(true).setCenterText1("Yoluxanlar").setCenterText1FontSize(12);
                pieChartData1.setHasCenterCircle(true).setCenterText1("Sağalanlar").setCenterText1FontSize(12);
                pieChartData.setHasCenterCircle(true).setCenterText1("Ölənlər").setCenterText1FontSize(12);
                //
                pieChartData2.setHasLabels(true);
                pieChartData.setHasLabels(true);
                pieChartData1.setHasLabels(true);
                //
                pieChartView2.setPieChartData(pieChartData2);
                pieChartView1.setPieChartData(pieChartData1);
                pieChartView.setPieChartData(pieChartData);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
