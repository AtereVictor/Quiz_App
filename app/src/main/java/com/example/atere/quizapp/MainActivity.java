package com.example.atere.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Creating a global variable score to keep track  of the score of the user
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartButtonClick(View view){
        // Switching the current  activity to question 1 layout
        setContentView(R.layout.question_1);
    }
    public void onNextButton1Click(View view){
        // Switching the current  activity to question 2 layout
        setContentView(R.layout.question_2);
    }
    public void onNextButton2Click(View view){
        // Switching the current  activity to question 3 layout
        setContentView(R.layout.question_3);
    }
    public void onNextButton3Click(View view){
        // Switching the current  activity to question 4 layout
        setContentView(R.layout.question_4);
    }
    public void onNextButton4Click(View view){
        // Switching the current  activity to question 5 layout
        setContentView(R.layout.question_5);
    }
    public void onNextButton5Click(View view){
        // Switching the current  activity to question 6 layout
        setContentView(R.layout.question_6);
    }
    public void onPreviousButton6Click(View view){
        // Switching the current  activity to question 5 layout
        setContentView(R.layout.question_5);
    }
    public void onPreviousButton2Click(View view){
        // Switching the current  activity to question 1 layout
        setContentView(R.layout.question_1);
    }
    public void onPreviousButton3Click(View view){
        // Switching the current  activity to question 2 layout
        setContentView(R.layout.question_2);
    }
    public void onPreviousButton4Click(View view){
        // Switching the current  activity to question 4 layout
        setContentView(R.layout.question_3);
    }
    public void onPreviousButton5Click(View view){
        // Switching the current  activity to question 5 layout
        setContentView(R.layout.question_4);
    }
    public void onSubmitButtonClick(View view){
        //Creating objects for the radio buttons with the correct answers
        RadioButton b1 = (RadioButton)findViewById(R.id.b1);
        RadioButton b2 = (RadioButton)findViewById(R.id.b2);
        RadioButton a3 = (RadioButton)findViewById(R.id.a3);
        RadioButton b4 = (RadioButton)findViewById(R.id.b4);
        RadioButton a5 = (RadioButton)findViewById(R.id.a5);
        RadioButton b6 = (RadioButton)findViewById(R.id.b6);

        //Conditional statements to update the variable score
        if (b1.isChecked()) score++;
        if (b2.isChecked()) score++;
        if (a3.isChecked()) score++;
        if (b4.isChecked()) score++;
        if (b6.isChecked()) score++;
        if (a5.isChecked()) score++;

        // variable for the percentage of the mark scored
        double percentage = (score/6)*100;
        String result = String.valueOf(score)+"%";
        setContentView(R.layout.result);
        TextView res = (TextView) findViewById(R.id.res);
        //Initializing the variable performance to give a brief description of the performance of the user in words
        String performance ="Good Job!\n";
        //Conditional statements to update the performance variable based onthe performance of the user
        if(percentage>=70){
            performance="Excellent Job!\n";
        }
        else if(percentage<50){
            performance="Poor Job!\nTry Harder next time\n";
        }
        //Setting the value of the
        res.setText(percentage+"Your score is: "+result);
    }
    public void onReview(View v){
        // Getting the strings of all the answers and storing them each in a variable
        String answer1=getString(R.string.b1)+"\n";
        String answer2=getString(R.string.b2)+"\n";
        String answer3=getString(R.string.a3)+"\n";
        String answer4=getString(R.string.b4)+"\n";
        String answer5=getString(R.string.a5)+"\n";
        String answer6=getString(R.string.b6);
        String answer=answer1+answer2+answer3+answer4+answer5+answer6;
        //Setting the text of the answer  text view to the concatenation of all the answers
        TextView answerView = (TextView) findViewById(R.id.answer);
        answerView.setText(answer);
        //Setting the visibility of the button to gone
        Button reviewButton =(Button) findViewById(R.id.review_button);
        reviewButton.setVisibility(View.GONE);
    }
}
