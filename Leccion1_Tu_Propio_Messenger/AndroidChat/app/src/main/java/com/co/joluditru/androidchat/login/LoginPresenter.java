package com.co.joluditru.androidchat.login;

/**
 * Created by joluditru on 25/07/2016.
 */
public interface LoginPresenter {
    void onDestroy();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
}
