package com.example.jualankaos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends AppCompatActivity {
    Button btnkshtm, btnkspth, btnksbr, btnkskn;//mendeklarasi variabel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnkshtm = findViewById(R.id.kshtm);
        btnkspth = findViewById(R.id.kspth);//berfungsi menghubungkan dengan button yang digunakan pada layout xml
        btnksbr = findViewById(R.id.ksbr);
        btnkskn = findViewById(R.id.kskn);

        btnkskn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DetailPemesanan.class);
                startActivity(i);
            }
        });

        btnksbr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DetailPemesanan.class);
                startActivity(i);
            }
        });

        btnkspth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DetailPemesanan.class);
                startActivity(i);
            }
        });

        btnkshtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DetailPemesanan.class);
                startActivity(i);
            }
        });
    }
}
