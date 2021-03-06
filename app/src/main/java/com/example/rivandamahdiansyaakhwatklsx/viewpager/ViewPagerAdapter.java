package com.example.rivandamahdiansyaakhwatklsx.viewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;
    String[] nama;
    int[] isi;

    public ViewPagerAdapter(Context context, String[] nama, int[] isi) {
        this.context = context;
        this.nama = nama;
        this.isi = isi;
    }

    @Override
    public int getCount() {
        return nama.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        TextView judul, isii;
        ImageView imageView;

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.viewitem, container, false);
        judul = v.findViewById(R.id.judulitem);
        isii = v.findViewById(R.id.isiitem);

        judul.setText(nama[position]);
        isii.setText(isi[position]);
        ((ViewPager) container).addView(v);
        return v;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager) container).removeView((LinearLayout) object);
    }
}
