package com.example.botix;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //ini nantinya buat tangkep pesan dari activity lain
        Intent i = getIntent();
        String message = i.getStringExtra("usrname"); // name harus sesuai dengan kode dari activity sumber
        ((TextView)findViewById(R.id.username)).setText(message);
    }

    //untuk ganti halaman
    public void launchSettingsFilm1(View v) {
        // launch halaman lain (New Activity)
        //yang pertama untuk darimana yaitu dari main Activity, yang kedua yaitu kemana halamannya
        Intent i = new Intent(this, film1.class);

        //untuk memulai
        startActivity(i);
    }

    public void launchSettingsFilm2(View v) {
        // launch halaman lain (New Activity)
        //yang pertama untuk darimana yaitu dari main Activity, yang kedua yaitu kemana halamannya
        Intent i = new Intent(this, film2.class);

        //untuk memulai
        startActivity(i);
    }

    public void launchSettingsFilm3(View v) {
        // launch halaman lain (New Activity)
        //yang pertama untuk darimana yaitu dari main Activity, yang kedua yaitu kemana halamannya
        Intent i = new Intent(this, film3.class);

        //untuk memulai
        startActivity(i);
    }

    public void launchSettingsFilm4(View v) {
        // launch halaman lain (New Activity)
        //yang pertama untuk darimana yaitu dari main Activity, yang kedua yaitu kemana halamannya
        Intent i = new Intent(this, film4.class);

        //untuk memulai
        startActivity(i);
    }

    public void launchSettingsFilm5(View v) {
        // launch halaman lain (New Activity)
        //yang pertama untuk darimana yaitu dari main Activity, yang kedua yaitu kemana halamannya
        Intent i = new Intent(this, film5.class);

        //untuk memulai
        startActivity(i);
    }

}