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
        //Boolean Variable to distinguish between true (submitted) and false (not submitted).
        boolean isSubmitted = false;


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
     * Any answer will be deemed correct.
     */
    public void questionFive() {

        RadioButton rbTwo = findViewById (R.id.question_5_correct);

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
            isSubmitted = true;
        }
        EditText userName = findViewById (R.id.name_text_input);
        String name = userName.getText ().toString ();
        String resultsMessage = name + ", You got " + correct + " out of 5 answers correct.";
        Toast.makeText (this, resultsMessage, Toast.LENGTH_LONG).show ();
    }

    /**
     * When clicked this method will reset the radio buttons in quiz to none selected
     */
    public void Reset(View view) {
        correct = 0;

        RadioGroup rg_q1 = findViewById (R.id.rg_q1);
        rg_q1.clearCheck ();
        RadioGroup rg_q2 = findViewById (R.id.rg_q2);
        rg_q2.clearCheck ();
        RadioGroup rg_q3 = findViewById (R.id.rg_q3);
        rg_q3.clearCheck ();
        RadioGroup rg_q4 = findViewById (R.id.rg_q4);
        rg_q4.clearCheck ();
    }

}
