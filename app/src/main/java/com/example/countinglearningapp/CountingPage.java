package com.example.countinglearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CountingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting_page);
    }

    public void onOne(View v){
        Intent intent = new Intent(CountingPage.this, ImagePage.class);
        intent.putExtra("value","one");
        startActivity(intent);
    }
    public void onTwo(View v){
        Intent intent = new Intent(CountingPage.this, ImagePage.class);
        intent.putExtra("value","two");
        startActivity(intent);
    }
    public void onThree(View v){
        Intent intent = new Intent(CountingPage.this, ImagePage.class);
        intent.putExtra("value","three");
        startActivity(intent);
    }
    public void onFour(View v){
        Intent intent = new Intent(CountingPage.this, ImagePage.class);
        intent.putExtra("value","four");
        startActivity(intent);
    }
    public void onFive(View v){
        Intent intent = new Intent(CountingPage.this, ImagePage.class);
        intent.putExtra("value","five");
        startActivity(intent);
    }
    public void onSix(View v){
        Intent intent = new Intent(CountingPage.this, ImagePage.class);
        intent.putExtra("value","six");
        startActivity(intent);
    }
    public void onSeven(View v){
        Intent intent = new Intent(CountingPage.this, ImagePage.class);
        intent.putExtra("value","seven");
        startActivity(intent);
    }
    public void onEight(View v){
        Intent intent = new Intent(CountingPage.this, ImagePage.class);
        intent.putExtra("value","eight");
        startActivity(intent);
    }
    public void onNine(View v){
        Intent intent = new Intent(CountingPage.this, ImagePage.class);
        intent.putExtra("value","nine");
        startActivity(intent);
    }
    public void onTen(View v){
        Intent intent = new Intent(CountingPage.this, ImagePage.class);
        intent.putExtra("value","ten");
        startActivity(intent);
    }




}