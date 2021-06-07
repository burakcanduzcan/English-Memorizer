package com.example.englishmemorizer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DICTIONARY_TABLE = "DICTIONARY_TABLE";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_CATEGORY = "CATEGORY";
    public static final String COLUMN_WORD = "WORD";
    public static final String COLUMN_DEFINITION = "DEFINITION";
    public static final String COLUMN_EXAMPLESENTENCE = "EXAMPLESENTENCE";
    public static final String COLUMN_SYNONYMS = "SYNONYMS";
    public static final String COLUMN_ANTONYMS = "ANTONYMS";
    public static final String COLUMN_IMAGEPATH = "IMAGEPATH";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "dictionary.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + DICTIONARY_TABLE + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_CATEGORY + " TEXT, " + COLUMN_WORD + " TEXT, " + COLUMN_DEFINITION + " TEXT, " + COLUMN_EXAMPLESENTENCE + " TEXT, " + COLUMN_SYNONYMS + " TEXT, " + COLUMN_ANTONYMS + " TEXT, " + COLUMN_IMAGEPATH + " TEXT)";
        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //incomplete
    public void starterInsert() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues verb1 = new ContentValues();
        verb1.put(COLUMN_CATEGORY, "Verb");
        verb1.put(COLUMN_WORD, "propose");
        verb1.put(COLUMN_DEFINITION, "put forward (a plan or suggestion) for consideration by others");
        verb1.put(COLUMN_EXAMPLESENTENCE, "he proposed a new nine-point peace plan");
        verb1.put(COLUMN_SYNONYMS, "suggest");
        verb1.put(COLUMN_ANTONYMS, "withdraw");
        verb1.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, verb1);

        ContentValues verb2 = new ContentValues();
        verb2.put(COLUMN_CATEGORY, "Verb");
        verb2.put(COLUMN_WORD, "suggest");
        verb2.put(COLUMN_DEFINITION, "put forward for consideration");
        verb2.put(COLUMN_EXAMPLESENTENCE, "I suggest that we wait a day or two");
        verb2.put(COLUMN_SYNONYMS, "propose");
        verb2.put(COLUMN_ANTONYMS, "declare");
        verb2.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, verb2);

        ContentValues verb3 = new ContentValues();
        verb3.put(COLUMN_CATEGORY, "Verb");
        verb3.put(COLUMN_WORD, "declare");
        verb3.put(COLUMN_DEFINITION, "say something in a solemn and emphatic manner");
        verb3.put(COLUMN_EXAMPLESENTENCE, "the prime minister declared that the programme of austerity had paid off");
        verb3.put(COLUMN_SYNONYMS, "proclaim");
        verb3.put(COLUMN_ANTONYMS, "implicit");
        verb3.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, verb3);
