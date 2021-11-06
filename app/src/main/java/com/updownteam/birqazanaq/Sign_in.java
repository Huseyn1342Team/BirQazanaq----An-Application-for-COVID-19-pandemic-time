package com.updownteam.birqazanaq;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Sign_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sign_in);
        final EditText Mail = (EditText)findViewById(R.id.mail);
        final EditText Password = (EditText)findViewById(R.id.password);
        final Button Submit = (Button)findViewById(R.id.submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String StringMail = Mail.getText().toString();
                String StringPassword = Password.getText().toString();
                if(StringMail.matches("")){
                    Toast.makeText(Sign_in.this,"Emailinizi qeyd edin",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(StringPassword.matches("")){
                    Toast.makeText(Sign_in.this,"Şifrənizi qeyd edin",Toast.LENGTH_SHORT).show();
                    return;
                }
                FirebaseAuth.getInstance().signInWithEmailAndPassword(StringMail,StringPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Intent i =new Intent(Sign_in.this,MelumatCorona.class);
                            startActivity(i);
                        }else{
                            Toast.makeText(Sign_in.this,"Yanlışdır",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
        final TextView Register = (TextView)findViewById(R.id.register);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Sign_in.this,Register.class);
                startActivity(i);
            }
        });
    }
}
