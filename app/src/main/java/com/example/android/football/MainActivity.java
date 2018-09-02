package com.example.android.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.football.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowTeamA = 0;
    int yellowTeamB = 0;
    int redTeamA = 0;
    int redTeamB = 0;
    int penaltyA = 0;
    int penaltyB = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeamA", scoreTeamA);
        outState.putInt("scoreTeamB", scoreTeamB);
        outState.putInt("yellowTeamA", yellowTeamA);
        outState.putInt("yellowTeamB", yellowTeamB);
        outState.putInt("redTeamA", redTeamA);
        outState.putInt("redTeamB", redTeamB);
        outState.putInt("penaltyA", penaltyA);
        outState.putInt("penaltyB", penaltyB);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("scoreTeamA");
            scoreTeamB = savedInstanceState.getInt("scoreTeamB");
            yellowTeamA = savedInstanceState.getInt("yellowTeamA");
            yellowTeamB = savedInstanceState.getInt("yellowTeamB");
            redTeamA = savedInstanceState.getInt("redTeamA");
            redTeamB = savedInstanceState.getInt("redTeamB");
            penaltyA = savedInstanceState.getInt("penaltyA");
            penaltyB = savedInstanceState.getInt("penaltyB");
        }

    }

    public void goalA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void yellowCardA(View v) {
        yellowTeamA = yellowTeamA + 1;
        displayYellowForTeamA(yellowTeamA);
    }

    public void redCardA(View v) {
        redTeamA = redTeamA + 1;
        displayRedForTeamA(redTeamA);
    }

    public void penaltyA(View v) {
        penaltyA = penaltyA + 1;
        displayPenaltyForTeamA(penaltyA);
    }

    public void goalB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void yellowCardB(View v) {
        yellowTeamB = yellowTeamB + 1;
        displayYellowForTeamB(yellowTeamB);
    }


    public void redCardB(View v) {
        redTeamB = redTeamB + 1;
        displayRedForTeamB(redTeamB);
    }

    public void penaltyB(View v) {
        penaltyB = penaltyB + 1;
        displayPenaltyForTeamB(penaltyB);
    }

    public void resetTheScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        penaltyA = 0;
        penaltyB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYellowForTeamA(yellowTeamA);
        displayYellowForTeamB(yellowTeamB);
        displayRedForTeamA(redTeamA);
        displayRedForTeamB(redTeamB);
        displayPenaltyForTeamA(penaltyA);
        displayPenaltyForTeamB(penaltyB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of yellow card for Team A.
     */
    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_card_text_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of red card for Team A.
     */
    public void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card_text_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of penalty for Team A.
     */
    public void displayPenaltyForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penalty_text_a);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of yellow card for Team B.
     */
    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_card_text_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of red card for Team B.
     */
    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_card_text_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of penalty for Team B.
     */
    public void displayPenaltyForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penalty_text_b);
        scoreView.setText(String.valueOf(score));
    }
}
