package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	
	public static final String C_P="create table Province("
			+"id integer primary key autoincrement, "
			+"province_name text, "
			+"province_code text)";
	public static final String C_CI="create table City("
			+"id integer primary key autoincrement, "
			+"city_name text, "
			+"city_code text, "
			+"province_id integer)";
	public static final String C_CO="create table County("
			+"id integer primary key autoincrement, "
			+"county_name text, "
			+"county_code text, "
			+"city_id integer)";
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
		Log.w("ssss", "ssss");
	}


	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}


	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		Log.w("db", "onCreate");
		db.execSQL(C_CI);
		db.execSQL(C_CO);
		db.execSQL(C_P);
		Log.w("db", "onCreate");
	}

}
