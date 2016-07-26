package com.co.joluditru.androidchat.login;

/**
 * Created by joluditru on 25/07/2016.
 */
public class LoginInteractorImpl implements LoginInteractor {

    private LoginRepository loginRepository;

    @Override
    public void checkSession() {
        loginRepository.checkSession();
    }

    @Override
    public void doSignUp(String email, String password) {
        loginRepository.signUp(email, password);
    }

    @Override
    public void doSignIn(String email, String password) {
        loginRepository.signIn(email, password);
    }
}
