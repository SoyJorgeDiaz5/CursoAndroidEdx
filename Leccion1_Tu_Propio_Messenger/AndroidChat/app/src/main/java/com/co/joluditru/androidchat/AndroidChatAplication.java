package com.co.joluditru.androidchat;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by joluditru on 24/07/2016.
 */
public class AndroidChatAplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
    }

    private void setupFirebase() {
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
    }
}
