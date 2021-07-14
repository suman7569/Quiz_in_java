package com.appdevelopersumankr.java.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "file1.db";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super ( context, DATABASE_NAME, null, DATABASE_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        //CREATING TABLE FOR C    START
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";


        final String SQL_CREATE_QUESTIONS_TABLE2 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME2 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";


        final String SQL_CREATE_QUESTIONS_TABLE3 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME3 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";


        final String SQL_CREATE_QUESTIONS_TABLE4 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME4 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";


        final String SQL_CREATE_QUESTIONS_TABLE5 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME5 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";


        final String SQL_CREATE_QUESTIONS_TABLE6 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME6 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";


        final String SQL_CREATE_QUESTIONS_TABLE7 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME7 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";


        final String SQL_CREATE_QUESTIONS_TABLE8 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME8 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";


        final String SQL_CREATE_QUESTIONS_TABLE9 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME9 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";


        final String SQL_CREATE_QUESTIONS_TABLE10 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME10 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        //CREATING TABLE FOR C       END

        final String SQL_CREATE_QUESTIONS_TABLE11 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME11 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        final String SQL_CREATE_QUESTIONS_TABLE12 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME12 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE13 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME13 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE14 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME14 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE15 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME15 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE16 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME16 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE17 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME17 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE18 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME18 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE19 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME19 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE20 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME20 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE21 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME21 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE22 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME22 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE23 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME23 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE24 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME24 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE25 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME25 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE26 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME26 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE27 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME27 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE28 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME28 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE29 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME29 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE30 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME30 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE31 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME31 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE32 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME32 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE33 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME33 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE34 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME34 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE35 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME35 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE36 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME36 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE37 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME37 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE38 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME38 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE39 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME39 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        final String SQL_CREATE_QUESTIONS_TABLE40 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME40 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        ///////////////////////////////////////////////
        final String SQL_CREATE_QUESTIONS_TABLE41 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME41 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE42 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME42 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE43 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME43 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE44 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME44 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE45 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME45 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE46 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME46 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE47 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME47 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE48 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME48 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE49 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME49 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE50 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME50 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE51 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME51 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        final String SQL_CREATE_QUESTIONS_TABLE52 = "CREATE TABLE " +
                QuizContract.QuestionsTable.TABLE_NAME52 + " ( " +
                QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";











        //EXECUTING TABLE FOR C START
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE2 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE3 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE4 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE5 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE6 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE7 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE8 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE9 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE10 );



        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE11 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE12 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE13 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE14 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE15 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE16 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE17 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE18 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE19 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE20 );



        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE21 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE22 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE23 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE24 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE25 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE26 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE27 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE28 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE29 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE30 );

        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE31 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE32 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE33 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE34 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE35 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE36 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE37 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE38 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE39 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE40 );
         //EXECUTING TABLR FOR    C      END

        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE41 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE42 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE43 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE44 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE45 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE46 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE47 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE48 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE49 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE50 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE51 );
        db.execSQL ( SQL_CREATE_QUESTIONS_TABLE52 );



        //ADDING QUESTION IN C   START
        fillQuestionsTable ();
        fillQuestionsTable2 ();
        fillQuestionsTable3 ();
        fillQuestionsTable4 ();
        fillQuestionsTable5 ();
        fillQuestionsTable6 ();
        fillQuestionsTable7 ();
        fillQuestionsTable8 ();
        fillQuestionsTable9 ();
        fillQuestionsTable10 ();
        //ADDING QUESTION IN C END

        fillQuestionsTable11 ();
        fillQuestionsTable12 ();
        fillQuestionsTable13 ();
        fillQuestionsTable14 ();
        fillQuestionsTable15 ();
        fillQuestionsTable16 ();
        fillQuestionsTable17 ();
        fillQuestionsTable18 ();
        fillQuestionsTable19 ();
        fillQuestionsTable20 ();

        fillQuestionsTable21 ();
        fillQuestionsTable22 ();
        fillQuestionsTable23 ();
        fillQuestionsTable24 ();
        fillQuestionsTable25 ();
        fillQuestionsTable26 ();
        fillQuestionsTable27 ();
        fillQuestionsTable28 ();
        fillQuestionsTable29 ();
        fillQuestionsTable30 ();

        fillQuestionsTable31 ();
        fillQuestionsTable32 ();
        fillQuestionsTable33 ();
        fillQuestionsTable34 ();
        fillQuestionsTable35 ();
        fillQuestionsTable36 ();
        fillQuestionsTable37 ();
        fillQuestionsTable38 ();
        fillQuestionsTable39 ();
        fillQuestionsTable40 ();


        fillQuestionsTable41 ();
        fillQuestionsTable42 ();
        fillQuestionsTable43 ();
        fillQuestionsTable44 ();
        fillQuestionsTable45 ();
        fillQuestionsTable46 ();
        fillQuestionsTable47 ();
        fillQuestionsTable48 ();
        fillQuestionsTable49 ();
        fillQuestionsTable50 ();
        fillQuestionsTable51 ();
        fillQuestionsTable52 ();

    }

    private void fillQuestionsTable()  {

//        Data Types, Variables and Arrays

        Question q1 = new Question ( " What is the range of short data type in Java?", " -128 to 127", " -32768 to 32767", " -2147483648 to 2147483647", " None of the mentioned", 2 );
        addQuestion ( q1 );
        Question q2 = new Question ( " What is the range of byte data type in Java?", " -128 to 127", " -32768 to 32767", " -2147483648 to 2147483647", " None of the mentioned", 1 );
        addQuestion ( q2 );
        Question q3 = new Question ( " An expression involving byte, int, and literal numbers is promoted to which of these?", " int", " long", " byte", " float", 1 );
        addQuestion ( q3 );
        Question q4 = new Question ( " Which of these literals can be contained in float data type variable?", " -1.7e+308", " -3.4e+038", " +1.7e+308", " -3.4e+050", 2 );
        addQuestion ( q4 );
        Question q5 = new Question ( " Which data type value is returned by all transcendental math functions?", " int", " float", " double", " long", 3 );
        addQuestion ( q5 );
        Question q6 = new Question ( "  What is the numerical range of a char data type in Java?", " -128 to 127", " 0 to 256", " 0 to 32767", " 0 to 65535", 4 );
        addQuestion ( q6 );
        Question q7 = new Question ( " Which of these coding types is used for data type characters in Java?", " ASCII", " ISO-LATIN-1", " UNICODE", " None ", 3 );
        addQuestion ( q7 );
        Question q8 = new Question ( " Which of these values can a boolean variable contain?", " True & False", "  0 & 1", " Any integer value", " true", 1 );
        addQuestion ( q8 );
        Question q9 = new Question ( " Which of these occupy first 0 to 127 in Unicode character set used for characters in Java?", " ASCII", " ISO-LATIN-1", " ASCII and ISO-LATIN1", " None ", 3 );
        addQuestion ( q9 );
        Question q10 = new Question ( " Which one is a valid declaration of a boolean?", " boolean b1 = 1;", " boolean b2 = ‘false’;", " boolean b3 = false;", " boolean b4 = ‘true’", 3 );
        addQuestion ( q10 );


    }
    private void fillQuestionsTable2() {

//        Operators and Control Statements

        Question q1 = new Question ( " Which of the following can be operands of arithmetic operators?", " Numeric", " Boolean", " Characters", " Both Numeric & Characters", 4 );
        addQuestion2 ( q1 );
        Question q2 = new Question ( " Modulus operator, %, can be applied to which of these?", " Integers", " Floating – point numbers", "  Both Integers and floating – point numbers", " None of the mentioned", 3);
        addQuestion2 ( q2 );
        Question q3 = new Question ( "  Decrement operator, −−, decreases the value of variable by what number?", " 1", " 2", " 3", " -1", 1 );
        addQuestion2 ( q3 );
        Question q4 = new Question ( " Which of these statements are incorrect?", " Assignment operators are more efficiently implemented by Java run-time system than their equivalent long forms", " Assignment operators run faster than their equivalent long forms", " Assignment operators can be used only with numeric and character data type", " None ", 4 );
        addQuestion2 ( q4 );
        Question q5 = new Question ( "  Can 8 byte long data type be automatically type cast to 4 byte float data type?", " yes", " no", " ", " ", 1 );
        addQuestion2 ( q5 );
        Question q6 = new Question ( " Which of these is not a bitwise operator?", " &", " &=", " |=", " <=", 4 );
        addQuestion2 ( q6 );
        Question q7 = new Question ( " Which operator is used to invert all the digits in a binary representation of a number?", " -", "  <<<", " >>>", " ^", 1 );
        addQuestion2 ( q7 );
        Question q8 = new Question ( " On applying Left shift operator, <<, on integer bits are lost one they are shifted past which position bit?", " 1", " 32", " 33", " 31", 4 );
        addQuestion2 ( q8 );
        Question q9 = new Question ( " What is the output of relational operators?", " Integer", " Boolean", " Characters", " Double", 2 );
        addQuestion2 ( q9 );
        Question q10 = new Question ( " Which of these is returned by “greater than”, “less than” and “equal to” operators?", " Integers", "  Floating – point numbers", " Boolean", " None ", 3 );
        addQuestion2 ( q10 );
    }
    private void fillQuestionsTable3() {


//        Java Environment & OOPS Concepts

        Question q1 = new Question ( " Which of the following is not OOPS concept in Java?", " Inheritance", " Encapsulation", " Polymorphism", " Compilation", 4 );
        addQuestion3 ( q1 );
        Question q2 = new Question ( " Which of the following is a type of polymorphism in Java?", " Compile time polymorphism", " Execution time polymorphism", " Multiple polymorphism", " Multilevel polymorphism", 1 );
        addQuestion3 ( q2 );
        Question q3 = new Question ( " When does method overloading is determined?", " At run time", " At compile time", " At coding time", " At execution time", 2 );
        addQuestion3 ( q3 );
        Question q4 = new Question ( " Which concept of Java is a way of converting real world objects in terms of class?", " Polymorphism", " Encapsulation", " Abstraction", " Inheritance", 3 );
        addQuestion3 ( q4 );
        Question q5 = new Question ( " Which concept of Java is achieved by combining methods and attribute into a class?", " Encapsulation", " Inheritance", " Polymorphism", " Abstraction", 1 );
        addQuestion3 ( q5 );
        Question q6 = new Question ( " What is it called if an object has its own lifecycle and there is no owner?", " Aggregation", " Composition", " Encapsulation", " Association", 4 );
        addQuestion3 ( q6 );
        Question q7 = new Question ( " What is it called where child object gets killed if parent object is killed?", " Aggregation", " Composition", " Encapsulation", " Association", 2 );
        addQuestion3 ( q7 );
        Question q8 = new Question ( " What is it called where object has its own lifecycle and child object cannot belong to another parent object?", " Aggregation", " Composition", " Encapsulation", " Association", 1 );
        addQuestion3 ( q8 );
        Question q9 = new Question ( "  Which component is used to compile, debug and execute java program?", " JVM", " JDK", " JIT", " JRE", 2 );
        addQuestion3 ( q9 );
        Question q10 = new Question ( " Which component is responsible for converting bytecode into machine specific code?", " JVM", " JDK", " JIT", " JRE", 1 );
        addQuestion3 ( q10 );
    }
    private void fillQuestionsTable4() {

        //        Classes and Methods

        Question q1 = new Question ( " box obj; // What is the stored in the object obj in following lines of Java code?", "  Memory address of allocated memory of object", " NULL", " Any arbitrary pointer", " Garbage", 2 );
        addQuestion4 ( q1 );
        Question q2 = new Question ( " Which of these keywords is used to make a class?", " class", " struct", " int", " none ", 1 );
        addQuestion4 ( q2 );
        Question q3 = new Question ( " Which of the following is a valid declaration of an object of class Box?", " Box obj = new Box();", " Box obj = new Box;", " obj = new Box();", " new Box obj;", 1 );
        addQuestion4 ( q3 );
        Question q4 = new Question ( " What is the return type of a method that does not return any value?", " int", " float", " void", " double", 3 );
        addQuestion4 ( q4 );
        Question q5 = new Question ( " What is the process of defining more than one method in a class differentiated by method signature?", " Function overriding", " Function overloading", " Function doubling", " None ", 2 );
        addQuestion4 ( q5 );
        Question q6 = new Question ( " Which of the following is a method having same name as that of it’s class?", " finalize", " delete", " class", " constructor", 4 );
        addQuestion4 ( q6 );
        Question q7 = new Question ( " Which method can be defined only once in a program?", " main method", " finalize method", " static method", " private method", 1 );
        addQuestion4 ( q7 );
        Question q8 = new Question ( " Which of this statement is incorrect?", " All object of a class are allotted memory for the all the variables defined in the class", " If a function is defined public it can be accessed by object of other class by inheritation", " main() method must be made public", " All object of a class are allotted memory for the methods defined in the class", 4 );
        addQuestion4 ( q8 );
        Question q9 = new Question ( " What is the return type of Constructors?", " int", " float", " void", " None ", 4 );
        addQuestion4 ( q9 );
        Question q10 = new Question ( " Which keyword is used by the method to refer to the object that invoked it?", " import", " catch", " abstract", " this", 4 );
        addQuestion4 ( q10 );
        Question q11 = new Question ( " All the variables of class should be ideally declared as?", " private", " public", " protected", " default", 1 );
        addQuestion4 ( q11 );
        Question q12 = new Question ( " Which of the following modifier means a particular variable cannot be accessed within the package?", " private", " public", " protected", " default", 1 );
        addQuestion4 ( q12 );
        Question q13 = new Question ( " How can a protected modifier be accessed?", " accessible only within the class", " accessible only within package", " accessible within package and outside the package but through inheritance only", " accessible by all", 3 );
        addQuestion4 ( q13 );
        Question q14 = new Question ( " What happens if constructor of class A is made private?", " Any class can instantiate objects of class A", " Objects of class A can be instantiated only within the class where it is declared", " Inherited class can instantiate objects of class A", " classes within the same package as class A can instantiate objects of class A", 2 );
        addQuestion4 ( q14 );
        Question q15 = new Question ( " All the variables of interface should be?", " default and final", " default and static", " public, static and final", " protect, static and final", 3 );
        addQuestion4 ( q15 );
        Question q16 = new Question ( " What is true of final class?", "  Final class cause compilation failure", " Final class cannot be instantiated", " Final class cause runtime failure", " Final class cannot be inherited", 4 );
        addQuestion4 ( q16 );
        Question q17 = new Question ( " How many copies of static and class variables are created when 10 objects are created of a class?", "  1, 10", " 10, 10", " 10, 1", " 1,1", 1 );
        addQuestion4 ( q17 );
        Question q18 = new Question ( " Can a class be declared with a protected modifier.", " True", " False", " ", " ", 2 );
        addQuestion4 ( q18 );
        Question q19 = new Question ( " Which is the modifier when there is none mentioned explicitly?", " protected", " private", " public", " default", 4 );
        addQuestion4 ( q19 );
        Question q20 = new Question ( " Arrays in Java are implemented as?", " class", " object", " variable", " none ", 2 );
        addQuestion4 ( q20 );
    }
    private void fillQuestionsTable5() {

        //                Inheritance

        Question q1 = new Question ( " Which of this keyword can be used in a subclass to call the constructor of superclass?", " super", " this", " extent", " extends", 1 );
        addQuestion5 ( q1 );
        Question q2 = new Question ( " What is the process of defining a method in a subclass having same name & type signature as a method in its superclass?", " Method overloading", " Method overriding", " Method hiding", " None ", 2 );
        addQuestion5 ( q2 );
        Question q3 = new Question ( " Which of these keywords can be used to prevent Method overriding?", " static", " constant", " protected", " final", 4 );
        addQuestion5 ( q3 );
        Question q4 = new Question ( " Which of these is correct way of calling a constructor having no parameters, of superclass A by subclass B?", " super(void);", " superclass.();", " super.A();", "  super();", 4 );
        addQuestion5 ( q4 );
        Question q5 = new Question ( " Which of these is supported by method overriding in Java?", " Abstraction", " Encapsulation", " Polymorphism", " None ", 3 );
        addQuestion5 ( q5 );
        Question q6 = new Question ( " Which of these class is superclass of every class in Java?", " String class", " Object class", "  Abstract class", " ArrayList class", 2 );
        addQuestion5 ( q6 );
        Question q7 = new Question ( " Which of these method of Object class can clone an object?", " Objectcopy()", " copy()", " Object clone()", " clone()", 3 );
        addQuestion5 ( q7 );
        Question q8 = new Question ( " Which of these method of Object class is used to obtain class of an object at run time?", " get()", " void getclass()", "  Class getclass()", " None ", 3 );
        addQuestion5 ( q8 );
        Question q9 = new Question ( " Which of these keywords can be used to prevent inheritance of a class?", " super", " constant", " class", " final", 4 );
        addQuestion5 ( q9 );
        Question q10 = new Question ( " Which of these keywords cannot be used for a class which has been declared final?", " abstract", " extends", " abstract and extends", " none ", 1 );
        addQuestion5 ( q10 );
    }
    private void fillQuestionsTable6() {

        //        String Handling

        Question q1 = new Question ( " Which of these class is superclass of String and StringBuffer class?", " java.util", " java.lang", " ArrayList", " None ", 2 );
        addQuestion6 ( q1 );
        Question q2 = new Question ( " Which of these operators can be used to concatenate two or more String objects?", " +", "  +=", " &", " ||", 1 );
        addQuestion6 ( q2 );
        Question q3 = new Question ( " Which of this method of class String is used to obtain a length of String object?", " get()", " Sizeof()", " lengthof()", " length()", 4 );
        addQuestion6 ( q3 );
        Question q4 = new Question ( " Which of these constructors is used to create an empty String object?", " String()", " String(void)", " String(0)", " None ", 1 );
        addQuestion6 ( q4 );
        Question q5 = new Question ( " Which of these method of class String is used to extract more than one character at a time a String object?", " getchars()", " GetChars()", " Getchars()", " getChars()", 4 );
        addQuestion6 ( q5 );
        Question q6 = new Question ( " Which of these methods is an alternative to getChars() that stores the characters in an array of bytes?", " getBytes()", " GetByte()", " giveByte()", " Give Bytes()", 1 );
        addQuestion6 ( q6 );
        Question q7 = new Question ( " Which of these methods can be used to convert all characters in a String into a character array?", " charAt()", " both getChars() & charAt()", "  both toCharArray() & getChars()", " All ", 3 );
        addQuestion6 ( q7 );
        Question q8 = new Question ( " What is the value returned by function compareTo() if the invoking string is less than the string compared?", " zero", " value less than zero", " value greater than zero", " none ", 2 );
        addQuestion6 ( q8 );
        Question q9 = new Question ( " Which of these data type value is returned by equals() method of String class?", " char", " int", " boolean", " all ", 3 );
        addQuestion6 ( q9 );
        Question q10 = new Question ( "  Which of this method of class String is used to extract a substring from a String object?", " substring()", " Substring()", " SubString()", " None ", 1 );
        addQuestion6 ( q10 );
    }
    private void fillQuestionsTable7() {

        //        Exploring java.lang & java.io

        Question q1 = new Question ( " Which of these classes is not included in java.lang?", " Byte", " Integer", " Array", " Class", 3 );
        addQuestion7 ( q1 );
        Question q2 = new Question ( " Which of these is a process of converting a simple data type into a class?", " type wrapping", " type conversion", " type casting", " none ", 1 );
        addQuestion7 ( q2 );
        Question q3 = new Question ( " Which of these is a super class of wrappers Double & Integer?", " Long", " Digits", " Float", " Number", 4 );
        addQuestion7 ( q3 );
        Question q4 = new Question ( " Which of these is a wrapper for simple data type float?", " float", " double", " Float", " Double", 3 );
        addQuestion7 ( q4 );
        Question q5 = new Question ( " Which of the following is a method of wrapper Float for converting the value of an object into byte?", " bytevalue()", " byte byteValue()", " Bytevalue()", " Byte Bytevalue()", 2 );
        addQuestion7 ( q5 );
        Question q6 = new Question ( " Which of these methods is used to check for infinitely large and small values?", " isInfinite()", " isNaN()", " Isinfinite()", " IsNaN()", 1 );
        addQuestion7 ( q6 );
        Question q7 = new Question ( " Which of the following package stores all the simple data types in java?", " lang", " java", " util", " java.packages", 1 );
        addQuestion7 ( q7 );
        Question q8 = new Question ( " Which of these is a wrapper for data type int?", " Integer", " Long", " Byte", " Double", 1 );
        addQuestion7 ( q8 );
        Question q9 = new Question ( " Which of the following methods is a method of wrapper Integer for obtaining hash code for the invoking object?", "  int hash()", " int hashcode()", " int hashCode()", " Integer hashcode()", 3 );
        addQuestion7 ( q9 );
        Question q10 = new Question ( " Which of these is a super class of wrappers Long, Character & Integer?", " Long", " Digits", " Float", " Number", 4 );
        addQuestion7 ( q10 );
        Question q11 = new Question ( " Which of these classes is used for input and output operation when working with bytes?", " InputStream", " Reader", " Writer", " All ", 1 );
        addQuestion7 ( q11 );
        Question q12 = new Question ( " Which of these class is used to read and write bytes in a file?", " FileReader", " FileWriter", " FileInputStream", " InputStreamReader", 3 );
        addQuestion7 ( q12 );
        Question q13 = new Question ( "  Which of these method of InputStream is used to read integer representation of next available byte input?", " read()", " scanf()", " get()", " getInteger()", 1 );
        addQuestion7 ( q13 );
        Question q14 = new Question ( "  Which of these data type is returned by every method of OutputStream?", " int", " float", " byte", " none ", 4 );
        addQuestion7 ( q14 );
        Question q15 = new Question ( " Which of these is a method to clear all the data present in output buffers?", " clear()", " flush()", " fflush()", " close()", 2 );
        addQuestion7 ( q15 );
        Question q16 = new Question ( " Which of these method(s) is/are used for writing bytes to an outputstream?", " put()", " print() and write()", "  printf()", " write() and read()", 2 );
        addQuestion7 ( q16 );
        Question q17 = new Question ( " Which of these stream contains the classes which can work on character stream?", " InputStream", " OutputStream", " Character Stream", " All ", 3 );
        addQuestion7 ( q17 );
        Question q18 = new Question ( " Which of these class is used to read characters in a file?", " FileReader", " FileWriter", " FileInputStream", " InputStreamReader", 1 );
        addQuestion7 ( q18 );
        Question q19 = new Question ( " Which of these method of FileReader class is used to read characters from a file?", " read()", " scanf()", " get()", "  getInteger()", 1 );
        addQuestion7 ( q19 );
        Question q20 = new Question ( " Which of these class can be used to implement the input stream that uses a character array as the source?", " BufferedReader", " FileReader", " CharArrayReader", " FileArrayReader", 3 );
        addQuestion7 ( q20 );
    }
    private void fillQuestionsTable8() {

        //        Serialization & Networking

        Question q1 = new Question ( " Which of these is a process of writing the state of an object to a byte stream?", " Serialization", " Externalization", " File Filtering", " All ", 1 );
        addQuestion8 ( q1 );
        Question q2 = new Question ( " Which of these process occur automatically by the java runtime system?", " Serialization", " Garbage collection", " File Filtering", " All ", 1 );
        addQuestion8 ( q2 );
        Question q3 = new Question ( " Which of these is an interface for control over serialization and deserialization?", " Serializable", " Externalization", " FileFilter", " ObjectInput", 2 );
        addQuestion8 ( q3 );
        Question q4 = new Question ( "  Which of these interface extends DataOutput interface?", " Serializable", " Externalization", " ObjectOutput", " ObjectInput", 3 );
        addQuestion8 ( q4 );
        Question q5 = new Question ( " Which of these is a method of ObjectOutput interface used to finalize the output state so that any buffers are cleared?", " clear", " flush", " fflush", " close", 2 );
        addQuestion8 ( q5 );
        Question q6 = new Question ( " Which of these is method of ObjectOutput interface used to write the object to input or output stream as required?", " write()", " Write()", " StreamWrite()", " writeObject()", 4 );
        addQuestion8 ( q6 );
        Question q7 = new Question ( " How an object can become serializable?", " If a class implements java.io.Serializable class", " If a class or any superclass implements java.io.Serializable interface", " Any object is serializable", " No object is serializable", 2 );
        addQuestion8 ( q7 );
        Question q8 = new Question ( "  What is serialization?", " Turning object in memory into stream of bytes", " Turning stream of bytes into an object in memory", " Turning object in memory into stream of bits", " Turning stream of bits into an object in memory", 1 );
        addQuestion8 ( q8 );
        Question q9 = new Question ( " What is deserialization?", " Turning object in memory into stream of bytes", " Turning stream of bytes into an object in memory", " Turning object in memory into stream of bits", " Turning stream of bits into an object in memory", 2 );
        addQuestion8 ( q9 );
        Question q10 = new Question ( " How many methods Serializable has?", " 0", " 1", " 4", " 2", 1 );
        addQuestion8 ( q10 );
    }
    private void fillQuestionsTable9() {

        //        java.util – The Collections Framework

        Question q1 = new Question ( " Which of these standard collection classes implements a dynamic array?", " AbstractList", " LinkedList", " ArrayList", " AbstractSet", 3 );
        addQuestion9 ( q1 );
        Question q2 = new Question ( " Which of these class can generate an array which can increase and decrease in size automatically?", " ArrayList()", " DynamicList()", " LinkedList()", " MallocList()", 1 );
        addQuestion9 ( q2 );
        Question q3 = new Question ( " Which of these method can be used to increase the capacity of ArrayList object manually?", " Capacity()", " increaseCapacity()", " increasecapacity()", " ensureCapacity()", 4 );
        addQuestion9 ( q3 );
        Question q4 = new Question ( " Which of these method of ArrayList class is used to obtain present size of an object?", " size()", " length()", " index()", " capacity()", 1 );
        addQuestion9 ( q4 );
        Question q5 = new Question ( " Which of these methods can be used to obtain a static array from an ArrayList object?", " Array()", " covertArray()", " toArray()", " covertoArray()", 3 );
        addQuestion9 ( q5 );
        Question q6 = new Question ( " Which of these method is used to reduce the capacity of an ArrayList object?", " trim()", " trimSize()", " trimTosize()", "  trimToSize()", 4 );
        addQuestion9 ( q6 );
        Question q7 = new Question ( " Map implements collection interface?", " True", " False", "  ", "  ", 2 );
        addQuestion9 ( q7 );
        Question q8 = new Question ( " Which of the below does not implement Map interface?", " HashMap", " Hashtable", " EnumMap", " Vector", 4 );
        addQuestion9 ( q8 );
        Question q9 = new Question ( "  What is the premise of equality for IdentityHashMap?", " Reference equality", "  Name equality", " Hashcode equality", "  Length equality", 1 );
        addQuestion9 ( q9 );
        Question q10 = new Question ( " What happens if we put a key object in a HashMap which exists?", " The new object replaces the older object", "  The new object is discarded", " The old object is removed from the map", " It throws an exception as the key already exists in the map", 1 );
        addQuestion9 ( q10 );
    }
    private void fillQuestionsTable10() {

        //        Exception Handling

        Question q1 = new Question ( " When does Exceptions in Java arises in code sequence? ", "Run Time ", " Compilation Time", " Can Occur Any Time", "None  ", 1 );
        addQuestion10 ( q1 );
        Question q2 = new Question ( " Which of these keywords is not a part of exception handling? ", "try", " finally", " thrown", " catch", 3 );
        addQuestion10 ( q2 );
        Question q3 = new Question ( " Which of these keywords must be used to monitor for exceptions?", " try", "finally ", " throw", "catch ", 1 );
        addQuestion10 ( q3 );
        Question q4 = new Question ( " Which of these keywords must be used to handle the exception thrown by try block in some rational manner? ", " try", " finally", " throw", " catch", 4 );
        addQuestion10 ( q4 );
        Question q5 = new Question ( "  Which of these keywords is used to manually throw an exception? ", " try", "finally ", "throw ", " catch", 3 );
        addQuestion10 ( q5 );
        Question q6 = new Question ( " Which of the following keywords is used for throwing exception manually? ", " finally", "try ", "throw ", "catch ", 3 );
        addQuestion10 ( q6 );
        Question q7 = new Question ( " Which of the following classes can catch all exceptions which cannot be caught? ", " RuntimeException", " Error", "Exception ", " ParentException", 2 );
        addQuestion10 ( q7 );
        Question q8 = new Question ( " Which of the following is a super class of all exception type classes? ", "Catchable ", "RuntimeExceptions ", " String", "Throwable ", 4 );
        addQuestion10 ( q8 );
        Question q9 = new Question ( " Which of the following operators is used to generate instance of an exception which can be thrown using throw? ", " thrown", " alloc", " malloc", " new", 4 );
        addQuestion10 ( q9 );
        Question q10 = new Question ( " Which of the following keyword is used by calling function to handle exception thrown by called function? ", " throws", "throw ", "try ", "catch ", 1 );
        addQuestion10 ( q10 );
    }
    private void fillQuestionsTable11() {

        //        Multithreading

        Question q1 = new Question ( " Which of this method can be used to make the main thread to be executed last among all the threads? ", "stop() ", "sleep() ", "join() ", "call() ", 2 );
        addQuestion11 ( q1 );
        Question q2 = new Question ( " Which of this method is used to find out that a thread is still running or not?", " run()", " Alive()", " isAlive()", " checkRun()", 3 );
        addQuestion11 ( q2 );
        Question q3 = new Question ( " Which of these method waits for the thread to terminate?", " sleep()", " isAlive()", " join()", " stop()", 3 );
        addQuestion11 ( q3 );
        Question q4 = new Question ( " Which of these method is used to explicitly set the priority of a thread?", "  set()", " make()", " setPriority()", " makePriority()", 3 );
        addQuestion11 ( q4 );
        Question q5 = new Question ( " Which of these method is used to implement Runnable interface?", " stop()", " run()", " runThread()", " stopThread()", 2 );
        addQuestion11 ( q5 );
        Question q6 = new Question ( " Which of these method is used to begin the execution of a thread?", " run()", " start()", " runThread()", " startThread()", 2 );
        addQuestion11 ( q6 );
        Question q7 = new Question ( " Which of these method of Thread class is used to find out the priority given to a thread?", " get()", " ThreadPriority()", " getPriority()", " getThreadPriority()", 3 );
        addQuestion11 ( q7 );
        Question q8 = new Question ( " Which of these method of Thread class is used to Suspend a thread for a period of time?", " sleep()", " terminate()", " suspend()", " stop()", 1 );
        addQuestion11 ( q8 );
        Question q9 = new Question ( " Which function of pre defined class Thread is used to check weather current thread being checked is still running?", " isAlive()", " Join()", " isRunning()", " Alive()", 1 );
        addQuestion11 ( q9 );
        Question q10 = new Question ( " Which of these are types of multitasking?", " Process based", " Thread based", " Process and Thread based", " None ", 3 );
        addQuestion11 ( q10 );
    }
    private void fillQuestionsTable12() {

        //        I/O & Applets


        Question q1 = new Question ( " What does AWT stands for?", " All Window Tools", " All Writing Tools", " Abstract Window Toolkit", " Abstract Writing Toolkit", 3 );
        addQuestion12 ( q1 );
        Question q2 = new Question ( " Which of these is used to perform all input & output operations in Java?", " streams", " Variables", " classes", " Methods", 1 );
        addQuestion12 ( q2 );
        Question q3 = new Question ( " Which of these is a type of stream in Java?", " Integer stream", " Short stream", " Byte stream", " Long stream", 3 );
        addQuestion12 ( q3 );
        Question q4 = new Question ( " Which of these classes are used by Byte streams for input and output operation?", " InputStream", " InputOutputStream", " Reader", " All ", 1 );
        addQuestion12 ( q4 );
        Question q5 = new Question ( " Which of these classes are used by character streams for input and output operations?", " InputStream", " Writer", " ReadStream", " InputOutputStream", 2 );
        addQuestion12 ( q5 );
        Question q6 = new Question ( " Which of these class is used to read from byte array?", " InputStream", " BufferedInputStream", " ArrayInputStream", " ByteArrayInputStream", 4 );
        addQuestion12 ( q6 );
        Question q7 = new Question ( " Which exception is thrown by read() method?", " IOException", " InterruptedException", " SystemException", " SystemInputException", 1 );
        addQuestion12 ( q7 );
        Question q8 = new Question ( " Which of these is used to read a string from the input stream?", " get()", " getLine()", " read()", " readLine()",3 );
        addQuestion12 ( q8 );
        Question q9 = new Question ( " Which of these class is used to read characters and strings in Java from console?", " BufferedReader", " StringReader", " BufferedStreamReader", " InputStreamReader", 1 );
        addQuestion12 ( q9 );
        Question q10 = new Question ( " Which of these class is implemented by FilterInputStream class?", " InputStream", " InputOutputStream", " BufferedInputStream", " SequenceInputStream", 1 );
        addQuestion12 ( q10 );
    }
    private void fillQuestionsTable13() {

        //        Event Handling
        Question q1 = new Question ( " Which of these packages contains all the classes and methods required for even handling in Java?", " java.applet", " ava.awt.event", "  java.awt", " java.event", 2 );
        addQuestion13 ( q1 );
        Question q2 = new Question ( " Which of these methods are used to register a keyboard event listener?", " KeyListener()", " addKistener()", " addKeyListener()", " eventKeyboardListener()", 3 );
        addQuestion13 ( q2 );
        Question q3 = new Question ( " Which of these methods are used to register a mouse motion listener?", " addMouse()", " addMouseListener()", " addMouseMotionListner()", " eventMouseMotionListener()", 3 );
        addQuestion13 ( q3 );
        Question q4 = new Question ( " Event class is defined in which of these libraries?", " java.io", " java.lang", " java.net", " java.util", 4 );
        addQuestion13 ( q4 );
        Question q5 = new Question ( " Which of these methods can be used to determine the type of event?", " getID()", " getSource()", " getEvent()", " getEventObject()", 1 );
        addQuestion13 ( q5 );
        Question q6 = new Question ( " Which of these class is super class of all the events?", " EventObject", " EventClass", " ActionEvent", " ItemEvent", 1 );
        addQuestion13 ( q6 );
        Question q7 = new Question ( " Which of these events will be notified if scroll bar is manipulated?", " ActionEvent", " ComponentEvent", " AdjustmentEvent", " WindowEvent", 3 );
        addQuestion13 ( q7 );
        Question q8 = new Question ( " Which of these events will be generated if we close an applet’s window?", " ActionEvent", " ComponentEvent", " AdjustmentEvent", " WindowEvent", 4 );
        addQuestion13 ( q8 );
        Question q9 = new Question ( " Which of these events is generated when a button is pressed?", " ActionEvent", " KeyEvent", " WindowEvent", " AdjustmentEvent", 1 );
        addQuestion13 ( q9 );
        Question q10 = new Question ( " Which of these methods can be used to obtain the command name for invoking ActionEvent object?", " getCommand()", " getActionCommand()", " getActionEvent()", " getActionEventCommand()", 2 );
        addQuestion13 ( q10 );
    }
    private void fillQuestionsTable14() {
        // Data Types, Variables and Arrays
        Question q1 = new Question ( " What is the order of variables in Enum?", " Ascending order", " Descending orde", " Random order", " Depends on the order() method", 1 );
        addQuestion14 ( q1 );
        Question q2 = new Question ( " Can we create an instance of Enum outside of Enum itself?", " Yes", " No", " none", " Programmer choice", 2 );
        addQuestion14 ( q2 );
        Question q3 = new Question ( "  If we try to add Enum constants to a TreeSet, what sorting order will it use?", " Sorted in the order of declaration of Enums", " Sorted in alphabetical order of Enums", " Sorted based on order() method", " Sorted in descending order of names of Enums", 1 );
        addQuestion14 ( q3 );
        Question q4 = new Question ( " Which method returns the elements of Enum class?", " getEnums()", " getEnumConstants()", " getEnumList()", " getEnum()", 2 );
        addQuestion14 ( q4 );
        Question q5 = new Question ( " Which class does all the Enums extend?", " Object", " Enums", " Enum", " EnumClass", 3 );
        addQuestion14 ( q5 );
        Question q6 = new Question ( " Are enums are type-safe?", " True", " False", " Depend on Modifier", " None", 1 );
        addQuestion14 ( q6 );
        Question q7 = new Question ( " Which of the following is the advantage of BigDecimal over double?", " Syntax", " Memory usage", "  Garbage creation", " Precision", 4 );
        addQuestion14 ( q7 );
        Question q8 = new Question ( " Which of the below data type doesn’t support overloaded methods for +,-,* and /?", " int", " float", " double", " BigDecimal", 4 );
        addQuestion14 ( q8 );
        Question q9 = new Question ( " What is the base of BigDecimal data type?", " Base 2", " Base 8", " Base 10", " Base e", 3 );
        addQuestion14 ( q9 );
        Question q10 = new Question ( " Which one is a valid declaration of a boolean?", " boolean b1 = 1;", " boolean b2 = ‘false’;", " boolean b3 = false;", " boolean b4 = ‘true’", 3 );
        addQuestion14 ( q10 );
    }
    private void fillQuestionsTable15() {
        //Operators and Control Statements
        Question q1 = new Question ( " Which of these operators can skip evaluating right hand operand?", " !", " |", " &", " &&", 4 );
        addQuestion15 ( q1 );
        Question q2 = new Question ( " Which of these have highest precedence?", " ()", " ++", " *", " >>", 1 );
        addQuestion15 ( q2 );
        Question q3 = new Question ( " Which of these selection statements test only for equality?", " if", " switch", " if & switch", " none ", 2 );
        addQuestion15 ( q3 );
        Question q4 = new Question ( " Which of these are selection statements in Java?", " if", " for", " continue", " break", 1 );
        addQuestion15 ( q4 );
        Question q5 = new Question ( " Which of the following loops will execute the body of loop even when condition controlling the loop is initially false?", " do-while", " while", " for", " None", 1 );
        addQuestion15 ( q5 );
        Question q6 = new Question ( " Which of these jump statements can skip processing the remainder of the code in its body for a particular iteration?", " break", " return", " exit", " continue", 4 );
        addQuestion15 ( q6 );
        Question q7 = new Question ( " Which of this statement is incorrect?", " switch statement is more efficient than a set of nested ifs", " two case constants in the same switch can have identical values", " switch statement can only test for equality, whereas if statement can evaluate any type of boolean expression", " it is possible to create a nested switch statements", 2 );
        addQuestion15 ( q7 );
        Question q8 = new Question ( " Which of the following is used with the switch statement?", " Continue", " Exit", " break", " do", 3 );
        addQuestion15 ( q8 );
        Question q9 = new Question ( " Which of the following is not a decision making statement?", " if", " if-else", " switch", " do-while", 4 );
        addQuestion15 ( q9 );
        Question q10 = new Question ( " Which of the following is not a valid jump statement?", " break", " goto", " continue", " return", 2 );
        addQuestion15 ( q10 );
    }
    private void fillQuestionsTable16() {
        // Java Environment & OOPS Concepts
        Question q1 = new Question ( "  Which component is responsible to run java program?", " JVM", " JDK", " JIT", " JRE", 4 );
        addQuestion16 ( q1 );
        Question q2 = new Question ( " Which component is responsible to optimize bytecode to machine code?", " JVM", " JDK", " JIT", " JRE", 3 );
        addQuestion16 ( q2 );
        Question q3 = new Question ( "  Which statement is true about java?", " Platform independent programming language", " Platform dependent programming language", " Code dependent programming language", " Sequence dependent programming language", 1 );
        addQuestion16 ( q3 );
        Question q4 = new Question ( "  Which of the below is invalid identifier with the main method?", " public", " static", " private", " final", 3 );
        addQuestion16 ( q4 );
        Question q5 = new Question ( " What is the extension of java code files?", " .class", " .java", " .txt", " .js", 2 );
        addQuestion16 ( q5 );
        Question q6 = new Question ( " What is the extension of compiled java classes?"," .class", " .java", " .txt", " .js", 1 );
        addQuestion16 ( q6 );
        Question q7 = new Question ( "  How can we identify whether a compilation unit is class or interface from a .class file?", " Java source file header", " Extension of compilation unit", " We cannot differentiate between class and interface", " The class or interface name should be postfixed with unit type", 1 );
        addQuestion16 ( q7 );
        Question q8 = new Question ( " What is use of interpreter?", " They convert bytecode to machine language code", " They read high level code and execute them", " They are intermediated between JIT and JVM", " It is a synonym for JIT", 2 );
        addQuestion16 ( q8 );
        Question q9 = new Question ( "  Which component is used to compile, debug and execute java program?", " JVM", " JDK", " JIT", " JRE", 2 );
        addQuestion16 ( q9 );
        Question q10 = new Question ( " Which component is responsible for converting bytecode into machine specific code?", " JVM", " JDK", " JIT", " JRE", 1 );
        addQuestion16 ( q10 );
    }
    private void fillQuestionsTable17() {
        //Classes and Methods
        Question q1 = new Question ( " Which of the following is a method having same name as that of its class?", " finalize", " delete", " class", " constructor", 4 );
        addQuestion17 ( q1 );
        Question q2 = new Question ( " Which operator is used by Java run time implementations to free the memory of an object when it is no longer needed?", " delete", " free", " new", " none ", 4 );
        addQuestion17 ( q2 );
        Question q3 = new Question ( " Which function is used to perform some action when the object is to be destroyed?", " finalize()", " delete()", " main()", " none ", 1 );
        addQuestion17 ( q3 );
        Question q4 = new Question ( " Which of the following statements are incorrect?", " default constructor is called at the time of object declaration", " constructor can be parameterized", " finalize() method is called when a object goes out of scope and is no longer needed", " finalize() method must be declared protected", 3 );
        addQuestion17 ( q4 );
        Question q5 = new Question ( " What is true about private constructor?", " Private constructor ensures only one instance of a class exist at any point of time", " Private constructor ensures multiple instances of a class exist at any point of time", " Private constructor eases the instantiation of a class", " Private constructor allows creating objects in other classes", 1 );
        addQuestion17 ( q5 );
        Question q6 = new Question ( " What would be the behaviour if this() and super() used in a method?", " Runtime error", "  Throws exception", " compile time error", " Runs successfully", 3 );
        addQuestion17 ( q6 );
        Question q7 = new Question ( "  What is false about constructor?", " Constructors cannot be synchronized in Java", " Java does not provide default copy constructor", " Constructor can have a return type", " “this” and “super” can be used in a constructor", 3 );
        addQuestion17 ( q7 );
        Question q8 = new Question ( " What is true about Class.getInstance()?", " Class.getInstance calls the constructor", " Class.getInstance is same as new operator", " Class.getInstance needs to have matching constructor", " Class.getInstance creates object if class does not have any constructor", 4 );
        addQuestion17 ( q8 );
        Question q9 = new Question ( " What is true about constructor?", " It can contain return type", " It can take any number of parameters", " It can have any non access modifiers", " Constructor cannot throw an exception", 2 );
        addQuestion17 ( q9 );
        Question q10 = new Question ( " Abstract class cannot have a constructor.", " True", " False", " ", " ", 2 );
        addQuestion17 ( q10 );
        Question q11 = new Question ( " Which of these keywords is used to prevent content of a variable from being modified?", " final", " last", " constant", " static", 1 );
        addQuestion17 ( q11 );
        Question q12 = new Question ( " Which of these cannot be declared static?", " class", " object", " variable", " method", 2 );
        addQuestion17 ( q12 );
        Question q13 = new Question ( " Which of these methods must be made static?", " main()", " delete()", " run()", " finalize()", 1 );
        addQuestion17 ( q13 );
        Question q14 = new Question ( " String in Java is a?", " class", " object", " variable", " character array", 1 );
        addQuestion17 ( q14 );
        Question q15 = new Question ( " Which of these method of String class is used to obtain character at specified index?", " char()", " Charat()", " charat()", " charAt()", 4 );
        addQuestion17 ( q15 );
        Question q16 = new Question ( " Which of these keywords is used to refer to member of base class from a subclass?", " upper", " super", " this", " none ", 2 );
        addQuestion17 ( q16 );
        Question q17 = new Question ( " Which of these method of String class can be used to test to strings for equality?", " isequal()", " isequals()", " equal()", " equals()", 4 );
        addQuestion17 ( q17 );
        Question q18 = new Question ( " Which of the following statements are incorrect?", " String is a class", " Strings in java are mutable", " Every string is an object of class String", " Java defines a peer class of String, called StringBuffer, which allows string to be altered", 2 );
        addQuestion17 ( q18 );
        Question q19 = new Question ( " Which of these is the method which is executed first before execution of any other thing takes place in a program?", " main method", " finalize method", " static method", " private method", 3 );
        addQuestion17 ( q19 );
        Question q20 = new Question ( " What is the process of defining more than one method in a class differentiated by parameters?", " Function overriding", " Function overloading", " Function doubling", " None ", 2 );
        addQuestion17 ( q20 );
    }
    private void fillQuestionsTable18() {
        //Inheritance
        Question q1 = new Question ( " Which of these class relies upon its subclasses for complete implementation of its methods?", " Object class", " abstract class", "  ArrayList class", " None ", 2 );
        addQuestion18 ( q1 );
        Question q2 = new Question ( " Which of these keywords are used to define an abstract class?", " abst", " abstract", " Abstract", " abstract class", 2 );
        addQuestion18 ( q2 );
        Question q3 = new Question ( " Which of these is not abstract?", " Thread", " AbstractList", " List", " None ", 1 );
        addQuestion18 ( q3 );
        Question q4 = new Question ( " If a class inheriting an abstract class does not define all of its function then it will be known as?", " Abstract", " A simple class", " Static class", " None ", 1 );
        addQuestion18 ( q4 );
        Question q5 = new Question ( " Which of this keyword must be used to inherit a class?", " super", " this", " extent", " extends", 4 );
        addQuestion18 ( q5 );
        Question q6 = new Question ( " A class member declared protected becomes a member of subclass of which type?", " public member", "  private member", "  protected member", " static member", 2 );
        addQuestion18 ( q6 );
        Question q7 = new Question ( " Which of these is correct way of inheriting class A by class B?", " class B + class A {}", " class B inherits class A {}", " class B extends A {}", " class B extends class A {}", 3 );
        addQuestion18 ( q7 );
        Question q8 = new Question ( " What is not type of inheritance?", " Single inheritance", "  Double inheritance", " Hierarchical inheritance", " Multiple inheritance", 2 );
        addQuestion18 ( q8 );
        Question q9 = new Question ( " Using which of the following, multiple inheritance in Java can be implemented?", " Interfaces", " Multithreading", " Protected methods", " Private methods", 1 );
        addQuestion18 ( q9 );
        Question q10 = new Question ( " All classes in Java are inherited from which class?", " java.lang.class", "  java.class.inherited", " java.class.object", "  java.lang.Object", 4 );
        addQuestion18 ( q10 );
    }
    private void fillQuestionsTable19() {
        //String Handling
        Question q1 = new Question ( " Which of these method of class String is used to remove leading and trailing whitespaces?", "  startsWith()", " trim()", " Trim()", " doTrim()", 2 );
        addQuestion19 ( q1 );
        Question q2 = new Question ( " Which of these class is used to create an object whose character sequence is mutable?", " String()", " StringBuffer()", " String() & StringBuffer()", " None ", 2 );
        addQuestion19 ( q2 );
        Question q3 = new Question ( " Which of this method of class StringBuffer is used to concatenate the string representation to the end of invoking string?", " concat()", " append()", "  join()", " concatenate()", 2 );
        addQuestion19 ( q3 );
        Question q4 = new Question ( " Which of these method of class StringBuffer is used to find the length of current character sequence?", " length()", "  Length()", " capacity()", " Capacity()", 1 );
        addQuestion19 ( q4 );
        Question q6 = new Question ( " Which of these methods is an alternative to getChars() that stores the characters in an array of bytes?", " getBytes()", " GetByte()", " giveByte()", " Give Bytes()", 1 );
        addQuestion19 ( q6 );
        Question q7 = new Question ( " Which of these methods can be used to convert all characters in a String into a character array?", " charAt()", " both getChars() & charAt()", "  both toCharArray() & getChars()", " All ", 3 );
        addQuestion19 ( q7 );
        Question q8 = new Question ( " What is the value returned by function compareTo() if the invoking string is less than the string compared?", " zero", " value less than zero", " value greater than zero", " none ", 2 );
        addQuestion19 ( q8 );
        Question q9 = new Question ( " Which of these data type value is returned by equals() method of String class?", " char", " int", " boolean", " all ", 3 );
        addQuestion19 ( q9 );
        Question q10 = new Question ( "  Which of this method of class String is used to extract a substring from a String object?", " substring()", " Substring()", " SubString()", " None ", 1 );
        addQuestion19 ( q10 );
    }
    private void fillQuestionsTable20() {
        // Exploring java.lang & java.io
        Question q1 = new Question ( " Which of these is a wrapper for simple data type char?", " Float", " Character", " String", " Integer", 2 );
        addQuestion20 ( q1 );
        Question q2 = new Question ( " Which of the following is method of wrapper Integer for converting the value of an object into int?", " bytevalue()", "  int intValue();", " Bytevalue()", " Byte Bytevalue()", 2 );
        addQuestion20 ( q2 );
        Question q3 = new Question ( " Which of these methods is used to obtain value of invoking object as a long?", " long value()", " long longValue()", " Long longvalue()", "  Long Longvalue()", 2 );
        addQuestion20 ( q3 );
        Question q4 = new Question ( " Which of these class have only one field ‘TYPE’?", " Void", " Process", " System", " Runtime", 1 );
        addQuestion20 ( q4 );
        Question q5 = new Question ( " Which of the following method of Process class can terminate a process?", " void kill()", " void destroy()", " void terminate()", " void exit()", 2 );
        addQuestion20 ( q5 );
        Question q6 = new Question ( " Standard output variable ‘out’ is defined in which class?", " Void", " Process", " Runtime", " System", 4 );
        addQuestion20 ( q6 );
        Question q7 = new Question ( " Which of these class can encapsulate an entire executing program?", " Void", " Process", " Runtime", " System", 2 );
        addQuestion20 ( q7 );
        Question q8 = new Question ( " Which of the following is method of System class is used to find how long a program takes to execute?", " currenttime()", " currentTime()", " currentTimeMillis()", " currenttimeMillis()", 3 );
        addQuestion20 ( q8 );
        Question q9 = new Question ( "  Which of these class holds a collection of static methods and variables?", " Void", " Process", " Runtime", " System", 4 );
        addQuestion20 ( q9 );
        Question q10 = new Question ( " Which of these class is a superclass of all other classes?", " Math", " Process", " System", " Object", 4 );
        addQuestion20 ( q10 );
        Question q11 = new Question ( "  Which of these classes can return more than one character to be returned to input stream", " BufferedReader", " Bufferedwriter", " PushbachReader", " CharArrayReader", 3 );
        addQuestion20 ( q11 );
        Question q12 = new Question ( " Which of the following is not a segment of memory in java?", " Stack Segment", " Heap Segment", " Code Segment", " Register Segment", 4 );
        addQuestion20 ( q12 );
        Question q13 = new Question ( " What is JVM?", " Bootstrap", " Interpreter", " Extension", " Compiler", 2 );
        addQuestion20 ( q13 );
        Question q14 = new Question ( "  Which one of the following is a class loader?", " Bootstrap", " Compiler", " Heap", " Interpreter", 1 );
        addQuestion20 ( q14 );
        Question q15 = new Question ( " Which class loader loads jar files from JDK directory?", " Bootstrap", " Extension", " System", " Heap", 2 );
        addQuestion20 ( q15 );
        Question q16 = new Question ( " Which of the following is not a memory classification in java?", " Young", " Old", " Permanent", " Temporary", 4 );
        addQuestion20 ( q16 );
        Question q17 = new Question ( " What is the Java 8 update of PermGen?", " Code Cache", " Tenured Space", " Metaspace", " Eden space", 3 );
        addQuestion20 ( q17 );
        Question q18 = new Question ( " Classes and Methods are stored in which space?", " Eden space", " Survivor space", " Tenured space", " Permanent space", 4 );
        addQuestion20 ( q18 );
        Question q19 = new Question ( " Where is String Pool stored?", "  Java Stack", "  Java Heap", " Permanent Generation", " Metaspace", 2 );
        addQuestion20 ( q19 );
        Question q20 = new Question ( " The same import package/class be called twice in java?", " True", " False", " ", " ", 1 );
        addQuestion20 ( q20 );
        Question q21 = new Question ( " Which of these exceptions handles the situations when an illegal argument is used to invoke a method?", " IllegalException", " Argument Exception", " IllegalArgumentException", " IllegalMethodArgumentExcepetion", 3 );
        addQuestion20 ( q21 );
    }
    private void fillQuestionsTable21() {

        //Serialization & Networking
        Question q1 = new Question ( " What type of members are not serialized?", " Private", " Protected", " Static", " Throwable", 3 );
        addQuestion21 ( q1 );
        Question q2 = new Question ( " If member does not implement serialization, which exception would be thrown?", " RuntimeException", " SerializableException", " NotSerializableException", " UnSerializedException", 3 );
        addQuestion21 ( q2 );
        Question q3 = new Question ( " Default Serialization process cannot be overridden.", " True", " False", " ", " ", 2 );
        addQuestion21 ( q3 );
        Question q4 = new Question ( " Which of the following methods is used to avoid serialization of new class whose super class already implements Serialization?", " writeObject()", " readWriteObject()", " writeReadObject()", " unSerializaedObject()", 1 );
        addQuestion21 ( q4 );
        Question q5 = new Question ( " Which of the following methods is not used while Serialization and DeSerialization?", " readObject()", " readExternal()", " readWriteObject()", " writeObject()", 3 );
        addQuestion21 ( q5 );
        Question q6 = new Question ( " Serializaed object can be transferred via network.", " True", " False", " ", " ", 1 );
        addQuestion21 ( q6 );
        Question q7 = new Question ( " Which of these is a process of extracting/removing the state of an object from a stream?", " Serialization", " Externalization", " File Filtering", " Deserialization", 4 );
        addQuestion21 ( q7 );
        Question q8 = new Question ( " Which of these process occur automatically by java run time system?", " Serialization", " Memory allocation", " Deserialization", " All ", 4 );
        addQuestion21 ( q8 );
        Question q9 = new Question ( " Which of these interface extends DataInput interface?", " Serializable", " Externalization", " ObjectOutput", " ObjectInput", 4 );
        addQuestion21 ( q9 );
        Question q10 = new Question ( " Which of these is a method of ObjectInput interface used to deserialize an object from a stream?", " int read()", " void close()", " Object readObject()", " Object WriteObject()", 3 );
        addQuestion21 ( q10 );
    }
    private void fillQuestionsTable22() {
        //java.util – The Collections Framework
        Question q1 = new Question ( " While finding the correct location for saving key value pair, how many times the key is hashed?", " 1", " 2", " 3", " unlimited till bucket is found", 2 );
        addQuestion22 ( q1 );
        Question q2 = new Question ( "  Is hashmap an ordered collection.", " True", " False", "  ", " ", 2 );
        addQuestion22 ( q2 );
        Question q3 = new Question ( " If two threads access the same hashmap at the same time, what would happen?", " ConcurrentModificationException", " NullPointerException", " ClassNotFoundException", " RuntimeException", 1 );
        addQuestion22 ( q3 );
        Question q4 = new Question ( " If large number of items are stored in hash bucket, what happens to the internal structure?", " The bucket will switch from LinkedList to BalancedTree", " The bucket will increase its size by a factor of load size defined", " The LinkedList will be replaced by another hashmap", " Any further addition throws Overflow exception", 1 );
        addQuestion22 ( q4 );
        Question q5 = new Question ( " How can we remove an object from ArrayList?", " remove() method", " using Iterator", " remove() method and using Iterator", " delete() method", 3 );
        addQuestion22 ( q5 );
        Question q6 = new Question ( " How to remove duplicates from List?", " HashSet<String> listToSet = new HashSet<String>(duplicateList);", " HashSet<String> listToSet = duplicateList.toSet();", " HashSet<String> listToSet = Collections.convertToSet(duplicateList);", " HashSet<String> listToSet = duplicateList.getSet();", 1 );
        addQuestion22 ( q6 );
        Question q7 = new Question ( " How to sort elements of ArrayList?", " Collection.sort(listObj);", " Collections.sort(listObj);", " listObj.sort();", " Sorter.sortAsc(listObj);", 2 );
        addQuestion22 ( q7 );
        Question q8 = new Question ( " Which class provides thread safe implementation of List?", " ArrayList", " CopyOnWriteArrayList", " HashList", " List", 2 );
        addQuestion22 ( q8 );
        Question q9 = new Question ( " Which of the below is not an implementation of List interface?", " RoleUnresolvedList", " Stack", " AttibuteList", " SessionList", 4 );
        addQuestion22 ( q9 );
        Question q10 = new Question ( " What is the worst case complexity of accessing an element in ArrayList?", " O(n)", " O(1)", " O(nlogn)", " O(2)", 2 );
        addQuestion22 ( q10 );
    }
    private void fillQuestionsTable23() {
        //Exception Handling
        Question q1 = new Question ( " Which of the following handles the exception when a catch is not used? ", "finally ", " throw handler", "default handler ", " java run time system", 3 );
        addQuestion23 ( q1 );
        Question q2 = new Question ( " Which part of code gets executed whether exception is caught or not? ", "finally ", " try", " catch", "throw ", 1 );
        addQuestion23 ( q2 );
        Question q3 = new Question ( " Which of the following should be true of the object thrown by a thrown statement? ", " Should be assignable to String type", "  Should be assignable to Exception type", " Should be assignable to Throwable type", "Should be assignable to Error type ", 3 );
        addQuestion23 ( q3 );
        Question q4 = new Question ( " Which of these is a super class of all exceptional type classes? ", " String", " RuntimeExceptions", " Throwable", " Cacheable", 3 );
        addQuestion23 ( q4 );
        Question q5 = new Question ( " Which of these class is related to all the exceptions that can be caught by using catch? ", " Error", " Exception", "RuntimeExecption ", " All ", 2 );
        addQuestion23 ( q5 );
        Question q6 = new Question ( " Which of these class is related to all the exceptions that cannot be caught? ", "Error ", "Exception ", "RuntimeExecption ", "All  ", 1 );
        addQuestion23 ( q6 );
        Question q7 = new Question ( " Which of these handles the exception when no catch is used? ", "Default handler ", "finally ", " throw handler", "  Java run time system", 1 );
        addQuestion23 ( q7 );
        Question q8 = new Question ( " What exception thrown by parseInt() method? ", "ArithmeticException ", " ClassNotFoundException", " NullPointerException", " NumberFormatException", 4 );
        addQuestion23 ( q8 );
        Question q9 = new Question ( " Which of these keywords is used to generate an exception explicitly? ", " try", "finally ", "throw ", "catch ", 3 );
        addQuestion23 ( q9 );
        Question q10 = new Question ( " Which of these class is related to all the exceptions that are explicitly thrown? ", " Error", "Exception ", "Throwable ", " Throw", 3 );
        addQuestion23 ( q10 );
    }
    private void fillQuestionsTable24() {
        //Multithreading
        Question q1 = new Question ( " Thread priority in Java is?", " Integer", " Float", " double", " long", 1 );
        addQuestion24 ( q1 );
        Question q2 = new Question ( " What requires less resources?", " Thread", " Process", " Thread and Process", " Neither Thread nor Process", 1 );
        addQuestion24 ( q2 );
        Question q3 = new Question ( " What does not prevent JVM from terminating?", " Process", " Daemon Thread", " User Thread", "  JVM Thread", 2 );
        addQuestion24 ( q3 );
        Question q4 = new Question ( " What decides thread priority?", " Process", " Process scheduler", " Thread", " Thread scheduler", 4 );
        addQuestion24 ( q4 );
        Question q5 = new Question ( " What should not be done to avoid deadlock?", " Avoid using multiple threads", "  Avoid hold several locks at once", " Execute foreign code while holding a lock", " Use interruptible locks", 3 );
        addQuestion24 ( q5 );
        Question q6 = new Question ( " Which of the following is a correct constructor for thread?", " Thread(Runnable a, String str)", " Thread(int priority)", " Thread(Runnable a, int priority)", " Thread(Runnable a, ThreadGroup t)", 1 );
        addQuestion24 ( q6 );
        Question q7 = new Question ( " Which of the following will ensure the thread will be in running state?", " yield()", " notify()", " wait()", " Thread.killThread()", 3 );
        addQuestion24 ( q7 );
        Question q8 = new Question ( " Which of these keywords are used to implement synchronization?", " synchronize", " syn", " synch", " synchronized", 4 );
        addQuestion24 ( q8 );
        Question q9 = new Question ( " Which of this method is used to avoid polling in Java?", " wait()", " notify()", " notifyAll()", " All ", 4 );
        addQuestion24 ( q9 );
        Question q10 = new Question ( " Which of these method wakes up the first thread that called wait()?", " wake()", " notify()", " start()", " notifyAll()", 2 );
        addQuestion24 ( q10 );
    }
    private void fillQuestionsTable25() {
        // I/O & Applets
        Question q1 = new Question ( " Which of these class contains the methods print() & println()?", " System", " System.out", " BUfferedOutputStream", " PrintStream", 4 );
        addQuestion25 ( q1 );
        Question q2 = new Question ( " Which of these methods can be used to writing console output?", " print()", " println()", " write()", " all ", 4 );
        addQuestion25 ( q2 );
        Question q3 = new Question ( "  Which of these classes are used by character streams output operations?", " InputStream", " Writer", " ReadStream", " InputOutputStream", 2 );
        addQuestion25 ( q3 );
        Question q4 = new Question ( " Which of these class is used to read from a file?", " InputStream", " BufferedInputStream", " FileInputStream", " BufferedFileInputStream", 3 );
        addQuestion25 ( q4 );
        Question q5 = new Question ( " Which of these class contains the methods used to write in a file?", " FileStream", " FileInputStream", " BUfferedOutputStream", " FileBufferStream", 2 );
        addQuestion25 ( q5 );
        Question q6 = new Question ( " Which of these exception is thrown in cases when the file specified for writing is not found?", " option ", " option ", " option ", " option ", 1 );
        addQuestion25 ( q6 );
        Question q7 = new Question ( " Which of these exception is thrown in cases when the file specified for writing is not found?", " IOException", " FileException", " FileNotFoundException", " FileInputException", 3 );
        addQuestion25 ( q7 );
        Question q8 = new Question ( " Which of these methods are used to read in from file?", " get()", " read()", " scan()", " readFileInput()", 2 );
        addQuestion25 ( q8 );
        Question q9 = new Question ( " Which of these values is returned by read() method is end of file (EOF) is encountered?", " 0", " 1", " -1", " Null", 3 );
        addQuestion25 ( q9 );
        Question q10 = new Question ( " Which of these exception is thrown by close() and read() methods?", " IOException", " FileException", " FileNotFoundException", " FileInputOutputException", 1 );
        addQuestion25 ( q10 );
    }
    private void fillQuestionsTable26() {
        // Event Handling
        Question q1 = new Question ( " Which of these methods can be used to know which key is pressed?", " getKey()", " getModifier()", " getActionKey()", " getActionEvent()", 2 );
        addQuestion26 ( q1 );
        Question q2 = new Question ( " Which of these events is generated by scroll bar?", " ActionEvent", " KeyEvent", " WindowEvent", " AdjustmentEvent", 4 );
        addQuestion26 ( q2 );
        Question q3 = new Question ( " Which of these methods can be used to determine the type of adjustment event?", " getType()", " getEventType()", " getAdjustmentType()", " getEventObjectType()", 3 );
        addQuestion26 ( q3 );
        Question q4 = new Question ( " Which of these methods can be used to know the degree of adjustment made by the user?", " getValue()", " getAdjustmentType()", " getAdjustmentValue()", " getAdjustmentAmount()", 1 );
        addQuestion26 ( q4 );
        Question q5 = new Question ( " Which of these constant value will change when the button at the end of scroll bar was clicked to increase its value?", " BLOCK_DECREMENT", " BLOCK_INCREMENT", " UNIT_DECREMENT", " UNIT_INCREMENT", 4 );
        addQuestion26 ( q5 );
        Question q6 = new Question ( " Which of these events is generated when the size of an event is changed?", " ComponentEvent", " ContainerEvent", " FocusEvent", " InputEvent", 1 );
        addQuestion26 ( q6 );
        Question q7 = new Question ( "  Which of these events is generated when the component is added or removed?", " ComponentEvent", " ContainerEvent", " FocusEvent", " InputEvent", 2 );
        addQuestion26 ( q7 );
        Question q8 = new Question ( " Which of these methods can be used to obtain the reference to the container that generated a ContainerEvent?", " getContainer()", " getContainerCommand()", " getActionEvent()", " getContainerEvent()", 4 );
        addQuestion26 ( q8 );
        Question q9 = new Question ( " Which of these methods can be used to get reference to a component that was removed from a container?", " getComponent()", " getchild()", " getContainerComponent()", " getComponentChild()", 2 );
        addQuestion26 ( q9 );
        Question q10 = new Question ( "  Which of these are integer constants of ComponentEvent class?", " COMPONENT_HIDDEN", " COMPONENT_MOVED", " COMPONENT_RESIZE", " All ", 4 );
        addQuestion26 ( q10 );

    }
    private void fillQuestionsTable27() {

        // Data Types, Variables and Arrays
        Question q1 = new Question ( " What is the limitation of toString() method of BigDecimal?", " There is no limitation", " toString returns null", " toString returns the number in expanded form", " toString uses scientific notation", 4 );
        addQuestion27 ( q1 );
        Question q2 = new Question ( " Which of the following is not provided by BigDecimal?", " scale manipulation", " + operator", " rounding", " hashing", 2 );
        addQuestion27 ( q2 );
        Question q3 = new Question ( " BigDecimal is a part of which package?", " java.lang", " java.math", " java.util", "  java.io", 2 );
        addQuestion27 ( q3 );
        Question q4 = new Question ( " What is BigDecimal.ONE?", " wrong statement", " custom defined statement", " static variable with value 1 on scale 10", " static variable with value 1 on scale 0", 4 );
        addQuestion27 ( q4 );
        Question q5 = new Question ( " Which class is a library of functions to perform arithmetic operations of BigInteger and BigDecimal?", " MathContext", " MathLib", " BigLib", " BigContext", 1 );
        addQuestion27 ( q5 );
        Question q6 = new Question ( " How to format date from one form to another?", " SimpleDateFormat", " DateFormat", " SimpleFormat", " DateConverter", 1 );
        addQuestion27 ( q6 );
        Question q7 = new Question ( " How is Date stored in database?", " java.sql.Date", " java.util.Date", " java.sql.DateTime ", " java.util.DateTime", 1 );
        addQuestion27 ( q7 );
        Question q8 = new Question ( " Which of these is long data type literal?", " 0x99fffL", " ABCDEFG", " 0x99fffa", " 99671246", 1 );
        addQuestion27 ( q8 );
        Question q9 = new Question ( " Which of these can be returned by the operator &?", " Integer", " Boolean", " Character", " Integer or Boolean", 4 );
        addQuestion27 ( q9 );
        Question q10 = new Question ( " Literals in java must be appended by which of these?", " L", " l", " D", " L and I", 4 );
        addQuestion27 ( q10 );
    }
    private void fillQuestionsTable28() {

       //Operators and Control Statements not not not
        Question q1 = new Question ( " Which of these operators can skip evaluating right hand operand?", " !", " |", " &", " &&", 4 );
        addQuestion28 ( q1 );
        Question q2 = new Question ( " Which of these have highest precedence?", " ()", " ++", " *", " >>", 1 );
        addQuestion28 ( q2 );
        Question q3 = new Question ( " Which of these selection statements test only for equality?", " if", " switch", " if & switch", " none ", 2 );
        addQuestion28 ( q3 );
        Question q4 = new Question ( " Which of these are selection statements in Java?", " if", " for", " continue", " break", 1 );
        addQuestion28 ( q4 );
        Question q5 = new Question ( " Which of the following loops will execute the body of loop even when condition controlling the loop is initially false?", " do-while", " while", " for", " None", 1 );
        addQuestion28 ( q5 );
        Question q6 = new Question ( " Which of these jump statements can skip processing the remainder of the code in its body for a particular iteration?", " break", " return", " exit", " continue", 4 );
        addQuestion28 ( q6 );
        Question q7 = new Question ( " Which of this statement is incorrect?", " switch statement is more efficient than a set of nested ifs", " two case constants in the same switch can have identical values", " switch statement can only test for equality, whereas if statement can evaluate any type of boolean expression", " it is possible to create a nested switch statements", 2 );
        addQuestion28 ( q7 );
        Question q8 = new Question ( " Which of the following is used with the switch statement?", " Continue", " Exit", " break", " do", 3 );
        addQuestion28 ( q8 );
        Question q9 = new Question ( " Which of the following is not a decision making statement?", " if", " if-else", " switch", " do-while", 4 );
        addQuestion28 ( q9 );
        Question q10 = new Question ( " Which of the following is not a valid jump statement?", " break", " goto", " continue", " return", 2 );
        addQuestion28 ( q10 );
    }
    private void fillQuestionsTable29() {
        //Java Environment & OOPS Concepts not not not
        Question q1 = new Question ( "  Which component is responsible to run java program?", " JVM", " JDK", " JIT", " JRE", 4 );
        addQuestion29 ( q1 );
        Question q2 = new Question ( " Which component is responsible to optimize bytecode to machine code?", " JVM", " JDK", " JIT", " JRE", 3 );
        addQuestion29 ( q2 );
        Question q3 = new Question ( "  Which statement is true about java?", " Platform independent programming language", " Platform dependent programming language", " Code dependent programming language", " Sequence dependent programming language", 1 );
        addQuestion29 ( q3 );
        Question q4 = new Question ( "  Which of the below is invalid identifier with the main method?", " public", " static", " private", " final", 3 );
        addQuestion29 ( q4 );
        Question q5 = new Question ( " What is the extension of java code files?", " .class", " .java", " .txt", " .js", 2 );
        addQuestion29 ( q5 );
        Question q6 = new Question ( " What is the extension of compiled java classes?"," .class", " .java", " .txt", " .js", 1 );
        addQuestion29 ( q6 );
        Question q7 = new Question ( "  How can we identify whether a compilation unit is class or interface from a .class file?", " Java source file header", " Extension of compilation unit", " We cannot differentiate between class and interface", " The class or interface name should be postfixed with unit type", 1 );
        addQuestion29 ( q7 );
        Question q8 = new Question ( " What is use of interpreter?", " They convert bytecode to machine language code", " They read high level code and execute them", " They are intermediated between JIT and JVM", " It is a synonym for JIT", 2 );
        addQuestion29 ( q8 );
        Question q9 = new Question ( "  Which component is used to compile, debug and execute java program?", " JVM", " JDK", " JIT", " JRE", 2 );
        addQuestion29 ( q9 );
        Question q10 = new Question ( " Which component is responsible for converting bytecode into machine specific code?", " JVM", " JDK", " JIT", " JRE", 1 );
        addQuestion29 ( q10 );


    }
    private void fillQuestionsTable30() {
        //Classes and Methods
        Question q1 = new Question ( " Abstract class cannot have a constructor.", " True", " False", " ", " ", 2 );
        addQuestion30 ( q1 );
        Question q2 = new Question ( " What is true about protected constructor?", " Protected constructor can be called directly", "  Protected constructor can only be called using super()", " Protected constructor can be used outside package", " protected constructor can be instantiated even if child is in a different package", 2 );
        addQuestion30 ( q2 );
        Question q3 = new Question ( " What is not the use of “this” keyword in Java?", " Passing itself to another method", " Calling another constructor in constructor chaining", " Referring to the instance variable when local variable has the same name", " Passing itself to method of the same class", 4 );
        addQuestion30 ( q3 );
        Question q4 = new Question ( " What would be the behaviour if one parameterized constructor is explicitly defined?", " Compilation error", " Compilation succeeds", " Runtime error", " Compilation succeeds but at the time of creating object using default constructor, it throws compilation error", 4 );
        addQuestion30 ( q4 );
        Question q5 = new Question ( " What would be behaviour if the constructor has a return type?", " Compilation error", " Runtime error", " Compilation and runs successfully", " Only String return type is allowed", 1 );
        addQuestion30 ( q5 );
        Question q6 = new Question ( " Which of the following has the highest memory requirement?", " Heap", " Stack", " JVM", " Class", 3 );
        addQuestion30 ( q6 );
        Question q7 = new Question ( " Where is a new object allocated memory?", " Young space", " Old space", " Young or Old space depending on space availability", " JVM", 1 );
        addQuestion30 ( q7 );
        Question q8 = new Question ( " Which of the following is a garbage collection technique?", " Cleanup model", " Mark and sweep model", " Space management model", " Sweep model", 2 );
        addQuestion30 ( q8 );
        Question q9 = new Question ( " What is -Xms and -Xmx while starting jvm?", " Initial; Maximum memory", " Maximum; Initial memory", " Maximum memory", " Initial memory", 1 );
        addQuestion30 ( q9 );
        Question q10 = new Question ( " Which exception is thrown when java is out of memory?", " MemoryFullException", " MemoryOutOfBoundsException", " OutOfMemoryError", " MemoryError", 3 );
        addQuestion30 ( q10 );
        Question q11 = new Question ( " How to get prints of shared object memory maps or heap memory maps for a given process?", " jmap", " memorymap", " memorypath", " jvmmap", 1 );
        addQuestion30 ( q11 );
        Question q12 = new Question ( " What happens to the thread when garbage collection kicks off?", " The thread continues its operation", " Garbage collection cannot happen until the thread is running", " The thread is paused while garbage collection runs", " The thread and garbage collection do not interfere with each other", 3 );
        addQuestion30 ( q12 );
        Question q13 = new Question ( " Which of these can be used to differentiate two or more methods having the same name?", "  Parameters data type", " Number of parameters", " Return type of method", " All of the mentioned", 4 );
        addQuestion30 ( q13 );
        Question q14 = new Question ( " Which of these data type can be used for a method having a return statement in it?", " void", " int", " float", " both int and float", 4 );
        addQuestion30 ( q14 );
        Question q15 = new Question ( " Which of this method is given parameter via command line arguments?", " main()", " recursive() method", " Any method", " System defined methods", 1 );
        addQuestion30 ( q15 );
        Question q16 = new Question ( " Which of these data types is used to store command line arguments?", " Array", " Stack", " String", " Integer", 3 );
        addQuestion30 ( q16 );
        Question q17 = new Question ( " How many arguments can be passed to main()?", " Infinite", " Only 1", " System Dependent", " None ", 1 );
        addQuestion30 ( q17 );
        Question q18 = new Question ( " Can command line arguments be converted into int automatically if required?", " Yes", " No", " Compiler Dependent", " Only ASCII characters can be converted", 2 );
        addQuestion30 ( q18 );
        Question q19 = new Question ( " Which class allows parsing of command line arguments?", " Args", " JCommander", " Command Line", " Input", 2 );
        addQuestion30 ( q19 );
        Question q20 = new Question ( " Which annotation is used to represent command line input and assigned to correct data type?", " @Input", " @Variable", " @Command Line", " @Parameter", 4 );
        addQuestion30 ( q20 );
        Question q21 = new Question ( " What is Recursion in Java?", " Recursion is a class", " Recursion is a process of defining a method that calls other methods repeatedly", " Recursion is a process of defining a method that calls itself repeatedly", " Recursion is a process of defining a method that calls other methods which in turn call again this method", 2 );
        addQuestion30 ( q21 );
        Question q22 = new Question ( " Which of these data types is used by operating system to manage the Recursion in Java?", " Array", " Stack", " Queue", " Tree", 2 );
        addQuestion30 ( q22 );
    }
    private void fillQuestionsTable31() {
        //Inheritance

        Question q1 = new Question ( " In order to restrict a variable of a class from inheriting to subclass, how variable should be declared?", " Protected", " Private", " Public", " Static", 2 );
        addQuestion31 ( q1 );
        Question q2 = new Question ( " If super class and subclass have same variable name, which keyword should be used to use super class?", " super", " this", " upper", " classname", 1 );
        addQuestion31 ( q2 );
        Question q3 = new Question ( " Which of the following is used for implementing inheritance through an interface?", " inherited", " using", " extends", " implements", 4 );
        addQuestion31 ( q3 );
        Question q4 = new Question ( " Which of the following is used for implementing inheritance through class?", " inherited", " using", " extends", " implements", 3 );
        addQuestion31 ( q4 );
        Question q5 = new Question ( " Does Java support multiple level inheritance?", " True", " False", " ", " ", 1 );
        addQuestion31 ( q5 );
        Question q6 = new Question ( " A class member declared protected becomes a member of subclass of which type?", " public member", "  private member", "  protected member", " static member", 2 );
        addQuestion31 ( q6 );
        Question q7 = new Question ( " Which of these is correct way of inheriting class A by class B?", " class B + class A {}", " class B inherits class A {}", " class B extends A {}", " class B extends class A {}", 3 );
        addQuestion31 ( q7 );
        Question q8 = new Question ( " What is not type of inheritance?", " Single inheritance", "  Double inheritance", " Hierarchical inheritance", " Multiple inheritance", 2 );
        addQuestion31 ( q8 );
        Question q9 = new Question ( " Using which of the following, multiple inheritance in Java can be implemented?", " Interfaces", " Multithreading", " Protected methods", " Private methods", 1 );
        addQuestion31 ( q9 );
        Question q10 = new Question ( " All classes in Java are inherited from which class?", " java.lang.class", "  java.class.inherited", " java.class.object", "  java.lang.Object", 4 );
        addQuestion31 ( q10 );


    }
    private void fillQuestionsTable32() {
        // String Handling   not    not
        Question q1 = new Question ( " Which of these method of class String is used to remove leading and trailing whitespaces?", "  startsWith()", " trim()", " Trim()", " doTrim()", 2 );
        addQuestion32 ( q1 );
        Question q2 = new Question ( " Which of these class is used to create an object whose character sequence is mutable?", " String()", " StringBuffer()", " String() & StringBuffer()", " None ", 2 );
        addQuestion32 ( q2 );
        Question q3 = new Question ( " Which of this method of class StringBuffer is used to concatenate the string representation to the end of invoking string?", " concat()", " append()", "  join()", " concatenate()", 2 );
        addQuestion32 ( q3 );
        Question q4 = new Question ( " Which of these method of class StringBuffer is used to find the length of current character sequence?", " length()", "  Length()", " capacity()", " Capacity()", 1 );
        addQuestion32 ( q4 );
        Question q6 = new Question ( " Which of these methods is an alternative to getChars() that stores the characters in an array of bytes?", " getBytes()", " GetByte()", " giveByte()", " Give Bytes()", 1 );
        addQuestion32 ( q6 );
        Question q7 = new Question ( " Which of these methods can be used to convert all characters in a String into a character array?", " charAt()", " both getChars() & charAt()", "  both toCharArray() & getChars()", " All ", 3 );
        addQuestion32 ( q7 );
        Question q8 = new Question ( " What is the value returned by function compareTo() if the invoking string is less than the string compared?", " zero", " value less than zero", " value greater than zero", " none ", 2 );
        addQuestion32 ( q8 );
        Question q9 = new Question ( " Which of these data type value is returned by equals() method of String class?", " char", " int", " boolean", " all ", 3 );
        addQuestion32 ( q9 );
        Question q10 = new Question ( "  Which of this method of class String is used to extract a substring from a String object?", " substring()", " Substring()", " SubString()", " None ", 1 );
        addQuestion32 ( q10 );

    }
    private void fillQuestionsTable33() {
        // Exploring java.lang & java.io
        Question q1 = new Question ( " Which of these method of Object class can generate duplicate copy of the object on which it is called?", " clone()", " copy()", " duplicate()", " dito()", 1 );
        addQuestion33 ( q1 );
        Question q2 = new Question ( " What is the value of double consonant ‘E’ defined in Math class?", " approximately 3", " approximately 3.14", " approximately 2.72", " approximately 0", 3 );
        addQuestion33 ( q2 );
        Question q3 = new Question ( " Which of these method is a rounding function of Math class?", " max()", " min()", " abs()", " all ", 4 );
        addQuestion33 ( q3 );
        Question q4 = new Question ( " Which of these class contains only floating point functions?", " Math", " Process", " System", " Object", 1 );
        addQuestion33 ( q4 );
        Question q5 = new Question ( "  Which of these class encapsulate the runtime state of an object or an interface?", " Class", " Object", " Runtime", " System", 1 );
        addQuestion33 ( q5 );
        Question q6 = new Question ( " Which of these exceptions is thrown by methods of System class?", " IOException", " SystemException", " SecurityException", " InputOutputException", 3 );
        addQuestion33 ( q6 );
        Question q7 = new Question ( " Which of these methods initiates garbage collection?", " gc()", " garbage()", " garbagecollection()", " Systemgarbagecollection()", 1 );
        addQuestion33 ( q7 );
        Question q8 = new Question ( " Which of these methods loads the specified dynamic library?", " load()", " library()", " loadlib()", " loadlibrary()", 1 );
        addQuestion33 ( q8 );
        Question q9 = new Question ( "  Which of these method can set the out stream to OutputStream?", " setStream()", " setosteam()", " setOut()", " streamtoOstream()", 3 );
        addQuestion33 ( q9 );
        Question q10 = new Question ( "  Which of these values are returns under the case of normal termination of a program?", " 0", " 1", " 2", " 3", 1 );
        addQuestion33 ( q10 );
        Question q11 = new Question ( "  Which of the following constant are defined in Character wrapper?", " MAX_RADIX", " MAX_VALUE", " TYPE", " All ", 4 );
        addQuestion33 ( q11 );
        Question q12 = new Question ( " Which of these exceptions will be thrown if we declare an array with negative size?", " IllegalArrayException", " IllegalArraySizeExeption", " NegativeArrayException", " NegativeArraySizeExeption", 4 );
        addQuestion33 ( q12 );
        Question q13 = new Question ( " Which of these packages contain all the Java’s built in exceptions?", " java.io", " java.util", " java.lang", " java.net", 3 );
        addQuestion33 ( q13 );
        Question q14 = new Question ( " Which of these exceptions will be thrown if we use null reference for an arithmetic operation?", " ArithmeticException", " NullPointerException", " IllegalAccessException", " IllegalOperationException", 2 );
        addQuestion33 ( q14 );
        Question q15 = new Question ( " Which of these class is used to create user defined exception?", "  java.lang", " Exception", " RunTime", " System", 2 );
        addQuestion33 ( q15 );
        Question q16 = new Question ( "  Which of these class provides various types of rounding functions?", " Math", " Process", " System", " Object", 1 );
        addQuestion33 ( q16 );
        Question q17 = new Question ( " Which of these methods return a smallest whole number greater than or equal to variable X?", " double ceil(double X)", " double floor(double X)", "  double max(double X)", " double min(double X)", 1 );
        addQuestion33 ( q17 );
        Question q18 = new Question ( " Which of function return absolute value of a variable?", " abs()", " absolute()", " absolutevariable()", " none ", 1 );
        addQuestion33 ( q18 );
        Question q19 = new Question ( "  Which of these methods of Byte wrapper can be used to obtain Byte object from a string?", " toString()", " getString()", " decode()", " encode()", 3 );
        addQuestion33 ( q19 );
        Question q20= new Question ( " Which of the following methods Byte wrapper return the value as a double?", " doubleValue()", " converDouble()", " getDouble()", " getDoubleValue()", 1 );
        addQuestion33 ( q20 );
        Question q21 = new Question ( " Which of these is a super class of wrappers Byte and short wrappers?", " Long", " Digits", " Float", " Number", 4 );
        addQuestion33 ( q21 );
        Question q22 = new Question ( " Which of these methods is not defined in both Byte and Short wrappers?", " intValue()", " isInfinite()", " toString()", " hashCode()", 2 );
        addQuestion33 ( q22 );
        Question q23 = new Question ( " Which of these methods of Character wrapper can be used to obtain the char value contained in Character object.", " get()", " getVhar()", " charValue()", " getCharacter()", 3 );
        addQuestion33 ( q23 );

    }
    private void fillQuestionsTable34() {
        //Serialization & Networking
        Question q1 = new Question ( " Which of these class extend InputStream class?", " ObjectStream", " ObjectInputStream", " ObjectOutput", " ObjectInput", 2 );
        addQuestion34 ( q1 );
        Question q2 = new Question ( " If member does not implement serialization, which exception would be thrown?", " RuntimeException", " SerializableException", " NotSerializableException", " UnSerializedException", 3 );
        addQuestion34 ( q2 );
        Question q3 = new Question ( " Default Serialization process cannot be overridden.", " True", " False", " ", " ", 2 );
        addQuestion34 ( q3 );
        Question q4 = new Question ( " Which of the following methods is used to avoid serialization of new class whose super class already implements Serialization?", " writeObject()", " readWriteObject()", " writeReadObject()", " unSerializaedObject()", 1 );
        addQuestion34 ( q4 );
        Question q5 = new Question ( " Which of the following methods is not used while Serialization and DeSerialization?", " readObject()", " readExternal()", " readWriteObject()", " writeObject()", 3 );
        addQuestion34 ( q5 );
        Question q6 = new Question ( " Serializaed object can be transferred via network.", " True", " False", " ", " ", 1 );
        addQuestion34 ( q6 );
        Question q7 = new Question ( " Which of these is a process of extracting/removing the state of an object from a stream?", " Serialization", " Externalization", " File Filtering", " Deserialization", 4 );
        addQuestion34 ( q7 );
        Question q8 = new Question ( " Which of these process occur automatically by java run time system?", " Serialization", " Memory allocation", " Deserialization", " All ", 4 );
        addQuestion34 ( q8 );
        Question q9 = new Question ( " Which of these interface extends DataInput interface?", " Serializable", " Externalization", " ObjectOutput", " ObjectInput", 4 );
        addQuestion34 ( q9 );
        Question q10 = new Question ( " Which of these is a method of ObjectInput interface used to deserialize an object from a stream?", " int read()", " void close()", " Object readObject()", " Object WriteObject()", 3 );
        addQuestion34 ( q10 );
    }
    private void fillQuestionsTable35() {
        //java.util – The Collections Framework
        Question q1 = new Question ( " When an array is passed to a method, will the content of the array undergo changes with the actions carried within the function?", " True", " False", "  ", "  ", 1 );
        addQuestion35 ( q1 );
        Question q2 = new Question ( " What is the default clone of HashSet?", " Deep clone", " Shallow clone", " Plain clone", " Hollow clone", 2 );
        addQuestion35 ( q2 );
        Question q3 = new Question ( " What does Collections.emptySet() return?", "  Immutable Set", " Mutable Set", " The type of Set depends on the parameter passed to the emptySet() method", "  Null object", 1 );
        addQuestion35 ( q3 );
        Question q4 = new Question ( " What are the initial capacity and load factor of HashSet?", " 10, 1.0", " 32, 0.75", " 16, 0.75", " 32, 1.0", 3 );
        addQuestion35 ( q4 );
        Question q5 = new Question ( " What is the relation between hashset and hashmap?", " HashSet internally implements HashMap", " HashMap internally implements HashSet", " HashMap is the interface; HashSet is the concrete class", " HashSet is the interface; HashMap is the concrete class", 1 );
        addQuestion35 ( q5 );
        Question q6 = new Question ( " What is the difference between TreeSet and SortedSet?", " TreeSet is more efficient than SortedSet", " SortedSet is more efficient than TreeSet", " TreeSet is an interface; SortedSet is a concrete class", " SortedSet is an interface; TreeSet is a concrete class", 4 );
        addQuestion35 ( q6 );
        Question q7 = new Question ( " What happens if two threads simultaneously modify TreeSet?", " ConcurrentModificationException is thrown", " Both threads can perform action successfully", " FailFastException is thrown", " IteratorModificationException is thrown", 1 );
        addQuestion35 ( q7 );
        Question q8 = new Question ( " What is the unique feature of LinkedHashSet?", " It is not a valid class", "  It maintains the insertion order and guarantees uniqueness", "  It provides a way to store key values with uniqueness", " The elements in the collection are linked to each other", 2 );
        addQuestion35 ( q8 );
        Question q9 = new Question ( " Which of these standard collection classes implements a linked list data structure?", " AbstractList", " LinkedList", " HashSet", " AbstractSet", 2 );
        addQuestion35 ( q9 );
        Question q10 = new Question ( " Which of these classes implements Set interface?", " ArrayList", " HashSet", " LinkedList", " DynamicList", 2 );
        addQuestion35 ( q10 );
        Question q11 = new Question ( " Which of these is the interface of legacy is implemented by Hashtable and Dictionary classes?", " Map", " Enumeration", " HashMap", " Hashtable", 1 );
        addQuestion35 ( q11 );
        Question q12 = new Question ( " Which of these is a class which uses String as a key to store the value in object?", " Array", " ArrayList", " Dictionary", " Properties", 4 );
        addQuestion35 ( q12 );
        Question q13 = new Question ( " Which of these methods is used to retrieve the elements in properties object at specific location?", " get()", " Elementat()", " ElementAt()", " getProperty()", 4 );
        addQuestion35 ( q13 );
        Question q14 = new Question ( " Which of these class object has an architecture similar to that of array?", " Bitset", " Map", " Hashtable", " All ", 1 );
        addQuestion35 ( q14 );
        Question q15 = new Question ( " Which of these method is used to make a bit zero specified by the index?", " put()", "  set() ", "  remove()", " clear()", 4 );
        addQuestion35 ( q15 );
        Question q16 = new Question ( " Which of these method is used to calculate number of bits required to hold the BitSet object?", " size()", " length()", " indexes()", " numberofBits()", 2 );
        addQuestion35 ( q16 );
        Question q17 = new Question ( " Which of these is a method of class Date which is used to search whether object contains a date before the specified date?", " after()", " contains()", " before()", " compareTo()", 3 );
        addQuestion35 ( q17 );
        Question q18 = new Question ( "  Which of these methods is used to retrieve elements in BitSet object at specific location?", " get()", " Elementat()", " ElementAt()", " getProperty()", 1 );
        addQuestion35 ( q18 );
    }
    private void fillQuestionsTable36() {
        //Exception Handling
        Question q1 = new Question ( " Which of these operator is used to generate an instance of an exception than can be thrown by using throw? ", "new ", "malloc" , " alloc", " thrown", 1 );
        addQuestion36 ( q1 );
        Question q2 = new Question ( " Which of these keywords is used to by the calling function to guard against the exception that is thrown by called function? ", " try", "throw ", "throws ", "catch ", 3 );
        addQuestion36 ( q2 );
        Question q3 = new Question ( "  Which of these clause will be executed even if no exceptions are found?", "throws ", "finally ", "throw ", "catch ", 2 );
        addQuestion36 ( q3 );
        Question q4 = new Question ( " A single try block must be followed by which of these? ", "finally ", "catch ", "finally & catch ", "none  ", 3 );
        addQuestion36 ( q4 );
        Question q5 = new Question ( "  Which of these exceptions handles the divide by zero error? ", " ArithmeticException", "MathException ", "IllegalAccessException ", "IllegarException ", 1 );
        addQuestion36 ( q5 );
        Question q6 = new Question ( " Which of these exceptions will occur if we try to access the index of an array beyond its length? ", "ArithmeticException ", "ArrayException ", "ArrayIndexException ", "ArrayIndexOutOfBoundsException ", 4 );
        addQuestion36 ( q6 );
        Question q7 = new Question ( "  What is the use of try & catch?", " It allows us to manually handle the exception", " It allows to fix errors ", "It prevents automatic terminating of the program in cases when an exception occurs ", "All  ", 4 );
        addQuestion36 ( q7 );
        Question q8 = new Question ( " Which of these keywords are used for the block to be examined for exceptions? ", "try ", "catch ", "throw ", "check ", 1 );
        addQuestion36 ( q8 );
        Question q9 = new Question ( " Which of these keywords are used for the block to handle the exceptions generated by try block? ", "try ", "catch ", "throw ", "check ", 2 );
        addQuestion36 ( q9 );
        Question q10 = new Question ( " Which of these keywords are used for generating an exception manually? ", "try ", "catch ", "throw ", "check ", 3 );
        addQuestion36 ( q10 );
    }
    private void fillQuestionsTable37() {
        //Multithreading    not     not
        Question q1 = new Question ( " Thread priority in Java is?", " Integer", " Float", " double", " long", 1 );
        addQuestion37 ( q1 );
        Question q2 = new Question ( " What requires less resources?", " Thread", " Process", " Thread and Process", " Neither Thread nor Process", 1 );
        addQuestion37 ( q2 );
        Question q3 = new Question ( " What does not prevent JVM from terminating?", " Process", " Daemon Thread", " User Thread", "  JVM Thread", 2 );
        addQuestion37 ( q3 );
        Question q4 = new Question ( " What decides thread priority?", " Process", " Process scheduler", " Thread", " Thread scheduler", 4 );
        addQuestion37 ( q4 );
        Question q5 = new Question ( " What should not be done to avoid deadlock?", " Avoid using multiple threads", "  Avoid hold several locks at once", " Execute foreign code while holding a lock", " Use interruptible locks", 3 );
        addQuestion37 ( q5 );
        Question q6 = new Question ( " Which of the following is a correct constructor for thread?", " Thread(Runnable a, String str)", " Thread(int priority)", " Thread(Runnable a, int priority)", " Thread(Runnable a, ThreadGroup t)", 1 );
        addQuestion37 ( q6 );
        Question q7 = new Question ( " Which of the following will ensure the thread will be in running state?", " yield()", " notify()", " wait()", " Thread.killThread()", 3 );
        addQuestion37 ( q7 );
        Question q8 = new Question ( " Which of these keywords are used to implement synchronization?", " synchronize", " syn", " synch", " synchronized", 4 );
        addQuestion37 ( q8 );
        Question q9 = new Question ( " Which of this method is used to avoid polling in Java?", " wait()", " notify()", " notifyAll()", " All ", 4 );
        addQuestion37 ( q9 );
        Question q10 = new Question ( " Which of these method wakes up the first thread that called wait()?", " wake()", " notify()", " start()", " notifyAll()", 2 );
        addQuestion37 ( q10 );

    }
    private void fillQuestionsTable38() {
        //I/O & Applets
        Question q1 = new Question ( " Which of these methods is used to write() into a file?", " put()", " putFile()", " write()", " writeFile()", 3 );
        addQuestion38 ( q1 );
        Question q2 = new Question ( " Which of these functions is called to display the output of an applet?", " display()", " paint()", " displayApplet()", " PrintApplet()", 2 );
        addQuestion38 ( q2 );
        Question q3 = new Question ( " Which of these methods can be used to output a string in an applet?", " display()", "  print() ", " drawString() ", " transient() ", 3 );
        addQuestion38 ( q3 );
        Question q4 = new Question ( " Which of these methods is a part of Abstract Window Toolkit (AWT) ?", " display()", " paint()", " drawString()", " transient()", 2 );
        addQuestion38 ( q4 );
        Question q5 = new Question ( " Which of these modifiers can be used for a variable so that it can be accessed from any thread or parts of a program?", " transient", " volatile", " global", " No modifier is needed", 2 );
        addQuestion38 ( q5 );
        Question q6 = new Question ( " Which of these operators can be used to get run time information about an object?", " getInfo", " Info", " instanceof", " getinfoof", 3 );
        addQuestion38 ( q6 );
        Question q7 = new Question ( " Which of these exception is thrown in cases when the file specified for writing is not found?", " IOException", " FileException", " FileNotFoundException", " FileInputException", 3 );
        addQuestion38 ( q7 );
        Question q8 = new Question ( " Which of these methods are used to read in from file?", " get()", " read()", " scan()", " readFileInput()", 2 );
        addQuestion38 ( q8 );
        Question q9 = new Question ( " Which of these values is returned by read() method is end of file (EOF) is encountered?", " 0", " 1", " -1", " Null", 3 );
        addQuestion38 ( q9 );
        Question q10 = new Question ( " Which of these exception is thrown by close() and read() methods?", " IOException", " FileException", " FileNotFoundException", " FileInputOutputException", 1 );
        addQuestion38 ( q10 );
    }
    private void fillQuestionsTable39() {
        //Event Handling
        Question q1 = new Question ( " Which of these events is generated when computer gains or loses input focus?", " ComponentEvent", " ContainerEvent", " FocusEvent", " InputEvent", 3 );
        addQuestion39 ( q1 );
        Question q2 = new Question ( " FocusEvent is subclass of which of these classes?", " ComponentEvent", " ContainerEvent", " ItemEvent", " InputEvent", 1 );
        addQuestion39 ( q2 );
        Question q3 = new Question ( " Which of these methods can be used to know the type of focus change?", " typeFocus()", " typeEventFocus()", " isTemporary()", " isPermanent()", 3 );
        addQuestion39 ( q3 );
        Question q4 = new Question ( " Which of these is superclass of ContainerEvent class?", " WindowEvent", " ComponentEvent", " ItemEvent", " InputEvent", 2 );
        addQuestion39 ( q4 );

        Question q5 = new Question ( " Which of these classes is used to define exceptions? ", "Exception ", "Throwable ", "Abstract ", "System ", 1 );
        addQuestion39 ( q1 );
        Question q6 = new Question ( " Which of these methods return description of an exception? ", "getException() ", " getMessage()", "obtainDescription() ", "obtainException() ", 2 );
        addQuestion39 ( q2 );
        Question q7 = new Question ( " Which of these methods is used to print stack trace? ", "obtainStackTrace() ", "printStackTrace() ", " getStackTrace()", "displayStackTrace() ", 2 );
        addQuestion39 ( q3 );
        Question q8 = new Question ( "  Which of these classes is super class of Exception class? ", "Throwable ", "System ", "RunTime ", "Class ", 1 );
        addQuestion39 ( q4 );


    }
    private void fillQuestionsTable40() {
        // Data Types, Variables and Arrays
        Question q1 = new Question ( " Literal can be of which of these data types?", " integer", " float", " boolean", " all of the mentioned", 4 );
        addQuestion40 ( q1);
        Question q2 = new Question ( "  Which of these can not be used for a variable name in Java?", " identifier", " keyword", "  identifier & keyword", " none ", 2 );
        addQuestion40 ( q2 );
        Question q3 = new Question ( "  Which of these is necessary condition for automatic type conversion in Java?", " The destination type is smaller than source type", " The destination type is larger than source type", " The destination type can be larger or smaller than source type", " None of the mentioned", 2 );
        addQuestion40 ( q3 );
        Question q4 = new Question ( " What is the prototype of the default constructor of this Java class?", " public ", " private", " protected", " none", 1 );
        addQuestion40 ( q4 );
        Question q5 = new Question ( " If an expression contains double, int, float, long, then the whole expression will be promoted into which of these data types?", " long", " int", " double", " float", 3 );
        addQuestion40 ( q5 );
        Question q6 = new Question ( " What is Truncation is Java?", " Floating-point value assigned to an integer type", " Integer value assigned to floating type", " Floating-point value assigned to an Floating type", " Integer value assigned to floating type", 1 );
        addQuestion40 ( q6 );
        Question q7 = new Question ( " Which of these operators is used to allocate memory to array variable in Java? ", " malloc", " alloc", " new", " new malloc", 3 );
        addQuestion40 ( q7 );
        Question q8 = new Question ( " Which of these is an incorrect array declaration?", " int arr[] = new int[5]", " int [] arr = new int[5]", " int arr[] = new int[5]", "  int arr[] = int [5] new", 4 );
        addQuestion40 ( q8 );
        Question q9 = new Question ( " Which of these is an incorrect Statement?", " It is necessary to use new operator to initialize an array", "  Array can be initialized using comma separated expressions surrounded by curly braces", " Array can be initialized when they are declared", " None ", 1 );
        addQuestion40 ( q9 );
        Question q10 = new Question ( " Which of these is necessary to specify at time of array initialization?", " Row", " Column", " Both Row and Column", " None of the mentioned", 1 );
        addQuestion40 ( q10 );
    }
    private void fillQuestionsTable41() {
        //Operators and Control Statements  not not
        Question q1 = new Question ( " Which of these operators can skip evaluating right hand operand?", " !", " |", " &", " &&", 4 );
        addQuestion41 ( q1 );
        Question q2 = new Question ( " Which of these have highest precedence?", " ()", " ++", " *", " >>", 1 );
        addQuestion41 ( q2 );
        Question q3 = new Question ( " Which of these selection statements test only for equality?", " if", " switch", " if & switch", " none ", 2 );
        addQuestion41 ( q3 );
        Question q4 = new Question ( " Which of these are selection statements in Java?", " if", " for", " continue", " break", 1 );
        addQuestion41 ( q4 );
        Question q5 = new Question ( " Which of the following loops will execute the body of loop even when condition controlling the loop is initially false?", " do-while", " while", " for", " None", 1 );
        addQuestion41 ( q5 );
        Question q6 = new Question ( " Which of these jump statements can skip processing the remainder of the code in its body for a particular iteration?", " break", " return", " exit", " continue", 4 );
        addQuestion41 ( q6 );
        Question q7 = new Question ( " Which of this statement is incorrect?", " switch statement is more efficient than a set of nested ifs", " two case constants in the same switch can have identical values", " switch statement can only test for equality, whereas if statement can evaluate any type of boolean expression", " it is possible to create a nested switch statements", 2 );
        addQuestion41 ( q7 );
        Question q8 = new Question ( " Which of the following is used with the switch statement?", " Continue", " Exit", " break", " do", 3 );
        addQuestion41 ( q8 );
        Question q9 = new Question ( " Which of the following is not a decision making statement?", " if", " if-else", " switch", " do-while", 4 );
        addQuestion41 ( q9 );
        Question q10 = new Question ( " Which of the following is not a valid jump statement?", " break", " goto", " continue", " return", 2 );
        addQuestion41 ( q10 );

    }
    private void fillQuestionsTable42() {
        //Java Environment & OOPS Concepts      not not
        Question q1 = new Question ( "  Which component is responsible to run java program?", " JVM", " JDK", " JIT", " JRE", 4 );
        addQuestion42 ( q1 );
        Question q2 = new Question ( " Which component is responsible to optimize bytecode to machine code?", " JVM", " JDK", " JIT", " JRE", 3 );
        addQuestion42 ( q2 );
        Question q3 = new Question ( "  Which statement is true about java?", " Platform independent programming language", " Platform dependent programming language", " Code dependent programming language", " Sequence dependent programming language", 1 );
        addQuestion42 ( q3 );
        Question q4 = new Question ( "  Which of the below is invalid identifier with the main method?", " public", " static", " private", " final", 3 );
        addQuestion42 ( q4 );
        Question q5 = new Question ( " What is the extension of java code files?", " .class", " .java", " .txt", " .js", 2 );
        addQuestion42 ( q5 );
        Question q6 = new Question ( " What is the extension of compiled java classes?"," .class", " .java", " .txt", " .js", 1 );
        addQuestion42 ( q6 );
        Question q7 = new Question ( "  How can we identify whether a compilation unit is class or interface from a .class file?", " Java source file header", " Extension of compilation unit", " We cannot differentiate between class and interface", " The class or interface name should be postfixed with unit type", 1 );
        addQuestion42 ( q7 );
        Question q8 = new Question ( " What is use of interpreter?", " They convert bytecode to machine language code", " They read high level code and execute them", " They are intermediated between JIT and JVM", " It is a synonym for JIT", 2 );
        addQuestion42 ( q8 );
        Question q9 = new Question ( "  Which component is used to compile, debug and execute java program?", " JVM", " JDK", " JIT", " JRE", 2 );
        addQuestion42 ( q9 );
        Question q10 = new Question ( " Which component is responsible for converting bytecode into machine specific code?", " JVM", " JDK", " JIT", " JRE", 1 );
        addQuestion42 ( q10 );
    }
    private void fillQuestionsTable43() {
        //Classes and Methods
        Question q1 = new Question ( " Which of the below is not a Java Profiler?", " JVM", " JConsole", " JProfiler", " Eclipse Profiler", 1 );
        addQuestion43 ( q1 );
        Question q2 = new Question ( " Which of the below is not a memory leak solution?", " Code changes", " JVM parameter tuning", " Process restart", " GC parameter tuning", 3 );
        addQuestion43 ( q2 );
        Question q3 = new Question ( " Garbage Collection can be controlled by a program?", " True", " False", " ", " ", 2 );
        addQuestion43 ( q3 );
        Question q4 = new Question ( " Which of these access specifiers must be used for main() method?", " private", " public", " protected", " none ", 2 );
        addQuestion43 ( q4 );
        Question q5 = new Question ( " Which of these is used to access a member of class before object of that class is created?", " public", " private", " static", " protected", 3 );
        addQuestion43 ( q5 );
        Question q6 = new Question ( " Which of these is used as a default for a member of a class if no access specifier is used for it?", " private", " public", " public, within its own package", " protected", 1 );
        addQuestion43 ( q6 );
        Question q7 = new Question ( " What is the process by which we can control what parts of a program can access the members of a class?", " Polymorphism", " Abstraction", " Encapsulation", " Recursion", 3 );
        addQuestion43 ( q7 );
        Question q8 = new Question ( " Which of the following statements are incorrect?", " public members of class can be accessed by any code in the program", " private members of class can only be accessed by other members of the class", " private members of class can be inherited by a subclass, and become protected members in subclass", " protected members of a class can be inherited by a subclass, and become private members of the subclass", 3 );
        addQuestion43 ( q8 );
        Question q9 = new Question ( " Which of these access specifier must be used for class so that it can be inherited by another subclass?", " public", " private", " protected", " none", 1 );
        addQuestion43 ( q9 );
        Question q10 = new Question ( "  Which one of the following is not an access modifier?", " Public", " Private", " Protected", " Void", 4 );
        addQuestion43 ( q10 );
        Question q11 = new Question ( " Which of these will happen if recursive method does not have a base case?", " An infinite loop occurs", " System stops the program after some time", "  After 1000000 calls it will be automatically stopped", " None ", 1 );
        addQuestion43 ( q11 );
        Question q12 = new Question ( " Which of these packages contains the exception Stack Overflow in Java?", " java.lang ", " java.util", "  java.io", " java.system", 1 );
        addQuestion43 ( q12 );




    }
    private void fillQuestionsTable44() {
        //Inheritance

        Question q1 = new Question ( " In order to restrict a variable of a class from inheriting to subclass, how variable should be declared?", " Protected", " Private", " Public", " Static", 2 );
        addQuestion44 ( q1 );
        Question q2 = new Question ( " If super class and subclass have same variable name, which keyword should be used to use super class?", " super", " this", " upper", " classname", 1 );
        addQuestion44 ( q2 );
        Question q3 = new Question ( " Which of the following is used for implementing inheritance through an interface?", " inherited", " using", " extends", " implements", 4 );
        addQuestion44 ( q3 );
        Question q4 = new Question ( " Which of the following is used for implementing inheritance through class?", " inherited", " using", " extends", " implements", 3 );
        addQuestion44 ( q4 );
        Question q5 = new Question ( " Does Java support multiple level inheritance?", " True", " False", " ", " ", 1 );
        addQuestion44 ( q5 );
        Question q6 = new Question ( " A class member declared protected becomes a member of subclass of which type?", " public member", "  private member", "  protected member", " static member", 2 );
        addQuestion44 ( q6 );
        Question q7 = new Question ( " Which of these is correct way of inheriting class A by class B?", " class B + class A {}", " class B inherits class A {}", " class B extends A {}", " class B extends class A {}", 3 );
        addQuestion44 ( q7 );
        Question q8 = new Question ( " What is not type of inheritance?", " Single inheritance", "  Double inheritance", " Hierarchical inheritance", " Multiple inheritance", 2 );
        addQuestion44 ( q8 );
        Question q9 = new Question ( " Using which of the following, multiple inheritance in Java can be implemented?", " Interfaces", " Multithreading", " Protected methods", " Private methods", 1 );
        addQuestion44 ( q9 );
        Question q10 = new Question ( " All classes in Java are inherited from which class?", " java.lang.class", "  java.class.inherited", " java.class.object", "  java.lang.Object", 4 );
        addQuestion44 ( q10 );
    }
    private void fillQuestionsTable45() {
        //String Handling

        Question q1 = new Question ( " Which of these method of class String is used to remove leading and trailing whitespaces?", "  startsWith()", " trim()", " Trim()", " doTrim()", 2 );
        addQuestion45 ( q1 );
        Question q2 = new Question ( " Which of these class is used to create an object whose character sequence is mutable?", " String()", " StringBuffer()", " String() & StringBuffer()", " None ", 2 );
        addQuestion45 ( q2 );
        Question q3 = new Question ( " Which of this method of class StringBuffer is used to concatenate the string representation to the end of invoking string?", " concat()", " append()", "  join()", " concatenate()", 2 );
        addQuestion45 ( q3 );
        Question q4 = new Question ( " Which of these method of class StringBuffer is used to find the length of current character sequence?", " length()", "  Length()", " capacity()", " Capacity()", 1 );
        addQuestion45 ( q4 );
        Question q6 = new Question ( " Which of these methods is an alternative to getChars() that stores the characters in an array of bytes?", " getBytes()", " GetByte()", " giveByte()", " Give Bytes()", 1 );
        addQuestion45 ( q6 );
        Question q7 = new Question ( " Which of these methods can be used to convert all characters in a String into a character array?", " charAt()", " both getChars() & charAt()", "  both toCharArray() & getChars()", " All ", 3 );
        addQuestion45 ( q7 );
        Question q8 = new Question ( " What is the value returned by function compareTo() if the invoking string is less than the string compared?", " zero", " value less than zero", " value greater than zero", " none ", 2 );
        addQuestion45 ( q8 );
        Question q9 = new Question ( " Which of these data type value is returned by equals() method of String class?", " char", " int", " boolean", " all ", 3 );
        addQuestion45 ( q9 );
        Question q10 = new Question ( "  Which of this method of class String is used to extract a substring from a String object?", " substring()", " Substring()", " SubString()", " None ", 1 );
        addQuestion45 ( q10 );
    }
    private void fillQuestionsTable46() {
        //Exploring java.lang & java.io
        Question q1= new Question ( " Which of the following methods return the value as a double?", " doubleValue()", " converDouble()", " getDouble()", " getDoubleValue()", 1 );
        addQuestion46 ( q1 );
        Question q2 = new Question ( " Which of these methods can be used to check whether the given value is a number or not?", " isNaN()", " isNumber()", " checkNaN()", " checkNumber()", 1 );
        addQuestion46 ( q2 );
        Question q3 = new Question ( " Which of these method of Double wrapper can be used to check whether a given value is infinite or not?", " Infinite()", " isInfinite()", " checkInfinite()", " None ", 2 );
        addQuestion46 ( q3 );
        Question q4 = new Question ( " Which of these exceptions is thrown by compareTo() method defined in a double wrapper?", " IOException", " SystemException", " CastException", " ClassCastException", 4 );
        addQuestion46 ( q4 );
        Question q5= new Question ( " Which of these packages contain classes and interfaces used for input & output operations of a program?", " java.util", "  java.lang", " java.io", " all ", 3 );
        addQuestion46 ( q5 );
        Question q6= new Question ( " Which of these class is not a member class of java.io package?", " String", " StringReader", " Writer", " File", 1 );
        addQuestion46 ( q6 );
        Question q7 = new Question ( " Which of these interface is not a member of java.io package?", " DataInput", " ObjectInput", " ObjectFilter", " FileFilter", 3 );
        addQuestion46 ( q7 );
        Question q8 = new Question ( "  Which of these class is not related to input and output stream in terms of functioning?", " File", " Writer", " InputStream", " Reader", 1 );
        addQuestion46 ( q8 );
        Question q9 = new Question ( " Which of these is specified by a File object?", " a file in disk", " directory path", " directory in disk", " none ", 3 );
        addQuestion46 ( q9 );
        Question q10 = new Question ( " Which of these is method for testing whether the specified element is a file or a directory?", " IsFile()", " isFile()", " Isfile()", "  isfile()", 2 );
        addQuestion46 ( q10 );
        Question q11 = new Question ( " Which of these is a super class of Character wrapper?", " Long", " Digits", " Float", " Number", 4 );
        addQuestion46 ( q11 );
        Question q12 = new Question ( " Which of these methods is used to know whether a given Character object is part of Java’s Identifiers?", " isIdentifier()", " isJavaIdentifier()", " isJavaIdentifierPart()", " none ", 3 );
        addQuestion46 ( q12 );
        Question q13 = new Question ( " Which of these coding techniques is used by method isDefined()?", " Latin", " ASCII", " ANSI", " UNICODE", 4 );
        addQuestion46 ( q13 );
        Question q14 = new Question ( " Which of these methods of Boolean wrapper returns boolean equivalent of an object.", " getBool()", " booleanValue()", " getbooleanValue()", "  getboolValue()", 2 );
        addQuestion46 ( q14 );
        Question q15 = new Question ( " Which of the following constant are defined in Boolean wrapper?", " TRUE", " FALSE", " TYPE", " All ", 4 );
        addQuestion46 ( q15 );
        Question q16 = new Question ( " Which of these methods return string equivalent of Boolean object?", " getString()", " toString()", " converString()", "  getStringObject()", 2 );
        addQuestion46 ( q16 );
        Question q17 = new Question ( " Which of these methods is used to know whether a string contains “true”?", " valueOf()", " valueOfString()", " getString()", " none ", 1 );
        addQuestion46 ( q17 );
        Question q18 = new Question ( " Which of these class have only one field?", " Character", " Boolean", " Byte", " void", 4 );
        addQuestion46 ( q18 );
        Question q19 = new Question ( " Which of these class contains all the methods present in Math class?", " SystemMath", " StrictMath", " Compiler", " ClassLoader", 2 );
        addQuestion46 ( q19 );
        Question q20 = new Question ( " Which of these method return a pseudorandom number?", " rand()", " random()", " randomNumber()", " randGenerator()", 2 );
        addQuestion46 ( q20 );
        Question q21 = new Question ( " Which of these classes encapsulate runtime environment?", " Class", " System", " Runtime", " ClassLoader", 3 );
        addQuestion46 ( q21 );
        Question q22 = new Question ( " Which of the following exceptions is thrown by every method of Runtime class?", " IOException", " SystemException", " SecurityException", " RuntimeException", 3 );
        addQuestion46 ( q22 );
        Question q23 = new Question ( "  Which of these methods returns the total number of bytes of memory available to the program?", " getMemory()", " TotalMemory()", " SystemMemory()", " getProcessMemory()", 2 );
        addQuestion46 ( q23 );
        Question q24 = new Question ( " Which of these Exceptions is thrown by loadClass() method of ClassLoader class?", " IOException", " SystemException", " ClassFormatError", " ClassNotFoundException", 4 );
        addQuestion46 ( q24 );
        Question q25 = new Question ( " Which of the interface contains all the methods used for handling thread related operations in Java?", " Math interface", " System interface", " Runnable interface", " ThreadHandling interface", 3 );
        addQuestion46 ( q25 );
        Question q26 = new Question ( "  Which of these class is used to make a thread?", " String", " System", " Thread", " Runnable", 3 );
        addQuestion46 ( q26 );
        Question q27 = new Question ( "  Which of this interface is implemented by Thread class?", " Runnable ", " Connections", " Set", " MapConnections", 1 );
        addQuestion46 ( q27 );
        Question q28 = new Question ( " Which of these methods of a Thread class is used to suspend a thread for a period of time?", " sleep()", " terminate()", " suspend()", " stop()", 1 );
        addQuestion46 ( q28 );
        Question q29 = new Question ( "  Which object Java application uses to create a new process?", " Process", " Builder", " ProcessBuilder", " CreateBuilder", 3 );
        addQuestion46 ( q29 );
        Question q30 = new Question ( " Java system properties can be set at runtime.", " True", " False", " ", " ", 1 );
        addQuestion46 ( q30 );
        Question q31 = new Question ( " Which system property stores installation directory of JRE?", " user.home", " java.class.path", " java.home", " user.dir", 3 );
        addQuestion46 ( q31 );
        Question q32 = new Question ( "  Which environment variable is used to set java path?", " JAVA", " JAVA_HOME", " CLASSPATH", " MAVEN_HOME", 2 );
        addQuestion46 ( q32 );


    }
    private void fillQuestionsTable47() {
        //Serialization & Networking

        Question q1 = new Question ( " Which of these is a process of writing the state of an object to a byte stream?", " Serialization", " Externalization", " File Filtering", " All ", 1 );
        addQuestion47 ( q1 );
        Question q2 = new Question ( " Which of these process occur automatically by the java runtime system?", " Serialization", " Garbage collection", " File Filtering", " All ", 1 );
        addQuestion47 ( q2 );
        Question q3 = new Question ( " Which of these is an interface for control over serialization and deserialization?", " Serializable", " Externalization", " FileFilter", " ObjectInput", 2 );
        addQuestion47 ( q3 );
        Question q4 = new Question ( "  Which of these interface extends DataOutput interface?", " Serializable", " Externalization", " ObjectOutput", " ObjectInput", 3 );
        addQuestion47 ( q4 );
        Question q5 = new Question ( " Which of these is a method of ObjectOutput interface used to finalize the output state so that any buffers are cleared?", " clear", " flush", " fflush", " close", 2 );
        addQuestion47 ( q5 );
        Question q6 = new Question ( " Which of these is method of ObjectOutput interface used to write the object to input or output stream as required?", " write()", " Write()", " StreamWrite()", " writeObject()", 4 );
        addQuestion47 ( q6 );
        Question q7 = new Question ( " How an object can become serializable?", " If a class implements java.io.Serializable class", " If a class or any superclass implements java.io.Serializable interface", " Any object is serializable", " No object is serializable", 2 );
        addQuestion47 ( q7 );
        Question q8 = new Question ( "  What is serialization?", " Turning object in memory into stream of bytes", " Turning stream of bytes into an object in memory", " Turning object in memory into stream of bits", " Turning stream of bits into an object in memory", 1 );
        addQuestion47 ( q8 );
        Question q9 = new Question ( " What is deserialization?", " Turning object in memory into stream of bytes", " Turning stream of bytes into an object in memory", " Turning object in memory into stream of bits", " Turning stream of bits into an object in memory", 2 );
        addQuestion47 ( q9 );
        Question q10 = new Question ( " How many methods Serializable has?", " 0", " 1", " 4", " 2", 1 );
        addQuestion47 ( q10 );
    }
    private void fillQuestionsTable48() {
        //java.util – The Collections Framework
        Question q1 = new Question ( " Which of these method is used to add an element to the start of a LinkedList object?", " add()", " first()", " AddFirst()", " addFirst()", 4 );
        addQuestion48 ( q1 );
        Question q2 = new Question ( " Which of these method of HashSet class is used to add elements to its object?", " add()", " Add()", " addFirst()", " insert()", 1 );
        addQuestion48 ( q2 );
        Question q3 = new Question ( " Which of these methods can be used to delete the last element in a LinkedList object?", " remove()", " delete()", " removeLast()", " deleteLast()", 3 );
        addQuestion48 ( q3 );
        Question q4 = new Question ( " Which of this method is used to change an element in a LinkedList Object?", " change()", " set()", " redo()", " add()", 2 );
        addQuestion48 ( q4 );
        Question q5 = new Question ( " Which of these object stores association between keys and values?", "  Hash table", " Map", " Array", " String", 2 );
        addQuestion48 ( q5 );
        Question q6 = new Question ( " Which of these classes provide implementation of map interface?", " ArrayList", " HashMap", " LinkedList", " DynamicList", 2 );
        addQuestion48 ( q6 );
        Question q7 = new Question ( " Which of these method is used to remove all keys/values pair from the invoking map?", " delete()", " remove()", " clear()", " removeAll()", 2 );
        addQuestion48 ( q7 );
        Question q8 = new Question ( " Which of these method Map class is used to obtain an element in the map having specified key?", "  search()", " get()", " set()", " look()", 2 );
        addQuestion48 ( q8 );
        Question q9 = new Question ( " Which of these methods can be used to obtain set of all keys in a map?", " getAll()", " getKeys()", " keyall()", " keySet()", 4 );
        addQuestion48 ( q9 );
        Question q10 = new Question ( " Which of these class object can be used to form a dynamic array?", " ArrayList", " Map", " Vector", " ArrayList & Vector", 4 );
        addQuestion48 ( q10 );
        Question q11 = new Question ( " Which of these are legacy classes?", " Stack", " Hashtable", " Vector", " All", 4 );
        addQuestion48 ( q11 );
        Question q12 = new Question ( " Which of these is the interface of legacy?", " Map", " Enumeration", " HashMap", " Hashtable", 2 );
        addQuestion48 ( q12 );
        Question q13 = new Question ( " What is the name of a data member of class Vector which is used to store a number of elements in the vector?", " length", " elements", " elementCount", " capacity", 3 );
        addQuestion48 ( q13 );
        Question q14 = new Question ( " Which of these methods is used to add elements in vector at specific location?", " add()", " set()", " AddElement()", " addElement()", 4 );
        addQuestion48 ( q14 );
        Question q15 = new Question ( " Which of these class object uses the key to store value?", " Dictionary", " Map", " Hashtable", " All ", 4 );
        addQuestion48 ( q15 );
        Question q16 = new Question ( " Which of these method is used to insert value and its key?", " put()", " set()", " insertElement()", " addElement()", 1 );
        addQuestion48 ( q16 );
    }
    private void fillQuestionsTable49() {
        //Exception Handling

        Question q1 = new Question ( " When does Exceptions in Java arises in code sequence? ", "Run Time ", " Compilation Time", " Can Occur Any Time", "None  ", 1 );
        addQuestion49 ( q1 );
        Question q2 = new Question ( " Which of these keywords is not a part of exception handling? ", "try", " finally", " thrown", " catch", 3 );
        addQuestion49 ( q2 );
        Question q3 = new Question ( " Which of these keywords must be used to monitor for exceptions?", " try", "finally ", " throw", "catch ", 1 );
        addQuestion49 ( q3 );
        Question q4 = new Question ( " Which of these keywords must be used to handle the exception thrown by try block in some rational manner? ", " try", " finally", " throw", " catch", 4 );
        addQuestion49 ( q4 );
        Question q5 = new Question ( "  Which of these keywords is used to manually throw an exception? ", " try", "finally ", "throw ", " catch", 3 );
        addQuestion49 ( q5 );
        Question q6 = new Question ( " Which of the following keywords is used for throwing exception manually? ", " finally", "try ", "throw ", "catch ", 3 );
        addQuestion49 ( q6 );
        Question q7 = new Question ( " Which of the following classes can catch all exceptions which cannot be caught? ", " RuntimeException", " Error", "Exception ", " ParentException", 2 );
        addQuestion49 ( q7 );
        Question q8 = new Question ( " Which of the following is a super class of all exception type classes? ", "Catchable ", "RuntimeExceptions ", " String", "Throwable ", 4 );
        addQuestion49 ( q8 );
        Question q9 = new Question ( " Which of the following operators is used to generate instance of an exception which can be thrown using throw? ", " thrown", " alloc", " malloc", " new", 4 );
        addQuestion49 ( q9 );
        Question q10 = new Question ( " Which of the following keyword is used by calling function to handle exception thrown by called function? ", " throws", "throw ", "try ", "catch ", 1 );
        addQuestion49 ( q10 );
    }
    private void fillQuestionsTable50() {
        //Multithreading
        Question q1 = new Question ( " Thread priority in Java is?", " Integer", " Float", " double", " long", 1 );
        addQuestion50 ( q1 );
        Question q2 = new Question ( " What requires less resources?", " Thread", " Process", " Thread and Process", " Neither Thread nor Process", 1 );
        addQuestion50 ( q2 );
        Question q3 = new Question ( " What does not prevent JVM from terminating?", " Process", " Daemon Thread", " User Thread", "  JVM Thread", 2 );
        addQuestion50 ( q3 );
        Question q4 = new Question ( " What decides thread priority?", " Process", " Process scheduler", " Thread", " Thread scheduler", 4 );
        addQuestion50 ( q4 );
        Question q5 = new Question ( " What should not be done to avoid deadlock?", " Avoid using multiple threads", "  Avoid hold several locks at once", " Execute foreign code while holding a lock", " Use interruptible locks", 3 );
        addQuestion50 ( q5 );
        Question q6 = new Question ( " Which of the following is a correct constructor for thread?", " Thread(Runnable a, String str)", " Thread(int priority)", " Thread(Runnable a, int priority)", " Thread(Runnable a, ThreadGroup t)", 1 );
        addQuestion50 ( q6 );
        Question q7 = new Question ( " Which of the following will ensure the thread will be in running state?", " yield()", " notify()", " wait()", " Thread.killThread()", 3 );
        addQuestion50 ( q7 );
        Question q8 = new Question ( " Which of these keywords are used to implement synchronization?", " synchronize", " syn", " synch", " synchronized", 4 );
        addQuestion50 ( q8 );
        Question q9 = new Question ( " Which of this method is used to avoid polling in Java?", " wait()", " notify()", " notifyAll()", " All ", 4 );
        addQuestion50 ( q9 );
        Question q10 = new Question ( " Which of these method wakes up the first thread that called wait()?", " wake()", " notify()", " start()", " notifyAll()", 2 );
        addQuestion50 ( q10 );

    }
    private void fillQuestionsTable51() {
        // I/O & Applets

        Question q1 = new Question ( " Which of these methods is used to write() into a file?", " put()", " putFile()", " write()", " writeFile()", 3 );
        addQuestion51 ( q1 );
        Question q2 = new Question ( " Which of these functions is called to display the output of an applet?", " display()", " paint()", " displayApplet()", " PrintApplet()", 2 );
        addQuestion51 ( q2 );
        Question q3 = new Question ( " Which of these methods can be used to output a string in an applet?", " display()", "  print() ", " drawString() ", " transient() ", 3 );
        addQuestion51 ( q3 );
        Question q4 = new Question ( " Which of these methods is a part of Abstract Window Toolkit (AWT) ?", " display()", " paint()", " drawString()", " transient()", 2 );
        addQuestion51 ( q4 );
        Question q5 = new Question ( " Which of these modifiers can be used for a variable so that it can be accessed from any thread or parts of a program?", " transient", " volatile", " global", " No modifier is needed", 2 );
        addQuestion51 ( q5 );
        Question q6 = new Question ( " Which of these operators can be used to get run time information about an object?", " getInfo", " Info", " instanceof", " getinfoof", 3 );
        addQuestion51 ( q6 );
        Question q7 = new Question ( " Which of these exception is thrown in cases when the file specified for writing is not found?", " IOException", " FileException", " FileNotFoundException", " FileInputException", 3 );
        addQuestion51 ( q7 );
        Question q8 = new Question ( " Which of these methods are used to read in from file?", " get()", " read()", " scan()", " readFileInput()", 2 );
        addQuestion51 ( q8 );
        Question q9 = new Question ( " Which of these values is returned by read() method is end of file (EOF) is encountered?", " 0", " 1", " -1", " Null", 3 );
        addQuestion51 ( q9 );
        Question q10 = new Question ( " Which of these exception is thrown by close() and read() methods?", " IOException", " FileException", " FileNotFoundException", " FileInputOutputException", 1 );
        addQuestion51 ( q10 );
    }
    private void fillQuestionsTable52() {
        //Event Handling
        Question q1 = new Question ( " Which of these classes is used to define exceptions? ", "Exception ", "Throwable ", "Abstract ", "System ", 1 );
        addQuestion52 ( q1 );
        Question q2 = new Question ( " Which of these methods return description of an exception? ", "getException() ", " getMessage()", "obtainDescription() ", "obtainException() ", 2 );
        addQuestion52 ( q2 );
        Question q3 = new Question ( " Which of these methods is used to print stack trace? ", "obtainStackTrace() ", "printStackTrace() ", " getStackTrace()", "displayStackTrace() ", 2 );
        addQuestion52 ( q3 );
        Question q4 = new Question ( "  Which of these classes is super class of Exception class? ", "Throwable ", "System ", "RunTime ", "Class ", 1 );
        addQuestion52 ( q4 );
        Question q5 = new Question ( " Which of these events is generated when computer gains or loses input focus?", " ComponentEvent", " ContainerEvent", " FocusEvent", " InputEvent", 3 );
        addQuestion52 ( q1 );
        Question q6 = new Question ( " FocusEvent is subclass of which of these classes?", " ComponentEvent", " ContainerEvent", " ItemEvent", " InputEvent", 1 );
        addQuestion52 ( q2 );
        Question q7 = new Question ( " Which of these methods can be used to know the type of focus change?", " typeFocus()", " typeEventFocus()", " isTemporary()", " isPermanent()", 3 );
        addQuestion52 ( q3 );
        Question q8 = new Question ( " Which of these is superclass of ContainerEvent class?", " WindowEvent", " ComponentEvent", " ItemEvent", " InputEvent", 2 );
        addQuestion52 ( q4 );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME2 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME3 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME4 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME5);
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME6 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME7 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME8 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME9 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME10 );

        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME11 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME12 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME13 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME14 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME15);
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME16 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME17 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME18 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME19 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME20 );

        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME21 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME22 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME23 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME24 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME25);
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME26 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME27 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME28 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME29 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME30 );

        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME31 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME32 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME33 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME34 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME35);
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME36 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME37 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME38 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME39 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME40 );


        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME41 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME42 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME43 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME44 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME45);
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME46 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME47 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME48 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME49 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME50 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME51 );
        db.execSQL ( "DROP TABLE IF EXISTS " + QuizContract.QuestionsTable.TABLE_NAME52 );
        onCreate ( db );
    }



    private void addQuestion(Question question)  {
        ContentValues cv = new ContentValues ();
        cv.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME, null, cv );
    }
    private void addQuestion2(Question question) {
        ContentValues cv2 = new ContentValues ();
        cv2.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv2.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv2.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv2.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv2.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv2.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME2, null, cv2 );
    }
    private void addQuestion3(Question question) {
        ContentValues cv3 = new ContentValues ();
        cv3.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv3.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv3.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv3.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv3.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv3.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME3, null, cv3 );
    }
    private void addQuestion4(Question question) {
        ContentValues cv4 = new ContentValues ();
        cv4.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv4.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv4.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv4.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv4.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv4.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME4, null, cv4 );
    }
    private void addQuestion5(Question question) {
        ContentValues cv5 = new ContentValues ();
        cv5.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv5.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv5.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv5.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv5.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv5.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME5, null, cv5 );
    }
    private void addQuestion6(Question question) {
        ContentValues cv6 = new ContentValues ();
        cv6.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv6.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv6.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv6.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv6.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv6.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME6, null, cv6 );
    }
    private void addQuestion7(Question question) {
        ContentValues cv7 = new ContentValues ();
        cv7.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv7.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv7.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv7.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv7.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv7.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME7, null, cv7 );
    }
    private void addQuestion8(Question question) {
        ContentValues cv8 = new ContentValues ();
        cv8.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv8.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv8.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv8.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv8.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv8.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME8, null, cv8 );
    }
    private void addQuestion9(Question question) {
        ContentValues cv9 = new ContentValues ();
        cv9.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv9.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv9.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv9.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv9.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv9.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME9, null, cv9 );
    }
    private void addQuestion10(Question question) {
        ContentValues cv10 = new ContentValues ();
        cv10.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv10.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv10.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv10.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv10.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv10.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME10, null, cv10 );
    }
    /////////////////////////////////////////////
    private void addQuestion11(Question question)  {
        ContentValues cv11 = new ContentValues ();
        cv11.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv11.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv11.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv11.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv11.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv11.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME11, null, cv11 );
    }
    private void addQuestion12(Question question) {
        ContentValues cv12 = new ContentValues ();
        cv12.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv12.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv12.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv12.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv12.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv12.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME12, null, cv12 );
    }
    private void addQuestion13(Question question) {
        ContentValues cv13 = new ContentValues ();
        cv13.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv13.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv13.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv13.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv13.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv13.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME13, null, cv13 );
    }
    private void addQuestion14(Question question) {
        ContentValues cv14 = new ContentValues ();
        cv14.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv14.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv14.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv14.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv14.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv14.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME14, null, cv14 );
    }
    private void addQuestion15(Question question) {
        ContentValues cv15 = new ContentValues ();
        cv15.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv15.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv15.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv15.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv15.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv15.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME15, null, cv15 );
    }
    private void addQuestion16(Question question) {
        ContentValues cv16 = new ContentValues ();
        cv16.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv16.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv16.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv16.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv16.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv16.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME16, null, cv16 );
    }
    private void addQuestion17(Question question) {
        ContentValues cv17 = new ContentValues ();
        cv17.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv17.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv17.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv17.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv17.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv17.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME17, null, cv17 );
    }
    private void addQuestion18(Question question) {
        ContentValues cv18 = new ContentValues ();
        cv18.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv18.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv18.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv18.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv18.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv18.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME18, null, cv18 );
    }
    private void addQuestion19(Question question) {
        ContentValues cv19 = new ContentValues ();
        cv19.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv19.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv19.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv19.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv19.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv19.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME19, null, cv19 );
    }
    private void addQuestion20(Question question) {
        ContentValues cv20 = new ContentValues ();
        cv20.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv20.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv20.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv20.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv20.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv20.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME20, null, cv20 );
    }
    ///////////////////////////////
    private void addQuestion21(Question question)  {
        ContentValues cv21 = new ContentValues ();
        cv21.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv21.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv21.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv21.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv21.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv21.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME21, null, cv21 );
    }
    private void addQuestion22(Question question) {
        ContentValues cv22 = new ContentValues ();
        cv22.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv22.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv22.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv22.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv22.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv22.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME22, null, cv22 );
    }
    private void addQuestion23(Question question) {
        ContentValues cv23 = new ContentValues ();
        cv23.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv23.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv23.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv23.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv23.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv23.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME23, null, cv23 );
    }
    private void addQuestion24(Question question) {
        ContentValues cv24 = new ContentValues ();
        cv24.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv24.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv24.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv24.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv24.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv24.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME24, null, cv24 );
    }
    private void addQuestion25(Question question) {
        ContentValues cv25 = new ContentValues ();
        cv25.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv25.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv25.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv25.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv25.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv25.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME25, null, cv25 );
    }
    private void addQuestion26(Question question) {
        ContentValues cv26 = new ContentValues ();
        cv26.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv26.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv26.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv26.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv26.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv26.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME26, null, cv26 );
    }
    private void addQuestion27(Question question) {
        ContentValues cv27 = new ContentValues ();
        cv27.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv27.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv27.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv27.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv27.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv27.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME27, null, cv27 );
    }
    private void addQuestion28(Question question) {
        ContentValues cv28 = new ContentValues ();
        cv28.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv28.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv28.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv28.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv28.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv28.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME28, null, cv28 );
    }
    private void addQuestion29(Question question) {
        ContentValues cv29 = new ContentValues ();
        cv29.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv29.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv29.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv29.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv29.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv29.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME29, null, cv29 );
    }
    private void addQuestion30(Question question) {
        ContentValues cv30 = new ContentValues ();
        cv30.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv30.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv30.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv30.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv30.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv30.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME30, null, cv30 );
    }
    ////////////////////////////////////////////
    private void addQuestion31(Question question)  {
        ContentValues cv31 = new ContentValues ();
        cv31.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv31.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv31.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv31.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv31.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv31.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME31, null, cv31 );
    }
    private void addQuestion32(Question question) {
        ContentValues cv32 = new ContentValues ();
        cv32.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv32.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv32.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv32.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv32.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv32.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME32, null, cv32 );
    }
    private void addQuestion33(Question question) {
        ContentValues cv33 = new ContentValues ();
        cv33.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv33.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv33.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv33.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv33.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv33.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME33, null, cv33 );
    }
    private void addQuestion34(Question question) {
        ContentValues cv34 = new ContentValues ();
        cv34.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv34.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv34.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv34.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv34.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv34.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME34, null, cv34 );
    }
    private void addQuestion35(Question question) {
        ContentValues cv35 = new ContentValues ();
        cv35.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv35.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv35.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv35.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv35.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv35.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME35, null, cv35 );
    }
    private void addQuestion36(Question question) {
        ContentValues cv36 = new ContentValues ();
        cv36.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv36.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv36.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv36.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv36.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv36.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME36, null, cv36 );
    }
    private void addQuestion37(Question question) {
        ContentValues cv37 = new ContentValues ();
        cv37.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv37.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv37.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv37.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv37.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv37.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME37, null, cv37 );
    }
    private void addQuestion38(Question question) {
        ContentValues cv38 = new ContentValues ();
        cv38.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv38.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv38.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv38.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv38.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv38.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME38, null, cv38 );
    }
    private void addQuestion39(Question question) {
        ContentValues cv39 = new ContentValues ();
        cv39.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv39.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv39.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv39.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv39.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv39.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME39, null, cv39 );
    }
    private void addQuestion40(Question question) {
        ContentValues cv40 = new ContentValues ();
        cv40.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv40.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv40.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv40.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv40.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv40.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME40, null, cv40 );
    }
    ///////////////////////////////////////////
    private void addQuestion41(Question question) {
        ContentValues cv41 = new ContentValues ();
        cv41.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv41.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv41.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv41.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv41.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv41.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME41, null, cv41 );
    }

    private void addQuestion42(Question question) {
        ContentValues cv42 = new ContentValues ();
        cv42.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv42.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv42.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv42.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv42.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv42.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME42, null, cv42 );
    }


    private void addQuestion43(Question question) {
        ContentValues cv43 = new ContentValues ();
        cv43.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv43.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv43.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv43.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv43.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv43.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME43, null, cv43 );
    }


    private void addQuestion44(Question question) {
        ContentValues cv44 = new ContentValues ();
        cv44.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv44.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv44.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv44.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv44.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv44.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME44, null, cv44 );
    }


    private void addQuestion45(Question question) {
        ContentValues cv45 = new ContentValues ();
        cv45.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv45.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv45.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv45.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv45.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv45.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME45, null, cv45 );
    }


    private void addQuestion46(Question question) {
        ContentValues cv46 = new ContentValues ();
        cv46.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv46.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv46.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv46.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv46.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv46.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME46, null, cv46 );
    }


    private void addQuestion47(Question question) {
        ContentValues cv47 = new ContentValues ();
        cv47.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv47.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv47.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv47.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv47.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv47.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME47, null, cv47 );
    }


    private void addQuestion48(Question question) {
        ContentValues cv48 = new ContentValues ();
        cv48.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv48.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv48.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv48.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv48.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv48.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME48, null, cv48 );
    }


    private void addQuestion49(Question question) {
        ContentValues cv49 = new ContentValues ();
        cv49.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv49.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv49.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv49.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv49.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv49.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME49, null, cv49 );
    }


    private void addQuestion50(Question question) {
        ContentValues cv50 = new ContentValues ();
        cv50.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv50.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv50.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv50.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv50.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv50.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME50, null, cv50 );
    }

    private void addQuestion51(Question question) {
        ContentValues cv51 = new ContentValues ();
        cv51.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv51.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv51.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv51.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv51.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv51.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME51, null, cv51 );
    }

    private void addQuestion52(Question question) {
        ContentValues cv52 = new ContentValues ();
        cv52.put ( QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion () );
        cv52.put ( QuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1 () );
        cv52.put ( QuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2 () );
        cv52.put ( QuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3 () );

        cv52.put ( QuizContract.QuestionsTable.COLUMN_OPTION4, question.getOption4 () );

        cv52.put ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr () );
        db.insert ( QuizContract.QuestionsTable.TABLE_NAME52, null, cv52 );
    }




