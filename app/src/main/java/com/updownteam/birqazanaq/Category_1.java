package com.updownteam.birqazanaq;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Toast;

public class Category_1 extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_protection,R.id.nav_eats,
                R.id.nav_films,R.id.nav_books,
                R.id.nav_statistics,R.id.nav_game,
                R.id.nav_programming,
                R.id.nav_language)
                .setDrawerLayout(drawer)
                .build();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.nav_protection:
                        Toast.makeText(Category_1.this, "My Account",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_eats:
                        Toast.makeText(Category_1.this, "Settings",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_films:
                        Toast.makeText(Category_1.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_books:
                        Toast.makeText(Category_1.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_statistics:
                        Toast.makeText(Category_1.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_game:
                        Toast.makeText(Category_1.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_programming:
                        Toast.makeText(Category_1.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    case R.id.nav_language:
                        Toast.makeText(Category_1.this, "My Cart",Toast.LENGTH_SHORT).show();break;
                    default:
                        return true;
                }


                return true;

            }
        });
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.category_1, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
