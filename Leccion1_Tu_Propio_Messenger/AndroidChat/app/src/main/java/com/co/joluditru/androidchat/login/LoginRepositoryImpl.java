package com.co.joluditru.androidchat.login;

import android.util.Log;

import com.co.joluditru.androidchat.domain.FirebaseHelper;
import com.co.joluditru.androidchat.lib.EventBus;
import com.co.joluditru.androidchat.lib.GreenRobotEventBus;
import com.co.joluditru.androidchat.login.events.LoginEvent;

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
        postEvent(LoginEvent.onSignUpSuccess);
    }

    @Override
    public void signIn(String email, String password) {
        postEvent(LoginEvent.onSignInSuccess);
    }

    @Override
    public void checkSession() {
        postEvent(LoginEvent.onFailedToRecoverSession);
    }

    private void postEvent(int type, String errorMessage){
        LoginEvent loginEvent = new LoginEvent();
        loginEvent.setEventType(type);
        if (errorMessage != null){
            loginEvent.setErrorMessage(errorMessage);
        }

        EventBus eventBus = GreenRobotEventBus.getInstance();
        eventBus.post(loginEvent);
    }

    private void postEvent(int type){
        postEvent(type, null);
    }
}
