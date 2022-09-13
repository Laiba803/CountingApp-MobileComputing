package com.example.countinglearningapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CustomizedListViews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_views);

        ArrayList<CountingClass> CountingList = new ArrayList<>();
        CountingList.add(new CountingClass("One(1)" , "One Finger", R.drawable.one));
        CountingList.add(new CountingClass("Two(2)" , "Two Fingers", R.drawable.two));
        CountingList.add(new CountingClass("Three(3)" , "Three Fingers", R.drawable.three));
        CountingList.add(new CountingClass("Four(4)" , "Four Fingers", R.drawable.four));
        CountingList.add(new CountingClass("Five(5)" , "Five Fingers", R.drawable.five));
        CountingList.add(new CountingClass("Six(6)" , "Six Fingers", R.drawable.six));
        CountingList.add(new CountingClass("Seven(7)" , "Seven Fingers", R.drawable.seven));
        CountingList.add(new CountingClass("Eight(8)" , "Eight Fingers", R.drawable.eight));
        CountingList.add(new CountingClass("Nine(9)" , "Nine Fingers", R.drawable.nine));
        CountingList.add(new CountingClass("Ten(10)" , "Ten Fingers", R.drawable.ten));

        Adapter adapter = new Adapter(this, CountingList);
        ListView listView = findViewById(R.id.finalView);
        listView.setAdapter(adapter);
    }
}
