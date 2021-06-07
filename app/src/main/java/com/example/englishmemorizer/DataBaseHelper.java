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

        ContentValues verb7 = new ContentValues();
        verb7.put(COLUMN_CATEGORY, "Verb");
        verb7.put(COLUMN_WORD, "eat");
        verb7.put(COLUMN_DEFINITION, "put (food) into the mouth and chew and swallow it");
        verb7.put(COLUMN_EXAMPLESENTENCE, "he was eating a hot dog");
        verb7.put(COLUMN_SYNONYMS, "consume, devour");
        verb7.put(COLUMN_ANTONYMS, "starve, fast");
        verb7.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, verb7);

        ContentValues verb8 = new ContentValues();
        verb8.put(COLUMN_CATEGORY, "Verb");
        verb8.put(COLUMN_WORD, "cry");
        verb8.put(COLUMN_DEFINITION, "shed tears, typically as an expression of distress, pain, or sorrow");
        verb8.put(COLUMN_EXAMPLESENTENCE, "don't cry—it'll be all right");
        verb8.put(COLUMN_SYNONYMS, "weep, sob");
        verb8.put(COLUMN_ANTONYMS, "laugh");
        verb8.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, verb8);

        ContentValues verb9 = new ContentValues();
        verb9.put(COLUMN_CATEGORY, "Verb");
        verb9.put(COLUMN_WORD, "walk");
        verb9.put(COLUMN_DEFINITION, "move at a regular pace by lifting and setting down each foot in turn, never having both feet off the ground at once");
        verb9.put(COLUMN_EXAMPLESENTENCE, "I walked across the lawn");
        verb9.put(COLUMN_SYNONYMS, "stroll");
        verb9.put(COLUMN_ANTONYMS, "run");
        verb9.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, verb9);

        ContentValues verb10 = new ContentValues();
        verb10.put(COLUMN_CATEGORY, "Verb");
        verb10.put(COLUMN_WORD, "run");
        verb10.put(COLUMN_DEFINITION, "move at a speed faster than a walk, never having both or all the feet on the ground at the same time");
        verb10.put(COLUMN_EXAMPLESENTENCE, "pass or cause to pass quickly in a particular direction");
        verb10.put(COLUMN_SYNONYMS, "sprint");
        verb10.put(COLUMN_ANTONYMS, "walk");
        verb10.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, verb10);
        //VERB END
        ContentValues adverb1 = new ContentValues();
        adverb1.put(COLUMN_CATEGORY, "Adverb");
        adverb1.put(COLUMN_WORD, "slowly");
        adverb1.put(COLUMN_DEFINITION, "at a slow speed");
        adverb1.put(COLUMN_EXAMPLESENTENCE, "Could you please speak more slowly?");
        adverb1.put(COLUMN_SYNONYMS, "steaidly");
        adverb1.put(COLUMN_ANTONYMS, "quickly");
        adverb1.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adverb1);

        ContentValues adverb2 = new ContentValues();
        adverb2.put(COLUMN_CATEGORY, "Adverb");
        adverb2.put(COLUMN_WORD, "rapidly");
        adverb2.put(COLUMN_DEFINITION, "very quickly; at a great rate");
        adverb2.put(COLUMN_EXAMPLESENTENCE, "the business is expanding rapidly");
        adverb2.put(COLUMN_SYNONYMS, "fleetly");
        adverb2.put(COLUMN_ANTONYMS, "lingering");
        adverb2.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adverb2);

        ContentValues adverb3 = new ContentValues();
        adverb3.put(COLUMN_CATEGORY, "Adverb");
        adverb3.put(COLUMN_WORD, "clumsily");
        adverb3.put(COLUMN_DEFINITION, "in an awkward and careless way");
        adverb3.put(COLUMN_EXAMPLESENTENCE, "he climbed clumsily over the rail");
        adverb3.put(COLUMN_SYNONYMS, "bulky");
        adverb3.put(COLUMN_ANTONYMS, "unwieldy");
        adverb3.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adverb3);

        ContentValues adverb4 = new ContentValues();
        adverb4.put(COLUMN_CATEGORY, "Adverb");
        adverb4.put(COLUMN_WORD, "delicately");
        adverb4.put(COLUMN_DEFINITION, "in a manner displaying fineness of texture or structure and intricate workmanship");
        adverb4.put(COLUMN_EXAMPLESENTENCE, "a silk dress delicately embroidered in gold");
        adverb4.put(COLUMN_SYNONYMS, "gently");
        adverb4.put(COLUMN_ANTONYMS, "indelicately");
        adverb4.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adverb4);

        ContentValues adverb5 = new ContentValues();
        adverb5.put(COLUMN_CATEGORY, "Adverb");
        adverb5.put(COLUMN_WORD, "badly");
        adverb5.put(COLUMN_DEFINITION, "in an unsatisfactory, inadequate, or unsuccessful way");
        adverb5.put(COLUMN_EXAMPLESENTENCE, "England have played badly this year");
        adverb5.put(COLUMN_SYNONYMS, "poorly");
        adverb5.put(COLUMN_ANTONYMS, "well");
        adverb5.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adverb5);

        ContentValues adverb6 = new ContentValues();
        adverb6.put(COLUMN_CATEGORY, "Adverb");
        adverb6.put(COLUMN_WORD, "diligently");
        adverb6.put(COLUMN_DEFINITION, "in a way that shows care and conscientiousness in one's work or duties");
        adverb6.put(COLUMN_EXAMPLESENTENCE, "he spends his nights diligently working on his dissertation");
        adverb6.put(COLUMN_SYNONYMS, "assiduous");
        adverb6.put(COLUMN_ANTONYMS, "careless");
        adverb6.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adverb6);

        ContentValues adverb7 = new ContentValues();
        adverb7.put(COLUMN_CATEGORY, "Adverb");
        adverb7.put(COLUMN_WORD, "abruptly");
        adverb7.put(COLUMN_DEFINITION, "suddenly and unexpectedly");
        adverb7.put(COLUMN_EXAMPLESENTENCE, "the film ends rather abruptly");
        adverb7.put(COLUMN_SYNONYMS, "precipitously");
        adverb7.put(COLUMN_ANTONYMS, "gradual");
        adverb7.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adverb7);

        ContentValues adverb8 = new ContentValues();
        adverb8.put(COLUMN_CATEGORY, "Adverb");
        adverb8.put(COLUMN_WORD, "sweetly");
        adverb8.put(COLUMN_DEFINITION, "in a generally pleasing or endearing way");
        adverb8.put(COLUMN_EXAMPLESENTENCE, "he looked at his children sleeping sweetly");
        adverb8.put(COLUMN_SYNONYMS, "delightfully");
        adverb8.put(COLUMN_ANTONYMS, "awfully");
        adverb8.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adverb8);

        ContentValues adverb9 = new ContentValues();
        adverb9.put(COLUMN_CATEGORY, "Adverb");
        adverb9.put(COLUMN_WORD, "warmly");
        adverb9.put(COLUMN_DEFINITION, "in a way that gives out warmth; with comfortable heat");
        adverb9.put(COLUMN_EXAMPLESENTENCE, "the sun shone warmly");
        adverb9.put(COLUMN_SYNONYMS, "kindly");
        adverb9.put(COLUMN_ANTONYMS, "apathetically");
        adverb9.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adverb9);

        ContentValues adverb10 = new ContentValues();
        adverb10.put(COLUMN_CATEGORY, "Adverb");
        adverb10.put(COLUMN_WORD, "sadly");
        adverb10.put(COLUMN_DEFINITION, "in a sad manner");
        adverb10.put(COLUMN_EXAMPLESENTENCE, "he smiled sadly");
        adverb10.put(COLUMN_SYNONYMS, "unfortunately");
        adverb10.put(COLUMN_ANTONYMS, "fortunately");
        adverb10.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adverb10);
        //ADVERB END
        ContentValues adjective1 = new ContentValues();
        adjective1.put(COLUMN_CATEGORY, "Adjective");
        adjective1.put(COLUMN_WORD, "obnoxious");
        adjective1.put(COLUMN_DEFINITION, "extremely unpleasant");
        adjective1.put(COLUMN_EXAMPLESENTENCE, "obnoxious odours");
        adjective1.put(COLUMN_SYNONYMS, "unpleasant");
        adjective1.put(COLUMN_ANTONYMS, "pleasant");
        adjective1.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adjective1);

        ContentValues adjective2 = new ContentValues();
        adjective2.put(COLUMN_CATEGORY, "Adjective");
        adjective2.put(COLUMN_WORD, "charming");
        adjective2.put(COLUMN_DEFINITION, "very pleasant or attractive");
        adjective2.put(COLUMN_EXAMPLESENTENCE, "a charming country cottage");
        adjective2.put(COLUMN_SYNONYMS, "pleasing");
        adjective2.put(COLUMN_ANTONYMS, "repulsive");
        adjective2.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adjective2);

        ContentValues adjective3 = new ContentValues();
        adjective3.put(COLUMN_CATEGORY, "Adjective");
        adjective3.put(COLUMN_WORD, "cruel");
        adjective3.put(COLUMN_DEFINITION, "wilfully causing pain or suffering to others, or feeling no concern about it");
        adjective3.put(COLUMN_EXAMPLESENTENCE, "people who are cruel to animals");
        adjective3.put(COLUMN_SYNONYMS, "brutal");
        adjective3.put(COLUMN_ANTONYMS, "mericful");
        adjective3.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adjective3);

        ContentValues adjective4 = new ContentValues();
        adjective4.put(COLUMN_CATEGORY, "Adjective");
        adjective4.put(COLUMN_WORD, "fantastic");
        adjective4.put(COLUMN_DEFINITION, "extraordinarily good or attractive");
        adjective4.put(COLUMN_EXAMPLESENTENCE, "they did a fantastic job");
        adjective4.put(COLUMN_SYNONYMS, "great");
        adjective4.put(COLUMN_ANTONYMS, "ordinary");
        adjective4.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adjective4);

        ContentValues adjective5 = new ContentValues();
        adjective5.put(COLUMN_CATEGORY, "Adjective");
        adjective5.put(COLUMN_WORD, "gentle");
        adjective5.put(COLUMN_DEFINITION, "having or showing a mild, kind, or tender temperament or character");
        adjective5.put(COLUMN_EXAMPLESENTENCE, "a gentle, sensitive man");
        adjective5.put(COLUMN_SYNONYMS, "kind");
        adjective5.put(COLUMN_ANTONYMS, "unkind");
        adjective5.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adjective5);

        ContentValues adjective6 = new ContentValues();
        adjective6.put(COLUMN_CATEGORY, "Adjective");
        adjective6.put(COLUMN_WORD, "unkind");
        adjective6.put(COLUMN_DEFINITION, "inconsiderate and harsh to others");
        adjective6.put(COLUMN_EXAMPLESENTENCE, "you were terribly unkind to her");
        adjective6.put(COLUMN_SYNONYMS, "uncharitable");
        adjective6.put(COLUMN_ANTONYMS, "kind");
        adjective6.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adjective6);

        ContentValues adjective7 = new ContentValues();
        adjective7.put(COLUMN_CATEGORY, "Adjective");
        adjective7.put(COLUMN_WORD, "bitter");
        adjective7.put(COLUMN_DEFINITION, "having a sharp, pungent taste or smell; not sweet");
        adjective7.put(COLUMN_EXAMPLESENTENCE, "raw berries have an intensely bitter flavour");
        adjective7.put(COLUMN_SYNONYMS, "sharp");
        adjective7.put(COLUMN_ANTONYMS, "sweet");
        adjective7.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adjective7);

        ContentValues adjective8 = new ContentValues();
        adjective8.put(COLUMN_CATEGORY, "Adjective");
        adjective8.put(COLUMN_WORD, "sharp");
        adjective8.put(COLUMN_DEFINITION, "having an edge or point that is able to cut or pierce something");
        adjective8.put(COLUMN_EXAMPLESENTENCE, "producing a sudden, piercing physical sensation or effect");
        adjective8.put(COLUMN_SYNONYMS, "keen");
        adjective8.put(COLUMN_ANTONYMS, "blunt");
        adjective8.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adjective8);

        ContentValues adjective9 = new ContentValues();
        adjective9.put(COLUMN_CATEGORY, "Adjective");
        adjective9.put(COLUMN_WORD, "blunt");
        adjective9.put(COLUMN_DEFINITION, "not having a sharp edge or point");
        adjective9.put(COLUMN_EXAMPLESENTENCE, "a blunt knife");
        adjective9.put(COLUMN_SYNONYMS, "dull");
        adjective9.put(COLUMN_ANTONYMS, "sharp");
        adjective9.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adjective9);

        ContentValues adjective10 = new ContentValues();
        adjective10.put(COLUMN_CATEGORY, "Adjective");
        adjective10.put(COLUMN_WORD, "dull ");
        adjective10.put(COLUMN_DEFINITION, "lacking interest or excitement");
        adjective10.put(COLUMN_EXAMPLESENTENCE, "your diet doesn't have to be dull and boring");
        adjective10.put(COLUMN_SYNONYMS, "uninteresting");
        adjective10.put(COLUMN_ANTONYMS, "intesting");
        adjective10.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, adjective10);
        //ADJECTIVE END
        ContentValues phraseIdiom1 = new ContentValues();
        phraseIdiom1.put(COLUMN_CATEGORY, "Phrase-Idiom");
        phraseIdiom1.put(COLUMN_WORD, "Hit the sack");
        phraseIdiom1.put(COLUMN_DEFINITION, "Go to sleep");
        phraseIdiom1.put(COLUMN_EXAMPLESENTENCE, "I've got to get up early tomorrow, so I'm going to hit the sack");
        phraseIdiom1.put(COLUMN_SYNONYMS, "");
        phraseIdiom1.put(COLUMN_ANTONYMS, "");
        phraseIdiom1.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, phraseIdiom1);

        ContentValues phraseIdiom2 = new ContentValues();
        phraseIdiom2.put(COLUMN_CATEGORY, "Phrase-Idiom");
        phraseIdiom2.put(COLUMN_WORD, "A blessing in disguise");
        phraseIdiom2.put(COLUMN_DEFINITION, "a good thing that seemed bad at first");
        phraseIdiom2.put(COLUMN_EXAMPLESENTENCE, "being omitted from the World Cup squad was a blessing in disguise");
        phraseIdiom2.put(COLUMN_SYNONYMS, "");
        phraseIdiom2.put(COLUMN_ANTONYMS, "");
        phraseIdiom2.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, phraseIdiom2);

        ContentValues phraseIdiom3 = new ContentValues();
        phraseIdiom3.put(COLUMN_CATEGORY, "Phrase-Idiom");
        phraseIdiom3.put(COLUMN_WORD, "A dime a dozen");
        phraseIdiom3.put(COLUMN_DEFINITION, "Something common");
        phraseIdiom3.put(COLUMN_EXAMPLESENTENCE, "experts in this field are a dime a dozen");
        phraseIdiom3.put(COLUMN_SYNONYMS, "");
        phraseIdiom3.put(COLUMN_ANTONYMS, "");
        phraseIdiom3.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, phraseIdiom3);

        ContentValues phraseIdiom4 = new ContentValues();
        phraseIdiom4.put(COLUMN_CATEGORY, "Phrase-Idiom");
        phraseIdiom4.put(COLUMN_WORD, "Beat around the bush");
        phraseIdiom4.put(COLUMN_DEFINITION, "Avoid saying what you mean, usually because it is uncomfortable");
        phraseIdiom4.put(COLUMN_EXAMPLESENTENCE, "Don't beat around the bush - get to the point");
        phraseIdiom4.put(COLUMN_SYNONYMS, "");
        phraseIdiom4.put(COLUMN_ANTONYMS, "");
        phraseIdiom4.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, phraseIdiom4);

        ContentValues phraseIdiom5 = new ContentValues();
        phraseIdiom5.put(COLUMN_CATEGORY, "Phrase-Idiom");
        phraseIdiom5.put(COLUMN_WORD, "Better late than never");
        phraseIdiom5.put(COLUMN_DEFINITION, "Better to arrive late than not to come at all");
        phraseIdiom5.put(COLUMN_EXAMPLESENTENCE, "it took them the majority of the campaign to come to that conclusion, but better late than never");
        phraseIdiom5.put(COLUMN_SYNONYMS, "");
        phraseIdiom5.put(COLUMN_ANTONYMS, "");
        phraseIdiom5.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, phraseIdiom5);

        ContentValues phraseIdiom6 = new ContentValues();
        phraseIdiom6.put(COLUMN_CATEGORY, "Phrase-Idiom");
        phraseIdiom6.put(COLUMN_WORD, "Bite the bullet");
        phraseIdiom6.put(COLUMN_DEFINITION, "To get something over with because it is inevitable");
        phraseIdiom6.put(COLUMN_EXAMPLESENTENCE, "decisions have to be taken and as director you have got to bite the bullet");
        phraseIdiom6.put(COLUMN_SYNONYMS, "");
        phraseIdiom6.put(COLUMN_ANTONYMS, "");
        phraseIdiom6.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, phraseIdiom6);

        ContentValues phraseIdiom7 = new ContentValues();
        phraseIdiom7.put(COLUMN_CATEGORY, "Phrase-Idiom");
        phraseIdiom7.put(COLUMN_WORD, "Break a leg");
        phraseIdiom7.put(COLUMN_DEFINITION, "Good luck");
        phraseIdiom7.put(COLUMN_EXAMPLESENTENCE, "Danny's family told him to “break a leg” right before he went up on stage");
        phraseIdiom7.put(COLUMN_SYNONYMS, "");
        phraseIdiom7.put(COLUMN_ANTONYMS, "");
        phraseIdiom7.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, phraseIdiom7);

        ContentValues phraseIdiom8 = new ContentValues();
        phraseIdiom8.put(COLUMN_CATEGORY, "Phrase-Idiom");
        phraseIdiom8.put(COLUMN_WORD, "Call it a day");
        phraseIdiom8.put(COLUMN_DEFINITION, "Stop working on something");
        phraseIdiom8.put(COLUMN_EXAMPLESENTENCE, "after three marriages, many men would have been more than ready to call it a day");
        phraseIdiom8.put(COLUMN_SYNONYMS, "");
        phraseIdiom8.put(COLUMN_ANTONYMS, "");
        phraseIdiom8.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, phraseIdiom8);

        ContentValues phraseIdiom9 = new ContentValues();
        phraseIdiom9.put(COLUMN_CATEGORY, "Phrase-Idiom");
        phraseIdiom9.put(COLUMN_WORD, "Cut somebody some slack");
        phraseIdiom9.put(COLUMN_DEFINITION, "Don't be so critical");
        phraseIdiom9.put(COLUMN_EXAMPLESENTENCE, "the press is willing to cut the President some slack because they like him");
        phraseIdiom9.put(COLUMN_SYNONYMS, "");
        phraseIdiom9.put(COLUMN_ANTONYMS, "");
        phraseIdiom9.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, phraseIdiom9);

        ContentValues phraseIdiom10 = new ContentValues();
        phraseIdiom10.put(COLUMN_CATEGORY, "Phrase-Idiom");
        phraseIdiom10.put(COLUMN_WORD, "Cutting corners");
        phraseIdiom10.put(COLUMN_DEFINITION, "Doing something poorly in order to save time or money");
        phraseIdiom10.put(COLUMN_EXAMPLESENTENCE, "there is always a temptation to cut corners when time is short");
        phraseIdiom10.put(COLUMN_SYNONYMS, "");
        phraseIdiom10.put(COLUMN_ANTONYMS, "");
        phraseIdiom10.put(COLUMN_IMAGEPATH, "https://i.imgur.com/8UdKNS4.jpg");
        db.insert(DICTIONARY_TABLE, null, phraseIdiom10);
        //phraseIdiomEnd
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

