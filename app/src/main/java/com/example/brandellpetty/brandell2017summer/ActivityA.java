package com.example.brandellpetty.brandell2017summer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityA extends BaseActivity {
//Use for Activity B, C, & D as well. Also use the onIntent method to fulfill the assignment.

    @OnClick(R.id.activity_a_a)
    public void toA(View v) { goToActivity(ActivityA.class); }

    @OnClick(R.id.activity_a_b)
    public void toB(View v) { goToActivity(ActivityB.class); }

    @OnClick(R.id.activity_a_c)
    public void toC(View v) { goToActivity(ActivityC.class); }

    @OnClick(R.id.activity_a_d)
    public void toD(View v) { goToActivity(ActivityD.class); }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show();
        ButterKnife.bind(this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        shortToast("onNewIntent");
    }
}
