package com.co.joluditru.androidchat.login;

/**
 * Created by joluditru on 25/07/2016.
 */
public interface LoginView {
    void enableInputs();
    void disableInputs();
    void showProgress();
    void hideProgress();

    void handleSignIn();
    void handleSignUp();

    void navigateToMainScreen();
    void loginError(String error);

    void newUserSuccess();
    void newUserError(String error);
}
