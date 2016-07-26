package com.co.joluditru.androidchat.login;

/**
 * Created by joluditru on 25/07/2016.
 */
public interface LoginInteractor {
    void checkSession();
    void doSignUp(String email, String password);
    void doSignIn(String email, String password);
}
