package com.example.elektronik;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import model.Elektronik;

public class DaftarElektronikActifity extends AppCompatActivity {
    public final static String ELEKTRONIK_TERPILIH ="elektronik_obj_key";
    List<Elektronik> elektronik;
    ListView listView;
    String jenisElektronik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar_listview_actifity);
        Intent intent = getIntent();
        jenisElektronik = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        TextView txJudul = findViewById(R.id.text_title_daftar);
        txJudul.setText(getString(R.string.daftar)+" "+jenisElektronik.toUpperCase());
        elektronik = DataProvider.getElektroniksByTipe(this,jenisElektronik);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_hewan);
        DafatarElektronikAdapter adapter = new DafatarElektronikAdapter(this, elektronik);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Elektronik terpilih = elektronik.get(position);
            bukaProfileHewan(terpilih);
        }
    };

    private void bukaProfileHewan(Elektronik elektronikTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, ProfileActifity.class);
        intent.putExtra(ELEKTRONIK_TERPILIH, elektronikTerpilih);
        startActivity(intent);
    }
}
