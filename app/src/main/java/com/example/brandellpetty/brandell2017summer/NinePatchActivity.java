package com.example.brandellpetty.brandell2017summer;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.brandellpetty.brandell2017summer.adapter.ScalePagerAdapter;

import java.util.ArrayList;

public class NinePatchActivity extends AppCompatActivity {


    private ViewPager viewPager;
    private ScalePagerAdapter adapter;
    private View viewPatch;
    private ArrayList<View> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine_patch);

        list = new ArrayList<View>();
        viewPager = (ViewPager) findViewById(R.id.activity_scale_view_pager);

        LayoutInflater lf = getLayoutInflater().from(this);
        viewPatch = lf.inflate(R.layout.nomail_imageview, null);

        list.add(viewPatch);

        adapter = new ScalePagerAdapter(list);
        viewPager.setAdapter(adapter);
    }
}
