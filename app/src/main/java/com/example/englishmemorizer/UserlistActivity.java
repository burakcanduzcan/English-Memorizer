package com.example.englishmemorizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class UserlistActivity extends AppCompatActivity {

    EditText etWord, etDefinition, etExampleSentence, etSynonyms, etAntonyms, etImageURL;
    Button btnAdd, btnView;
    ListView lvUserlist;
    ArrayAdapter userlistArrayAdapter;
    DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);

        etWord = (EditText) findViewById(R.id.etWord);
        etDefinition = (EditText) findViewById(R.id.etDefinition);
        etExampleSentence = (EditText) findViewById(R.id.etExampleSentence);
        etSynonyms = (EditText) findViewById(R.id.etSynonyms);
        etAntonyms = (EditText) findViewById(R.id.etAntonyms);
        etImageURL = (EditText) findViewById(R.id.etImageURL);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnView = (Button) findViewById(R.id.btnView);
        lvUserlist = (ListView) findViewById(R.id.lvUserlist);
        dataBaseHelper = new DataBaseHelper(UserlistActivity.this);

        //show dictionary entries in listview
        ShowWordsOnListView();

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataBaseHelper = new DataBaseHelper(UserlistActivity.this);

                ShowWordsOnListView();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmpImageURL = "";
                if (etImageURL.getText().toString().equals("")) {
                    tmpImageURL = "https://i.imgur.com/8UdKNS4.jpg";
                } else {
                    tmpImageURL = etImageURL.getText().toString();
                }
                UserlistModel userlistModel;
                try {
                    userlistModel = new UserlistModel(-1,
                            "User List",
                            etWord.getText().toString(),
                            etDefinition.getText().toString(),
                            etExampleSentence.getText().toString(),
                            etSynonyms.getText().toString(),
                            etAntonyms.getText().toString(),
                            tmpImageURL.toString()
                    );
                    //Toast.makeText(UserlistActivity.this, userlistModel.getWord(), Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(UserlistActivity.this, "Error creating new word entry", Toast.LENGTH_SHORT).show();
                    userlistModel = new UserlistModel(-1, "error", "error", "error", "error", "error", "error", "error");
                }

                DataBaseHelper dataBaseHelper = new DataBaseHelper(UserlistActivity.this);
                boolean success = dataBaseHelper.addOne(userlistModel);
                Toast.makeText(UserlistActivity.this, "Success " + success, Toast.LENGTH_SHORT).show();
                ShowWordsOnListView();
            }
        });

        lvUserlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                UserlistModel clickedWord = (UserlistModel) parent.getItemAtPosition(position);
                dataBaseHelper.deleteOne(clickedWord);
                ShowWordsOnListView();
                Toast.makeText(UserlistActivity.this, "Deleted a word from the dictionary!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void ShowWordsOnListView() {
        userlistArrayAdapter = new ArrayAdapter<UserlistModel>(UserlistActivity.this, android.R.layout.simple_list_item_1, dataBaseHelper.getEveryone());
        //userlistArrayAdapter = new ArrayAdapter<UserlistModel>(UserlistActivity.this, android.R.layout.simple_list_item_1, dataBaseHelper.getFromCategory("Adjective"));
        lvUserlist.setAdapter(userlistArrayAdapter);
    }
}