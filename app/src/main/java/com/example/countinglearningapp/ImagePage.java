package com.example.countinglearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ImagePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_page);

        ImageView img = findViewById(R.id.imageView);
        String imgVal = getIntent().getStringExtra("value");

        if(imgVal.equals("one")){
            img.setImageResource(R.drawable.one);
        }
        else if(imgVal.equals("two")){
            img.setImageResource(R.drawable.two);
        }
        else if(imgVal.equals("three")){
            img.setImageResource(R.drawable.three);
        }
        else if(imgVal.equals("four")){
            img.setImageResource(R.drawable.four);
        }
        else if(imgVal.equals("five")){
            img.setImageResource(R.drawable.five);
        }
        else if(imgVal.equals("six")){
            img.setImageResource(R.drawable.six);
        }
        else if(imgVal.equals("seven")){
            img.setImageResource(R.drawable.seven);
        }
        else if(imgVal.equals("eight")){
            img.setImageResource(R.drawable.eight);
        }
        else if(imgVal.equals("nine")){
            img.setImageResource(R.drawable.nine);
        }
        else if(imgVal.equals("ten")){
            img.setImageResource(R.drawable.ten);
        }
    }
}