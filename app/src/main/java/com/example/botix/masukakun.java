package com.example.botix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class masukakun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_masukakun);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //ini nantinya buat tangkep pesan dari activity lain
        getIntent();
    }

    //untuk ganti halaman login
    public void launchSettingslogin(View v){
        // launch halaman lain (New Activity)
        //yang pertama untuk darimana yaitu dari main Activity, yang kedua yaitu kemana halamannya
        Intent i = new Intent(this, Login.class);
        //untuk memulai
        startActivity(i);

    }

    //untuk ganti halaman signup
    public void launchSettingssignup(View v){
        // launch halaman lain (New Activity)
        //yang pertama untuk darimana yaitu dari main Activity, yang kedua yaitu kemana halamannya
        Intent i = new Intent(this, signup.class);
        //untuk memulai
        startActivity(i);

    }


}