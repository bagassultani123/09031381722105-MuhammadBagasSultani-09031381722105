package com.bengkel.bangkelmotorkotapalembang;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class DetailActivity extends AppCompatActivity {
    private String telepon, lokasi, komentar;
    private Button btnTelepon, btnLokasi,btnKomentar;
    private WebView wvbengkel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent tangkap = getIntent();
        String idBengkel = tangkap.getStringExtra("amplopID");

        if(idBengkel.equals("0")){ //Jaya Abadi Motor Sport
            telepon = "087748469303";
            lokasi = "-2.950029, 104.785713";
        }
        else if(idBengkel.equals("1")){ //sinar jaya motor
            telepon = "0711373630";
            lokasi = "-2.966712, 104.757075";
        }
        else if(idBengkel.equals("2")){ //Samurai Paint - Setia Motor
            telepon = "081272267644";
            lokasi = "-2.949367, 104.741852";
        }
        else if(idBengkel.equals("3")){ //Kencana Raya Motor
            telepon = "089608963158";
            lokasi = "-2.950156, 104.741102";
        }
        else if(idBengkel.equals("4")){ //Tosca Motor
            telepon = "081377959888";
            lokasi = "-2.954377, 104.735344";
        }
        else if(idBengkel.equals("5")){ //Bintang Motor
            telepon = "0711350511";
            lokasi = "-2.952012, 104.734201";
        }
        else if(idBengkel.equals("6")){ //Inti Motor Km 5
            telepon = "085366638887";
            lokasi = "-2.952457, 104.734494";
        }
        else if(idBengkel.equals("7")){ //Toko Daniel Motor km 5 palembang
            telepon = "07117944626";
            lokasi = "-2.942589, 104.744405";
        }
        else if(idBengkel.equals("8")){ //Jaya Motor
            telepon = "07117708071";
            lokasi = "-2.956049, 104.754187";
        }
        else if(idBengkel.equals("9")){ //Berkat Motor
            telepon = "08127378188";
            lokasi = "-2.963214, 104.769390";
        }
        else if(idBengkel.equals("10")){ //Capella Motor
            telepon = "081279883333";
            lokasi = "-2.956999, 104.754386";
        }
        else if(idBengkel.equals("11")){ //Ferio Motor
            telepon = "0711357719";
            lokasi = "-2.976655, 104.754914";
        }
        else if(idBengkel.equals("12")){ //Panca Jaya Motor
            telepon = "0711357988";
            lokasi = "-2.977219, 104.754499";
        }
        else if(idBengkel.equals("13")){ //Zona Motor
            telepon = "081288686800";
            lokasi = "-2.978458, 104.754001";
        }
        else if(idBengkel.equals("14")){ //Candi Bengkel
            telepon = "0711351777";
            lokasi = "-2.982824, 104.755358";
        }
        else if(idBengkel.equals("15")){ //Rizky Motor
            telepon = "082376866941";
            lokasi = "-2.982354, 104.755921";
        }
        else if(idBengkel.equals("16")){ //Sumber Kita Jaya
            telepon = "0711357936";
            lokasi = "-2.983073, 104.757980";
        }
        else if(idBengkel.equals("17")){ //Teman Baru
            telepon = "0711350385";
            lokasi = "-2.983058, 104.757926";
        }
        else if(idBengkel.equals("18")){ //Kms Variasi Motor Palembang
            telepon = "0711320001";
            lokasi = "-2.982776, 104.757342";
        }
        else if(idBengkel.equals("19")){ //Omega Motor
            telepon = "0711364243";
            lokasi = "-2.982523, 104.758205";
        }

        btnTelepon = findViewById(R.id.btn_telepon);
        btnLokasi = findViewById(R.id.btn_lokasi);

        btnTelepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent panggil = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+telepon));
                startActivity(panggil);
            }
        });

        btnLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlMap = "http://maps.google.com/maps?daddr="+lokasi;
                Intent peta = new Intent(Intent.ACTION_VIEW, Uri.parse(urlMap));
                startActivity(peta);
            }
        });

        String fileHTML = "file:///android_res/raw/bengkel_"+idBengkel+".html";

        wvbengkel = findViewById(R.id.wv_bengkel);
        wvbengkel.loadUrl(fileHTML);
    }

    public void saran(View view) {
        Intent intent = new Intent(DetailActivity.this, komentar.class);
        startActivity(intent);
    }
}



