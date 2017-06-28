package com.agussuarya.latihan2.utilities;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by root on 28/06/17.
 */

public class PrefManager {
    public PrefManager() {

    }

    public void saveString(Context ctx, String key, String value) {
        PreferenceManager.getDefaultSharedPreferences(ctx).edit().putString(key, value).apply();
    }

    public String getString(Context ctx, String key, String defailtValue) {
        return PreferenceManager.getDefaultSharedPreferences(ctx).getString(key, defailtValue);
    }

    public void saveBoolean(Context ctx, String key, boolean value) {
        PreferenceManager.getDefaultSharedPreferences(ctx).edit().putBoolean(key, value).apply();
    }

    public boolean getBoolean(Context ctx, String key, boolean defaultValue) {
        return PreferenceManager.getDefaultSharedPreferences(ctx).getBoolean(key, defaultValue);
    }

}
