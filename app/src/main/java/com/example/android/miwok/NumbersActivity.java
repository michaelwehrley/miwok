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

import java.util.ArrayList;

import static com.example.android.miwok.R.id.numbers;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of words
//        String[] words = new String[10];
        ArrayList<String> names = new ArrayList<String>();

        names.add("one");
        names.add("two");
        names.add("three");
        names.add("four");
        names.add("five");
        names.add("six");
        names.add("seven");
        names.add("eight");
        names.add("nine");
        names.add("ten");

//        LinearLayout rootView = (LinearLayout)findViewById(R.id.activity_numbers);
//
//        for (int i = 0; i < names.size(); i++) {
//            TextView numberView = new TextView(this);
//            numberView.setText(names.get(i));
//            rootView.addView(numberView);
//        }

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
