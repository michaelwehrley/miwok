package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("black", "lutti"));
        words.add(new Word("brow", "otiiko"));
        words.add(new Word("yellow", "tolookosu"));
        words.add(new Word("gray", "oyyisa"));
        words.add(new Word("green", "massokka"));
        words.add(new Word("yellow", "temmokka"));
        words.add(new Word("red", "kenekaku"));
        words.add(new Word("white", "kawinta"));
        words.add(new Word("red", "kenekaku"));
        words.add(new Word("white", "kawinta"));
        words.add(new Word("white", "kawinta"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
