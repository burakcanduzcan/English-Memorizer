package com.example.englishmemorizer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemorizeActivity extends AppCompatActivity {

    TextView tvWord, tvDefinition, tvExample, tvSynonyms, tvAntonyms;
    ImageView ivImage;
    Button btnNext, btnAddToList;
    DataBaseHelper dataBaseHelper;
    int currentWordIndex = 0;
    List<UserlistModel> wordsToMemorize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorize);

        tvWord = (TextView) findViewById(R.id.tvWord);
        tvDefinition = (TextView) findViewById(R.id.tvDefinition);
        tvExample = (TextView) findViewById(R.id.tvExample);
        tvSynonyms = (TextView) findViewById(R.id.tvSynonyms);
        tvAntonyms = (TextView) findViewById(R.id.tvAntonyms);
        ivImage = (ImageView) findViewById(R.id.ivImage);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnAddToList = (Button) findViewById(R.id.btnAddToList);

        dataBaseHelper = new DataBaseHelper(MemorizeActivity.this);
        //get data from intent
        String memorizeCategory = getIntent().getStringExtra("MemorizeCategory");
        //Toast.makeText(this, memorizeCategory, Toast.LENGTH_SHORT).show();

        if (memorizeCategory.toString().equals("User List")) {
            btnAddToList.setVisibility(View.INVISIBLE);
        }

        //create list of words from specific category
        wordsToMemorize = new ArrayList<>();
        wordsToMemorize = dataBaseHelper.getFromCategory(memorizeCategory);
        Collections.shuffle(wordsToMemorize);
        //Toast.makeText(this, "Size of array is: " + wordsToMemorize.size(), Toast.LENGTH_SHORT).show();

        //show word in activity START
        if (wordsToMemorize.size() != 0) {
            updateActivityForCurrentIndex(wordsToMemorize);
        }

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentWordIndex < wordsToMemorize.size()-1) {
                    currentWordIndex++;
                    updateActivityForCurrentIndex(wordsToMemorize);
                } else {
                    btnNext.setVisibility(View.INVISIBLE);
                    Toast.makeText(MemorizeActivity.this, "End of the category", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnAddToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvWord.getText().toString().equals("UNKNOWN")) {
                    Toast.makeText(MemorizeActivity.this, "Word not found", Toast.LENGTH_SHORT).show();
                } else {
                    UserlistModel userlistModel;
                    try {
                        userlistModel = new UserlistModel(-1,
                                "User List",
                                wordsToMemorize.get(currentWordIndex).getWord(),
                                wordsToMemorize.get(currentWordIndex).getDefinition(),
                                wordsToMemorize.get(currentWordIndex).getExampleSentence(),
                                wordsToMemorize.get(currentWordIndex).getSynonyms(),
                                wordsToMemorize.get(currentWordIndex).getAntonyms(),
                                wordsToMemorize.get(currentWordIndex).getImagePath()
                        );
                    } catch (Exception e) {
                        Toast.makeText(MemorizeActivity.this, "Error when adding the word to user list", Toast.LENGTH_SHORT).show();
                        userlistModel = new UserlistModel(-1, "error", "error", "error", "error", "error", "error", "error");
                    }

                    DataBaseHelper dataBaseHelper = new DataBaseHelper(MemorizeActivity.this);
                    boolean success = dataBaseHelper.addOne(userlistModel);
                    if (success) {
                        Toast.makeText(MemorizeActivity.this, "Word added to the user list!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MemorizeActivity.this, "Failed to add to the user list", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void updateActivityForCurrentIndex(List<UserlistModel> wordsToMemorize) {
        //show image
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher_round);
        Glide.with(this).load(wordsToMemorize.get(currentWordIndex).getImagePath().toString()).apply(options).into(ivImage);
        tvWord.setText(wordsToMemorize.get(currentWordIndex).getWord());
        tvDefinition.setText(wordsToMemorize.get(currentWordIndex).getDefinition());
        tvExample.setText(wordsToMemorize.get(currentWordIndex).getExampleSentence());
        tvSynonyms.setText(wordsToMemorize.get(currentWordIndex).getSynonyms());
        tvAntonyms.setText(wordsToMemorize.get(currentWordIndex).getAntonyms());
    }

}