package com.example.englishmemorizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btnBack;
    int stateExercise = 0;
    int stateMemorize = 0;
    DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btnBack = (Button) findViewById(R.id.btnBack);
        dataBaseHelper = new DataBaseHelper(MainActivity.this);

        String returnedValueSharedPref = getApplicationContext().getSharedPreferences(getApplicationContext().getPackageName(), Context.MODE_PRIVATE).getString("isInserted4", "false");
        if (returnedValueSharedPref.toString().equals("false")) {
            dataBaseHelper.starterInsert();
            SharedPreferences sharedPref = this.getSharedPreferences(this.getPackageName(), Context.MODE_PRIVATE);
            SharedPreferences.Editor edit = sharedPref.edit();
            edit.putString("isInserted4", "true");
            boolean b = edit.commit();
            if (b = true) {
                Toast.makeText(this, "Successfully initialized starting dictionary", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Error during dictionary initialization", Toast.LENGTH_SHORT).show();
            }
        } else if (returnedValueSharedPref.toString().equals("true")) {
            //Toast.makeText(this, "Dictionary database is already made", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Invalid shared preference value", Toast.LENGTH_SHORT).show();
        }

        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btnBack.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (stateExercise == 0 && stateMemorize == 0) {
                    stateExercise = 1;
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                    btn5.setVisibility(View.VISIBLE);
                    btnBack.setVisibility(View.VISIBLE);
                    btn1.setText("Verb");
                    btn2.setText("Adverb");
                    btn3.setText("Adjective");
                    btn4.setText("Phrase/Idiom");
                    btn5.setText("User List");

                } else if (stateExercise == 1) {
                    //Create intent
                    //go to exercise activity with verb key
                    Intent intent11 = new Intent(getBaseContext(), ExerciseActivity.class);
                    intent11.putExtra("ExerciseCategory", "Verb");
                    startActivity(intent11);
                } else if (stateMemorize == 1) {
                    //Create intent
                    //go to memorize activity with verb key
                    Intent intent12 = new Intent(getBaseContext(), MemorizeActivity.class);
                    intent12.putExtra("MemorizeCategory", "Verb");
                    startActivity(intent12);
                } else {
                    Toast.makeText(MainActivity.this, "Something went wrong, please report it back.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (stateExercise == 0 && stateMemorize == 0) {
                    // go to CRUD page for adding user words
                    Intent intentToUserlist = new Intent(MainActivity.this, UserlistActivity.class);
                    startActivity(intentToUserlist);

                } else if (stateExercise == 1) {
                    //Create intent
                    //go to exercise activity with adverb key
                    Intent intent21 = new Intent(getBaseContext(), ExerciseActivity.class);
                    intent21.putExtra("ExerciseCategory", "Adverb");
                    startActivity(intent21);
                } else if (stateMemorize == 1) {
                    //Create intent
                    //go to memorize activity with adverb key
                    Intent intent22 = new Intent(getBaseContext(), MemorizeActivity.class);
                    intent22.putExtra("MemorizeCategory", "Adverb");
                    startActivity(intent22);
                } else {
                    Toast.makeText(MainActivity.this, "Something went wrong, please report it back.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (stateExercise == 0 && stateMemorize == 0) {
                    stateMemorize = 1;
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.VISIBLE);
                    btn5.setVisibility(View.VISIBLE);
                    btnBack.setVisibility(View.VISIBLE);
                    btn1.setText("Verb");
                    btn2.setText("Adverb");
                    btn3.setText("Adjective");
                    btn4.setText("Phrase/Idiom");
                    btn5.setText("User List");

                } else if (stateExercise == 1) {
                    //Create intent
                    //go to exercise activity with adjective key
                    Intent intent31 = new Intent(getBaseContext(), ExerciseActivity.class);
                    intent31.putExtra("ExerciseCategory", "Adjective");
                    startActivity(intent31);
                } else if (stateMemorize == 1) {
                    //Create intent
                    //go to memorize activity with adjective key
                    Intent intent32 = new Intent(getBaseContext(), MemorizeActivity.class);
                    intent32.putExtra("MemorizeCategory", "Adjective");
                    startActivity(intent32);
                } else {
                    Toast.makeText(MainActivity.this, "Something went wrong, please report it back.", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (stateExercise == 1) {
                    //Create intent
                    //go to exercise activity with Phrase-Idiom key
                    Intent intent41 = new Intent(getBaseContext(), ExerciseActivity.class);
                    intent41.putExtra("ExerciseCategory", "Phrase-Idiom");
                    startActivity(intent41);
                } else if (stateMemorize == 1) {
                    //Create intent
                    //go to memorize activity with Phrase-Idiom key
                    Intent intent42 = new Intent(getBaseContext(), MemorizeActivity.class);
                    intent42.putExtra("MemorizeCategory", "Phrase-Idiom");
                    startActivity(intent42);
                } else {
                    Toast.makeText(MainActivity.this, "Something went wrong, please report it back.", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (stateExercise == 1) {
                    //Create intent
                    //go to exercise activity with User List key
                    Intent intent51 = new Intent(getBaseContext(), ExerciseActivity.class);
                    intent51.putExtra("ExerciseCategory", "User List");
                    startActivity(intent51);
                } else if (stateMemorize == 1) {
                    //Create intent
                    //go to memorize activity with User List key
                    Intent intent52 = new Intent(getBaseContext(), MemorizeActivity.class);
                    intent52.putExtra("MemorizeCategory", "User List");
                    startActivity(intent52);
                } else {
                    Toast.makeText(MainActivity.this, "Something went wrong, please report it back.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (stateExercise == 1 || stateMemorize == 1) {
                    stateExercise = 0;
                    stateMemorize = 0;
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btnBack.setVisibility(View.INVISIBLE);
                    btn1.setText("Exercise");
                    btn2.setText("Add Word");
                    btn3.setText("Memorize");
                }
            }
        });

    }
}