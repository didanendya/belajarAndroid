package com.didanendya.rosariojawa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRosarioJawa = findViewById(R.id.btn_doa_rosario);
        btnRosarioJawa.setOnClickListener(this);

        Button btnPengembang = findViewById(R.id.btn_pengembang);
        btnPengembang.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_doa_rosario:
                Intent moveIntent = new Intent(MainActivity.this, RosarioJawa.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_pengembang:
                Intent moveIntentLagi = new Intent(MainActivity.this, TimPengembang.class);
                startActivity(moveIntentLagi);
                break;
        }
    }
}