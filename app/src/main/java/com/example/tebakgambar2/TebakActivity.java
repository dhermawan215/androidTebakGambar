package com.example.tebakgambar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class TebakActivity extends AppCompatActivity {
    ImageView imageView_tebak;
    EditText editText_jawabb;
    Button button_cek;

    String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);

        setInitalisasi();
        cekIntent();
        onClickJos();

    }

    private void onClickJos(){
        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText_jawabb.getText().toString().equals(jawaban)){
                    Toast.makeText(TebakActivity.this, "jawaban benar", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TebakActivity.this, "jawaban salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void cekIntent(){
        Intent cek = getIntent();
        String nama_icon = cek.getStringExtra("nama_icon");

        if (nama_icon.equals("line")){
            imageView_tebak.setImageResource(R.drawable.line);
            jawaban = "line";
        } else if(nama_icon.equals("instagram")){
            imageView_tebak.setImageResource(R.drawable.instagram);
            jawaban = "instagram";
        }else if(nama_icon.equals("youtube")){
            imageView_tebak.setImageResource(R.drawable.youtube);
            jawaban = "youtube";
        }else if(nama_icon.equals("whatsapp")){
            imageView_tebak.setImageResource(R.drawable.whatsapp);
            jawaban = "whatsapp";
        }else if(nama_icon.equals("snapchat")){
            imageView_tebak.setImageResource(R.drawable.snapchat);
            jawaban = "snapchat";
        }else {
            imageView_tebak.setImageResource(R.drawable.twitter);
            jawaban = "twitter";
        }
    }

    private void setInitalisasi(){
        imageView_tebak = (ImageView) findViewById(R.id.imageView_tebak);
        editText_jawabb = (EditText) findViewById(R.id.editText_jawab);
        button_cek = (Button) findViewById(R.id.buttonCek);
    }


}