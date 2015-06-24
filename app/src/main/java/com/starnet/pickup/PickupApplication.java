package com.starnet.pickup;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by jn-wr on 2015/6/24.
 */
public class PickupApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        JPushInterface.setDebugMode(true); 	// 设置开启日志,发布时请关闭日志
        JPushInterface.init(this);     		// 初始化 JPush
    }
}
