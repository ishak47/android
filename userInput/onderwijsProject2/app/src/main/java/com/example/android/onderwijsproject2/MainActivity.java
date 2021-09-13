package com.example.android.onderwijsproject2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*vraag 1*/
    String givenAnswerQ1;
    String goodAnswerQ1;
    boolean isAnswerQ1Correct = false;

    public boolean CheckQ1() {
        goodAnswerQ1 = "1953";
        EditText antwoord1 = findViewById(R.id.vraag1_antwoord);
        givenAnswerQ1 = antwoord1.getText().toString().toLowerCase(Locale.ROOT);

        isAnswerQ1Correct = givenAnswerQ1.equals(goodAnswerQ1);
        return isAnswerQ1Correct;
    }

    /*vraag 2*/
    String givenAnswerQ2;
    String goodAnswerQ2;
    Boolean isAnswerQ2Correct = false;

    public boolean CheckQ2() {
        goodAnswerQ2 = "china";
        EditText antwoord2 = findViewById(R.id.vraag2_antwoord);
        givenAnswerQ2 = antwoord2.getText().toString().toLowerCase(Locale.ROOT);

        isAnswerQ2Correct = givenAnswerQ2.equals(goodAnswerQ2);
        return isAnswerQ2Correct;
    }

    /*vraag 3*/
    Boolean isAnswerQ3Correct = false;
    int goodIdQ3;
    int givenAnswerQ3;

    public boolean CheckQ3() {
        RadioGroup vraag3_antwoorden = findViewById(R.id.vraag3_antwoorden);
        givenAnswerQ3 = vraag3_antwoorden.getCheckedRadioButtonId();
        RadioButton goodAnswerQ3 = findViewById(R.id.vraag3_antwoord3);
        goodIdQ3 = goodAnswerQ3.getId();

        isAnswerQ3Correct = givenAnswerQ3 == goodIdQ3;
        return isAnswerQ3Correct;
    }

    /*vraag 4*/
    Boolean isAnswerQ4Correct = false;
    int goodIdQ4;
    int givenAnswerQ4;

    public boolean CheckQ4() {
        RadioGroup vraag4_antwoorden = findViewById(R.id.vraag4_antwoorden);
        givenAnswerQ4 = vraag4_antwoorden.getCheckedRadioButtonId();
        RadioButton goodAnswerQ4 = findViewById(R.id.vraag4_antwoord2);
        goodIdQ4 = goodAnswerQ4.getId();

        isAnswerQ4Correct = givenAnswerQ4 == goodIdQ4;
        return isAnswerQ4Correct;
    }

    public String setTextQ1() {
        CheckQ1();
        String textScoreQ1 = "";

        if (isAnswerQ1Correct) {
            textScoreQ1 = "Je antwoord op vraag 1 is goed";
        } else {
            textScoreQ1 = "Je antwoord op vraag 1 is fout";
        }

        return textScoreQ1;
    }

    public String setTextQ2() {
        CheckQ2();
        String textScoreQ2 = "";

        if (isAnswerQ2Correct) {
            textScoreQ2 = "Je antwoord op vraag 2 is goed";
        } else {
            textScoreQ2 = "Je antwoord op vraag 2 is fout";
        }

        return textScoreQ2;
    }

    public String setTextQ3() {
        CheckQ3();
        String textScoreQ3 = "";

        if (isAnswerQ3Correct) {
            textScoreQ3 = "Je antwoord op vraag 3 is goed";
        } else {
            textScoreQ3 = "Je antwoord op vraag 3 is fout";
        }

        return textScoreQ3;
    }

    public String setTextQ4() {
        CheckQ4();
        String textScoreQ4 = "";

        if (isAnswerQ4Correct) {
            textScoreQ4 = "Je antwoord op vraag 4 is goed";
        } else {
            textScoreQ4 = "Je antwoord op vraag 4 is fout";
        }

        return textScoreQ4;
    }

    public void setScoreText() {
        TextView scoreText = findViewById(R.id.show_score_text_view);
        CheckQ1();
        CheckQ2();
        CheckQ3();
        CheckQ4();
        scoreText.setText(setTextQ1() + "\n" + setTextQ2() + "\n" + setTextQ3() + "\n" + setTextQ4());
    }

    public void submitAnswers(View view) {
        setScoreText();
    }
}