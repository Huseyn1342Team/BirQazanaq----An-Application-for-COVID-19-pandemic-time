package com.updownteam.birqazanaq;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DiabetTest extends AppCompatActivity {
    //Test1
    //Types-- Boyrek,Qaraciyer,Urek,QanXerceng,Xerceng,Derman,QanAzligi,SidikInfeksiya,Depresiya,BoyrekDaslari,Hamilelik,Sis,DeriXes,EsebXes,Psixiatrik,Alergiya,Ezele,Goz,Sinir;
    private CheckBox Boyrek;
    private CheckBox Qaraciyer;
    private CheckBox Urek;
    private CheckBox QanXerceng;
    private CheckBox Xerceng;
    private CheckBox Derman;
    private CheckBox QanAzligi;
    private CheckBox SidikInfeksiya;
    private CheckBox Depresiya;
    private CheckBox BoyrekDaslari;
    private CheckBox Hamilelik;
    private CheckBox Sis;
    private CheckBox DeriXes;
    private CheckBox EsebXes;
    private CheckBox Psixiatrik;
    private CheckBox Alergiya;
    private CheckBox Ezele;
    private CheckBox Goz;
    private CheckBox Sinir;
    private Button Duyme1;
    private RelativeLayout Test1;
    private RelativeLayout Test2;
    private RelativeLayout Test3 ;
    private RelativeLayout Result ;
    private CheckBox Acliq ;
    private CheckBox Susuz;
    private CheckBox CoxSidik;
    private CheckBox AgizQurulugu;
    private CheckBox CekiItkisi;
    private CheckBox GeceSidik;
    private Button Duuyme2 ;
    private CheckBox AzSidik ;
    private CheckBox Saralmaq;
    private CheckBox YuxuYox ;
    private CheckBox Karbohidrat;
    private CheckBox SuYox ;
    private CheckBox CoxSidikEsas;
    private CheckBox Alkoqol;
    private CheckBox Stres;
    private CheckBox CoxSuIc;
    private CheckBox SidikQovucu;
    private CheckBox Yorgunluq;
    private Button Duyme3;

    private String BoyrekString,QaraciyerString,UrekString,QanXercengString,XercengString,DermanString,QazAzligiString,SidikInfeksiyaString,DepresiyaString,BoyrekdaslariString;
    private String HamilelikString,SisString,DeriXesString,EsebXesString,PsixiatrikString,AlergiyaString,EzeleString,GozString,SinirString;
    //Test2
    private double Total;
    private String AzSidikString;
    private String AcliqString,SusuzString,CoxSidikString,AgizQuruluguString,CekiItkisiString,GeceSidikString;
    private double AcliqInt,SusuzInt,CoxSidikInt,AgizQuruluguInt,CekiItkisiInt,GeceSidikInt;
    //Test3
    //Type-- Saralmaq,YuxuYox,Karbohidrat,SuYox,CoxSidikEsas,Alkoqol,Stres,CoxSuIc,SidikQovucu,Yorgunluq;
    private String SaralmaqString,YuxuYoxString,KarbohidratString,SuYoxString,CoxSidikEsasString,AlkoqolString,StresString,CoxSuIcString,SidikQovucuString,YorgunluqString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_diabet_test);
        Boyrek = (CheckBox)findViewById(R.id.kidney);
        Qaraciyer = (CheckBox)findViewById(R.id.liver);
        Urek = (CheckBox)findViewById(R.id.hearth);
        QanXerceng = (CheckBox)findViewById(R.id.bloodcancer);
        Xerceng = (CheckBox)findViewById(R.id.cancer);
        Derman = (CheckBox)findViewById(R.id.painkiller);
        QanAzligi = (CheckBox)findViewById(R.id.qanazligi);
        SidikInfeksiya = (CheckBox)findViewById(R.id.sidikinfeksiya);
        Depresiya = (CheckBox)findViewById(R.id.mesamesindromu);
        BoyrekDaslari = (CheckBox)findViewById(R.id.kidneystone);
        Hamilelik = (CheckBox)findViewById(R.id.hamilelik);
        Sis = (CheckBox)findViewById(R.id.tumor);
        DeriXes = (CheckBox)findViewById(R.id.derixestelikleri);
        EsebXes = (CheckBox)findViewById(R.id.esebxes);
        Psixiatrik = (CheckBox)findViewById(R.id.psixiatrik);
        Alergiya  = (CheckBox)findViewById(R.id.alergiya);
        Ezele = (CheckBox)findViewById(R.id.migren);
        Goz = (CheckBox)findViewById(R.id.goz);
        Sinir = (CheckBox)findViewById(R.id.dental);
        Duyme1 = (Button)findViewById(R.id.submit);
        Test1 = (RelativeLayout)findViewById(R.id.test1);
        Test2 = (RelativeLayout)findViewById(R.id.test2);
        Test3 = (RelativeLayout)findViewById(R.id.test3);
        Result = (RelativeLayout)findViewById(R.id.result);
        Acliq = (CheckBox)findViewById(R.id.acliq);
        Susuz = (CheckBox)findViewById(R.id.susuz);
        CoxSidik = (CheckBox)findViewById(R.id.coxsidik);
        AgizQurulugu = (CheckBox)findViewById(R.id.agiz);
        CekiItkisi = (CheckBox)findViewById(R.id.cekiitkisi);
        GeceSidik = (CheckBox)findViewById(R.id.gecesidik);
        Duuyme2 = (Button)findViewById(R.id.submit2);
        AzSidik = (CheckBox)findViewById(R.id.azsidik);
        Saralmaq = (CheckBox)findViewById(R.id.saralmaq);
        YuxuYox = (CheckBox)findViewById(R.id.nosleep);
        Karbohidrat  = (CheckBox)findViewById(R.id.karbohidrat);
        SuYox  = (CheckBox)findViewById(R.id.nowater);
        CoxSidikEsas = (CheckBox) findViewById(R.id.practice);
        Alkoqol = (CheckBox)findViewById(R.id.alkoqol);
        Stres = (CheckBox)findViewById(R.id.stres);
        CoxSuIc = (CheckBox)findViewById(R.id.coxsuic);
        SidikQovucu = (CheckBox)findViewById(R.id.sidikqovucu);
        Yorgunluq = (CheckBox)findViewById(R.id.gozdamci);
        Duyme3 = (Button)findViewById(R.id.submit3);
        test1();
    }
    private void test1(){
        Duyme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog csprogress=new ProgressDialog(DiabetTest.this);
                csprogress.setMessage("Zəhmət olmasa gözləyin...");
                csprogress.show();
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        csprogress.dismiss();
                        Test1.setVisibility(View.GONE);
                        Test2.setVisibility(View.VISIBLE);
                        test2();
                    }
                }, 3000);
            }
        });
    }
    private void test2(){
        //Types-- Boyrek,Qaraciyer,Urek,QanXerceng,Xerceng,Derman,QanAzligi,SidikInfeksiya,Depresiya,BoyrekDaslari,Hamilelik,Sis,DeriXes,EsebXes,Psixiatrik,Alergiya,Ezele,Goz,Sinir;
        if(Boyrek.isChecked()){
            BoyrekString = "true";
        }
        if(Qaraciyer.isChecked()){
            QaraciyerString = "true";
        }
        if(Urek.isChecked()){
            UrekString ="true";
        }
        if(QanXerceng.isChecked()){
            QanXercengString = "true";
        }
        if(Xerceng.isChecked()){
            XercengString = "true";
        }
        if(Derman.isChecked()){
            DermanString = "true";
        }
        if(QanAzligi.isChecked()){
            QazAzligiString = "true";
        }
        if(SidikInfeksiya.isChecked()){
            SidikInfeksiyaString = "true";
        }
        if(Depresiya.isChecked()){
            DepresiyaString ="true";
        }
        //Types-- Boyrek,Qaraciyer,Urek,QanXerceng,Xerceng,Derman,QanAzligi,SidikInfeksiya,Depresiya,BoyrekDaslari,Hamilelik,Sis,DeriXes,EsebXes,Psixiatrik,Alergiya,Ezele,Goz,Sinir;
        if(BoyrekDaslari.isChecked()){
            BoyrekdaslariString = "true";
        }
        if(Hamilelik.isChecked()){
            HamilelikString = "true";
        }
        if(Sis.isChecked()){
            SisString = "true";
        }
        if(DeriXes.isChecked()){
            DeriXesString = "true";
        }
        if(EsebXes.isChecked()){
            EsebXesString = "true";
        }
        if(Psixiatrik.isChecked()){
            PsixiatrikString ="true";
        }
        if(Alergiya.isChecked()){
            AlergiyaString = "true";
        }
        if(Ezele.isChecked()){
            EzeleString = "true";
        }
        if(Goz.isChecked()){
            GozString = "true";
        }
        if(Sinir.isChecked()){
            SinirString = "true";
        }
        Duuyme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog csprogress=new ProgressDialog(DiabetTest.this);
                csprogress.setMessage("Zəhmət olmasa gözləyin...");
                csprogress.show();
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        csprogress.dismiss();
                        Test2.setVisibility(View.GONE);
                        Test3.setVisibility(View.VISIBLE);
                        test3();
                    }
                }, 3000);
            }
        });
    }
    private void test3(){
        //Type--Acliq,Susuz,CoxSidik,AgizQurulusu,CekiItkisi,GeceSidik
        if(AzSidik.isChecked()){
            AzSidikString = "true";
        }
        if(Acliq.isChecked()){
            AcliqString = "true";
        }
        if(Susuz.isChecked()){
            SusuzString = "true";
        }
        if(AgizQurulugu.isChecked()){
            AgizQuruluguString = "true";
        }
        if(CekiItkisi.isChecked()){
            CekiItkisiString = "true";
        }
        if(GeceSidik.isChecked()){
            GeceSidikString = "true";
        }
        Duyme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog csprogress=new ProgressDialog(DiabetTest.this);
                csprogress.setMessage("Zəhmət olmasa gözləyin...");
                csprogress.show();
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        csprogress.dismiss();
                        Test3.setVisibility(View.GONE);
                        Result.setVisibility(View.VISIBLE);
                        test4();
                    }
                }, 7000);
            }
        });
    }
    private void test4(){
        //Type-- Saralmaq,YuxuYox,Karbohidrat,SuYox,CoxSidikEsas,Alkoqol,Stres,CoxSuIc,SidikQovucu,Yorgunluq;
        if(Saralmaq.isChecked()){
            SaralmaqString = "true";
        }
        if(YuxuYox.isChecked()){
            YuxuYoxString = "true";
        }
        if(Karbohidrat.isChecked()){
            KarbohidratString = "true";
        }
        if(SuYox.isChecked()){
            SuYoxString = "true";
        }
        if(CoxSidikEsas.isChecked()){
            if(CoxSidik.isChecked()){
                CoxSidikString = "true";
            }else{
                CoxSidikString = "true";
            }
        }
        if(Alkoqol.isChecked()){
            AlkoqolString = "true";
        }
        if(Stres.isChecked()){
            StresString = "true";
        }
        if(CoxSuIc.isChecked()){
            CoxSuIcString = "true";
        }
        if(SidikQovucu.isChecked()){
            SidikQovucuString = "true";
        }
        if(Yorgunluq.isChecked()){
            YorgunluqString ="true";
        }
        //Type--Acliq,Susuz,CoxSidik,AgizQurulusu,CekiItkisi,GeceSidik
        if(AgizQurulugu.isChecked()){
            AgizQuruluguInt = 5.00;
            if(SuYox.isChecked()){
                AgizQuruluguInt = AgizQuruluguInt-1.0;
            }
            if(AzSidik.isChecked()){
                AgizQuruluguInt = AgizQuruluguInt-1.0;
            }
            if(Yorgunluq.isChecked()){
                AgizQuruluguInt = AgizQuruluguInt-1.0;
            }
            if(Saralmaq.isChecked()){
                AgizQuruluguInt = AgizQuruluguInt - 1.0;
            }
        }
        if(Acliq.isChecked()){
            AcliqInt = 2.00;
            if(SuYox.isChecked()){
                AcliqInt = AcliqInt -0.25;
            }
            if(Alkoqol.isChecked()){
                AcliqInt = AcliqInt - 0.25;
            }
            if(Stres.isChecked()){
                AcliqInt = AcliqInt - 0.25;
            }
            if(Derman.isChecked()){
                AcliqInt = AcliqInt -0.25;
            }
        }
        if(Susuz.isChecked()){
            SusuzInt = 4.00;
            if(Goz.isChecked()){
                SusuzInt = SusuzInt -1.0;
            }
            if(Boyrek.isChecked()){
                SusuzInt = SusuzInt-1.00;
            }
            if(Derman.isChecked()){
                SusuzInt = SusuzInt-1.00;
            }

        }
        if(CoxSidik.isChecked()){
            CoxSidikInt = 3.00;
            if(Stres.isChecked()){
                CoxSidikInt = CoxSidikInt - 0.50;
            }
            if(SidikQovucu.isChecked()){
                CoxSidikInt = CoxSidikInt -0.50;
            }
            if(Sinir.isChecked()){
                CoxSidikInt = CoxSidikInt -0.50;
            }
            if(SidikInfeksiya.isChecked()){
                CoxSidikInt = CoxSidikInt -0.50;
            }
            if(Xerceng.isChecked()){
                CoxSidikInt = CoxSidikInt - 0.50;
            }
            if(BoyrekDaslari.isChecked()){
                CoxSidikInt = CoxSidikInt -0.50;
            }
            if(CoxSuIc.isChecked()){
                if(CoxSidikInt == 0){
                    CoxSidikInt = 0.0;
                }else{
                    CoxSidikInt =CoxSidikInt -0.50;
                }
            }
        }
        if(CekiItkisi.isChecked()){
            CekiItkisiInt = 2.00;
            if(Ezele.isChecked()){
                CekiItkisiInt = CekiItkisiInt - 0.5;
            }
            if(Depresiya.isChecked()){
                CekiItkisiInt = CekiItkisiInt - 0.50;
            }
            if(Goz.isChecked()){
                CekiItkisiInt = CekiItkisiInt -0.50;
            }
            if(Xerceng.isChecked()){
                CekiItkisiInt = CekiItkisiInt -0.50;
            }
            if(Urek.isChecked()){
                if(CekiItkisiInt == 0.0){
                    CekiItkisiInt = 0.0;
                }else{
                    CekiItkisiInt = CekiItkisiInt - 0.50;
                }
            }
        }
        if(GeceSidik.isChecked()){
            GeceSidikInt = 1.00;
            if(SidikInfeksiya.isChecked()){
                GeceSidikInt = GeceSidikInt - 0.25;
            }
            if(Alkoqol.isChecked()){
                GeceSidikInt = GeceSidikInt - 0.25;
            }
            if(Hamilelik.isChecked()){
                GeceSidikInt = GeceSidikInt - 0.25;
            }
            if(Boyrek.isChecked()){
                GeceSidikInt = GeceSidikInt - 0.25;
            }
            if(Urek.isChecked()){
                if(GeceSidikInt == 0){
                    GeceSidikInt = 0.0;
                }else{
                    GeceSidikInt = GeceSidikInt - 0.25;
                }
            }
            //Total-- 17
        }
        Total = AgizQuruluguInt + AcliqInt + SusuzInt+CoxSidikInt+CekiItkisiInt+GeceSidikInt;
        final TextView Netice = (TextView)findViewById(R.id.netice2);
        final TextView Rey = (TextView)findViewById(R.id.netice3);
        if(Total >= 0){
            Netice.setText("AZDIR");
            Rey.setText("Hal-hazırda sizin simpromlarınız bizə diabet olmaq ehtimalınızın az olduğunu deyir. Gələcəkdə simptomlarınızda dəyişiklik olduqda, proqramımızda yenə test edə bilərsiniz.");
        }
        if(Total >= 5){
            Netice.setText("Ortadır");
            Rey.setText("Sizin simptomlarınız diabet olmaq ehtimalınız var olduğunu haqqında bizə məlumat verir. Təcili tibbi yardıma zəg edin və ya həkimə müraciət edin.");
        }
        if(Total >= 11){
            Netice.setText("Çoxdur");
            Rey.setText("Sizin simptomlarınız diabet olmaq ehtimalınızın çox olduğu haqqında bizə məlumat veir. Təcili Tibbi Yardıma zəng edin və ya həkimə müraciət edin.");
        }
    }

}
