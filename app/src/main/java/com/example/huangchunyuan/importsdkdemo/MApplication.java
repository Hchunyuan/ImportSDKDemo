package com.example.huangchunyuan.importsdkdemo;

/**
 * Created by HUANGCHUNYUAN on 2019/3/9.
 */
import android.app.Application;
import android.content.Context;

import com.secneo.sdk.Helper;

public class MApplication extends Application {

    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MApplication.this);
    }

}