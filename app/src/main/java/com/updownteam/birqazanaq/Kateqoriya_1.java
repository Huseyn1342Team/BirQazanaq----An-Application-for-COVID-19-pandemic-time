package com.updownteam.birqazanaq;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.os.Handler;
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

import de.hdodenhof.circleimageview.CircleImageView;

public class Kateqoriya_1 extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kateqoriya_1);
        Button Submit = (Button)findViewById(R.id.submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Kateqoriya_1.this,TestChooser.class);
                startActivity(i);
            }
        });
        //DrawerLayout drawer = findViewById(R.id.drawer_layout);
        final ProgressDialog csprogress=new ProgressDialog(Kateqoriya_1.this);
        csprogress.setMessage("Zəhmət olmasa gözləyin...");
        csprogress.show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                csprogress.dismiss();
            }
        }, 3000);
        final Toolbar toolbar = findViewById(R.id.toolbar);
        final String StringCategory = getIntent().getStringExtra("category");
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
        if(StringCategory.matches("eats")){
            toolbar.setTitle("Günün yeməkləri");
            toolbar.setTitleTextColor(Color.WHITE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Eats");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    TextView Text1 = (TextView)findViewById(R.id.text1);
                    TextView Text2 = (TextView)findViewById(R.id.text2);
                    TextView Text3 = (TextView)findViewById(R.id.text3);
                    ImageView Image1 = (ImageView) findViewById(R.id.image1);
                    ImageView Image2 = (ImageView)findViewById(R.id.image2);
                    ImageView Image3 = (ImageView)findViewById(R.id.image3);
                    CardView Card1 = (CardView) findViewById(R.id.card1);
                    CardView Card2 = (CardView)findViewById(R.id.card2);
                    CardView Card3 = (CardView)findViewById(R.id.card3);
                    Card1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","eat1");
                            startActivity(i);
                        }
                    });
                    Card2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","eat2");
                            startActivity(i);
                        }
                    });
                    Card3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","eat3");
                            startActivity(i);
                        }
                    });
                    String StringText1 = dataSnapshot.child("eat1").child("bigtext").getValue().toString();
                    String StringText2 = dataSnapshot.child("eat2").child("bigtext").getValue().toString();
                    String StringText3 = dataSnapshot.child("eat3").child("bigtext").getValue().toString();
                    String StringImage1 = dataSnapshot.child("eat1").child("bigimage").getValue().toString();
                    String StringImage2 = dataSnapshot.child("eat2").child("bigimage").getValue().toString();
                    String StringImage3 = dataSnapshot.child("eat3").child("bigimage").getValue().toString();
                    Text1.setText(StringText1);
                    Text2.setText(StringText2);
                    Text3.setText(StringText3);
                    Picasso.get().load(StringImage1).fit().centerCrop().into(Image1);
                    Picasso.get().load(StringImage2).fit().centerCrop().into(Image2);
                    Picasso.get().load(StringImage3).fit().centerCrop().into(Image3);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
        if(StringCategory.matches("films")){
            toolbar.setTitle("Günün filmləri");
            toolbar.setTitleTextColor(Color.WHITE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Films");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    TextView Text1 = (TextView)findViewById(R.id.text1);
                    TextView Text2 = (TextView)findViewById(R.id.text2);
                    TextView Text3 = (TextView)findViewById(R.id.text3);
                    ImageView Image1 = (ImageView) findViewById(R.id.image1);
                    ImageView Image2 = (ImageView)findViewById(R.id.image2);
                    ImageView Image3 = (ImageView)findViewById(R.id.image3);
                    CardView Card1 = (CardView) findViewById(R.id.card1);
                    CardView Card2 = (CardView)findViewById(R.id.card2);
                    CardView Card3 = (CardView)findViewById(R.id.card3);
                    Card1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","film1");
                            startActivity(i);
                        }
                    });
                    Card2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","film2");
                            startActivity(i);
                        }
                    });
                    Card3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","film3");
                            startActivity(i);
                        }
                    });
                    String StringText1 = dataSnapshot.child("film1").child("bigtext").getValue().toString();
                    String StringText2 = dataSnapshot.child("film2").child("bigtext").getValue().toString();
                    String StringText3 = dataSnapshot.child("film3").child("bigtext").getValue().toString();
                    String StringImage1 = dataSnapshot.child("film1").child("bigimage").getValue().toString();
                    String StringImage2 = dataSnapshot.child("film2").child("bigimage").getValue().toString();
                    String StringImage3 = dataSnapshot.child("film3").child("bigimage").getValue().toString();
                    Text1.setText(StringText1);
                    Text2.setText(StringText2);
                    Text3.setText(StringText3);
                    Picasso.get().load(StringImage1).fit().centerCrop().into(Image1);
                    Picasso.get().load(StringImage2).fit().centerCrop().into(Image2);
                    Picasso.get().load(StringImage3).fit().centerCrop().into(Image3);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
        if(StringCategory.matches("books")){
            toolbar.setTitle("Günün kitabları");
            toolbar.setTitleTextColor(Color.WHITE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Books");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    TextView Text1 = (TextView)findViewById(R.id.text1);
                    TextView Text2 = (TextView)findViewById(R.id.text2);
                    TextView Text3 = (TextView)findViewById(R.id.text3);
                    ImageView Image1 = (ImageView) findViewById(R.id.image1);
                    ImageView Image2 = (ImageView)findViewById(R.id.image2);
                    ImageView Image3 = (ImageView)findViewById(R.id.image3);
                    CardView Card1 = (CardView) findViewById(R.id.card1);
                    CardView Card2 = (CardView)findViewById(R.id.card2);
                    CardView Card3 = (CardView)findViewById(R.id.card3);
                    Card1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","book1");
                            startActivity(i);
                        }
                    });
                    Card2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","book2");
                            startActivity(i);
                        }
                    });
                    Card3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","book3");
                            startActivity(i);
                        }
                    });
                    String StringText1 = dataSnapshot.child("book1").child("bigtext").getValue().toString();
                    String StringText2 = dataSnapshot.child("book2").child("bigtext").getValue().toString();
                    String StringText3 = dataSnapshot.child("book3").child("bigtext").getValue().toString();
                    String StringImage1 = dataSnapshot.child("book1").child("bigimage").getValue().toString();
                    String StringImage2 = dataSnapshot.child("book2").child("bigimage").getValue().toString();
                    String StringImage3 = dataSnapshot.child("book3").child("bigimage").getValue().toString();
                    Text1.setText(StringText1);
                    Text2.setText(StringText2);
                    Text3.setText(StringText3);
                    Picasso.get().load(StringImage1).fit().centerCrop().into(Image1);
                    Picasso.get().load(StringImage2).fit().centerCrop().into(Image2);
                    Picasso.get().load(StringImage3).fit().centerCrop().into(Image3);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
        if(StringCategory.matches("games")){
            toolbar.setTitle("Günün oyunları");
            toolbar.setTitleTextColor(Color.WHITE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Games");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    TextView Text1 = (TextView)findViewById(R.id.text1);
                    TextView Text2 = (TextView)findViewById(R.id.text2);
                    TextView Text3 = (TextView)findViewById(R.id.text3);
                    ImageView Image1 = (ImageView) findViewById(R.id.image1);
                    ImageView Image2 = (ImageView)findViewById(R.id.image2);
                    ImageView Image3 = (ImageView)findViewById(R.id.image3);
                    CardView Card1 = (CardView) findViewById(R.id.card1);
                    CardView Card2 = (CardView)findViewById(R.id.card2);
                    CardView Card3 = (CardView)findViewById(R.id.card3);
                    Card1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","game1");
                            startActivity(i);
                        }
                    });
                    Card2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","game2");
                            startActivity(i);
                        }
                    });
                    Card3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","game3");
                            startActivity(i);
                        }
                    });
                    String StringText1 = dataSnapshot.child("game1").child("bigtext").getValue().toString();
                    String StringText2 = dataSnapshot.child("game2").child("bigtext").getValue().toString();
                    String StringText3 = dataSnapshot.child("game3").child("bigtext").getValue().toString();
                    String StringImage1 = dataSnapshot.child("game1").child("bigimage").getValue().toString();
                    String StringImage2 = dataSnapshot.child("game2").child("bigimage").getValue().toString();
                    String StringImage3 = dataSnapshot.child("game3").child("bigimage").getValue().toString();
                    Text1.setText(StringText1);
                    Text2.setText(StringText2);
                    Text3.setText(StringText3);
                    Picasso.get().load(StringImage1).fit().centerCrop().into(Image1);
                    Picasso.get().load(StringImage2).fit().centerCrop().into(Image2);
                    Picasso.get().load(StringImage3).fit().centerCrop().into(Image3);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
        if(StringCategory.matches("dresses")){
            toolbar.setTitle("Günün geyimləri");
            toolbar.setTitleTextColor(Color.WHITE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Dresses");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    TextView Text1 = (TextView)findViewById(R.id.text1);
                    TextView Text2 = (TextView)findViewById(R.id.text2);
                    TextView Text3 = (TextView)findViewById(R.id.text3);
                    ImageView Image1 = (ImageView) findViewById(R.id.image1);
                    ImageView Image2 = (ImageView)findViewById(R.id.image2);
                    ImageView Image3 = (ImageView)findViewById(R.id.image3);
                    CardView Card1 = (CardView) findViewById(R.id.card1);
                    CardView Card2 = (CardView)findViewById(R.id.card2);
                    CardView Card3 = (CardView)findViewById(R.id.card3);
                    Card1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","dress1");
                            startActivity(i);
                        }
                    });
                    Card2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","dress2");
                            startActivity(i);
                        }
                    });
                    Card3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","dress3");
                            startActivity(i);
                        }
                    });
                    String StringText1 = dataSnapshot.child("dress1").child("bigtext").getValue().toString();
                    String StringText2 = dataSnapshot.child("dress2").child("bigtext").getValue().toString();
                    String StringText3 = dataSnapshot.child("dress3").child("bigtext").getValue().toString();
                    String StringImage1 = dataSnapshot.child("dress1").child("bigimage").getValue().toString();
                    String StringImage2 = dataSnapshot.child("dress2").child("bigimage").getValue().toString();
                    String StringImage3 = dataSnapshot.child("dress3").child("bigimage").getValue().toString();
                    Text1.setText(StringText1);
                    Text2.setText(StringText2);
                    Text3.setText(StringText3);
                    Picasso.get().load(StringImage1).fit().centerCrop().into(Image1);
                    Picasso.get().load(StringImage2).fit().centerCrop().into(Image2);
                    Picasso.get().load(StringImage3).fit().centerCrop().into(Image3);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
        if(StringCategory.matches("programming")){
            toolbar.setTitle("Günün proqramlaşdırma tapşırıqları");
            toolbar.setTitleTextColor(Color.WHITE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Programming");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    TextView Text1 = (TextView)findViewById(R.id.text1);
                    TextView Text2 = (TextView)findViewById(R.id.text2);
                    TextView Text3 = (TextView)findViewById(R.id.text3);
                    ImageView Image1 = (ImageView) findViewById(R.id.image1);
                    ImageView Image2 = (ImageView)findViewById(R.id.image2);
                    ImageView Image3 = (ImageView)findViewById(R.id.image3);
                    CardView Card1 = (CardView) findViewById(R.id.card1);
                    CardView Card2 = (CardView)findViewById(R.id.card2);
                    CardView Card3 = (CardView)findViewById(R.id.card3);
                    Card1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","programming1");
                            startActivity(i);
                        }
                    });
                    Card2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","programming2");
                            startActivity(i);
                        }
                    });
                    Card3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","programming3");
                            startActivity(i);
                        }
                    });
                    String StringText1 = dataSnapshot.child("programming1").child("bigtext").getValue().toString();
                    String StringText2 = dataSnapshot.child("programming2").child("bigtext").getValue().toString();
                    String StringText3 = dataSnapshot.child("programming3").child("bigtext").getValue().toString();
                    String StringImage1 = dataSnapshot.child("programming1").child("bigimage").getValue().toString();
                    String StringImage2 = dataSnapshot.child("programming2").child("bigimage").getValue().toString();
                    String StringImage3 = dataSnapshot.child("programming3").child("bigimage").getValue().toString();
                    Text1.setText(StringText1);
                    Text2.setText(StringText2);
                    Text3.setText(StringText3);
                    Picasso.get().load(StringImage1).fit().centerCrop().into(Image1);
                    Picasso.get().load(StringImage2).fit().centerCrop().into(Image2);
                    Picasso.get().load(StringImage3).fit().centerCrop().into(Image3);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
        if(StringCategory.matches("language")){
            toolbar.setTitle("Dil örgən ");
            toolbar.setTitleTextColor(Color.WHITE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Languages");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    TextView Text1 = (TextView)findViewById(R.id.text1);
                    TextView Text2 = (TextView)findViewById(R.id.text2);
                    TextView Text3 = (TextView)findViewById(R.id.text3);
                    ImageView Image1 = (ImageView) findViewById(R.id.image1);
                    ImageView Image2 = (ImageView)findViewById(R.id.image2);
                    ImageView Image3 = (ImageView)findViewById(R.id.image3);
                    CardView Card1 = (CardView) findViewById(R.id.card1);
                    CardView Card2 = (CardView)findViewById(R.id.card2);
                    CardView Card3 = (CardView)findViewById(R.id.card3);
                    Card1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","language1");
                            startActivity(i);
                        }
                    });
                    Card2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","language2");
                            startActivity(i);
                        }
                    });
                    Card3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i =new Intent(Kateqoriya_1.this,Kateqoriya_2.class);
                            i.putExtra("category","language3");
                            startActivity(i);
                        }
                    });
                    String StringText1 = dataSnapshot.child("language1").child("bigtext").getValue().toString();
                    String StringText2 = dataSnapshot.child("language2").child("bigtext").getValue().toString();
                    String StringText3 = dataSnapshot.child("language3").child("bigtext").getValue().toString();
                    String StringImage1 = dataSnapshot.child("language1").child("bigimage").getValue().toString();
                    String StringImage2 = dataSnapshot.child("language2").child("bigimage").getValue().toString();
                    String StringImage3 = dataSnapshot.child("language3").child("bigimage").getValue().toString();
                    Text1.setText(StringText1);
                    Text2.setText(StringText2);
                    Text3.setText(StringText3);
                    Picasso.get().load(StringImage1).fit().centerCrop().into(Image1);
                    Picasso.get().load(StringImage2).fit().centerCrop().into(Image2);
                    Picasso.get().load(StringImage3).fit().centerCrop().into(Image3);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
        //setSupportActionBar(toolbar);
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
                R.id.nav_protection, R.id.nav_eats, R.id.nav_films,-
                R.id.nav_books, R.id.nav_statistics, R.id.nav_game,R.id.nav_programming,R.id.nav_language)
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
                        Intent a =new Intent(Kateqoriya_1.this,MelumatCorona.class);
                        startActivity(a);
                        return false;
                    case R.id.nav_eats:
                        Intent b =new Intent(Kateqoriya_1.this,Kateqoriya_1.class);
                        b.putExtra("category","eats");
                        startActivity(b);
                        return false;
                    case R.id.nav_films:
                        Intent c = new Intent(Kateqoriya_1.this,Kateqoriya_1.class);
                        c.putExtra("category","films");
                        startActivity(c);
                        return  false;
                    case R.id.nav_books:
                        Intent d = new Intent(Kateqoriya_1.this,Kateqoriya_1.class);
                        d.putExtra("category","books");
                        startActivity(d);
                        return false;
                    case R.id.nav_statistics:
                        Intent  i =new Intent(Kateqoriya_1.this,Statistics_2.class);
                        startActivity(i);
                        return false;
                    case R.id.nav_game:
                        Intent f = new Intent(Kateqoriya_1.this,Kateqoriya_1.class);
                        f.putExtra("category","games");
                        startActivity(f);
                        return false;
                    case R.id.nav_programming:
                        Intent f2 = new Intent(Kateqoriya_1.this,Kateqoriya_1.class);
                        f2.putExtra("category","programming");
                        startActivity(f2);
                        return false;
                    case R.id.nav_language:
                        Intent f3 = new Intent(Kateqoriya_1.this,Kateqoriya_1.class);
                        f3.putExtra("category","language");
                        startActivity(f3);
                        return false;
                    case R.id.nav_photo:
                        Intent f4 = new Intent(Kateqoriya_1.this,Profil2.class);
                        startActivity(f4);
                        return false;
                    case R.id.nav_log:
                        FirebaseAuth.getInstance().signOut();
                        Intent f5 = new Intent(Kateqoriya_1.this,Sign_in.class);
                        startActivity(f5);
                        return false;
                    default:
                        return true;
                }
            }
        });

       // NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
       // NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
       // NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.kateqoriya_1, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
       // NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
       // return NavigationUI.navigateUp(navController, mAppBarConfiguration)
       //
        //        || super.onSupportNavigateUp();
        return false;
    }
}
