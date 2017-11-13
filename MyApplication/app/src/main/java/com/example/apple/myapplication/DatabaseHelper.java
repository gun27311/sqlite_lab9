package com.example.apple.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Apple on 11/8/2017 AD.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    private static final String DB_NAME = "memberDB";
    private static final int DB_VERSION = 1 ;

    private static final String DB_CREATE = "" +
            "CREATE TABLE mamber (" +
            "id INTERGER PRIMARY KEY, " +
            "name TEXT NOT NULL, " +
            "surname TEXT NOT NULL, " +
            "age INTEGER NOT NULL);";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DB_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(DatabaseHelper.class.getName(),
                "Upgread database version from version "+ oldVersion+ " to " +
                        newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS member");
        onCreate(db);
    }
}
