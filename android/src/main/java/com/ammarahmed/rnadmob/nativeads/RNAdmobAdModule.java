package com.ammarahmed.rnadmob.nativeads;

import androidx.annotation.NonNull;

import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.LogLevel;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNAdmobAdModule extends ReactContextBaseJavaModule {
    ReactApplicationContext _ctx;
    RNAdmobAdModule(ReactApplicationContext context) {
        super(context);
        this._ctx = context;
    }

    @NonNull
    @Override
    public String getName() {
        return "AdmobAdModule";
    }

    @ReactMethod
    public void initConfig() {
        // appToken:
        // environment: sandbox | production
        AdjustConfig config = new AdjustConfig(this._ctx,  "xu2fy7zb2bk0", "sandbox", true);
        config.setLogLevel(LogLevel.SUPRESS);
        Adjust.onCreate(config);
    }
}
