package com.example.brandellpetty.brandell2017summer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ResultActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
    }

    //Remember to create the new intent before super.onBackPressed(); so that the method can be
    //called. Or else the method will not be called and as a result the app will crash when
    //producing this action.
    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("Data","data");
        setResult(RESULT_OK,intent);
        super.onBackPressed();
    }
}
