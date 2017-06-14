package com.example.brandellpetty.brandell2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.brandellpetty.brandell2017summer.adapter.AdvanceListViewAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceListViewActivity extends BaseActivity {

    @BindView(R.id.activity_advance_list_view) ListView lv;


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

        TextView tv = new TextView(this);
        tv.setTextSize(50);
        tv.setText("HeaderView");
        lv.addHeaderView(tv);

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

}
