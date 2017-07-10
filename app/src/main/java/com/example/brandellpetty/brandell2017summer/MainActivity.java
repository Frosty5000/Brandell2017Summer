package com.example.brandellpetty.brandell2017summer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.brandellpetty.brandell2017summer.dialog.CustomDialog;
import com.example.brandellpetty.brandell2017summer.dialog.QuizDialog;
import com.example.brandellpetty.brandell2017summer.fragment.DemoFragment;
import com.example.brandellpetty.brandell2017summer.fragment.WorkFragment;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private TextView tv_demo;
    private TextView tv_work;

    @BindView(R.id.activity_radio_group)
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        setListener();
    }

    private void initialView() {
        tv_demo = (TextView)findViewById(R.id.activity_tool_demo);
        tv_work = (TextView)findViewById(R.id.activity_tool_work);
        WorkFragment workFragment = new WorkFragment();
        DemoFragment demoFragment = new DemoFragment();
    }

    private void setListener(){
       final WorkFragment workFragment = new WorkFragment();
        final DemoFragment demoFragment = new DemoFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.activity_main_fragment,demoFragment).commit();

        tv_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
               // Toast.makeText(MainActivity.this, "You clicked demo", Toast.LENGTH_SHORT).show();
                tv_work.setTextColor(Color.BLACK);
                tv_demo.setTextColor(Color.RED);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_fragment,demoFragment).commit();
            }
        });

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "You clicked work", Toast.LENGTH_SHORT).show();
                tv_work.setTextColor(Color.RED);
                tv_demo.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_fragment,workFragment).commit();
            }
        };
        tv_work.setOnClickListener(listener);
    }

    public void login(View v){
        Toast.makeText(MainActivity.this, "You clicked login", Toast.LENGTH_SHORT).show();
    }

    public void submit(View v){
//        Toast.makeText(MainActivity.this, "Submitted!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Quiz5Activity.class);
        startActivity(intent);
    }

    public void quiz2(View v){
        QuizDialog quizDialog = new QuizDialog(this, new QuizDialog.QuizDialogListener() {
            @Override
            public void onOKClicked(String msg) {
                shortToast(msg);
            }
        });
        quizDialog.setCanceledOnTouchOutside(true);
        quizDialog.show();

    }


}
