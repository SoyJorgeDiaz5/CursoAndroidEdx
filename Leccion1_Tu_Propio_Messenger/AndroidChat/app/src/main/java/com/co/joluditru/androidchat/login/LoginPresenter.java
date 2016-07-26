package com.co.joluditru.androidchat.login;

import com.co.joluditru.androidchat.login.events.LoginEvent;

/**
 * Created by joluditru on 25/07/2016.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
    void onEventMainThread(LoginEvent event);
}
