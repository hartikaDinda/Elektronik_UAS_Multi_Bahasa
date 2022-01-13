package com.example.elektronik;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import model.Elektronik;

public class ProfileActifity extends AppCompatActivity {

    Elektronik elektronik;
    TextView txJenis,txName,txDeskripsi,txJudul;
    ImageView ivFotoElektronik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        elektronik = (Elektronik) intent.getSerializableExtra(DaftarElektronikActifity.ELEKTRONIK_TERPILIH);
        inisialisasiView();
        tampilkanProfil(elektronik);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txName = findViewById(R.id.txName);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoElektronik = findViewById(R.id.gambarElektronik);
    }

    private void tampilkanProfil(Elektronik elektronik) {
        Log.d("Profil","Menampilkan "+elektronik.getElektronik());
        txJudul.setText(elektronik.getElektronik());
        txJenis.setText(elektronik.getJenis());
        txName.setText(elektronik.getNama());
        txDeskripsi.setText(elektronik.getDeskripsi());
        ivFotoElektronik.setImageDrawable(this.getDrawable(elektronik.getDrawableRes()));

    }
}
