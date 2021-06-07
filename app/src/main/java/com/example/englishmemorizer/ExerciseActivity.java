package com.example.englishmemorizer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseActivity extends AppCompatActivity {

    TextView tvCurrentWord, tvAnswer;
    Button btnOption1,btnOption2, btnOption3, btnOption4, btnNextQuestion;
    DataBaseHelper dataBaseHelper;
    int currentWordIndex = 0;
    List<UserlistModel> wordsToExercise;
    List<String> definitionList;
    int correctAnswerIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        tvCurrentWord = (TextView) findViewById(R.id.tvCurrentWord);
        tvAnswer = (TextView) findViewById(R.id.tvAnswer);
        btnOption1 = (Button) findViewById(R.id.btnOption1);
        btnOption2 = (Button) findViewById(R.id.btnOption2);
        btnOption3 = (Button) findViewById(R.id.btnOption3);
        btnOption4 = (Button) findViewById(R.id.btnOption4);
        btnNextQuestion = (Button) findViewById(R.id.btnNextQuestion);

        dataBaseHelper = new DataBaseHelper(ExerciseActivity.this);
        //get data from intent
        String exerciseCategory = getIntent().getStringExtra("ExerciseCategory");
        //Toast.makeText(this, memorizeCategory, Toast.LENGTH_SHORT).show();

        //create list of words from specific category
        wordsToExercise = new ArrayList<>();
        wordsToExercise = dataBaseHelper.getFromCategory(exerciseCategory);
        definitionList = new ArrayList<>();
        for (int i = 0; i < wordsToExercise.size(); i++) {
            definitionList.add(wordsToExercise.get(i).getDefinition());
        }

        Collections.shuffle(wordsToExercise);
        //Toast.makeText(this, "Size of array is: " + wordsToMemorize.size(), Toast.LENGTH_SHORT).show();

        prepareForCurrentQuestion();

        btnOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (correctAnswerIndex == 0) {
                    btnOption1.setBackgroundColor(Color.GREEN);
                    tvAnswer.setText("CORRECT");
                    tvAnswer.setTextColor(Color.GREEN);
                    btnOption1.setEnabled(false);
                    btnOption2.setEnabled(false);
                    btnOption3.setEnabled(false);
                    btnOption4.setEnabled(false);
                    btnNextQuestion.setVisibility(View.VISIBLE);
                } else {
                    btnOption1.setBackgroundColor(Color.RED);
                    tvAnswer.setText("WRONG");
                    tvAnswer.setTextColor(Color.RED);
                    btnOption1.setEnabled(false);
                    btnOption2.setEnabled(false);
                    btnOption3.setEnabled(false);
                    btnOption4.setEnabled(false);
                    btnNextQuestion.setVisibility(View.VISIBLE);
                }
            }
        });

        btnOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (correctAnswerIndex == 1) {
                    btnOption2.setBackgroundColor(Color.GREEN);
                    tvAnswer.setText("CORRECT");
                    tvAnswer.setTextColor(Color.GREEN);
                    btnOption1.setEnabled(false);
                    btnOption2.setEnabled(false);
                    btnOption3.setEnabled(false);
                    btnOption4.setEnabled(false);
                    btnNextQuestion.setVisibility(View.VISIBLE);
                } else {
                    btnOption2.setBackgroundColor(Color.RED);
                    tvAnswer.setText("WRONG");
                    tvAnswer.setTextColor(Color.RED);
                    btnOption1.setEnabled(false);
                    btnOption2.setEnabled(false);
                    btnOption3.setEnabled(false);
                    btnOption4.setEnabled(false);
                    btnNextQuestion.setVisibility(View.VISIBLE);
                }
            }
        });

        btnOption3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (correctAnswerIndex == 2) {
                    btnOption3.setBackgroundColor(Color.GREEN);
                    tvAnswer.setText("CORRECT");
                    tvAnswer.setTextColor(Color.GREEN);
                    btnOption1.setEnabled(false);
                    btnOption2.setEnabled(false);
                    btnOption3.setEnabled(false);
                    btnOption4.setEnabled(false);
                    btnNextQuestion.setVisibility(View.VISIBLE);
                } else {
                    btnOption3.setBackgroundColor(Color.RED);
                    tvAnswer.setText("WRONG");
                    tvAnswer.setTextColor(Color.RED);
                    btnOption1.setEnabled(false);
                    btnOption2.setEnabled(false);
                    btnOption3.setEnabled(false);
                    btnOption4.setEnabled(false);
                    btnNextQuestion.setVisibility(View.VISIBLE);
                }
            }
        });

        btnOption4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (correctAnswerIndex == 3) {
                    btnOption4.setBackgroundColor(Color.GREEN);
                    tvAnswer.setText("CORRECT");
                    tvAnswer.setTextColor(Color.GREEN);
                    btnOption1.setEnabled(false);
                    btnOption2.setEnabled(false);
                    btnOption3.setEnabled(false);
                    btnOption4.setEnabled(false);
                    btnNextQuestion.setVisibility(View.VISIBLE);
                } else {
                    btnOption4.setBackgroundColor(Color.RED);
                    tvAnswer.setText("WRONG");
                    tvAnswer.setTextColor(Color.RED);
                    btnOption1.setEnabled(false);
                    btnOption2.setEnabled(false);
                    btnOption3.setEnabled(false);
                    btnOption4.setEnabled(false);
                    btnNextQuestion.setVisibility(View.VISIBLE);
                }
            }
        });

        btnNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentWordIndex++;
                prepareForCurrentQuestion();
            }
        });
    }

    private void prepareForCurrentQuestion() {
        if (currentWordIndex < wordsToExercise.size()-1) {
            btnNextQuestion.setVisibility(View.INVISIBLE);
            btnOption1.setEnabled(true);
            btnOption2.setEnabled(true);
            btnOption3.setEnabled(true);
            btnOption4.setEnabled(true);
            btnOption1.setBackgroundColor(Color.WHITE);
            btnOption2.setBackgroundColor(Color.WHITE);
            btnOption3.setBackgroundColor(Color.WHITE);
            btnOption4.setBackgroundColor(Color.WHITE);
            tvAnswer.setTextColor(Color.BLACK);
            tvCurrentWord.setText(wordsToExercise.get(currentWordIndex).getWord());
            tvAnswer.setText("");
            Collections.shuffle(definitionList);
            btnOption1.setText(definitionList.get(0));
            btnOption2.setText(definitionList.get(1));
            btnOption3.setText(definitionList.get(2));
            btnOption4.setText(definitionList.get(3));
            btnOption1.setText(wordsToExercise.get(currentWordIndex).getDefinition());
            correctAnswerIndex = 0;
        } else {
            Toast.makeText(this, "Exercise finished!", Toast.LENGTH_SHORT).show();
            btnNextQuestion.setVisibility(View.INVISIBLE);
            btnOption1.setEnabled(false);
            btnOption2.setEnabled(false);
            btnOption3.setEnabled(false);
            btnOption4.setEnabled(false);
            btnOption1.setBackgroundColor(Color.WHITE);
            btnOption2.setBackgroundColor(Color.WHITE);
            btnOption3.setBackgroundColor(Color.WHITE);
            btnOption4.setBackgroundColor(Color.WHITE);
            tvCurrentWord.setText("");
            tvAnswer.setText("");
            btnOption1.setText("");
            btnOption2.setText("");
            btnOption3.setText("");
            btnOption4.setText("");
        }

    }
}