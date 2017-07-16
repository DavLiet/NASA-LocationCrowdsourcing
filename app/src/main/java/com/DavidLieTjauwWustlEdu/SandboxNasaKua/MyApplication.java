package com.DavidLieTjauwWustlEdu.SandboxNasaKua;

import android.app.Application;

import com.estimote.coresdk.common.config.EstimoteSDK;

//
// Running into any issues? Drop us an email to: contact@estimote.com
//

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        EstimoteSDK.initialize(getApplicationContext(), "sandbox-nasa-kua", "17f63377066b3b5a18f12e6930815972");

        // uncomment to enable debug-level logging
        // it's usually only a good idea when troubleshooting issues with the Estimote SDK
//        EstimoteSDK.enableDebugLogging(true);
    }
}