////////////////////////////////////////////////////////////////////////////////
    public List<Question> getAllQuestions() {
        List<Question> questionList = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME, null );
        if (c.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c.getInt ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList.add ( question );
            } while (c.moveToNext ());
        }
        c.close ();
        return questionList;
    }
    public List<Question> getAllQuestions2() {
        List<Question> questionList2 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c2 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME2, null );
        if (c2.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c2.getString ( c2.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c2.getString ( c2.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c2.getString ( c2.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c2.getString ( c2.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c2.getString ( c2.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c2.getInt ( c2.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList2.add ( question );
            } while (c2.moveToNext ());
        }
        c2.close ();
        return questionList2;
    }
    public List<Question> getAllQuestions3() {
        List<Question> questionList3 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c3 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME3, null );
        if (c3.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c3.getString ( c3.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c3.getString ( c3.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c3.getString ( c3.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c3.getString ( c3.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c3.getString ( c3.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c3.getInt ( c3.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList3.add ( question );
            } while (c3.moveToNext ());
        }
        c3.close ();
        return questionList3;
    }
    public List<Question> getAllQuestions4() {
        List<Question> questionList4 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c4 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME4, null );
        if (c4.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c4.getString ( c4.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c4.getString ( c4.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c4.getString ( c4.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c4.getString ( c4.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c4.getString ( c4.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c4.getInt ( c4.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList4.add ( question );
            } while (c4.moveToNext ());
        }
        c4.close ();
        return questionList4;
    }
    public List<Question> getAllQuestions5() {
        List<Question> questionList5 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c5 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME5, null );
        if (c5.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c5.getString ( c5.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c5.getString ( c5.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c5.getString ( c5.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c5.getString ( c5.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c5.getString ( c5.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c5.getInt ( c5.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList5.add ( question );
            } while (c5.moveToNext ());
        }
        c5.close ();
        return questionList5;
    }
    public List<Question> getAllQuestions6() {
        List<Question> questionList6 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c6 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME6, null );
        if (c6.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c6.getString ( c6.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c6.getString ( c6.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c6.getString ( c6.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c6.getString ( c6.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c6.getString ( c6.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c6.getInt ( c6.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList6.add ( question );
            } while (c6.moveToNext ());
        }
        c6.close ();
        return questionList6;
    }
    public List<Question> getAllQuestions7() {
        List<Question> questionList7 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c7 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME7, null );
        if (c7.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c7.getString ( c7.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c7.getString ( c7.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c7.getString ( c7.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c7.getString ( c7.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c7.getString ( c7.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c7.getInt ( c7.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList7.add ( question );
            } while (c7.moveToNext ());
        }
        c7.close ();
        return questionList7;
    }
    public List<Question> getAllQuestions8() {
        List<Question> questionList8 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c8 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME8, null );
        if (c8.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c8.getString ( c8.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c8.getString ( c8.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c8.getString ( c8.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c8.getString ( c8.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c8.getString ( c8.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c8.getInt ( c8.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList8.add ( question );
            } while (c8.moveToNext ());
        }
        c8.close ();
        return questionList8;
    }
    public List<Question> getAllQuestions9() {
        List<Question> questionList9 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c9 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME9, null );
        if (c9.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c9.getString ( c9.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c9.getString ( c9.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c9.getString ( c9.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c9.getString ( c9.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c9.getString ( c9.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c9.getInt ( c9.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList9.add ( question );
            } while (c9.moveToNext ());
        }
        c9.close ();
        return questionList9;
    }
    public List<Question> getAllQuestions10() {
        List<Question> questionList10 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c10 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME10, null );
        if (c10.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c10.getString ( c10.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c10.getString ( c10.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c10.getString ( c10.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c10.getString ( c10.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c10.getString ( c10.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c10.getInt ( c10.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList10.add ( question );
            } while (c10.moveToNext ());
        }
        c10.close ();
        return questionList10;
    }
    //////////////////////////////
    public List<Question> getAllQuestions11() {
        List<Question> questionList11 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c11 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME11, null );
        if (c11.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c11.getString ( c11.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c11.getString ( c11.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c11.getString ( c11.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c11.getString ( c11.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c11.getString ( c11.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c11.getInt ( c11.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList11.add ( question );
            } while (c11.moveToNext ());
        }
        c11.close ();
        return questionList11;
    }
    public List<Question> getAllQuestions12() {
        List<Question> questionList12 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c12 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME12, null );
        if (c12.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c12.getString ( c12.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c12.getString ( c12.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c12.getString ( c12.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c12.getString ( c12.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c12.getString ( c12.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c12.getInt ( c12.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList12.add ( question );
            } while (c12.moveToNext ());
        }
        c12.close ();
        return questionList12;
    }
    public List<Question> getAllQuestions13() {
        List<Question> questionList13 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c13 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME13, null );
        if (c13.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c13.getString ( c13.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c13.getString ( c13.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c13.getString ( c13.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c13.getString ( c13.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c13.getString ( c13.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c13.getInt ( c13.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList13.add ( question );
            } while (c13.moveToNext ());
        }
        c13.close ();
        return questionList13;
    }
    public List<Question> getAllQuestions14() {
        List<Question> questionList14 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c14 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME14, null );
        if (c14.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c14.getString ( c14.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c14.getString ( c14.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c14.getString ( c14.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c14.getString ( c14.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c14.getString ( c14.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c14.getInt ( c14.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList14.add ( question );
            } while (c14.moveToNext ());
        }
        c14.close ();
        return questionList14;
    }
    public List<Question> getAllQuestions15() {
        List<Question> questionList15 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c15 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME15, null );
        if (c15.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c15.getString ( c15.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c15.getString ( c15.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c15.getString ( c15.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c15.getString ( c15.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c15.getString ( c15.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c15.getInt ( c15.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList15.add ( question );
            } while (c15.moveToNext ());
        }
        c15.close ();
        return questionList15;
    }
    public List<Question> getAllQuestions16() {
        List<Question> questionList16 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c16 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME16, null );
        if (c16.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c16.getString ( c16.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c16.getString ( c16.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c16.getString ( c16.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c16.getString ( c16.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c16.getString ( c16.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c16.getInt ( c16.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList16.add ( question );
            } while (c16.moveToNext ());
        }
        c16.close ();
        return questionList16;
    }
    public List<Question> getAllQuestions17() {
        List<Question> questionList17 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c17 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME17, null );
        if (c17.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c17.getString ( c17.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c17.getString ( c17.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c17.getString ( c17.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c17.getString ( c17.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c17.getString ( c17.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c17.getInt ( c17.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList17.add ( question );
            } while (c17.moveToNext ());
        }
        c17.close ();
        return questionList17;
    }
    public List<Question> getAllQuestions18() {
        List<Question> questionList18 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c18 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME18, null );
        if (c18.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c18.getString ( c18.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c18.getString ( c18.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c18.getString ( c18.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c18.getString ( c18.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );

//                question.setOption4 ( c.getString ( c.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setOption4 ( c18.getString ( c18.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );

                question.setAnswerNr ( c18.getInt ( c18.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList18.add ( question );
            } while (c18.moveToNext ());
        }
        c18.close ();
        return questionList18;
    }
    public List<Question> getAllQuestions19() {
        List<Question> questionList19 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c19 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME19, null );
        if (c19.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c19.getString ( c19.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c19.getString ( c19.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c19.getString ( c19.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c19.getString ( c19.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c19.getString ( c19.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c19.getInt ( c19.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList19.add ( question );
            } while (c19.moveToNext ());
        }
        c19.close ();
        return questionList19;
    }
    public List<Question> getAllQuestions20() {
        List<Question> questionList20 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c20 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME20, null );
        if (c20.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c20.getString ( c20.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c20.getString ( c20.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c20.getString ( c20.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c20.getString ( c20.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c20.getString ( c20.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c20.getInt ( c20.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList20.add ( question );
            } while (c20.moveToNext ());
        }
        c20.close ();
        return questionList20;
    }
    //////////////////////
    public List<Question> getAllQuestions21() {
        List<Question> questionList21 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c21 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME21, null );
        if (c21.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c21.getString ( c21.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c21.getString ( c21.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c21.getString ( c21.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c21.getString ( c21.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c21.getString ( c21.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c21.getInt ( c21.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList21.add ( question );
            } while (c21.moveToNext ());
        }
        c21.close ();
        return questionList21;
    }
    public List<Question> getAllQuestions22() {
        List<Question> questionList22 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c22 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME22, null );
        if (c22.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c22.getString ( c22.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c22.getString ( c22.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c22.getString ( c22.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c22.getString ( c22.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c22.getString ( c22.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c22.getInt ( c22.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList22.add ( question );
            } while (c22.moveToNext ());
        }
        c22.close ();
        return questionList22;
    }
    public List<Question> getAllQuestions23() {
        List<Question> questionList23 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c23 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME23, null );
        if (c23.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c23.getString ( c23.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c23.getString ( c23.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c23.getString ( c23.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c23.getString ( c23.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c23.getString ( c23.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c23.getInt ( c23.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList23.add ( question );
            } while (c23.moveToNext ());
        }
        c23.close ();
        return questionList23;
    }
    public List<Question> getAllQuestions24() {
        List<Question> questionList24 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c24 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME24, null );
        if (c24.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c24.getString ( c24.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c24.getString ( c24.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c24.getString ( c24.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c24.getString ( c24.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c24.getString ( c24.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c24.getInt ( c24.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList24.add ( question );
            } while (c24.moveToNext ());
        }
        c24.close ();
        return questionList24;
    }
    public List<Question> getAllQuestions25() {
        List<Question> questionList25 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c25 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME25, null );
        if (c25.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c25.getString ( c25.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c25.getString ( c25.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c25.getString ( c25.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c25.getString ( c25.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c25.getString ( c25.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c25.getInt ( c25.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList25.add ( question );
            } while (c25.moveToNext ());
        }
        c25.close ();
        return questionList25;
    }
    public List<Question> getAllQuestions26() {
        List<Question> questionList26 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c26 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME26, null );
        if (c26.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c26.getString ( c26.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c26.getString ( c26.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c26.getString ( c26.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c26.getString ( c26.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c26.getString ( c26.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c26.getInt ( c26.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList26.add ( question );
            } while (c26.moveToNext ());
        }
        c26.close ();
        return questionList26;
    }
    public List<Question> getAllQuestions27() {
        List<Question> questionList27 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c27 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME27, null );
        if (c27.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c27.getString ( c27.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c27.getString ( c27.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c27.getString ( c27.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c27.getString ( c27.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c27.getString ( c27.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c27.getInt ( c27.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList27.add ( question );
            } while (c27.moveToNext ());
        }
        c27.close ();
        return questionList27;
    }
    public List<Question> getAllQuestions28() {
        List<Question> questionList28 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c28 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME28, null );
        if (c28.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c28.getString ( c28.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c28.getString ( c28.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c28.getString ( c28.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c28.getString ( c28.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c28.getString ( c28.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c28.getInt ( c28.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList28.add ( question );
            } while (c28.moveToNext ());
        }
        c28.close ();
        return questionList28;
    }
    public List<Question> getAllQuestions29() {
        List<Question> questionList29 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c29 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME29, null );
        if (c29.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c29.getString ( c29.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c29.getString ( c29.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c29.getString ( c29.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c29.getString ( c29.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c29.getString ( c29.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c29.getInt ( c29.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList29.add ( question );
            } while (c29.moveToNext ());
        }
        c29.close ();
        return questionList29;
    }
    public List<Question> getAllQuestions30() {
        List<Question> questionList30 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c30 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME30, null );
        if (c30.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c30.getString ( c30.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c30.getString ( c30.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c30.getString ( c30.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c30.getString ( c30.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c30.getString ( c30.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c30.getInt ( c30.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList30.add ( question );
            } while (c30.moveToNext ());
        }
        c30.close ();
        return questionList30;
    }
    ///////////////////////////////////////
    public List<Question> getAllQuestions31() {
        List<Question> questionList31 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c31 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME31, null );
        if (c31.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c31.getString ( c31.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c31.getString ( c31.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c31.getString ( c31.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c31.getString ( c31.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c31.getString ( c31.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c31.getInt ( c31.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList31.add ( question );
            } while (c31.moveToNext ());
        }
        c31.close ();
        return questionList31;
    }
    public List<Question> getAllQuestions32() {
        List<Question> questionList32 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c32 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME32, null );
        if (c32.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c32.getString ( c32.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c32.getString ( c32.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c32.getString ( c32.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c32.getString ( c32.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c32.getString ( c32.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c32.getInt ( c32.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList32.add ( question );
            } while (c32.moveToNext ());
        }
        c32.close ();
        return questionList32;
    }
    public List<Question> getAllQuestions33() {
        List<Question> questionList33 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c33 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME33, null );
        if (c33.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c33.getString ( c33.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c33.getString ( c33.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c33.getString ( c33.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c33.getString ( c33.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c33.getString ( c33.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c33.getInt ( c33.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList33.add ( question );
            } while (c33.moveToNext ());
        }
        c33.close ();
        return questionList33;
    }
    public List<Question> getAllQuestions34() {
        List<Question> questionList34 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c34 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME34, null );
        if (c34.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c34.getString ( c34.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c34.getString ( c34.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c34.getString ( c34.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c34.getString ( c34.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c34.getString ( c34.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c34.getInt ( c34.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList34.add ( question );
            } while (c34.moveToNext ());
        }
        c34.close ();
        return questionList34;
    }
    public List<Question> getAllQuestions35() {
        List<Question> questionList35 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c35 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME35, null );
        if (c35.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c35.getString ( c35.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c35.getString ( c35.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c35.getString ( c35.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c35.getString ( c35.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c35.getString ( c35.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c35.getInt ( c35.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList35.add ( question );
            } while (c35.moveToNext ());
        }
        c35.close ();
        return questionList35;
    }
    public List<Question> getAllQuestions36() {
        List<Question> questionList36 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c36 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME36, null );
        if (c36.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c36.getString ( c36.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c36.getString ( c36.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c36.getString ( c36.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c36.getString ( c36.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c36.getString ( c36.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c36.getInt ( c36.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList36.add ( question );
            } while (c36.moveToNext ());
        }
        c36.close ();
        return questionList36;
    }
    public List<Question> getAllQuestions37() {
        List<Question> questionList37 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c37 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME37, null );
        if (c37.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c37.getString ( c37.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c37.getString ( c37.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c37.getString ( c37.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c37.getString ( c37.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c37.getString ( c37.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c37.getInt ( c37.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList37.add ( question );
            } while (c37.moveToNext ());
        }
        c37.close ();
        return questionList37;
    }
    public List<Question> getAllQuestions38() {
        List<Question> questionList38 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c38 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME38, null );
        if (c38.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c38.getString ( c38.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c38.getString ( c38.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c38.getString ( c38.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c38.getString ( c38.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c38.getString ( c38.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c38.getInt ( c38.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList38.add ( question );
            } while (c38.moveToNext ());
        }
        c38.close ();
        return questionList38;
    }
    public List<Question> getAllQuestions39() {
        List<Question> questionList39 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c39 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME39, null );
        if (c39.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c39.getString ( c39.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c39.getString ( c39.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c39.getString ( c39.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c39.getString ( c39.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c39.getString ( c39.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c39.getInt ( c39.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList39.add ( question );
            } while (c39.moveToNext ());
        }
        c39.close ();
        return questionList39;
    }

    public List<Question> getAllQuestions40() {
        List<Question> questionList40 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c40 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME40, null );
        if (c40.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c40.getString ( c40.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c40.getString ( c40.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c40.getString ( c40.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c40.getString ( c40.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c40.getString ( c40.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c40.getInt ( c40.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList40.add ( question );
            } while (c40.moveToNext ());
        }
        c40.close ();
        return questionList40;
    }
    ///////////////////////////////////////



    public List<Question> getAllQuestions41() {
        List<Question> questionList41 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c41 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME41, null );
        if (c41.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c41.getString ( c41.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c41.getString ( c41.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c41.getString ( c41.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c41.getString ( c41.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c41.getString ( c41.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c41.getInt ( c41.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList41.add ( question );
            } while (c41.moveToNext ());
        }
        c41.close ();
        return questionList41;
    }

    public List<Question> getAllQuestions42() {
        List<Question> questionList42 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c42 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME42, null );
        if (c42.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c42.getString ( c42.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c42.getString ( c42.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c42.getString ( c42.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c42.getString ( c42.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c42.getString ( c42.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c42.getInt ( c42.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList42.add ( question );
            } while (c42.moveToNext ());
        }
        c42.close ();
        return questionList42;
    }

    public List<Question> getAllQuestions43() {
        List<Question> questionList43 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c43 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME43, null );
        if (c43.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c43.getString ( c43.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c43.getString ( c43.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c43.getString ( c43.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c43.getString ( c43.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c43.getString ( c43.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c43.getInt ( c43.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList43.add ( question );
            } while (c43.moveToNext ());
        }
        c43.close ();
        return questionList43;
    }

    public List<Question> getAllQuestions44() {
        List<Question> questionList44 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c44 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME44, null );
        if (c44.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c44.getString ( c44.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c44.getString ( c44.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c44.getString ( c44.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c44.getString ( c44.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c44.getString ( c44.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c44.getInt ( c44.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList44.add ( question );
            } while (c44.moveToNext ());
        }
        c44.close ();
        return questionList44;
    }

    public List<Question> getAllQuestions45() {
        List<Question> questionList45 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c45 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME45, null );
        if (c45.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c45.getString ( c45.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c45.getString ( c45.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c45.getString ( c45.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c45.getString ( c45.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c45.getString ( c45.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c45.getInt ( c45.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList45.add ( question );
            } while (c45.moveToNext ());
        }
        c45.close ();
        return questionList45;
    }

    public List<Question> getAllQuestions46() {
        List<Question> questionList46 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c46 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME46, null );
        if (c46.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c46.getString ( c46.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c46.getString ( c46.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c46.getString ( c46.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c46.getString ( c46.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c46.getString ( c46.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c46.getInt ( c46.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList46.add ( question );
            } while (c46.moveToNext ());
        }
        c46.close ();
        return questionList46;
    }

    public List<Question> getAllQuestions47() {
        List<Question> questionList47 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c47 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME47, null );
        if (c47.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c47.getString ( c47.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c47.getString ( c47.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c47.getString ( c47.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c47.getString ( c47.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c47.getString ( c47.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c47.getInt ( c47.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList47.add ( question );
            } while (c47.moveToNext ());
        }
        c47.close ();
        return questionList47;
    }

    public List<Question> getAllQuestions48() {
        List<Question> questionList48 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c48 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME48, null );
        if (c48.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c48.getString ( c48.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c48.getString ( c48.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c48.getString ( c48.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c48.getString ( c48.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c48.getString ( c48.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c48.getInt ( c48.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList48.add ( question );
            } while (c48.moveToNext ());
        }
        c48.close ();
        return questionList48;
    }

    public List<Question> getAllQuestions49() {
        List<Question> questionList49 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c49 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME49, null );
        if (c49.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c49.getString ( c49.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c49.getString ( c49.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c49.getString ( c49.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c49.getString ( c49.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c49.getString ( c49.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c49.getInt ( c49.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList49.add ( question );
            } while (c49.moveToNext ());
        }
        c49.close ();
        return questionList49;
    }

    public List<Question> getAllQuestions50() {
        List<Question> questionList50 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c50 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME50, null );
        if (c50.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c50.getString ( c50.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c50.getString ( c50.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c50.getString ( c50.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c50.getString ( c50.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c50.getString ( c50.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c50.getInt ( c50.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList50.add ( question );
            } while (c50.moveToNext ());
        }
        c50.close ();
        return questionList50;
    }

    public List<Question> getAllQuestions51() {
        List<Question> questionList51 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c51 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME51, null );
        if (c51.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c51.getString ( c51.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c51.getString ( c51.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c51.getString ( c51.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c51.getString ( c51.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c51.getString ( c51.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c51.getInt ( c51.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList51.add ( question );
            } while (c51.moveToNext ());
        }
        c51.close ();
        return questionList51;
    }

    public List<Question> getAllQuestions52() {
        List<Question> questionList52 = new ArrayList<> ();
        db = getReadableDatabase ();
        Cursor c52 = db.rawQuery ( "SELECT * FROM " + QuizContract.QuestionsTable.TABLE_NAME52, null );
        if (c52.moveToFirst ()) {
            do {
                Question question = new Question ();
                question.setQuestion ( c52.getString ( c52.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_QUESTION ) ) );
                question.setOption1 ( c52.getString ( c52.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION1 ) ) );
                question.setOption2 ( c52.getString ( c52.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION2 ) ) );
                question.setOption3 ( c52.getString ( c52.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION3 ) ) );
                question.setOption4 ( c52.getString ( c52.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_OPTION4 ) ) );
                question.setAnswerNr ( c52.getInt ( c52.getColumnIndex ( QuizContract.QuestionsTable.COLUMN_ANSWER_NR ) ) );
                questionList52.add ( question );
            } while (c52.moveToNext ());
        }
        c52.close ();
        return questionList52;
    }
}