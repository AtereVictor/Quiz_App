package com.example.atere.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int Score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onStartButtonClick(View view){
        setContentView(R.layout.question_1);
    }
    public void onNextButton1Click(View view){
        RadioButton b1 = (RadioButton)findViewById(R.id.b1);
        if (b1.isChecked()) Score++;
        setContentView(R.layout.question_2);
    }
    public void onNextButton2Click(View view){
        RadioButton b2 = (RadioButton)findViewById(R.id.b2);
        if (b2.isChecked()) Score++;
        setContentView(R.layout.question_3);
    }
    public void onNextButton3Click(View view){
        RadioButton a3 = (RadioButton)findViewById(R.id.a3);
        if (a3.isChecked()) Score++;
        setContentView(R.layout.question_4);
    }
    public void onNextButton4Click(View view){
        RadioButton b4 = (RadioButton)findViewById(R.id.b4);
        if (b4.isChecked()) Score++;
        setContentView(R.layout.question_5);
    }
    public void onNextButton5Click(View view){
        RadioButton a5 = (RadioButton)findViewById(R.id.a5);
        if (a5.isChecked()) Score++;
        setContentView(R.layout.question_6);
    }
    public void onPreviousButton6Click(View view){
        setContentView(R.layout.question_5);
    }
    public void onPreviousButton2Click(View view){
        setContentView(R.layout.question_1);
    }
    public void onPreviousButton3Click(View view){
        setContentView(R.layout.question_2);
    }
    public void onPreviousButton4Click(View view){
        setContentView(R.layout.question_3);
    }
    public void onPreviousButton5Click(View view){
        setContentView(R.layout.question_4);
    }
    public void onSubmitButtonClick(View view){
        RadioButton b6 =  findViewById(R.id.b6);
        if (b6.isChecked()) Score++;
        double percentage = (Score/6)*100;
        String result = String.valueOf(Score)+"%";
        setContentView(R.layout.result);
        TextView res =  findViewById(R.id.res);
        String performance ="Good Job!\n";
        if(percentage>=70){
            performance="Excellent Job!\n";
        }
        else if(percentage<50){
            performance="Poor Job!\nTry Harder next time\n";
        }
        res.setText(percentage+"Your Score is: "+result);
    }
    public void onReview(View v){
        TextView answer =  findViewById(R.id.answer);
    }

}
