package com.example.android.miwok;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
//import com.example.android.miwok.Word;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.numbers;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of words
//        String[] words = new String[10];
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten", "na'aacha"));

//        names.add("two");

//        LinearLayout rootView = (LinearLayout)findViewById(R.id.activity_numbers);
//
//        for (int i = 0; i < names.size(); i++) {
//            TextView numberView = new TextView(this);
//            numberView.setText(names.get(i));
//            rootView.addView(numberView);
//        }

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
