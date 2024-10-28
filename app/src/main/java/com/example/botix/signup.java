package com.example.botix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //ini nantinya buat tangkep pesan dari activity lain
        getIntent();
    }

    //untuk ganti halaman
    public void launchSettingsMain(View v) {
        // launch halaman lain (New Activity)
        //yang pertama untuk darimana yaitu dari main Activity, yang kedua yaitu kemana halamannya
        Intent i = new Intent(this, MainActivity.class);

        //ini akan mengambil data text edit dari XML yang akan dipindahkan ke halaman lain
        String message = ((EditText)findViewById(R.id.username)).getText().toString();
        //harus letakkin ini sebelum melakukan pergantian activity, name disini akan digunakan sebagai key untuk halaman lain
        i.putExtra("usrname", message);

        //untuk memulai
        startActivity(i);
    }
}