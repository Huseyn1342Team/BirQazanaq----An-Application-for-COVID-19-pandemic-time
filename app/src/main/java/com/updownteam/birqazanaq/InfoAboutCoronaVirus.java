package com.updownteam.birqazanaq;


import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class InfoAboutCoronaVirus extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dl = (DrawerLayout)findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open,R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();


        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.nav_protection:
                        Toast.makeText(InfoAboutCoronaVirus.this, "My Account",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_eats:
                        Toast.makeText(InfoAboutCoronaVirus.this, "Settings",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_films:
                        Toast.makeText(InfoAboutCoronaVirus.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_books:
                        Toast.makeText(InfoAboutCoronaVirus.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_statistics:
                        Toast.makeText(InfoAboutCoronaVirus.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_game:
                        Toast.makeText(InfoAboutCoronaVirus.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_programming:
                        Toast.makeText(InfoAboutCoronaVirus.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_language:
                        Toast.makeText(InfoAboutCoronaVirus.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    default:
                        return true;
                }


                return true;

            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
}