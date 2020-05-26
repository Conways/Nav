package com.conways.nav;

import android.app.Application;

/**
 * @author Zong
 * Created on 2020/5/25
 * Describe:
 */
public class TestApp extends Application {

    public static Application context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
