package com.example.leidong;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import org.litepal.LitePal;

/**
 * Created by leidong on 2017/5/5.
 */

public class LitePalSample extends Application {
    private static Context context = null;
    private SQLiteDatabase sqLiteDatabase;

    @Override
    public void onCreate(){
        super.onCreate();
        LitePal.initialize(this);

        sqLiteDatabase = LitePal.getDatabase();

        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
