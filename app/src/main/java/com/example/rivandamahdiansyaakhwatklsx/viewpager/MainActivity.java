package com.example.rivandamahdiansyaakhwatklsx.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    String[] nama = {
            "Doa telat Makan", "Doa masuk WC", "Doa keluar WC",
            "Doa ketika Hujan turun", "Doa ketika hujan selesai", "Doa untuk orang sakit",
            "Doa ketika bersin dan jawabannya", "Doa agar selamat dunia akhirat", "Doa ketika bercermin",
            "Doa ketika perjalanan safar"
    };
    int[] isi = {
            R.string.doatelat, R.string.doamasuk, R.string.doakeluar,
            R.string.doapashujan, R.string.doaselese, R.string.doasakit,
            R.string.doabersin, R.string.doaselamat, R.string.doabercermin,
            R.string.doasafar
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getApplicationContext(), nama, isi);
        viewPager.setAdapter(adapter);

    }
}
