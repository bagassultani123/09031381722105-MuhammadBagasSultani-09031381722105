package com.bengkel.bangkelmotorkotapalembang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class komentar extends AppCompatActivity {

    EditText edtNama;
    RadioGroup satu;
    RadioButton dua;
    RadioButton tiga;
    TextView rate;
    Button btnSubmit;
    TextView nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar);

        // menguhubungkan view yang ada di xml dengan java
        edtNama = (EditText) findViewById(R.id.edtnamaku);
        satu = (RadioGroup) findViewById(R.id.satu);
        dua = (RadioButton) findViewById(R.id.dua);
        tiga = (RadioButton) findViewById(R.id.tiga);
        nama = (TextView)findViewById(R.id.nama);
        rate = (TextView) findViewById(R.id.rate);
        btnSubmit = (Button)findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {   // set tombol Submit ketika diklik akan menjalankan methode proses
            @Override
            public void onClick(View v) {
                proses();
            }
        });
    }

    public void proses(){
        String Nama = edtNama.getText().toString();
        nama.setText(Nama);
        if (dua.isChecked()){
            rate.setText("puas");
        }
        else {
            rate.setText("kurang puas");
        }
    }
}
