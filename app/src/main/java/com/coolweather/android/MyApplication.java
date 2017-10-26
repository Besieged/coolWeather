package com.coolweather.android;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by msi on 2017/10/26.
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePalApplication.initialize(context);
    }

    public static Context getContext(){
        return context;
    }

}
