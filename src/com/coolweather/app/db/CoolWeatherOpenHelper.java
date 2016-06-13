package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	public static final String C_P="create table Province("
			+"id integer primary key autoincrement,"
			+"province_name text, "
			+"province_code text)";
	public static final String C_CI="create table City("
			+"id integer primary key autoincrement,"
			+"city_name text, "
			+"city_code text,"
			+"province_id integer)";
	public static final String C_CO="create table Country("
			+"id integer primary key autoincrement,"
			+"country_name text, "
			+"country_code text,"
			+"city_id integer)";
	
	/*public  CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version) {
		super(context,name,factory,version);
		// TODO Auto-generated method stub

	}*/
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(C_P);
		db.execSQL(C_CI);
		db.execSQL(C_CO);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}