package com.updownteam.birqazanaq;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.HeaderViewListAdapter;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ChooseAnalyze_3 extends AppCompatActivity {
    //Headache,Sneez,Fever,Cough,Respiration,Urine,Pain,Fatigue,Nose,Oxygen
    private String StringHeadache = "false";
    private String StringSneez = "false";
    private String StringFever = "false";
    private String StringCough = "false";
    private String StringRespiration = "false";
    private String StringUrine = "false";
    private String StringPain = "false";
    private String StringFatigue = "false";
    private String StringNose = "false";
    private String StringOxygen = "false";
    private String StringThroat = "false";
    private String StringChest = "false";
    private String StringMede = "false";
    private String StringKusma = "false";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_analyze_3);
        MobileAds.initialize(this,getString(R.string.app_id));
        AdView ad1 = (AdView)this.findViewById(R.id.ad1);
        AdView ad2 = (AdView)this.findViewById(R.id.ad2);
        AdRequest request1 = new AdRequest.Builder().build();
        AdRequest request2 = new AdRequest.Builder().build();
        ad1.loadAd(request1);
        ad2.loadAd(request2);
        //Headache,Sneez,Fever,Cough,Respiration,Urine,Pain,Fatigue,Nose,Oxygen,Community,Doktor,BloodPressure,Diabet,Lung,Liver,Kidney,Hearth,Genetic,PainKiller,
        //BloodCancer,Cancer,Kemo,Immune,Kortizon,Hospital,Ill,Country
        final String Community = getIntent().getStringExtra("community");
        final String Doktor = getIntent().getStringExtra("doktor");
        final String BloodPressure=getIntent().getStringExtra("bloodpressure");
        final String Diabet = getIntent().getStringExtra("diabet");
        final String Lung  = getIntent().getStringExtra("lung");
        final String Liver = getIntent().getStringExtra("liver");
        final String Kidney = getIntent().getStringExtra("kidney");
        final String Hearth = getIntent().getStringExtra("hearth");
        final String Infection = getIntent().getStringExtra("infection");
        final String Genetic = getIntent().getStringExtra("genetic");
        final String PainKiller = getIntent().getStringExtra("painkiller");
        final String BloodCancer = getIntent().getStringExtra("bloodcancer");
        final String Cancer = getIntent().getStringExtra("cancer");
        final String Kemo = getIntent().getStringExtra("kemo");
        final String Immune = getIntent().getStringExtra("immune");
        final String Kortizon = getIntent().getStringExtra("kortizon");
        final String Hospital = getIntent().getStringExtra("hospital");
        final String Ill = getIntent().getStringExtra("ill");
        final String Country = getIntent().getStringExtra("country");
        final Button Submit = (Button)findViewById(R.id.submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog csprogress=new ProgressDialog(ChooseAnalyze_3.this);
                csprogress.setMessage("Zəhmət olmasa gözləyin...");
                csprogress.show();
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        csprogress.dismiss();
                //Headache,Sneez,Fever,Cough,Respiration,Urine,Pain,Fatigue,Nose,Oxygen
                final CheckBox Headache = (CheckBox)findViewById(R.id.yesheadache);
                final CheckBox Sneez1 = (CheckBox)findViewById(R.id.yesfever1);
                final CheckBox Fever = (CheckBox)findViewById(R.id.yesfever2);
                final CheckBox Cough = (CheckBox)findViewById(R.id.yescough);
                final CheckBox Respiration = (CheckBox)findViewById(R.id.yesrespiration);
                final CheckBox Urine = (CheckBox)findViewById(R.id.yesurine);
                final CheckBox Pain = (CheckBox)findViewById(R.id.yespain);
                final CheckBox Fatigue = (CheckBox)findViewById(R.id.yesfatigue);
                final CheckBox Nose = (CheckBox)findViewById(R.id.yesnose);
                final CheckBox Oxygen = (CheckBox)findViewById(R.id.yesoxygen);
                final CheckBox Throat = (CheckBox)findViewById(R.id.yesthroat);
                final CheckBox Chest = (CheckBox)findViewById(R.id.yeschest);
                final CheckBox Mede = (CheckBox)findViewById(R.id.yesmede);
                final CheckBox Kusma = (CheckBox)findViewById(R.id.yeskusma);
                if(Chest.isChecked()){StringChest = "true";};
                if(Mede.isChecked()){StringMede = "true";};
                if(Kusma.isChecked()){StringKusma = "true";};
                if(Throat.isChecked()){StringThroat ="true";};
                if(Headache.isChecked()){StringHeadache = "true";};
                if(Sneez1.isChecked()){StringSneez = "true";};
                if(Fever.isChecked()){StringFever="true";};
                if(Cough.isChecked()){StringCough = "true";};
                if(Respiration.isChecked()){StringRespiration = "true";};
                if(Urine.isChecked()){StringUrine = "true";};
                if(Pain.isChecked()){StringPain = "true";};
                if(Fatigue.isChecked()){StringFatigue = "true";};
                if(Nose.isChecked()){StringNose = "true";};
                if(Oxygen.isChecked()){StringOxygen = "true";};
                Intent i = new Intent(ChooseAnalyze_3.this,ChooseAnalyze_4.class);
                i.putExtra("headache", StringHeadache);
                i.putExtra("sneez",StringSneez);
                i.putExtra("fever",StringFever);
                i.putExtra("infection",Infection);
                i.putExtra("cough",StringCough);
                i.putExtra("respiration",StringRespiration);
                i.putExtra("urine",StringUrine);
                i.putExtra("pain",StringPain);
                i.putExtra("fatigue",StringFatigue);
                i.putExtra("nose",StringNose);
                i.putExtra("oxygen",StringOxygen);
                i.putExtra("community",Community);
                i.putExtra("doktor",Doktor);
                i.putExtra("bloodpressure",BloodPressure);
                i.putExtra("diabet",Diabet);
                i.putExtra("lung",Lung);
                i.putExtra("liver",Liver);
                i.putExtra("kidney",Kidney);
                i.putExtra("hearth",Hearth);
                i.putExtra("genetic",Genetic);
                i.putExtra("painkiller",PainKiller);
                i.putExtra("bloodcancer",BloodCancer);
                i.putExtra("cancer",Cancer);
                i.putExtra("kemo",Kemo);
                i.putExtra("immune",Immune);
                i.putExtra("kortizon",Kortizon);
                i.putExtra("hospital",Hospital);
                i.putExtra("throat",StringThroat);
                i.putExtra("chest",StringChest);
                i.putExtra("mede",StringMede);
                i.putExtra("kusma",StringKusma);
                i.putExtra("ill",Ill);i.putExtra("country",Country);
                startActivity(i);
                    }
                }, 3000);
            }
        });
    }
}
