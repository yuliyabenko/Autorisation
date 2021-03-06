package com.yuliya.autorisation;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.vk.sdk.VKSdk;

/**
 * Created by Yuliya on 30.01.2017.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize the SDK before executing any other operations,
        FacebookSdk.sdkInitialize(getApplicationContext());
        VKSdk.initialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }
}