/*
        ContentValues verb4 = new ContentValues();
        verb4.put(COLUMN_CATEGORY, "Verb");
        verb4.put(COLUMN_WORD, "imagine");
        verb4.put(COLUMN_DEFINITION, "form a mental image or concept of");
        verb4.put(COLUMN_EXAMPLESENTENCE, "she imagined him at his desk, his head in his hands");
        verb4.put(COLUMN_SYNONYMS, "envisage");
        verb4.put(COLUMN_ANTONYMS, "doubt");
        verb4.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, verb4);

        ContentValues verb5 = new ContentValues();
        verb5.put(COLUMN_CATEGORY, "Verb");
        verb5.put(COLUMN_WORD, "lean");
        verb5.put(COLUMN_DEFINITION, "be in or move into a sloping position");
        verb5.put(COLUMN_EXAMPLESENTENCE, "he leaned back in his chair");
        verb5.put(COLUMN_SYNONYMS, "tilt");
        verb5.put(COLUMN_ANTONYMS, "even");
        verb5.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, verb5);

        ContentValues verb6 = new ContentValues();
        verb6.put(COLUMN_CATEGORY, "Verb");
        verb6.put(COLUMN_WORD, "stay");
        verb6.put(COLUMN_DEFINITION, "stay the same; remain in a certain state");
        verb6.put(COLUMN_EXAMPLESENTENCE, "The dress remained wet after repeated attempts to dry it");
        verb6.put(COLUMN_SYNONYMS, "wait");
        verb6.put(COLUMN_ANTONYMS, "leave");
        verb6.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, verb6);

        ContentValues adjective1 = new ContentValues();
        adjective1.put(COLUMN_CATEGORY, "Adjective");
        adjective1.put(COLUMN_WORD, "obnoxious");
        adjective1.put(COLUMN_DEFINITION, "extremely unpleasant");
        adjective1.put(COLUMN_EXAMPLESENTENCE, "obnoxious odours");
        adjective1.put(COLUMN_SYNONYMS, "unpleasant");
        adjective1.put(COLUMN_ANTONYMS, "pleasant");
        adjective1.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adjective1);

        ContentValues phraseIdiom1 = new ContentValues();
        phraseIdiom1.put(COLUMN_CATEGORY, "Phrase-Idiom");
        phraseIdiom1.put(COLUMN_WORD, "Hit the sack");
        phraseIdiom1.put(COLUMN_DEFINITION, "Go to sleep");
        phraseIdiom1.put(COLUMN_EXAMPLESENTENCE, "I've got to get up early tomorrow, so I'm going to hit the sack");
        phraseIdiom1.put(COLUMN_SYNONYMS, "");
        phraseIdiom1.put(COLUMN_ANTONYMS, "");
        phraseIdiom1.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, phraseIdiom1);
*/


    }

    public boolean addOne(UserlistModel userlistModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_CATEGORY, userlistModel.getCategory());
        cv.put(COLUMN_WORD, userlistModel.getWord());
        cv.put(COLUMN_DEFINITION, userlistModel.getDefinition());
        cv.put(COLUMN_EXAMPLESENTENCE, userlistModel.getExampleSentence());
        cv.put(COLUMN_SYNONYMS, userlistModel.getSynonyms());
        cv.put(COLUMN_ANTONYMS, userlistModel.getAntonyms());
        cv.put(COLUMN_IMAGEPATH, userlistModel.getImagePath());

        long insert = db.insert(DICTIONARY_TABLE, null, cv);
        if (insert == -1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean deleteOne(UserlistModel userlistModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        String queryString = "DELETE FROM " + DICTIONARY_TABLE + " WHERE " + COLUMN_ID + " = " + userlistModel.getId();
        Cursor cursor = db.rawQuery(queryString, null);
        if (cursor.moveToFirst()) {
            return true;
        } else {
            return false;
        }
    }

    public List<UserlistModel> getFromCategory(String specificCat) {
        List<UserlistModel> returnList = new ArrayList<>();

        String queryString = "SELECT * FROM " + DICTIONARY_TABLE + " WHERE " + COLUMN_CATEGORY + " = '" + specificCat + "'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);
        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(0);
                String category = cursor.getString(1);
                String word = cursor.getString(2);
                String definition = cursor.getString(3);
                String exampleSentence = cursor.getString(4);
                String synonyms = cursor.getString(5);
                String antonyms = cursor.getString(6);
                String imagePath = cursor.getString(7);

                UserlistModel newUserword = new UserlistModel(id, category, word, definition, exampleSentence, synonyms, antonyms, imagePath);
                returnList.add(newUserword);
            } while (cursor.moveToNext());
        } else {
            //failure, don't return anything
        }

        cursor.close();
        db.close();
        return returnList;
    }

    public List<UserlistModel> getEveryone() {
        List<UserlistModel> returnList = new ArrayList<>();

        String queryString = "SELECT * FROM " + DICTIONARY_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);
        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(0);
                String category = cursor.getString(1);
                String word = cursor.getString(2);
                String definition = cursor.getString(3);
                String exampleSentence = cursor.getString(4);
                String synonyms = cursor.getString(5);
                String antonyms = cursor.getString(6);
                String imagePath = cursor.getString(7);

                UserlistModel newUserword = new UserlistModel(id, category, word, definition, exampleSentence, synonyms, antonyms, imagePath);
                returnList.add(newUserword);
            } while (cursor.moveToNext());
        } else {
            //failure, don't return anything
        }

        cursor.close();
        db.close();
        return returnList;
    }
}

