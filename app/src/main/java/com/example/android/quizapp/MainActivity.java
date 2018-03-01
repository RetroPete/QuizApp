package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreCount;
    int answers;

    //QUESTIONS
    RadioGroup  question1;
    RadioButton q1_answer1, q1_answer2, q1_answer3, q1_answer4;
    EditText    q2_answer1;
    RadioGroup  question3;
    RadioButton q3_answer1, q3_answer2, q3_answer3, q3_answer4;
    RadioGroup  question4;
    RadioButton q4_answer1, q4_answer2, q4_answer3, q4_answer4;
    RadioGroup  question5;
    RadioButton q5_answer1, q5_answer2, q5_answer3, q5_answer4;
    RadioGroup  question6;
    RadioButton q6_answer1, q6_answer2, q6_answer3, q6_answer4;
    CheckBox    q7_answer1, q7_answer2, q7_answer3, q7_answer4;

    //ANSWERS (NO PEEKING)
    int chosenAnswer1;
    int chosenAnswer2;
    int chosenAnswer3;
    int chosenAnswer4;
    int chosenAnswer5;
    int chosenAnswer6;
    int chosenAnswer7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question1 = findViewById(R.id.question1);
        q1_answer1 = findViewById(R.id.q1_answer1);
        q1_answer2 = findViewById(R.id.q1_answer2);
        q1_answer3 = findViewById(R.id.q1_answer3);
        q1_answer4 = findViewById(R.id.q1_answer4);

        q2_answer1 = findViewById(R.id.q2_answer1);

        question3 = findViewById(R.id.question3);
        q3_answer1 = findViewById(R.id.q3_answer1);
        q3_answer2 = findViewById(R.id.q3_answer2);
        q3_answer3 = findViewById(R.id.q3_answer3);
        q3_answer4 = findViewById(R.id.q3_answer4);

        question4 = findViewById(R.id.question4);
        q4_answer1 = findViewById(R.id.q4_answer1);
        q4_answer2 = findViewById(R.id.q4_answer2);
        q4_answer3 = findViewById(R.id.q4_answer3);
        q4_answer4 = findViewById(R.id.q4_answer4);

        question5 = findViewById(R.id.question5);
        q5_answer1 = findViewById(R.id.q5_answer1);
        q5_answer2 = findViewById(R.id.q5_answer2);
        q5_answer3 = findViewById(R.id.q5_answer3);
        q5_answer4 = findViewById(R.id.q5_answer4);

        question6 = findViewById(R.id.question6);
        q6_answer1 = findViewById(R.id.q6_answer1);
        q6_answer2 = findViewById(R.id.q6_answer2);
        q6_answer3 = findViewById(R.id.q6_answer3);
        q6_answer4 = findViewById(R.id.q6_answer4);

        q7_answer1 = findViewById(R.id.q7_answer1);
        q7_answer2 = findViewById(R.id.q7_answer2);
        q7_answer3 = findViewById(R.id.q7_answer3);
        q7_answer4 = findViewById(R.id.q7_answer4);

    }

    //Displaying score comment
    public void displayComment(String comment) {
        TextView scoreComment = findViewById(R.id.score_comment);
        scoreComment.setText(String.valueOf(comment));
    }

    private void chosenVScorrect() {

        //Question 1
        chosenAnswer1 = question1.getCheckedRadioButtonId();
        if (chosenAnswer1 == -1) {
        } else {
            View radioButton1 = question1.findViewById(chosenAnswer1);
            if (radioButton1.getId() == R.id.q1_answer2) {
                scoreCount += 1;
            }
        }

        //Question 2
        if (!q2_answer1.getText().toString().equalsIgnoreCase(getString(R.string.q2_answer1))) {
        } else {
            if (q2_answer1.getText().toString().equalsIgnoreCase(getString(R.string.q2_answer1))) {
                scoreCount += 1;
            }
        }

        //Question 3
        chosenAnswer3 = question3.getCheckedRadioButtonId();
        if (chosenAnswer3 == -1) {
        } else {
            View radioButton3 = question3.findViewById(chosenAnswer3);
            if (radioButton3.getId() == R.id.q3_answer4) {
                scoreCount += 1;
            }
        }

        //Question 4
        chosenAnswer4 = question4.getCheckedRadioButtonId();
        if (chosenAnswer4 == -1) {
        } else {
            View radioButton4 = question4.findViewById(chosenAnswer4);
            if (radioButton4.getId() == R.id.q4_answer3) {
                scoreCount += 1;
            }
        }

        //Question 5
        chosenAnswer5 = question5.getCheckedRadioButtonId();
        if (chosenAnswer5 == -1) {
        } else {
            View radioButton5 = question5.findViewById(chosenAnswer5);
            if (radioButton5.getId() == R.id.q5_answer2) {
                scoreCount += 1;
            }
        }

        //Question 6
        chosenAnswer6 = question6.getCheckedRadioButtonId();
        if (chosenAnswer6 == -1) {
        } else {
            View radioButton6 = question6.findViewById(chosenAnswer6);
            if (radioButton6.getId() == R.id.q6_answer2) {
                scoreCount += 1;
            }
        }

        //Question 7
        if (!q7_answer1.isChecked() && !q7_answer2.isChecked() && q7_answer3.isChecked()
                && !q7_answer4.isChecked()) {
            scoreCount += 1;
        }
    }

    public void answerChecker() {
        chosenVScorrect();

        //For question 1
        if (chosenAnswer1 != -1) {
            answers += 1;
        }

        //For question 2
        if (chosenAnswer2 != -1) {
            answers += 1;
        }

        //For question 3
        if (chosenAnswer3 != -1) {
            answers += 1;
        }

        //For question 4
        if (chosenAnswer4 != -1) {
            answers += 1;
        }

        //For question 5
        if (chosenAnswer5 != -1) {
            answers += 1;
        }

        //For question 6
        if (chosenAnswer6 != -1) {
            answers += 1;
        }

        //For question 7
        if (chosenAnswer7 != -1) {
            answers += 1;
        }
    }

    public void finalScore(View v) {

        //To prevent scores and answers from updating
        scoreCount = 0;
        answers = 0;
        answerChecker();

        //Score Comment for 0 correct answers
        if (scoreCount == 0) {
            Toast.makeText(this, getString(R.string.zero) + scoreCount + "!", Toast.LENGTH_LONG).show();
        }

        //Score Comment for 1-2 correct answers
        if (scoreCount == 1 | scoreCount == 2) {
            Toast.makeText(this, getString(R.string.one_two) + scoreCount + "!", Toast.LENGTH_LONG).show();
        }

        //Score Comment for 3-4 correct answers
        if (scoreCount == 3 | scoreCount == 4) {
            Toast.makeText(this, getString(R.string.three_four) + scoreCount + "!", Toast.LENGTH_LONG).show();
        }

        //Score Comment for 5-6 correct answers
        if (scoreCount == 5 | scoreCount == 6) {
            Toast.makeText(this, getString(R.string.five_six) + scoreCount + "!", Toast.LENGTH_LONG).show();
        }

        //Score Comment for 7 correct answers
        if (scoreCount == 7) {
            Toast.makeText(this, getString(R.string.full_score) + scoreCount + "!", Toast.LENGTH_LONG).show();
        }
    }

    public void reset(View v) {

        //RESET
        scoreCount = 0;
        answers = 0;
        question1.clearCheck();
        q2_answer1.setText(null);
        question3.clearCheck();
        question4.clearCheck();
        question5.clearCheck();
        question6.clearCheck();
        q7_answer1.setChecked(false);
        q7_answer2.setChecked(false);
        q7_answer3.setChecked(false);
        q7_answer4.setChecked(false);
        String comment = "";
        displayComment(comment);
    }
}