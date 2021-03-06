package com.example.brandellpetty.brandell2017summer;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SharedPreferenceActivity extends BaseActivity{

    private final String EMAIL = "email";
    private final String PASSWORD = "password";
    private final String USER = "user";


    @BindView(R.id.activity_sharedpreference_email)
    EditText emailEditText;

    @BindView(R.id.activity_sharedpreference_password)
    EditText passwordEditText;

    @OnClick(R.id.activity_sharedpreference_clear)
    public void clear(View v){
        SharedPreferences sp = getSharedPreferences(USER, MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        editor.commit();
        emailEditText.setText("");
        passwordEditText.setText("");
        shortToast("You cleared all content");
    }

    @OnClick (R.id.activity_sharedpreference_login)
    public void login (View v){
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();
       if(check(email,password)){
           shortToast("Login Successful");
       }
    }

    private boolean check(String email, String password){
        boolean passwordCorrect = true;
        if(passwordCorrect){
            SharedPreferences sp = getSharedPreferences(USER, MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putString(EMAIL, email);
            editor.putString(PASSWORD, password);
            editor.commit();
            return true;
        }
        else{
            return false;
        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        ButterKnife.bind(this);
        retrieveLoginInfo();
    }

    private void retrieveLoginInfo() {
        SharedPreferences sp = getSharedPreferences(USER, MODE_PRIVATE);
        String email = sp.getString(EMAIL, "null");
        String password = sp.getString(PASSWORD, "null");
        if (!email.equals("null")){
            emailEditText.setText(email);
            passwordEditText.setText(password);
        }

    }


}
