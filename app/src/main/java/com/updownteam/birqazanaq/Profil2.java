package com.updownteam.birqazanaq;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class Profil2 extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
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
        setContentView(R.layout.activity_profil2);
        final ProgressDialog csprogress=new ProgressDialog(Profil2.this);
        csprogress.setMessage("Zəhmət olmasa gözləyin...");
        csprogress.show();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                csprogress.dismiss();
            }
        }, 3000);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Profil şəkli");
        toolbar.setTitleTextColor(Color.WHITE);
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
                R.id.nav_protection, R.id.nav_eats, R.id.nav_films,
                R.id.nav_books, R.id.nav_statistics, R.id.nav_game,
                R.id.nav_programming,R.id.nav_language)
                .setDrawerLayout(drawer)
                .build();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.nav_protection:
                        Intent a =new Intent(Profil2.this,MelumatCorona.class);
                        startActivity(a);
                        return false;
                    case R.id.nav_eats:
                        Intent b =new Intent(Profil2.this,Kateqoriya_1.class);
                        b.putExtra("category","eats");
                        startActivity(b);
                        return false;
                    case R.id.nav_films:
                        Intent c = new Intent(Profil2.this,Kateqoriya_1.class);
                        c.putExtra("category","films");
                        startActivity(c);
                        return  false;
                    case R.id.nav_books:
                        Intent d = new Intent(Profil2.this,Kateqoriya_1.class);
                        d.putExtra("category","books");
                        startActivity(d);
                        return false;
                    case R.id.nav_statistics:
                        Intent  i =new Intent(Profil2.this,Statistics_2.class);
                        startActivity(i);
                        return false;
                    case R.id.nav_game:
                        Intent f = new Intent(Profil2.this,Kateqoriya_1.class);
                        f.putExtra("category","games");
                        startActivity(f);
                        return false;
                    case R.id.nav_programming:
                        Intent f2 = new Intent(Profil2.this,Kateqoriya_1.class);
                        f2.putExtra("category","programming");
                        startActivity(f2);
                        return false;
                    case R.id.nav_language:
                        Intent f3 = new Intent(Profil2.this,Kateqoriya_1.class);
                        f3.putExtra("category","language");
                        startActivity(f3);
                        return false;
                    case R.id.nav_photo:
                        Intent f4 = new Intent(Profil2.this,ProfilPhoto.class);
                        startActivity(f4);
                        return false;
                    case R.id.nav_log:
                        FirebaseAuth.getInstance().signOut();
                        Intent f5 = new Intent(Profil2.this,Sign_in.class);
                        startActivity(f5);
                        return false;
                    default:
                        return true;
                }
            }
        });
        MobileAds.initialize(this,getString(R.string.app_id));
        AdView ad1 = (AdView)this.findViewById(R.id.ad1);
        AdView ad2 = (AdView)this.findViewById(R.id.ad2);
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
                                    if (ImageUrl.matches("")) {
                                        Toast.makeText(Profil2.this, "Siz şəkil yükləməlisiniz", Toast.LENGTH_SHORT).show();
                                        return;
                                    }
                                    DatabaseReference db1 = FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("profil");
                                    db1.setValue(ImageUrl);
                                    Intent i =new Intent(Profil2.this,MelumatCorona.class);
                                    startActivity(i);
                                }
                            });
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            progressDialog.dismiss();
                            Toast.makeText(Profil2.this, "Failed "+e.getMessage(), Toast.LENGTH_SHORT).show();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.profil2, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
