package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("black", "lutti", R.drawable.color_black));
        words.add(new Word("brow", "otiiko", R.drawable.color_brown));
        words.add(new Word("yellow", "tolookosu", R.drawable.color_dusty_yellow));
        words.add(new Word("gray", "oyyisa", R.drawable.color_gray));
        words.add(new Word("green", "massokka", R.drawable.color_green));
        words.add(new Word("yellow", "temmokka", R.drawable.color_mustard_yellow));
        words.add(new Word("red", "kenekaku", R.drawable.color_red));
        words.add(new Word("white", "kawinta", R.drawable.color_white));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
