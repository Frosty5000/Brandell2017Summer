package com.example.brandellpetty.brandell2017summer;

import android.app.Application;

import com.example.brandellpetty.brandell2017summer.util.UtilLog;

/**
 * Created by brandellpetty on 6/19/17.
 */

public class BrandellApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setIsLog(false);
    }
}
