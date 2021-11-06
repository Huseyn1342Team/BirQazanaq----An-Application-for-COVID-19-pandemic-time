package com.updownteam.birqazanaq;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Kateqoriya_3 extends AppCompatActivity {
    private String Language;
    private ImageView Image;
    private Button Submit;
    private StorageReference storageReference;
    private Bitmap bitmap;
    private String ImageUrl;
    private FirebaseStorage storage;
    private EditText Post;
    private ImageButton PutImage;
    private RecyclerView PostList;
    private Button Submit1;
    private final int PICK_IMAGE_REQUEST = 71;
    private Uri filePath;
    private List<String> people;
    private AutoCompleteTextView Search;
    private String MonthText;
    private ImageButton SearchButton;
    private String Profil;
    private String Name;
    private String Surname;
    private BottomNavigationView BotttomNavigationview;
    private int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kateqoriya_3);
        AdView ad1 = (AdView)findViewById(R.id.ad1);
        AdView ad2 = (AdView)findViewById(R.id.ad2);
        AdRequest request1 = new AdRequest.Builder().build();
        AdRequest request2 = new AdRequest.Builder().build();
        ad1.loadAd(request1);
        ad2.loadAd(request2);
        storage = FirebaseStorage.getInstance();
        storageReference = storage.getReference();
        Image = (ImageView)findViewById(R.id.image);
        Submit = (Button)findViewById(R.id.submit);
        Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChooseImage();
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UploadImage();
            }
        });
    }
    private void ChooseImage(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK
                && data != null && data.getData() != null )
        {
            filePath = data.getData();
            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), filePath);
                Image.setImageBitmap(bitmap);

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
    private void UploadImage(){
        if(filePath != null)
        {
            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setTitle("Uploading...");
            progressDialog.show();

            final StorageReference ref = storageReference.child("images/"+ UUID.randomUUID().toString());
            ref.putFile(filePath)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            progressDialog.dismiss();
                            ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                                @Override
                                public void onSuccess(Uri uri) {
                                    // getting image uri and converting into string
                                    Uri downloadUrl = uri;
                                    ImageUrl = downloadUrl.toString();
                                    EditText Insta = (EditText) findViewById(R.id.insta);
                                    final String StringInsta = Insta.getText().toString();
                                    if (ImageUrl.matches("")) {
                                        Toast.makeText(Kateqoriya_3.this, "Siz şəkil yükləməlisiniz", Toast.LENGTH_SHORT).show();
                                        return;
                                    }
                                    if(StringInsta.matches("")){
                                        Toast.makeText(Kateqoriya_3.this,"Siz instagram hesabınızı yazmalısnız",Toast.LENGTH_SHORT).show();
                                        return;
                                    }
                                    final String StringCategory = getIntent().getStringExtra("category");
                                    if (StringCategory.matches("eat1")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Eats").child("eat1");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("eat2")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Eats").child("eat2");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("eat3")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Eats").child("eat3");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("film1")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Films").child("film1");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("film2")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Films").child("film2");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("film3")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Films").child("film3");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("book1")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Books").child("book1");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("book2")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Books").child("book2");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("book3")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Books").child("book3");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("game1")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Games").child("game1");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("game2")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Games").child("game2");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("game3")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Games").child("game3");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("dress1")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Dresses").child("dress1");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("dress2")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Dresses").child("dress2");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("dress3")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Dresses").child("dress3");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("programming1")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Programming").child("programming1");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);

                                    }
                                    if (StringCategory.matches("programming2")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Programming").child("programmin2");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("programming3")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Programming").child("programming3");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("language1")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Languages").child("language1");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("language2")) {
                                        DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Languages").child("language2");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    if (StringCategory.matches("language3")) {
                                        ; DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Languages").child("language3");
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil").setValue(ImageUrl);
                                        db1.child("Result").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("insta").setValue(StringInsta);
                                    }
                                    Intent i =new Intent(Kateqoriya_3.this, Kate_1.class);
                                    startActivity(i);
                                }
                            });
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            progressDialog.dismiss();
                            Toast.makeText(Kateqoriya_3.this, "Failed "+e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    })
                    .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {
                            double progress = (100.0*taskSnapshot.getBytesTransferred()/taskSnapshot
                                    .getTotalByteCount());
                            progressDialog.setMessage("Uploading "+(int)progress+"%");
                        }
                    });
        }
    }
}
