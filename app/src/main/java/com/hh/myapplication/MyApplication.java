package com.hh.myapplication;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application{

    private static Context mContext;

    public MyApplication() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
