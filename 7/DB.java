package com.example.librarymgmtsystem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB extends SQLiteOpenHelper {

   SQLiteDatabase sqLiteDatabase;
   public DB(Context context) {
       super(context, "data.db", null, 1);
       sqLiteDatabase = getWritableDatabase();   }

   @Override
   public void onCreate(SQLiteDatabase db) {
       db.execSQL("CREATE TABLE bookinsert (BookName TEXT, author TEXT)");   }

   @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       onCreate(db);   }

   // Save book details
   public void save(String bookName, String author) {
       ContentValues cv = new ContentValues();
       cv.put("BookName", bookName);
       cv.put("author", author);
       sqLiteDatabase.insert("bookinsert", null, cv);   }

   // Retrieve book details
   public String retrieve(String bookName) {
       Cursor cursor = sqLiteDatabase.query("bookinsert", null, "BookName=?", new String[]{bookName}, null, null, null);
       cursor.moveToFirst();
       if (cursor.getCount() <= 0) {
           return "Book does not exist";       }
       String author = cursor.getString(cursor.getColumnIndex("author"));
       cursor.close();
       return author;   }

   // Update book details
   public void update(String bookName, String author) {
       ContentValues values = new ContentValues();
       values.put("author", author);
       sqLiteDatabase.update("bookinsert", values, "BookName=?", new String[]{bookName});   }

   // Delete book entry
   public void delete(String bookName) {
       sqLiteDatabase.delete("bookinsert", "BookName=?", new String[]{bookName});   }}
