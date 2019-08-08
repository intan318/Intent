package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DataActivity extends AppCompatActivity {

//    TextView tvNama;
//    TextView tvUmur;
//    TextView tvAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        TextView tvNama = findViewById(R.id.txtNama);
        TextView tvUmur = findViewById(R.id.txtUmur);
        TextView tvAlamat = findViewById(R.id.txtAlamat);

        tvNama.setText(getIntent().getStringExtra("nama"));
        tvUmur.setText(getIntent().getStringExtra("umur"));
        tvAlamat.setText(getIntent().getStringExtra("alamat"));

//        Intent i = getIntent();
//        String dataNama = i.getStringExtra("nama");
//        String dataUmur = i.getStringExtra("umur");
//        String dataAlamat = i.getStringExtra("alamat");
//
//        tvNama.setText(dataNama);
//        tvUmur.setText(dataUmur);
//        tvAlamat.setText(dataAlamat);
    }

//    private void initData() {
//        tvNama = findViewById(R.id.txtNama);
//        tvUmur = findViewById(R.id.txtUmur);
//        tvAlamat = findViewById(R.id.txtAlamat);
//
//    }
}
