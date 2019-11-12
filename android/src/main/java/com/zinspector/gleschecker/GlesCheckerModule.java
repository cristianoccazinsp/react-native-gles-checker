package com.zinspector.gleschecker;

import android.app.ActivityManager;


import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;


public class GlesCheckerModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public GlesCheckerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "GlesChecker";
    }


    @ReactMethod
    public void getGlesVersion(Promise promise) {

        ActivityManager activityManager = (ActivityManager) reactContext.getSystemService(reactContext.ACTIVITY_SERVICE);

        try{
            promise.resolve(activityManager.getDeviceConfigurationInfo().getGlEsVersion());
        }
        catch(Exception e){
            promise.reject("GLES_VERSION_FAILED", "Failed to get OpenGL ES Version: " + e.getMessage());
        }
    }

}