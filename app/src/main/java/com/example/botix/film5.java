package com.example.botix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class film5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film1);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //ini nantinya buat tangkep pesan dari activity lain
        getIntent();

        WebView webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.youtube.com/wgiY28Uo-T0?si=SWz4fwug57DIfbHN");
    }

    //untuk ganti halaman
    public void launchSettingsMain(View v) {
        // launch halaman lain (New Activity)
        //yang pertama untuk darimana yaitu dari main Activity, yang kedua yaitu kemana halamannya
        Intent i = new Intent(this, MainActivity.class);

        //untuk memulai
        startActivity(i);
    }

}
