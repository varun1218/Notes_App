package com.example.bottomnavigationdrawer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.bottomnavigationdrawer.ui.getset;

import java.util.ArrayList;

public class My_Database extends SQLiteOpenHelper {

    private  static  final  String DB_NAME = "mydb";
    private  static  final  String ID_COL = "myid";
    private  static  final  String TITLE_COL = "title";
    private  static  final  String DESCRIPTION_COL = "description";
    private  static  final  String TABLE_NAME = "info";
    private  static  final  int DB_VERSION = 1;

    public My_Database(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TITLE_COL + " TEXT,"
                + DESCRIPTION_COL + " TEXT)";
        db.execSQL(query);

    }

    public void addnewData(String my_title ,String my_description){
        SQLiteDatabase mdb = this.getWritableDatabase();
        ContentValues value = new ContentValues();
        value.put(TITLE_COL,my_title);
        value.put(DESCRIPTION_COL,my_description);
        mdb.insert(TABLE_NAME,null,value);
    }

//    public void updatedata(String title, String description){
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put(TITLE_COL, title);
//        values.put(DESCRIPTION_COL, description);
//        db.update(TABLE_NAME,values,"myid="+ID_COL,null);
//    }

//    public void deleteItem(int position) {
//        Log.i("pos", "SELECT * FROM " + TABLE_NAME + " WHERE " + ID_COL + " = " + position);
//        SQLiteDatabase db = this.getWritableDatabase();
//        db.execSQL("DELETE FROM " + TABLE_NAME + " WHERE " +
//                ID_COL + " = " + position + ";");
//
//    }

//    public getset fetch_id(String position) {
//
//
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        Cursor cursor = db.query(TABLE_NAME, new String[] { ID_COL
//                }, TITLE_COL + "=?",
//                new String[] { position }, null, null, null, null);
//        if (cursor != null)
//            cursor.moveToFirst();
//
//        getset contact = new getset(Integer.parseInt(cursor.getString(0)));
//
//        return contact;
//
//    }



    public ArrayList<getset> getdata(){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME,null);
        ArrayList<getset> datagetarraylist = new ArrayList<>();
        if (cursor.moveToFirst()){
            do {

                datagetarraylist.add(new getset(cursor.getString(1),
                        cursor.getString(2)));

            }while (cursor.moveToNext());
        }
        return datagetarraylist;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
}
