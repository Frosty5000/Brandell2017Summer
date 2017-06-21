package com.example.brandellpetty.brandell2017summer;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.example.brandellpetty.brandell2017summer.dialog.CustomDialog;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DialogActivity extends BaseActivity {

    private int checkedID = 0;

    @BindView(R.id.activity_dialog)
    RadioGroup radioGroup;

    @OnClick(R.id.activity_dialog_submit)
    public void submit(View view){
     //   shortToast("You chose Dialog:" + checkedID);
        switch (checkedID){
            case R.id.activity_dialog_1:
                shortToast("You chose the first one");
                break;
            case R.id.activity_dialog_2:
                shortToast("You chose the second one");
                break;
            case R.id.activity_dialog_3:
                shortToast("You chose the third one");
                break;
            case R.id.activity_dialog_4:
                shortToast("You chose the fourth one");
                break;
            case R.id.activity_dialog_5:
                shortToast("You chose the fifth one");
                break;
            case R.id.activity_dialog_6:
                shortToast("You chose the sixth one");
                break;
            case R.id.activity_dialog_7:
                shortToast("You chose the seventh one");
                break;
            case R.id.activity_dialog_8:
                CustomDialog customDialog = new CustomDialog(this, new CustomDialog.ICustomDialogListener() {
                    @Override
                    public void onOKClicked(String msg) {
                        shortToast(msg);
                    }
                });
                customDialog.setCanceledOnTouchOutside(true);
                customDialog.show();
                shortToast("You chose the last one");
                break;
            default:
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        ButterKnife.bind(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                checkedID = checkedId;
            }
        });
    }
}



