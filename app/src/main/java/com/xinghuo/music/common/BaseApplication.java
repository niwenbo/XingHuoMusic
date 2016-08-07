package com.xinghuo.music.common;

import android.app.Application;
import com.baidu.mapapi.SDKInitializer;
import cn.jpush.android.api.JPushInterface;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化百度地图api
        SDKInitializer.initialize(getApplicationContext());
        //初始化极光推送
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }


}
