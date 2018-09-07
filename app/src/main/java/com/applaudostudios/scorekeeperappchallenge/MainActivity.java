package com.applaudostudios.scorekeeperappchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreRealMadrid = 0;
    int GoalsByPenaltyRealMadrid = 0;
    int foulsRealMadrid = 0;
    int yellowCardsRealMadrid = 0;
    int redCardsRealMadrid = 0;

    int scoreBarcelona = 0;
    int GoalsByPenaltyBarcelona = 0;
    int foulsBarcelona = 0;
    int yellowCardsBarcelona = 0;
    int redCardsBarcelona = 0;

    TextView realMadridScores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        realMadridScores = findViewById(R.id.real_madrid_score);
        realMadridScores.setText(String.valueOf(0));
    }

    public void addGoalForBarcelona(View v) {
        scoreBarcelona += 1;
        displayForBarcelona(scoreBarcelona);
    }

    public void displayForBarcelona(int score) {
        TextView scoreView = findViewById(R.id.barcelona_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addGoalForRealMadrid(View v) {
        scoreRealMadrid += 1;
        displayForRealMadrid(scoreRealMadrid);
    }

    public void displayForRealMadrid(int score) {
        TextView scoreView = findViewById(R.id.real_madrid_score);
        scoreView.setText(String.valueOf(score));
    }

}
