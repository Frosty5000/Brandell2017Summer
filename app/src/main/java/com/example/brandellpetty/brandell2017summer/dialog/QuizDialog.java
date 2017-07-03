package com.example.brandellpetty.brandell2017summer.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.brandellpetty.brandell2017summer.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnItemClick;
import butterknife.OnItemSelected;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * Created by brandellpetty on 7/3/17.
 */

public class QuizDialog extends Dialog {

    private final QuizDialogListener listener;
//    private int checkedID;


    @BindView(R.id.radio_group_quiz)
    RadioGroup radioGroup;

    public interface QuizDialogListener{
        public void onOKClicked(String msg);
    }
    @OnClick(R.id.dialog_quiz_ok)
    public void ok(View view){
        cancel();
    }
    @OnClick(R.id.dialog_quiz_cancel)
    public void cancel(View view){
        cancel();
    }

    @OnClick(R.id.dialog_quiz_yes)
    public void quizYes(View view){
        listener.onOKClicked("Yes");
        cancel();
    }

    @OnClick(R.id.dialog_quiz_no)
    public void quizNo(View view){
        listener.onOKClicked("No");
        cancel();
    }
    @OnClick(R.id.dialog_quiz_exit)
    public void quizExit(View view){
        System.exit(0);
        cancel();
    }

    public QuizDialog(@NonNull Context context, QuizDialogListener listener){
        super(context, R.style.dialog);
        setContentView(R.layout.dialog_quiz);
        ButterKnife.bind(this);
        this.listener = listener;
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
//            @Override
//            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
//                checkedID = checkedId;
//            }
//        });
    }
}
