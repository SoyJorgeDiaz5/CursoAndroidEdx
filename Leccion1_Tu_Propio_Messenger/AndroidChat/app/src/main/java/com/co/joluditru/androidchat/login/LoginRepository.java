package com.co.joluditru.androidchat.login;

/**
 * Created by joluditru on 25/07/2016.
 */
public interface LoginRepository {
    void signUp(String email, String password);
    void signIn(String email, String password);
    void checkSession();
}
