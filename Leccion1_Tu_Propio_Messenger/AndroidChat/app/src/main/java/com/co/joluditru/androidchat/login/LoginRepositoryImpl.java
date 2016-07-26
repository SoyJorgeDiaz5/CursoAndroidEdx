package com.co.joluditru.androidchat.login;

import android.util.Log;

import com.co.joluditru.androidchat.domain.FirebaseHelper;

/**
 * Created by joluditru on 25/07/2016.
 */
public class LoginRepositoryImpl implements LoginRepository {

    private FirebaseHelper firebaseHelper;

    public LoginRepositoryImpl() {
        this.firebaseHelper = FirebaseHelper.getInstance();
    }

    @Override
    public void signUp(String email, String password) {
        Log.e("LoginRepositoryImpl", "SignUp");
    }

    @Override
    public void signIn(String email, String password) {
        Log.e("LoginRepositoryImpl", "SignIn");
    }

    @Override
    public void checkSession() {
        Log.e("LoginRepositoryImpl", "Check Session");
    }
}
