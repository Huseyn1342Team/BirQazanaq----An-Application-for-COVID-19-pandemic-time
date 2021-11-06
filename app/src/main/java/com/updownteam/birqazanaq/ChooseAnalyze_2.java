package com.updownteam.birqazanaq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.hbb20.CCPCountry;
import com.hbb20.CountryCodePicker;

import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;

public class ChooseAnalyze_2 extends AppCompatActivity {
    private  String StrinHospital;
    private  String StringIll;
    private String StringCountry;
    private String StringCommunity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_analyze_2);
        MobileAds.initialize(this,getString(R.string.app_id));
        AdView ad1 = (AdView)this.findViewById(R.id.ad1);
        AdView ad2 = (AdView)this.findViewById(R.id.ad2);
        AdRequest request1 = new AdRequest.Builder().build();
        AdRequest request2 = new AdRequest.Builder().build();
        ad1.loadAd(request1);
        ad2.loadAd(request2);
        final String Doktor = getIntent().getStringExtra("doktor");
        final String BloodPressure = getIntent().getStringExtra("bloodpressure");
        final String Lung = getIntent().getStringExtra("lung");
        final String Diabet = getIntent().getStringExtra("diabet");
        final String Liver = getIntent().getStringExtra("liver");
        final String Kidney = getIntent().getStringExtra("kidney");
        final String Hearht = getIntent().getStringExtra("hearth");
        final String Genetic  = getIntent().getStringExtra("genetic");
        final String PainKiller = getIntent().getStringExtra("painkiller");
        final String BloodCancer = getIntent().getStringExtra("bloodcancer");
        final String Cancer = getIntent().getStringExtra("cancer");
        final String Kemo = getIntent().getStringExtra("kemo");
        final String Immune = getIntent().getStringExtra("immune");
        final String Infection = getIntent().getStringExtra("infection");
        final String Kortizon = getIntent().getStringExtra("kortizon");
        Toast.makeText(ChooseAnalyze_2.this,Kidney,Toast.LENGTH_SHORT).show();
        final CountryCodePicker Country = (CountryCodePicker) findViewById(R.id.country);
        final CheckBox YesHospital = (CheckBox)findViewById(R.id.yeshospital);
        final CheckBox NoHospital = (CheckBox)findViewById(R.id.nohospital);
        final CheckBox YesIll = (CheckBox)findViewById(R.id.yesill);
        final CheckBox NoIll = (CheckBox)findViewById(R.id.noill);
        final Button Submit = (Button)findViewById(R.id.submit);
        final CheckBox YesCommunity = (CheckBox)findViewById(R.id.yescommunity);
        final CheckBox NoCommunity = (CheckBox)findViewById(R.id.nocommunity);
        final CheckBox NoCountry = (CheckBox)findViewById(R.id.nocountry);
        YesHospital.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                NoHospital.setChecked(false);
            }
        });
        NoHospital.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                YesHospital.setChecked(false);

            }
        });
        YesIll.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                NoIll.setChecked(false);
            }
        });
        NoIll.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                YesIll.setChecked(false);
            }
        });
        YesCommunity.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                NoCommunity.setChecked(false);

            }
        });
        NoCommunity.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                YesCommunity.setChecked(false);
            }
        });
        NoCountry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Country.setVisibility(View.INVISIBLE);
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(YesHospital.isChecked()){
                    StrinHospital = "true";
                }
                if(NoHospital.isChecked()){
                    StrinHospital = "false";
                }
                if(YesIll.isChecked()){
                    StringIll = "true";
                }
                if(NoIll.isChecked()){
                    StringIll = "false";
                }
                StringCountry = Country.getDefaultCountryName();
                if(NoCountry.isChecked()){
                    StringCountry = "false";
                }
                if(NoCommunity.isChecked()){
                    StringCommunity = "false";
                }
                if(YesCommunity.isChecked()){
                    StringCommunity = "true";
                }
                if(StrinHospital == null || StrinHospital.matches("")){
                    Toast.makeText(ChooseAnalyze_2.this,"Son 14 gün suallarında birinə cavab verməmisiniz!",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(StringIll == null || StringIll.matches("")){
                    Toast.makeText(ChooseAnalyze_2.this,"Son 14 gün suallarında birinə cavab verməmisiniz!",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(StringCommunity == null || StringCommunity.matches("")){
                    Toast.makeText(ChooseAnalyze_2.this,"Son 14 gün suallarında birinə cavab verməmisiniz!",Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent i =new Intent(ChooseAnalyze_2.this,ChooseAnalyze_3.class);
                i.putExtra("doktor",Doktor);
                i.putExtra("infection",Infection);
                i.putExtra("bloodpressure",BloodPressure);
                i.putExtra("diabet",Diabet);
                i.putExtra("lung",Lung);
                i.putExtra("liver",Liver);
                i.putExtra("kidney",Kidney);
                i.putExtra("hearth",Hearht);
                i.putExtra("genetic",Genetic);
                i.putExtra("painkiller",PainKiller);
                i.putExtra("bloodcancer",BloodCancer);
                i.putExtra("cancer",Cancer);
                i.putExtra("kemo",Kemo);
                i.putExtra("immune",Immune);
                i.putExtra("kortizon",Kortizon);
                i.putExtra("hospital",StrinHospital);
                i.putExtra("ill",StringIll);
                i.putExtra("country",StringCountry);
                i.putExtra("community",StringCommunity);
                startActivity(i);
            }
        });

    }
}
