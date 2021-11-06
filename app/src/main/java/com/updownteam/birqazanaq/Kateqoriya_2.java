package com.updownteam.birqazanaq;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class Kateqoriya_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kateqoriya_2);
        MobileAds.initialize(this,getString(R.string.app_id));
        AdView ad1 = (AdView)this.findViewById(R.id.ad1);
        AdView ad2 = (AdView)this.findViewById(R.id.ad2);
        AdRequest request1 = new AdRequest.Builder().build();
        AdRequest request2 = new AdRequest.Builder().build();
        ad1.loadAd(request1);
        ad2.loadAd(request2);
        final ProgressDialog csprogress=new ProgressDialog(Kateqoriya_2.this);
        csprogress.setMessage("Zəhmət olmasa gözləyin...");
        csprogress.show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                csprogress.dismiss();
            }
        }, 3000);
        String StringCategory = getIntent().getStringExtra("category");
        final Button Submit = (Button)findViewById(R.id.submit);
        if(StringCategory.matches("eat1")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Eats").child("eat1");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","eat1");
                    startActivity(i);
                }
            });

        }
        if(StringCategory.matches("eat2")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Eats").child("eat2");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","eat2");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("eat3")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Eats").child("eat3");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","eat3");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("film1")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Films").child("film1");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","film1");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("film2")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Films").child("film2");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","film2");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("film3")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Films").child("film3");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","film3");
                    startActivity(i);
                }
            });

        }
        if(StringCategory.matches("book1")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Books").child("book1");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","book1");
                    startActivity(i);
                }
            });

        }
        if(StringCategory.matches("book2")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Books").child("book2");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","book2");
                    startActivity(i);
                }
            });

        }
        if(StringCategory.matches("book3")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Books").child("book3");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","book3");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("game1")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Games").child("game1");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","game1");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("game2")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Games").child("game2");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","game2");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("game3")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Games").child("game3");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","game3");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("dress1")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Dresses").child("dress1");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","dress1");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("dress2")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Dresses").child("dress2");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","dress2");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("dress3")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Dresses").child("dress3");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","dress3");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("programming1")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Programming").child("programming1");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","programming1");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("programming2")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Programming").child("programming2");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","programming2");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("programming3")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Programming").child("programming3");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","programming3");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("language1")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Languages").child("language1");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","language1");
                    startActivity(i);
                }
            });

        }
        if(StringCategory.matches("language2")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Languages").child("language2");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","language2");
                    startActivity(i);
                }
            });
        }
        if(StringCategory.matches("language3")){
            final ImageView Image1 = (ImageView)findViewById(R.id.image1);
            final ImageView Image2 = (ImageView)findViewById(R.id.image2);
            final ImageView Image3 = (ImageView)findViewById(R.id.text3);
            final ImageView Image4 = (ImageView)findViewById(R.id.image4);
            final ImageView Image5 = (ImageView)findViewById(R.id.image5);
            final ImageView Image6 = (ImageView)findViewById(R.id.image6);
            final ImageView Image7 = (ImageView)findViewById(R.id.image7);
            final ImageView Image8 = (ImageView)findViewById(R.id.image8);
            final ImageView Image9 = (ImageView)findViewById(R.id.image9);
            final ImageView Image10 = (ImageView)findViewById(R.id.image10);
            final ImageView Image11 = (ImageView)findViewById(R.id.image11);
            final ImageView Image12 = (ImageView)findViewById(R.id.image12);
            final TextView Title1 = (TextView)findViewById(R.id.title1);
            final TextView Title2 = (TextView)findViewById(R.id.title2);
            final TextView Title3 = (TextView)findViewById(R.id.title3);
            final TextView Title4 = (TextView)findViewById(R.id.title4);
            final TextView Title5 = (TextView)findViewById(R.id.title5);
            final TextView Title6 = (TextView)findViewById(R.id.title6);
            final TextView Title7 = (TextView)findViewById(R.id.title7);
            final TextView Title8 = (TextView)findViewById(R.id.title8);
            final TextView Title9 = (TextView)findViewById(R.id.title9);
            final TextView Title10 = (TextView)findViewById(R.id.title10);
            final TextView Title11 = (TextView)findViewById(R.id.title11);
            final TextView Title12 = (TextView)findViewById(R.id.title12);
            final TextView Description1 = (TextView)findViewById(R.id.description1);
            final TextView Description2 = (TextView)findViewById(R.id.description2);
            final TextView Description3 = (TextView)findViewById(R.id.description3);
            final TextView Description4 = (TextView)findViewById(R.id.description4);
            final TextView Description5 = (TextView)findViewById(R.id.description5);
            final TextView Description6 = (TextView)findViewById(R.id.description6);
            final TextView Description7 = (TextView)findViewById(R.id.description7);
            final TextView Description8 = (TextView)findViewById(R.id.description8);
            final TextView Description9 = (TextView)findViewById(R.id.description9);
            final TextView Description10 = (TextView)findViewById(R.id.description10);
            final TextView Description11 = (TextView)findViewById(R.id.description11);
            final TextView Description12 = (TextView)findViewById(R.id.description12);
            Title1.setVisibility(View.GONE);
            Title2.setVisibility(View.GONE);
            Title3.setVisibility(View.GONE);
            Title4.setVisibility(View.GONE);
            Title5.setVisibility(View.GONE);
            Title6.setVisibility(View.GONE);
            Title7.setVisibility(View.GONE);
            Title8.setVisibility(View.GONE);
            Title9.setVisibility(View.GONE);
            Title10.setVisibility(View.GONE);
            Title11.setVisibility(View.GONE);
            Title12.setVisibility(View.GONE);
            Image1.setVisibility(View.GONE);
            Image2.setVisibility(View.GONE);
            Image3.setVisibility(View.GONE);
            Image4.setVisibility(View.GONE);
            Image5.setVisibility(View.GONE);
            Image6.setVisibility(View.GONE);
            Image7.setVisibility(View.GONE);
            Image8.setVisibility(View.GONE);
            Image9.setVisibility(View.GONE);
            Image10.setVisibility(View.GONE);
            Image11.setVisibility(View.GONE);
            Image12.setVisibility(View.GONE);
            Description1.setVisibility(View.GONE);
            Description2.setVisibility(View.GONE);
            Description3.setVisibility(View.GONE);
            Description4.setVisibility(View.GONE);
            Description5.setVisibility(View.GONE);
            Description6.setVisibility(View.GONE);
            Description7.setVisibility(View.GONE);
            Description8.setVisibility(View.GONE);
            Description9.setVisibility(View.GONE);
            Description10.setVisibility(View.GONE);
            Description11.setVisibility(View.GONE);
            Description12.setVisibility(View.GONE);
            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Languages").child("language3");
            db1.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(dataSnapshot.hasChild("image1")){
                        Image1.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image1").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image1);
                    }
                    if(dataSnapshot.hasChild("image2")){
                        Image2.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image2").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image2);
                    }
                    if(dataSnapshot.hasChild("image3")){
                        Image3.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image3").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image3);
                    }
                    if(dataSnapshot.hasChild("image4")){
                        Image4.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image4").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image4);
                    }
                    if(dataSnapshot.hasChild("image5")){
                        Image5.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image5").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image5);
                    }
                    if(dataSnapshot.hasChild("image6")){
                        Image6.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image6").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image6);
                    }
                    if(dataSnapshot.hasChild("image7")){
                        Image7.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image7").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image7);
                    }
                    if(dataSnapshot.hasChild("image8")){
                        Image8.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image8").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image8);
                    }
                    if(dataSnapshot.hasChild("image9")){
                        Image9.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image9").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image9);
                    }
                    if(dataSnapshot.hasChild("image10")){
                        Image10.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image10").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image10);
                    }
                    if(dataSnapshot.hasChild("image11")){
                        Image11.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image11").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image11);
                    }
                    if(dataSnapshot.hasChild("image12")){
                        Image12.setVisibility(View.VISIBLE);
                        String Value = dataSnapshot.child("image12").getValue().toString();
                        Picasso.get().load(Value).fit().centerCrop().into(Image12);
                    }
                    if(dataSnapshot.hasChild("title1")){
                        Title1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title1").getValue().toString();
                        Title1.setText(value);
                    }
                    if(dataSnapshot.hasChild("title2")){
                        Title2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title2").getValue().toString();
                        Title2.setText(value);
                    }
                    if(dataSnapshot.hasChild("title3")){
                        Title3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title3").getValue().toString();
                        Title3.setText(value);
                    }
                    if(dataSnapshot.hasChild("title4")){
                        Title4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title4").getValue().toString();
                        Title4.setText(value);
                    }
                    if(dataSnapshot.hasChild("title5")){
                        Title5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title5").getValue().toString();
                        Title5.setText(value);
                    }
                    if(dataSnapshot.hasChild("title6")){
                        Title6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title6").getValue().toString();
                        Title6.setText(value);
                    }
                    if(dataSnapshot.hasChild("title7")){
                        Title7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title7").getValue().toString();
                        Title7.setText(value);
                    }
                    if(dataSnapshot.hasChild("title8")){
                        Title8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title8").getValue().toString();
                        Title8.setText(value);
                    }
                    if(dataSnapshot.hasChild("title9")){
                        Title9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title9").getValue().toString();
                        Title9.setText(value);
                    }
                    if(dataSnapshot.hasChild("title10")){
                        Title10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title10").getValue().toString();
                        Title10.setText(value);
                    }
                    if(dataSnapshot.hasChild("title11")){
                        Title11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title11").getValue().toString();
                        Title11.setText(value);
                    }
                    if(dataSnapshot.hasChild("title12")){
                        Title12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("title12").getValue().toString();
                        Title12.setText(value);
                    }
                    if(dataSnapshot.hasChild("description1")){
                        Description1.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description1").getValue().toString();
                        Description1.setText(value);
                    }
                    if(dataSnapshot.hasChild("description2")){
                        Description2.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description2").getValue().toString();
                        Description2.setText(value);
                    }
                    if(dataSnapshot.hasChild("description3")){
                        Description3.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description3").getValue().toString();
                        Description3.setText(value);
                    }
                    if(dataSnapshot.hasChild("description4")){
                        Description4.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description4").getValue().toString();
                        Description4.setText(value);
                    }
                    if(dataSnapshot.hasChild("description5")){
                        Description5.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description5").getValue().toString();
                        Description5.setText(value);
                    }
                    if(dataSnapshot.hasChild("description6")){
                        Description6.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description6").getValue().toString();
                        Description6.setText(value);
                    }
                    if(dataSnapshot.hasChild("description7")){
                        Description7.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description7").getValue().toString();
                        Description7.setText(value);
                    }
                    if(dataSnapshot.hasChild("description8")){
                        Description8.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description8").getValue().toString();
                        Description8.setText(value);
                    }
                    if(dataSnapshot.hasChild("description9")){
                        Description9.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description9").getValue().toString();
                        Description9.setText(value);
                    }
                    if(dataSnapshot.hasChild("description10")){
                        Description10.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description10").getValue().toString();
                        Description10.setText(value);
                    }
                    if(dataSnapshot.hasChild("description11")){
                        Description11.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description11").getValue().toString();
                        Description11.setText(value);
                    }
                    if(dataSnapshot.hasChild("description12")){
                        Description12.setVisibility(View.VISIBLE);
                        String value = dataSnapshot.child("description12").getValue().toString();
                        Description12.setText(value);
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(Kateqoriya_2.this,Kateqoriya_3.class);
                    i.putExtra("category","language3");
                    startActivity(i);
                }
            });
        }

    }
}
