package com.spearbothy.ytime.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.spearbothy.ytime.YTimeApp;

/**
 * Created by mahao on 17-6-7.
 */

public class SPUtils {

    private  SharedPreferences sp;

    private static SPUtils sSPUtils;

    private SPUtils(Context context) {
        sp = context.getSharedPreferences("ytime", Context.MODE_PRIVATE);
    }

    public static SPUtils getInstance(){
        if(sSPUtils == null){
            sSPUtils = new SPUtils(YTimeApp.sApp);
        }
        return sSPUtils;
    }

    public void put(String key, String value) {
        sp.edit().putString(key, value).apply();
    }

    public void put(String key, boolean value) {
        sp.edit().putBoolean(key, value).apply();
    }

    public void put(String key, int value) {
        sp.edit().putInt(key, value).apply();
    }

    public void getInt(String key) {
        sp.getInt(key, 0);
    }

    public void getBoolean(String key) {
        sp.getBoolean(key, false);
    }

    public void getString(String key) {
        sp.getString(key, "");
    }
}
