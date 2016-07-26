package com.co.joluditru.androidchat.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.co.joluditru.androidchat.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @Bind(R.id.txt_email)
    EditText inputEmail;
    @Bind(R.id.txt_password)
    EditText inputPassword;
    @Bind(R.id.progressBar)
    ProgressBar progressBar;
    @Bind(R.id.layout_main_container)
    RelativeLayout container;
    @Bind(R.id.btn_signin)
    Button btnSignin;
    @Bind(R.id.btn_signup)
    Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_signin)
    public void handleSignin(){
        Log.e("ANDROID-CHAT",inputEmail.getText().toString());
    }

    @OnClick(R.id.btn_signup)
    public void handleSignup(){
        Log.e("ANDROID-CHAT",inputEmail.getText().toString());
    }

}
