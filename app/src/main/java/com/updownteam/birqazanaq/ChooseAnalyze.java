package com.updownteam.birqazanaq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ChooseAnalyze extends AppCompatActivity {
    private String StringDoktor,StringBloodPressure,StringLung,StringDiabet,StringLiver,StringKidney,StringHearth,StringGenetic,StringPainKiller,StringBloodCancer,StringCancer,StringKemo,StringImmune,StringKortizon;
    private String StringInfection;
    private AdRequest adRequest;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_analyze);
        MobileAds.initialize(this, getString(R.string.app_id));
        adView = (AdView) this.findViewById(R.id.ad);
        adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        AdView ad2 = (AdView) this.findViewById(R.id.ad2);
        AdRequest req1 = new AdRequest.Builder().build();
        ad2.loadAd(req1);
        final CheckBox YesDoktor = (CheckBox) findViewById(R.id.yesdoktor);
        final CheckBox NoDoktor = (CheckBox) findViewById(R.id.nodoktor);
        final CheckBox BloodPressure = (CheckBox) findViewById(R.id.bloodpressure);
        final CheckBox Lung = (CheckBox) findViewById(R.id.lungdisease);
        final CheckBox Diabet = (CheckBox) findViewById(R.id.diabetdisease);
        final CheckBox Liver = (CheckBox) findViewById(R.id.liverdisease);
        final CheckBox Kidney = (CheckBox) findViewById(R.id.kidneydisease);
        final CheckBox Hearht = (CheckBox) findViewById(R.id.heartdisease);
        final CheckBox Genetic = (CheckBox) findViewById(R.id.geneticdisease);
        final CheckBox PainKiller = (CheckBox) findViewById(R.id.painkillerdisease);
        final CheckBox BloodCancer = (CheckBox) findViewById(R.id.bloodcancerdisease);
        final CheckBox Cancer = (CheckBox) findViewById(R.id.cancerdisease);
        final CheckBox Kemo = (CheckBox) findViewById(R.id.kemodisease);
        final CheckBox Immune = (CheckBox) findViewById(R.id.immunedisease);
        final CheckBox Kortizon = (CheckBox) findViewById(R.id.kortizondisease);
        final CheckBox Infection = (CheckBox) findViewById(R.id.infection);
        YesDoktor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    NoDoktor.setChecked(false);
                }
            });
            NoDoktor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    YesDoktor.setChecked(false);
                }
            });
            Button Submit = (Button) findViewById(R.id.submit);
            Submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Infection.isChecked()) {
                        StringInfection = "true";
                    } else {
                        StringInfection = "false";
                    }
                    if (YesDoktor.isChecked()) {
                        StringDoktor = "true";
                    }
                    if (NoDoktor.isChecked()) {
                        StringDoktor = "false";
                    }
                    if (BloodPressure.isChecked()) {
                        StringBloodPressure = "true";
                    } else {
                        StringBloodPressure = "false";
                    }
                    if (Lung.isChecked()) {
                        StringLung = "true";
                    } else {
                        StringLung = "false";
                    }
                    if (Diabet.isChecked()) {
                        StringDiabet = "true";
                    } else {
                        StringDiabet = "false";
                    }
                    if (Liver.isChecked()) {
                        StringLiver = "true";
                    } else {
                        StringLiver = "false";
                    }
                    if (Kidney.isChecked()) {
                        StringKidney = "true";
                    } else {
                        StringKidney = "false";
                    }
                    if (Hearht.isChecked()) {
                        StringHearth = "true";
                    } else {
                        StringHearth = "false";
                    }
                    if (Genetic.isChecked()) {
                        StringGenetic = "true";
                    } else {
                        StringGenetic = "false";
                    }
                    if (PainKiller.isChecked()) {
                        StringPainKiller = "true";
                    } else {
                        StringPainKiller = "false";
                    }
                    if (BloodCancer.isChecked()) {
                        StringBloodCancer = "true";
                    } else {
                        StringBloodCancer = "false";
                    }
                    if (Cancer.isChecked()) {
                        StringCancer = "true";
                    } else {
                        StringCancer = "false";
                    }
                    if (Kemo.isChecked()) {
                        StringKemo = "true";
                    } else {
                        StringKemo = "false";
                    }
                    if (Immune.isChecked()) {
                        StringImmune = "true";
                    } else {
                        StringImmune = "false";
                    }
                    if (Kortizon.isChecked()) {
                        StringKortizon = "true";
                    } else {
                        StringKortizon = "false";
                    }
                    if (StringDoktor == null || StringDoktor.matches("")) {
                        Toast.makeText(ChooseAnalyze.this, "Tibb sektorunda işləyirsinizmi sualına cavab verilməyib.", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    //StringDoktor,StringBloodPressure,StringLung,StringDiabet,StringLiver,StringKidney,StringHearth,StringGenetic,StringPainKiller,StringBloodCancer,StringCancer,StringKemo,StringImmune,StringKortizon;
                    Intent i = new Intent(ChooseAnalyze.this, ChooseAnalyze_2.class);
                    i.putExtra("doktor", StringDoktor);
                    i.putExtra("bloodpressure", StringBloodPressure);
                    i.putExtra("lung", StringLung);
                    i.putExtra("diabet", StringDiabet);
                    i.putExtra("liver", StringLiver);
                    i.putExtra("kidney", StringKidney);
                    i.putExtra("hearth", StringHearth);
                    i.putExtra("genetic", StringGenetic);
                    i.putExtra("painkiller", StringPainKiller);
                    i.putExtra("bloodcancer", StringBloodCancer);
                    i.putExtra("cancer", StringCancer);
                    i.putExtra("kemo", StringKemo);
                    i.putExtra("immune", StringImmune);
                    i.putExtra("kortizon", StringKortizon);
                    i.putExtra("infection", StringInfection);
                    startActivity(i);
                }
            });
    }
}
