package com.co.joluditru.tipcalc;

import android.app.Application;

/**
 * Created by joluditru on 19/06/2016.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://github.com/joluditru";

    public String getAboutUrl(){
        return ABOUT_URL;
    }
}
