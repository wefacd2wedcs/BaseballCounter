package com.example.android.baseballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.baseballcounter.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int outsTeamA = 0;
    int outsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_runs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_runs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayOutsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_outs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayOutsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_outs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 3 point.
     */
    public void addRunForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneOutTeamA(View view) {
        outsTeamA = outsTeamA + 1;
        if (outsTeamA == 3) { outsTeamA = 0;}

        displayOutsForTeamA(outsTeamA);
    }

    /**
     * Increase the score for Team B by 3 point.
     */
    public void addRunForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneOutTeamB(View view) {
        outsTeamB = outsTeamB + 1;
        if (outsTeamB == 3) { outsTeamB = 0;}

        displayOutsForTeamB(outsTeamB);
    }

    /**
     * Reset scores.
     */
    public void Reset(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        outsTeamA = 0;
        outsTeamB = 0;

        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayOutsForTeamB(scoreTeamB);
        displayOutsForTeamA(scoreTeamA);
    }
}