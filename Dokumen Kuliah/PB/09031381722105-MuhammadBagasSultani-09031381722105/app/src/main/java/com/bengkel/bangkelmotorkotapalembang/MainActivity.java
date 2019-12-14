package com.bengkel.bangkelmotorkotapalembang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;


public class MainActivity extends AppCompatActivity {

    ListView lvBengkel;
    ArrayAdapter<CharSequence> colokan;
    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.obeng);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_main);

        lvBengkel = findViewById(R.id.lv_Bengkel);
        colokan = ArrayAdapter.createFromResource(MainActivity.this, R.array.array_bengkel, android.R.layout.simple_list_item_1);
        lvBengkel.setAdapter(colokan);

        lvBengkel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this, String.valueOf(lvPempek.getItemIdAtPosition(i)), Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("amplopID", String.valueOf(lvBengkel.getItemIdAtPosition(i)));
                startActivity(pindah);
            }
        });
    }
}

