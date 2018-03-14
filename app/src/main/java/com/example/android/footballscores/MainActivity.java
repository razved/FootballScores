package com.example.android.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalTeamA = 0;
    int goalTeamB = 0;
    int foalTeamA = 0;
    int foalTeamB = 0;
    TextView textGoalsTeamA;
    TextView textGoalsTeamB;
    TextView textFoalsTeamA;
    TextView textFoalsTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textGoalsTeamA = findViewById(R.id.textGoalsTeamA);
        textGoalsTeamB = findViewById(R.id.textGoalsTeamB);
        textFoalsTeamA = findViewById(R.id.textFoalsTeamA);
        textFoalsTeamB = findViewById(R.id.textFoalsTeamB);
    }

    // save variables value
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("goalsTeamA", goalTeamA);
        outState.putInt("goalsTeamB", goalTeamB);
        outState.putInt("foalsTeamA", foalTeamA);
        outState.putInt("foalsTeamB", foalTeamB);
    }

    // restore and display variables value
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        goalTeamA = savedInstanceState.getInt("goalsTeamA");
        goalTeamB = savedInstanceState.getInt("goalsTeamB");
        foalTeamA = savedInstanceState.getInt("foalsTeamA");
        foalTeamB = savedInstanceState.getInt("foalsTeamB");
        displayGoalTeamA(goalTeamA);
        displayGoalTeamB(goalTeamB);
        displayFoalTeamA(foalTeamA);
        displayFoalTeamB(foalTeamB);
    }


    /**
     * Display goals for team A
     *
     * @param goals goals for team A to be displayed
     */
    public void displayGoalTeamA(int goals) {
        textGoalsTeamA.setText(String.valueOf(goals));
    }

    /**
     * Display foals for team A
     *
     * @param foals foals for team A to be displayed
     */
    public void displayFoalTeamA(int foals) {
        textFoalsTeamA.setText(String.valueOf(foals));
    }

    /**
     * Display goals for team B
     *
     * @param goals goals for team B to be displayed
     */
    public void displayGoalTeamB(int goals) {
        textGoalsTeamB.setText(String.valueOf(goals));
    }

    /**
     * Display foals for team B
     *
     * @param foals foals for team B to be displayed
     */
    public void displayFoalTeamB(int foals) {
        textFoalsTeamB.setText(String.valueOf(foals));
    }

    /**
     * increase and display goals for team A
     */
    public void addOneGoalTeamA(View v) {
        goalTeamA += 1;
        displayGoalTeamA(goalTeamA);
    }

    /**
     * increase and display foals for team A
     */

    public void addOneFoalTeamA(View v) {
        foalTeamA += 1;
        displayFoalTeamA(foalTeamA);
    }

    /**
     * increase and display goals for team B
     */
    public void addOneGoalTeamB(View v) {
        goalTeamB += 1;
        displayGoalTeamB(goalTeamB);
    }

    /**
     * increase and display foals for team B
     */
    public void addOneFoalTeamB(View v) {
        foalTeamB += 1;
        displayFoalTeamB(foalTeamB);
    }

    /**
     * reset all scores and foals for both team, and display it
     */

    public void resetAll(View v) {
        goalTeamA = 0;
        goalTeamB = 0;
        foalTeamA = 0;
        foalTeamB = 0;
        displayGoalTeamA(goalTeamA);
        displayGoalTeamB(goalTeamB);
        displayFoalTeamA(foalTeamA);
        displayFoalTeamB(foalTeamB);
    }

}
