package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("black", "lutti", R.drawable.family_daughter));
        words.add(new Word("brow", "otiiko", R.drawable.family_father));
        words.add(new Word("yellow", "tolookosu", R.drawable.family_grandfather));
        words.add(new Word("gray", "oyyisa", R.drawable.family_grandmother));
        words.add(new Word("green", "massokka", R.drawable.family_mother));
        words.add(new Word("yellow", "temmokka", R.drawable.family_daughter));
        words.add(new Word("red", "kenekaku", R.drawable.family_older_brother));
        words.add(new Word("white", "kawinta", R.drawable.family_older_sister));
        words.add(new Word("red", "kenekaku", R.drawable.family_son));
        words.add(new Word("white", "kawinta", R.drawable.family_younger_brother));
        words.add(new Word("white", "kawinta", R.drawable.family_younger_sister));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
