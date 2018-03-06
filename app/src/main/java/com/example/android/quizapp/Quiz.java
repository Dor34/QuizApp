package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    /**
     * Variable to hold the amount of correct answers.
     */
    int correct = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    /**
     * Method to record correct answer for question 1.
     */
    public void questionOne() {

        RadioButton rbOne = findViewById(R.id.question_1_correct);

        if (rbOne.isChecked()) {
            correct++;
        }
    }

    /**
     * Method to record correct answer for question 2.
     */
    public void questionTwo() {

        RadioButton rbTwo = findViewById(R.id.question_2_correct);

        if (rbTwo.isChecked()) {
            correct++;
        }
    }

    /**
     * Method to record correct answer for question 3.
     */
    public void questionThree() {

        CheckBox cb1 = findViewById(R.id.Kareem_Abdul_Jabbar);
        CheckBox cb2 = findViewById(R.id.Wilt_Chamberlin);
        CheckBox cb3 = findViewById(R.id.Kobe_Bryant);
        CheckBox cb4 = findViewById(R.id.Michael_Jordan);
        CheckBox cb5 = findViewById(R.id.Karl_Malone);


        if (!cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked() && !cb5.isChecked())

        if (cb1.isChecked() && cb5.isChecked()) {
            correct++;
        }
    }

    /**
     * Method to record correct answer for question 4.
     */
    public void questionFour() {

        RadioButton rbFour = findViewById(R.id.question_4_correct);

        if (rbFour.isChecked()) {
            correct++;
        }
    }

    /**
     * Method to record correct answer for question 5.
     * Any answer will be deemed correct.
     */
    public void questionFive() {

        RadioButton rbFiveTwo = findViewById(R.id.question_5_correct);

        if (rbFiveTwo.isChecked()) {
            correct++;
        }
    }

    /**
     * Compile answers.
     */

    private void calculateAnswers(){
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
    }

    /**
     * Method to display question results in a toast message.
     */
    public void submitAnswers(View view) {

        calculateAnswers ();

        EditText userName = findViewById(R.id.name_text_input);
        String name = userName.getText().toString();

        String resultsMessage = name + ", You got " + correct + " out of 5 answers correct.";
        Toast.makeText(this, resultsMessage, Toast.LENGTH_LONG).show();

    }

}
