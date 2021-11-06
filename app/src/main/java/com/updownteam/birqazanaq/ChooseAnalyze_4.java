package com.updownteam.birqazanaq;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ChooseAnalyze_4 extends AppCompatActivity {
    //Country,Hospital,Ill,Community,Fever,Cough,Oxygen,Throat,Headache,Chest,Nose,Pain,Fatigue,Urine,Mede,Kusma,Sneez,Respiration,Doktor;
    private double IntCountry = 0.00,IntHospital=0.00,IntIll=0.00,IntCommunity=0.00,IntFever=0.00,IntCough=0.00,IntOxygen=0.00,IntThroat=0.00,IntHeadache=0.00,IntChest=0.00,IntNose=0.00,IntPain=0.00,IntFatigue=0.00,IntUrine=0.00,IntMede=0.00,IntKusma=0.00,IntSneez=0.00,IntRespiration=0.00,IntDoktor=0.00;
    private double Total = 0.00;
    private double IntPainKiller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_analyze_4);
        MobileAds.initialize(this,getString(R.string.app_id));
        AdView ad1 = (AdView)this.findViewById(R.id.ad1);
        AdView ad2 = (AdView)this.findViewById(R.id.ad2);
        AdRequest re1 = new AdRequest.Builder().build();
        AdRequest re2 = new AdRequest.Builder().build();
        ad1.loadAd(re1);
        ad2.loadAd(re2);
        final ProgressDialog csprogress=new ProgressDialog(ChooseAnalyze_4.this);
        csprogress.setMessage("Zəhmət olmasa gözləyin...");
        csprogress.show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                csprogress.dismiss();
            }
        }, 6000);
        //Headache,Sneez,Fever,Cough,Respiration,Urine,Pain,Fatigue,Nose,Oxygen,Community,Doktor,BloodPressure,Diabet,Lung,Liver,Kidney,Hearth,Genetic,PainKiller,
        //BloodCancer,Cancer,Kemo,Immune,Kortizon,Hospital,Ill,Country
        final String Headache = getIntent().getStringExtra("headache");final String Sneez = getIntent().getStringExtra("sneez");final String Fever = getIntent().getStringExtra("fever");
        final String Cough = getIntent().getStringExtra("cough");final String Respiration = getIntent().getStringExtra("respiration");final String Urine = getIntent().getStringExtra("urine");
        final String Pain = getIntent().getStringExtra("pain");final String Fatigue = getIntent().getStringExtra("fatigue");final String Nose = getIntent().getStringExtra("nose");
        final String Oxygen = getIntent().getStringExtra("oxygen");final String Community = getIntent().getStringExtra("community");final String Doktor = getIntent().getStringExtra("doktor");
        final String BloodPressure = getIntent().getStringExtra("bloodpressure");final String Diabet = getIntent().getStringExtra("diabet");final String Lung = getIntent().getStringExtra("lung");
        final String Liver = getIntent().getStringExtra("liver");final String Kidney = getIntent().getStringExtra("kidney");final String Hearth = getIntent().getStringExtra("hearth");
        final String Genetic = getIntent().getStringExtra("genetic");final String PainKiller = getIntent().getStringExtra("painkiller");final String BloodCancer = getIntent().getStringExtra("bloodcancer");
        final String Cancer = getIntent().getStringExtra("cancer");final String Kemo = getIntent().getStringExtra("kemo");final String Immune = getIntent().getStringExtra("immune");
        final String Kortizon = getIntent().getStringExtra("kortizon");final String Hospital  = getIntent().getStringExtra("hospital");final String Ill = getIntent().getStringExtra("ill");
        final String Country  = getIntent().getStringExtra("country");final String Throat = getIntent().getStringExtra("throat");
        final String Chest = getIntent().getStringExtra("chest");final String Mede = getIntent().getStringExtra("mede");final String Kusma = getIntent().getStringExtra("kusma");
        final String Infection = getIntent().getStringExtra("infection");
        //Country,Hospital,Ill,Community,Fever,Cough,Oxygen,Throat,Headache,Chest,Nose,Pain,Fatigue,Urine,Mede,Kusma,Sneez,Respiration,Doktor;
        if(Country.matches("true")){
            IntCountry = 2.00;
        };
        if(Hospital.matches("true")){
            IntHospital = 1.00;
        };
        if(Ill.matches("true")){
            IntIll = 2.00;
        };
        if(Community.matches("true")){
            IntCommunity = 3.00;
        };
        if(Fever.matches("true")){
            IntFever = 21.00;
            if(Infection.matches("true")){
                IntFever = IntFever - 6.00;
            }
            if(BloodCancer.matches("true")){
                IntFever = IntFever - 5.00;
            }
            if(Cancer.matches("true")){
                IntFever = IntFever - 5.00;
            }
            if(Immune.matches("true")){
                IntFever = IntFever - 3.00;
            }
        };
        if(Infection.matches("true")){
            IntFever = 16.00;
        }
        if(Cough.matches("true")){
            IntCough = 6.00;
            if(Lung.matches("true")){
                IntCough = IntCough - 1.00;
            }
            if(Cancer.matches("true")){
                IntCough = IntCough - 1.00;
            }
            if(Kidney.matches("true")){
                IntCough = IntCough - 1.00;
            }
        };
        if(Oxygen.matches("true")){
            IntOxygen = 3.00;
            if(Lung.matches("true")){
                IntOxygen = IntOxygen - 0.5;
            }
            if(BloodPressure.matches("true")){
                IntOxygen = IntOxygen - 0.5;
            }
            if(Kidney.matches("true")){
                IntOxygen = IntOxygen - 0.5;
            }
            if(Hearth.matches("true")) {
                IntOxygen = IntOxygen - 0.5;
            }
            if(BloodCancer.matches("true")){
                IntOxygen = IntOxygen - 0.5;
            }
            if(Cancer.matches("true")){
                IntOxygen = IntOxygen - 0.5;
            }
        };
        if(Throat.matches("true")){
            IntThroat = 2.00;
        };
        if(Headache.matches("true")){
            IntHeadache = 1.00;
            if(BloodPressure.matches("true")){
                IntHeadache = IntHeadache - 0.125;
            }
            if(Kortizon.matches("true")){
                IntHeadache = IntHeadache - 0.125;
            }
        };
        if(Chest.matches("true")){
            IntChest = 1.00;
            if(Lung.matches("true")){
                IntChest = IntChest -0.125;
            }
            if(BloodPressure.matches("true")){
                IntChest = IntChest -0.125;
            }
            if(Kidney.matches("true")){
                IntChest = IntChest -0.125;
            }
            if(Hearth.matches("true")){
                IntChest = IntChest -0.125;
            }
            if(Kortizon.matches("true")){
                IntChest = IntChest -0.125;
            }
        };
        if(Nose.matches("true")){
            IntNose = 1.00;

        };
        if(Pain.matches("true")){
            IntPain = 1.00;
            if(Kidney.matches("true")){
                IntPain = IntPain - 0.125;
            }
            if(Hearth.matches("true")){
                IntPain = IntPain - 0.125;
            }
            if(BloodCancer.matches("true")){
                IntPain = IntPain - 0.125;
            }
            if(Kemo.matches("true")){
                IntPain = IntPain - 0.125;
            }
            if(Immune.matches("true")){
                IntPain = IntPain - 0.125;
            }
        };
        if(Fatigue.matches("true")){
            IntFatigue = 2.00;
            if(Lung.matches("true")){
                IntFatigue = IntFatigue - 0.25;
            }
            if(Diabet.matches("true")){
                IntFatigue = IntFatigue - 0.25;
            }
            if(Liver.matches("true")){
                IntFatigue = IntFatigue - 0.25;
            }
            if(Kidney.matches("true")){
                IntFatigue = IntFatigue - 0.25;
            }
            if(Hearth.matches("true")){
                IntFatigue = IntFatigue - 0.25;
            }
            if(BloodCancer.matches("true")){
                IntFatigue = IntFatigue - 0.25;
            }
            if(Cancer.matches("true")){
                IntFatigue = IntFatigue - 0.25;
            }
            if(Kemo.matches("true")){
                IntFatigue = IntFatigue - 0.25;
            }
            if(Kortizon.matches("true")){
                IntFatigue = IntFatigue - 0.25;
            }
            if(Immune.matches("true")){
                IntFatigue = IntFatigue - 0.25;
            }
        };
        if(Urine.matches("true")){
            IntUrine = 1.00;
            if(Infection.matches("true")){
                IntUrine = IntUrine - 0.125;
            }
        };
        if(Mede.matches("true")){
            IntMede = 1.00;
        };
        if(Kusma.matches("true")){
            IntKusma = 1.00;
        };
        if(Sneez.matches("true")){
            IntSneez = 15.00;
        };
        if(Respiration.matches("true")){
            IntRespiration = 6.00;
            if(Infection.matches("true")){
                IntRespiration = IntRespiration - 1.00;
            }
            if(Lung.matches("true")){
                IntRespiration = IntRespiration - 1.00;
            }
            if(BloodPressure.matches("true")){
                IntRespiration = IntRespiration - 1.00;
            }
            if(Kidney.matches("true")){
                IntRespiration = IntRespiration - 1.00;
            }
            if(Hearth.matches("true")){
                IntRespiration = IntRespiration - 1.00;
            }
            if(BloodCancer.matches("true")){
                IntRespiration = IntRespiration - 1.00;
            }
            if(Cancer.matches("true")){
                IntRespiration = IntRespiration - 1.00;
            }
            if(Kortizon.matches("true")){
                IntRespiration = IntRespiration - 1.00;
            }
        };
        if(Doktor.matches("true")){
            IntDoktor = 2.00;
        };
        if(PainKiller.matches("true")){
            IntPainKiller = 3.00;
        }
        final TextView Condition = (TextView)findViewById(R.id.condition);
        final TextView ConditionRey = (TextView)findViewById(R.id.conditionrey);
        //Country,Hospital,Ill,Community,Fever,Cough,Oxygen,Throat,Headache,Chest,Nose,Pain,Fatigue,Urine,Mede,Kusma,Sneez,Respiration,Doktor;
        Total  = IntCountry+IntHospital+IntIll+IntCommunity+IntFever+IntCough+IntOxygen+IntThroat+IntHeadache+IntChest+IntNose+IntPain+IntFatigue+IntUrine+IntMede+IntKusma+IntRespiration+IntDoktor-IntSneez+IntPainKiller;
        if(Total>=0.00){
            Condition.setText("AZDIR");
            ConditionRey.setText("Zəhmət olmasa, simtomplarınızda dəyişiklik olduqda testi təkrarlayın.");
        }
        if(Total>=20.00){
            Condition.setText("ORTADIR");

        }
        if(Total>=35.00){
            Condition.setText("YÜKSƏKDİR");
        }
        if(Fever.matches("true")){
            // Yoxdur -- > 1
            // Nadir hallarda --> 2
            // Bezen -->3
            // Hemise -->4
            //MaxBal-->
            //Flu
            if(Cough.matches("true")){
                if(Respiration.matches("false")){
                    if(Headache.matches("true")){
                        if(Pain.matches("true")){
                            if(Throat.matches("true")){
                                if(Fatigue.matches("true")){
                                    if(Urine.matches("true")){
                                        if(Nose.matches("true")){
                                            if(Sneez.matches("false")){
                                                Condition.setText("AZDIR");
                                                ConditionRey.setText("Sizin qrip olmaq ehtimalınız daha çoxdur. Ancaq COVİD-19 olma ehtimalınız var. Əgər halınız pişləşsə və ya qıdırmanız şiddətli olsa Təcili tibbi yardım çağırmağınız tövsiyyə olunur.");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            //Flu
        }
        //Common Cold
        if(Fever.matches("false")){
            if(Respiration.matches("false")){
                if(Headache.matches("false")){
                    if(Pain.matches("true")){
                        if(Throat.matches("true")){
                            if(Fatigue.matches("true")){
                                if(Urine.matches("false")){
                                    if(Nose.matches("true")){
                                        if(Sneez.matches("true")){
                                            Condition.setText("AZDIR");
                                            ConditionRey.setText("Sizin soyuqdəymə olmaq ehtimalınız daha çoxdur. Ancaq COVİD-19 olma ehtimalınız var. Əgər halınız pişləşsə və ya qıdırmanız şiddətli olsa Təcili tibbi yardım çağırmağınız tövsiyyə olunur.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //Common COld
        //Allergies
        if(Fever.matches("true")){
            if(Cough.matches("true")){
                if(Respiration.matches("true")){
                    if(Headache.matches("true")){
                        if(Pain.matches("false")){
                            if(Throat.matches("false")){
                                if(Fatigue.matches("true")){
                                    if(Urine.matches("false")){
                                        if(Nose.matches("true")){
                                            if(Sneez.matches("true")){
                                                Condition.setText("AZDIR");
                                                ConditionRey.setText("Sizin simptomlarınızın alergiya ilə bağlı olmaq ehtimalı daha çoxdur. Ancaq COVİD-19 olma ehtimalınız var. Əgər halınız pişləşsə və ya qıdırmanız şiddətli olsa Təcili tibbi yardım çağırmağınız tövsiyyə olunur.");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //Allergies
        final double IntAlergic = 0.00;
        final double IntFlu = 0.00;
        final double IntCold = 0.00;
    }
}
