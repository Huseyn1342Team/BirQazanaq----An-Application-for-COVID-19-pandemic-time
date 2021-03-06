package com.updownteam.birqazanaq;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.os.Handler;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.commons.math3.geometry.spherical.twod.Circle;

import de.hdodenhof.circleimageview.CircleImageView;

public class MelumatCorona extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("News1");
        db1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                TextView Text2 = (TextView)findViewById(R.id.text2);
                ImageView Image2 = (ImageView)findViewById(R.id.image2);
                String StrimgImage= dataSnapshot.child("bigimage").getValue().toString();
                String StringText = dataSnapshot.child("bigtext").getValue().toString();
                Text2.setText(StringText);
                Picasso.get().load(StrimgImage).fit().centerCrop().into(Image2);
                ImageView Image3 = (ImageView)findViewById(R.id.image3);
                TextView Text3 = (TextView)findViewById(R.id.text3);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        //??ks??rd??kd?? v?? ya asq??rd??qda burnunuzu v?? a??z??n??z?? salfet v?? ya qolunuzun i?? hiss??si il?? ??rt??n.
        DatabaseReference db2 = FirebaseDatabase.getInstance().getReference().child("News2");
        db2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                ImageView Image3 = (ImageView)findViewById(R.id.image3);
                TextView Text3 = (TextView)findViewById(R.id.text3);
                String StrimgImage= dataSnapshot.child("bigimage").getValue().toString();
                String StringText = dataSnapshot.child("bigtext").getValue().toString();
                Text3.setText(StringText);
                Picasso.get().load(StrimgImage).fit().centerCrop().into(Image3);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        setContentView(R.layout.activity_melumat_corona);
        final ProgressDialog csprogress=new ProgressDialog(MelumatCorona.this);
        csprogress.setMessage("Z??hm??t olmasa g??zl??yin...");
        csprogress.show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                csprogress.dismiss();
            }
        }, 3000);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Korona haqq??nda m??lumat");
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
        //setSupportActionBar(toolbar);
        //toolbar.dismissPopupMenus();
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
        CardView Card1 = (CardView)findViewById(R.id.card1);
        CardView Card2 = (CardView)findViewById(R.id.card2);
        CardView Card3 = (CardView)findViewById(R.id.card3);
        Card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MelumatCorona.this,News1.class);
                startActivity(i);
            }
        });
        Card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MelumatCorona.this,News_2.class);
                startActivity(i);
            }
        });
        Card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MelumatCorona.this,News_3.class);
                startActivity(i);
            }
        });
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        //protection,eats,films,books,statistics,game,dress,programming,language
        Button Submit = (Button)findViewById(R.id.submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MelumatCorona.this,TestChooser.class);
                startActivity(i);
            }
        });
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_protection, R.id.nav_eats, R.id.nav_films,
                R.id.nav_books, R.id.nav_statistics, R.id.nav_game,
                R.id.nav_programming,R.id.nav_language)
                .setDrawerLayout(drawer)
                .build();
        View headerView = navigationView.getHeaderView(0);
        final CircleImageView ProfilImage = (CircleImageView)headerView.findViewById(R.id.profile_image);
        final TextView Name = (TextView)headerView.findViewById(R.id.name);
        DatabaseReference d1 = FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid());
        d1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String StringImage = dataSnapshot.child("profil").getValue().toString();
                String StringName = dataSnapshot.child("namesurname").getValue().toString();
                String StringGender = dataSnapshot.child("cins").getValue().toString();
                Picasso.get().load(StringImage).fit().centerCrop().into(ProfilImage);
                Name.setText(StringName);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.nav_protection:
                        Intent a =new Intent(MelumatCorona.this,MelumatCorona.class);
                        startActivity(a);
                        return false;
                    case R.id.nav_eats:
                        Intent b =new Intent(MelumatCorona.this,Kateqoriya_1.class);
                        b.putExtra("category","eats");
                        startActivity(b);
                        return false;
                    case R.id.nav_films:
                        Intent c = new Intent(MelumatCorona.this,Kateqoriya_1.class);
                        c.putExtra("category","films");
                        startActivity(c);
                        return  false;
                    case R.id.nav_books:
                        Intent d = new Intent(MelumatCorona.this,Kateqoriya_1.class);
                        d.putExtra("category","books");
                        startActivity(d);
                        return false;
                    case R.id.nav_statistics:
                        Intent  i =new Intent(MelumatCorona.this,Statistics_2.class);
                        startActivity(i);
                        return false;
                    case R.id.nav_game:
                        Intent f = new Intent(MelumatCorona.this,Kateqoriya_1.class);
                        f.putExtra("category","games");
                        startActivity(f);
                        return false;
                    case R.id.nav_programming:
                        Intent f2 = new Intent(MelumatCorona.this,Kateqoriya_1.class);
                        f2.putExtra("category","programming");
                        startActivity(f2);
                        return false;
                    case R.id.nav_language:
                        Intent f3 = new Intent(MelumatCorona.this,Kateqoriya_1.class);
                        f3.putExtra("category","language");
                        startActivity(f3);
                        return false;
                    case R.id.nav_photo:
                        Intent f4 = new Intent(MelumatCorona.this,Profil2.class);
                        startActivity(f4);
                        return false;
                    case R.id.nav_log:
                        FirebaseAuth.getInstance().signOut();
                        Intent f5 = new Intent(MelumatCorona.this,Sign_in.class);
                        startActivity(f5);
                        return false;
                    default:
                        return true;
                }
            }
        });
       //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
       //NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
       //NavigationUI.setupWithNavController(navigationView, navController);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.melumat_corona, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
       //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
       //return NavigationUI.navigateUp(navController, mAppBarConfiguration)
       //         || super.onSupportNavigateUp();
        return Boolean.parseBoolean(null);
    }
}
