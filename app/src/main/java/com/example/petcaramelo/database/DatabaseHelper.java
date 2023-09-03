package com.example.petcaramelo.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "caramelo";
    private static final String TABLE_ADOTAR = "adotar";
    private static final String TABLE_DOAR = "doar";
    private static final String TABLE_CORDENADAS = "cordenadas";
    private static final String CREATE_TABLE_ADOTAR = "CREATE TABLE " + TABLE_ADOTAR + "(" +
            "_id INTERGER PRIMARY KEY AUTOINCREMENT," +
            "nome VARCHAR(100)," +
            "endereco VARCHAR(100)," +
            "telefone VARCHAR(100)," +
            "id_corden INTERGER," +
            "CONSTRAINT fk_cordenadas FOREIGN KEY (id_corden) REFERENCES cordenadas (id)) ";

    private static final String CREATE_TABLE_DOAR = "CREATE TABLE " + TABLE_DOAR + "(" +
            "_id INTERGER PRIMARY KEY AUTOINCREMENT," +
            "nome VARCHAR(100)," +
            "endereco VARCHAR(100)," +
            "telefone VARCHAR(100)," +
            "id_corden INTERGER," +
            "CONSTRAINT fk_cordenadas FOREIGN KEY (id_corden) REFERENCES cordenadas (id)) ";
    ;
    private static final String CREATE_TABLE_CORDENADAS = "CREATE TABLE " + TABLE_CORDENADAS + "(" +
            "_id INTERGER PRIMARY KEY AUTOINCREMENT," +
            "latidute FLOAT," +
            "longitude FLOAT )";
    private static final String DROP_TABLE_ADOTAR = "DROP TABLE IF EXISTS " + TABLE_ADOTAR;
    private static final String DROP_TABLE_DOAR = "DROP TABLE IF EXISTS " + TABLE_DOAR;
    private static final String DROP_TABLE_CORDENADAS = "DROP TABLE IF EXISTS "+ TABLE_CORDENADAS;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME,null , 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_ADOTAR);
        sqLiteDatabase.execSQL(CREATE_TABLE_DOAR);
        sqLiteDatabase.execSQL(CREATE_TABLE_CORDENADAS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL(DROP_TABLE_ADOTAR);
        sqLiteDatabase.execSQL(DROP_TABLE_DOAR);
        sqLiteDatabase.execSQL(DROP_TABLE_CORDENADAS);
    }
}
