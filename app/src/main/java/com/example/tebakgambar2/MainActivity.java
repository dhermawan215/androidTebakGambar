package com.example.tebakgambar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView_line, imageView_whatsapp, imageView_youtube,
    imageView_instagram, imageView_snapchat, imageView_twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInisialisasi();
        onClickMantab();
    }

    private void onClickMantab(){
        imageView_line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this,TebakActivity.class);
                d.putExtra("nama_icon", "Line");
                startActivity(d);
            }
        });

        imageView_snapchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this,TebakActivity.class);
                c.putExtra("nama_icon", "snapchat");
                startActivity(c);
            }
        });

        imageView_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, TebakActivity.class);
                a.putExtra("nama_icon","twitter");
                startActivity(a);
            }
        });

        imageView_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this,TebakActivity.class);
                al.putExtra("nama_icon","youtube");
                startActivity(al);
            }
        });

        imageView_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this,TebakActivity.class);
                al.putExtra("nama_icon","Instagram");
                startActivity(al);
            }
        });

        imageView_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this,TebakActivity.class);
                al.putExtra("nama_icon","whatsapp");
                startActivity(al);
            }
        });





    }

    private void setInisialisasi() {
        imageView_line=
                (ImageView)findViewById(R.id.imageView_line);
        imageView_snapchat =
                (ImageView)findViewById(R.id.imageView_snapchat);
        imageView_instagram =
                (ImageView)findViewById(R.id.imageView_instagram);
        imageView_twitter =
                (ImageView)findViewById(R.id.imageView_twitter);
        imageView_whatsapp =
                (ImageView)findViewById(R.id.imageView_whatsapp);
        imageView_youtube=
                (ImageView)findViewById(R.id.imageView_youtube);
    }

}