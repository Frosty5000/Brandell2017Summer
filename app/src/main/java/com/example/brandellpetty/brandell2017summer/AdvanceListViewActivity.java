package com.example.brandellpetty.brandell2017summer;

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

import com.example.brandellpetty.brandell2017summer.adapter.AdvanceListViewAdapter;
import com.example.brandellpetty.brandell2017summer.adapter.BaseViewPagerAdapter;
import com.example.brandellpetty.brandell2017summer.fragment.BlueFragment;
import com.example.brandellpetty.brandell2017summer.fragment.GreenFragment;
import com.example.brandellpetty.brandell2017summer.fragment.RedFragment;

import java.lang.reflect.Array;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceListViewActivity extends AppCompatActivity{

    @BindView(R.id.activity_advance_list_view) ListView lv;
    private ArrayList<Fragment> list1 = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        ButterKnife.bind(this);
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello, how are you?");
        list.add("I'm fine, thank you!");
        list.add("So what's up?");
        list.add("I'm having a get together later this Saturday, would you like to come?");
        list.add("I may have to work that day, but if I don't have to, sure!");
        list.add("Cool! If you do show up you can bring whoever you want.");
        list.add("Most likely will be bringing a friend to tag along then!");
        list.add("The get together starts at 8pm.");
        list.add("I actually get off of work at 6pm!");
        list.add("Oh great!");
        list.add("I'll definitely stop by, see you then!");
        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this, list);
        lv.setAdapter(adapter);


//        ViewPager viewPager = (ViewPager) findViewById(R.id.activity_view_pager);
//        list1.add(new RedFragment());
//        list1.add(new GreenFragment());
//        list1.add(new BlueFragment());

//        BaseViewPagerAdapter pagerAdapter =
//                new BaseViewPagerAdapter(getSupportFragmentManager(), list1);
//        viewPager.setAdapter(pagerAdapter);
//        viewPager.setCurrentItem(1);

        TextView tv = new TextView(this);
        tv.setTextSize(50);
        tv.setText("HeaderView");
        lv.addHeaderView(tv);
        lv.setAdapter((ListAdapter) adapter);

        TextView tv1 = new TextView(this);
        tv1.setTextSize(50);
        tv1.setText("FooterView");
        lv.addFooterView(tv1);

//        lv.setOnClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
//                showToast(String.valueOf(position));
//            }
//        });

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
