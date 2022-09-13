package com.example.countinglearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class QuizPage extends AppCompatActivity {

    TextView scoreValue, decision;
    Button opt1, opt2, opt3, next;
    ImageView img;
    int randomNo,newScore = 0;
    String check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        img = findViewById(R.id.imageView2);
        scoreValue = findViewById(R.id.scoreVal);
        decision = findViewById(R.id.decision);
        opt1 = findViewById(R.id.option1);
        opt2 = findViewById(R.id.option2);
        opt3 = findViewById(R.id.option3);
        next = findViewById(R.id.nextQues);

        int[] myImages = new int[]{
                R.drawable.qone ,R.drawable.qtwo ,R.drawable.qthree ,R.drawable.qfour ,R.drawable.qfive ,
                R.drawable.qsix ,R.drawable.qseven ,R.drawable.qeight ,R.drawable.qnine ,R.drawable.qten ,
        };


        img.setImageResource(R.drawable.qnine);
        opt1.setText("9");
        opt2.setText("5");
        opt3.setText("4");
        check = "9";

        next.setEnabled(false);
        decision.setText(" ");

        next.setOnClickListener(new View.OnClickListener() {
            @Override 
            public void onClick(View view) {
                opt1.setAlpha(1f);
                opt2.setAlpha(1f);
                opt3.setAlpha(1f);
                opt1.setBackgroundColor(Color.parseColor("#FF6200EE"));
                opt2.setBackgroundColor(Color.parseColor("#FF6200EE"));
                opt3.setBackgroundColor(Color.parseColor("#FF6200EE"));
                opt1.setEnabled(true);
                opt2.setEnabled(true);
                opt3.setEnabled(true);
                decision.setText(" ");
                Random rand = new Random();
                randomNo = rand.nextInt(myImages.length);
                //Drawable d = getResources().getDrawable(myImages[randomNo]);
                //img.setImageDrawable(d);
                img.setImageResource(myImages[randomNo]);

                if(randomNo == 0){ //1
                    opt1.setText("2");
                    opt2.setText("1");
                    opt3.setText("7");
                    check = "1"; //String.valueOf(new Integer(1))
                }
                else if(randomNo == 1){ //2
                    opt1.setText("6");
                    opt2.setText("10");
                    opt3.setText("2");
                    check = "2";
                }
                else if(randomNo == 2){ //3
                    opt1.setText("4");
                    opt2.setText("3");
                    opt3.setText("1");
                    check = "3";
                }
                else if(randomNo ==3){ //4
                    opt1.setText("4");
                    opt2.setText("6");
                    opt3.setText("9");
                    check = "4";
                }
                else if(randomNo == 4){ //5
                    opt1.setText("7");
                    opt2.setText("1");
                    opt3.setText("5");
                    check = "5";
                }
                else if(randomNo == 5){ //6
                    opt1.setText("6");
                    opt2.setText("8");
                    opt3.setText("10");
                    check = "6";
                }
                else if(randomNo == 6){ //7
                    opt1.setText("2");
                    opt2.setText("1");
                    opt3.setText("7");
                    check = "7";
                }
                if(randomNo == 7){ //8
                    opt1.setText("2");
                    opt2.setText("8");
                    opt3.setText("7");
                    check = "8";
                }
                else if(randomNo == 8){ //9
                    opt1.setText("9");
                    opt2.setText("5");
                    opt3.setText("4");
                    check = "9";
                }
                else if(randomNo == 9){ //10
                    opt1.setText("3");
                    opt2.setText("10");
                    opt3.setText("6");
                    check = "10";
                }
            }
        });

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opt1.setBackgroundColor(Color.parseColor("#FF6200EE"));
                opt2.setBackgroundColor(Color.parseColor("#FF6200EE"));
                opt3.setBackgroundColor(Color.parseColor("#FF6200EE"));
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                next.setEnabled(true);
                if(opt1.getText() == check){
                    decision.setText("Right Answer!");
                    newScore++;
                    scoreValue.setText(String.valueOf(newScore));
                    opt1.setBackgroundColor(Color.GREEN);
                }
                else{
                    decision.setText("Wrong Answer!");
                    opt1.setBackgroundColor(Color.RED);
                }
                opt2.setAlpha(0.5f);
                opt3.setAlpha(0.5f);
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opt1.setBackgroundColor(Color.parseColor("#FF6200EE"));
                opt2.setBackgroundColor(Color.parseColor("#FF6200EE"));
                opt3.setBackgroundColor(Color.parseColor("#FF6200EE"));
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                next.setEnabled(true);
                if(opt2.getText() == check){
                    decision.setText("Right Answer!");
                    newScore += 1;
                    scoreValue.setText(String.valueOf(newScore));
                    opt2.setBackgroundColor(Color.GREEN);
                }
                else{
                    decision.setText("Wrong Answer!");
                    opt2.setBackgroundColor(Color.RED);
                }
                opt1.setAlpha(0.5f);
                opt3.setAlpha(0.5f);
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opt1.setBackgroundColor(Color.parseColor("#FF6200EE"));
                opt2.setBackgroundColor(Color.parseColor("#FF6200EE"));
                opt3.setBackgroundColor(Color.parseColor("#FF6200EE"));
                opt1.setEnabled(false);
                opt2.setEnabled(false);
                opt3.setEnabled(false);
                next.setEnabled(true);
                if(opt3.getText() == check){
                    decision.setText("Right Answer!");
                    newScore +=1;
                    scoreValue.setText(String.valueOf(newScore));
                    opt3.setBackgroundColor(Color.GREEN);
                }
                else{
                    decision.setText("Wrong Answer!");
                    opt3.setBackgroundColor(Color.RED);
                }
                opt1.setAlpha(0.5f);
                opt2.setAlpha(0.5f);
            }
        });
    }

}