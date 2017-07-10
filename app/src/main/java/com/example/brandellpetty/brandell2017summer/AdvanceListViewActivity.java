package com.example.brandellpetty.brandell2017summer;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AbsListView;

import com.example.brandellpetty.brandell2017summer.adapter.AdvanceListViewAdapter;
import com.example.brandellpetty.brandell2017summer.adapter.BaseViewPagerAdapter;
import com.example.brandellpetty.brandell2017summer.fragment.BlueFragment;
import com.example.brandellpetty.brandell2017summer.fragment.GreenFragment;
import com.example.brandellpetty.brandell2017summer.fragment.RedFragment;

import java.lang.reflect.Array;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.R.id.tabs;

public class AdvanceListViewActivity extends AppCompatActivity{

    private TabLayout tabs;
    private ViewPager viewPager;
    private ArrayList<Fragment> list2 = new ArrayList<Fragment>();

    @BindView(R.id.activity_advance_list_view) ListView lv;
    private ArrayList<String> list1 = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        ButterKnife.bind(this);
        ArrayList<String> list = new ArrayList<>();
        list1.add("Hello");
        list1.add("Hello, how are you?");
        list1.add("I'm fine, thank you!");
        list1.add("So what's up?");
        list1.add("I'm having a get together later this Saturday, would you like to come?");
        list1.add("I may have to work that day, but if I don't have to, sure!");
        list1.add("Cool! If you do show up you can bring whoever you want.");
        list1.add("Most likely will be bringing a friend to tag along then!");
        list1.add("The get together starts at 8pm.");
        list1.add("I actually get off of work at 6pm!");
        list1.add("Oh great!");
        list1.add("I'll definitely stop by, see you then!");
        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this, list1);
        lv.setAdapter(adapter);

        viewPager = (ViewPager)findViewById(R.id.activity_view_pager);
        list2.add(new RedFragment());
        list2.add(new GreenFragment());
        list2.add(new BlueFragment());
        BaseViewPagerAdapter pagerAdapter =
                new BaseViewPagerAdapter(getSupportFragmentManager(), list2);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);

//        TextView tv = new TextView(this);
//        tv.setTextSize(50);
//        tv.setText("HeaderView");
//        lv.addHeaderView(viewPager);
//        lv.setAdapter(adapter);

       // tabs = (TabLayout)findViewById(R.id.tab_layout);
//        tabs.setupWithViewPager(viewPager);
//        tabs.setTabMode(TabLayout.MODE_SCROLLABLE);

        TextView tv1 = new TextView(this);
        tv1.setTextSize(20);
        tv1.setText("Enter text . . .");
        lv.addFooterView(tv1);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart");
    }



}
