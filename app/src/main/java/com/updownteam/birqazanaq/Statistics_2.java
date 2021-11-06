package com.updownteam.birqazanaq;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class Statistics_2 extends AppCompatActivity {
    private String Death,Recover,Infected;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics_2);
        final ProgressDialog csprogress=new ProgressDialog(Statistics_2.this);
        csprogress.setMessage("Zəhmət olmasa gözləyin...");
        csprogress.show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                csprogress.dismiss();
            }
        }, 3000);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Statistika");
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setNavigationIcon(R.drawable.nav123);
        final DrawerLayout drawer = findViewById(R.id.drawer_layout);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!drawer.isDrawerOpen(GravityCompat.START)){
                    drawer.openDrawer(GravityCompat.START);
                }
                else{
                    drawer.closeDrawer(GravityCompat.END);
                }
            }
        });
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.instagram.com/bir_qazanaq/"));
                startActivity(intent);
            }
        });
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_protection, R.id.nav_eats, R.id.nav_films,
                R.id.nav_books, R.id.nav_statistics, R.id.nav_game,
                R.id.nav_programming,R.id.nav_language)
                .setDrawerLayout(drawer)
                .build();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.nav_protection:
                        Intent a =new Intent(Statistics_2.this,MelumatCorona.class);
                        startActivity(a);
                        return false;
                    case R.id.nav_eats:
                        Intent b =new Intent(Statistics_2.this,Kateqoriya_1.class);
                        b.putExtra("category","eats");
                        startActivity(b);
                        return false;
                    case R.id.nav_films:
                        Intent c = new Intent(Statistics_2.this,Kateqoriya_1.class);
                        c.putExtra("category","films");
                        startActivity(c);
                        return  false;
                    case R.id.nav_books:
                        Intent d = new Intent(Statistics_2.this,Kateqoriya_1.class);
                        d.putExtra("category","books");
                        startActivity(d);
                        return false;
                    case R.id.nav_statistics:
                        Intent  i =new Intent(Statistics_2.this,Statistics_2.class);
                        startActivity(i);
                        return false;
                    case R.id.nav_game:
                        Intent f = new Intent(Statistics_2.this,Kateqoriya_1.class);
                        f.putExtra("category","games");
                        startActivity(f);
                        return false;
                    case R.id.nav_programming:
                        Intent f2 = new Intent(Statistics_2.this,Kateqoriya_1.class);
                        f2.putExtra("category","programming");
                        startActivity(f2);
                        return false;
                    case R.id.nav_language:
                        Intent f3 = new Intent(Statistics_2.this,Kateqoriya_1.class);
                        f3.putExtra("category","language");
                        startActivity(f3);
                        return false;
                    case R.id.nav_photo:
                        Intent f4 = new Intent(Statistics_2.this,Profil2.class);
                        startActivity(f4);
                        return false;
                    case R.id.nav_log:
                        FirebaseAuth.getInstance().signOut();
                        Intent f5 = new Intent(Statistics_2.this,Sign_in.class);
                        startActivity(f5);
                        return false;
                    default:
                        return true;
                }
            }
        });
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
       // NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
       // NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
       // NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.statistics_2, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
