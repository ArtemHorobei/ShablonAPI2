package com.spirit.shablonapi.app;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        ApiClient.init(this);
        super.onCreate();
    }
}
