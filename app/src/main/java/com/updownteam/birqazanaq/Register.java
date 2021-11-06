package com.updownteam.birqazanaq;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_register);
        final Spinner Cins = (Spinner)findViewById(R.id.cins);
        final EditText NameAndSurname = (EditText)findViewById(R.id.namesurname);
        final EditText Age = (EditText)findViewById(R.id.age);
        final EditText Email = (EditText)findViewById(R.id.email);
        final EditText Boyun = (EditText)findViewById(R.id.boyun);
        final EditText Ceki = (EditText)findViewById(R.id.ceki);
        final EditText Sifre = (EditText)findViewById(R.id.sifre);
        Button Submit = (Button)findViewById(R.id.submit);
        String[] items = new String[]{ "Kişi","Qadın"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        Cins.setAdapter(adapter);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //NameAndSurname,Age,Email,Boyun,Ceki,Sifre,Cins
                final String StringNameSurname = NameAndSurname.getText().toString();
                final String StringAge = Age.getText().toString();
                final String StringEmail = Email.getText().toString();
                final String StringBoyun = Boyun.getText().toString();
                final String StringCeki = Ceki.getText().toString();
                final String StringSifre =Sifre.getText().toString();
                final String StringCins = Cins.getSelectedItem().toString();
                if(StringNameSurname.matches("")){
                    Toast.makeText(Register.this,"Ad və Soyadınızı açın",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(StringAge.matches("")){
                    Toast.makeText(Register.this,"Yaşınızı qeyd edin",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(StringEmail.matches("")){
                    Toast.makeText(Register.this,"Emailinizi qeyd edin",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(StringBoyun.matches("")){
                    Toast.makeText(Register.this,"Boyunuzu qeyd edin",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(StringCeki.matches("")){
                    Toast.makeText(Register.this,"Çəkinizi qeyd edin",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(StringSifre.matches("")){
                    Toast.makeText(Register.this,"Şifrənizi qeyd edin",Toast.LENGTH_SHORT).show();
                    return;
                }
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(StringEmail,StringSifre).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid());
                            //NameAndSurname,Age,Email,Boyun,Ceki,Sifre,Cins
                            db1.child("namesurname").setValue(StringNameSurname);
                            db1.child("age").setValue(StringAge);
                            db1.child("email").setValue(StringEmail);
                            db1.child("boy").setValue(StringBoyun);
                            db1.child("ceki").setValue(StringCeki);
                            db1.child("sifre").setValue(StringSifre);
                            db1.child("cins").setValue(StringCins);
                            db1.child("profil").setValue("https://firebasestorage.googleapis.com/v0/b/birqazanaq-2f4f7.appspot.com/o/146-1468479_my-profile-icon-blank-profile-picture-circle-hd.png?alt=media&token=9cd99680-6fac-4216-81a1-4db2bf20a1d7");
                            Intent i =new Intent(Register.this,MelumatCorona.class);
                            startActivity(i);
                        }
                        else{
                            Toast.makeText(Register.this,"Email artıq qeydiyyatdan keçirilib.",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent i =new Intent(Register.this,Sign_in.class);
        startActivity(i);
        //super.onBackPressed();
    }
}
