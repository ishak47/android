package com.example.android.reportcard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView grades = findViewById(R.id.grades);
        ReportCard();
        grades.setText(toString());
    }
    String reportGrades;
    String name = "ishak";
    double chemistryGrade,englishGrade,mathGrade,historyGrade,spanishGrade;

    public double getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(int grade) {
        chemistryGrade = grade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int grade) {
        englishGrade = grade;
    }

    public double getSpanishGrade() {
        return spanishGrade;
    }

    public void setSpanishGrade(int grade) {
        spanishGrade = grade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int grade) {
        mathGrade = grade;
    }

    public double getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(int grade) {
        historyGrade = grade;
    }

    public void ReportCard() {
        //Initialize any variables here!
        chemistryGrade = 6.4;
        englishGrade = 9.2;
        mathGrade = 5.5;
        historyGrade = 8.1;
    }

        //Your code here!  Return a representation of the report card rather than the empty string
        @NonNull
        @Override
        public String toString() {
            reportGrades = "Name: " + name;
            reportGrades += "\nMath grade: " + getMathGrade();
            reportGrades += "\nHistory grade: " + getHistoryGrade();
            reportGrades += "\nChemistry grade: " + getChemistryGrade();
            reportGrades += "\nSpanish grade: " + getSpanishGrade();
            reportGrades += "\nEnglish grade: " + getEnglishGrade();
            return reportGrades;
        }
    }