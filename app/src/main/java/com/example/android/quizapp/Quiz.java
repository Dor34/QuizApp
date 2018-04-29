package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    /**
     * Variable to hold the amount of correct answers.
     */
    int correct = 0;
    private boolean isSubmitted;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_quiz);

    }


    /**
     * Method to record correct answer for question 1.
     */
    public void questionOne() {

        RadioButton rbThree = findViewById (R.id.question_1_correct);

        if (rbThree.isChecked ()) {
            correct++;
        }
    }

    /**
     * Method to record correct answer for question 2.
     */
    public void questionTwo() {

        RadioButton rbTwo = findViewById (R.id.question_2_correct);

        if (rbTwo.isChecked ()) {
            correct++;
        }
    }

    /**
     * Method to record correct answer for question 3.
     */
    public void questionThree() {

        CheckBox cb1 = findViewById (R.id.cb1);
        CheckBox cb2 = findViewById (R.id.cb2);
        CheckBox cb3 = findViewById (R.id.cb3);
        CheckBox cb4 = findViewById (R.id.cb4);
        CheckBox cb5 = findViewById (R.id.cb5);

        if (cb1.isChecked ()) {
            if (!cb2.isChecked ()) {
                if (!cb3.isChecked ()) {
                    if (!cb4.isChecked ()) {
                        if (cb5.isChecked ())
                            correct++;
                    }
                }
            }
        }
    }


    /**
     * Method to record correct answer for question 4.
     */
    public void questionFour() {

        RadioButton rbTwo = findViewById (R.id.question_4_correct);

        if (rbTwo.isChecked ()) {
            correct++;
        }
    }

    /**
     * Method to record correct answer for question 5.
     */
    public void questionFive() {

        RadioButton rbTwo = findViewById (R.id.question_5_correct);

        if (rbTwo.isChecked ()) {
            correct++;
        }
    }

    /**
     * Method to record correct answer for question 6.
     */
    public void questionSix () {

        RadioButton rbTwo = findViewById (R.id.question_6_correct);

        if (rbTwo.isChecked ()) {
            correct++;
        }
    }
    /**
     * Compile answers.
     */

    private void calculateAnswers() {

    }

    /**
     * Method to display question results in a toast message.
     */
    public void submitAnswers(View view) {
        calculateAnswers ();
        //Check for isSubmitted value
        if (isSubmitted) {
            Toast.makeText (this, "You've already submitted your answers", Toast.LENGTH_SHORT).show ();
        } else {
            calculateAnswers ();
            questionOne ();
            questionTwo ();
            questionThree ();
            questionFour ();
            questionFive ();
            questionSix ();
            isSubmitted = true;
        }
        EditText userName = findViewById (R.id.name_text_input);
        String name = userName.getText ().toString ();
        String resultsMessage = name + ", You got " + correct + " out of 6 answers correct.";
        Toast.makeText (this, resultsMessage, Toast.LENGTH_LONG).show ();
    }

    /**
     * When clicked this method will reset the quiz
     */
    public void Reset(View view) {
        correct = 0;

        //resets radio buttons on quiz
        RadioGroup rg_q1 = findViewById (R.id.rg_q1);
        rg_q1.clearCheck ();
        RadioGroup rg_q2 = findViewById (R.id.rg_q2);
        rg_q2.clearCheck ();
        RadioGroup rg_q3 = findViewById (R.id.rg_q3);
        rg_q3.clearCheck ();
        RadioGroup rg_q4 = findViewById (R.id.rg_q4);
        rg_q4.clearCheck ();
        RadioGroup rg_q5 = findViewById (R.id.rg_q5);
        rg_q5.clearCheck ();
    }

    //clears checkboxes
    public void check_box_group () {
        CheckBox cb1 = findViewById(R.id.cb1);
        if (cb1.isChecked ()) {
            cb1.setChecked (false);
        }
        CheckBox cb2 = findViewById(R.id.cb2);
        if (cb2.isChecked ()) {
            cb2.setChecked (false);
        }
        CheckBox cb3 = findViewById(R.id.cb3);
        if (cb3.isChecked()) {
            cb3.setChecked (false);
        }
        CheckBox cb4 = findViewById(R.id.cb4);
        if(cb4.isChecked ()) {
            cb4.setChecked (false);
        }
        CheckBox cb5 = findViewById(R.id.cb5);
        if (cb5.isChecked ()) {
            cb5.setChecked (false);
        }
    }
}