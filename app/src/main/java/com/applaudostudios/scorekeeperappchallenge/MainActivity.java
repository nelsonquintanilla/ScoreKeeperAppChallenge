package com.applaudostudios.scorekeeperappchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreRealMadrid = 0;
    TextView realMadridScore;
    TextView goalFromPenaltyRealMadrid;
    TextView foulsRealMadrid;
    TextView yellowCardsRealMadrid;
    TextView redCardsRealMadrid;
    TextView redCards2RealMadrid;

    int scoreBarcelona = 0;
    TextView barcelonaScore;
    TextView goalFromPenaltyBarcelona;
    TextView foulsBarcelona;
    TextView yellowCardsBarcelona;
    TextView redCardsBarcelona;
    TextView redCards2Barcelona;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        realMadridScore = findViewById(R.id.real_madrid_score);
        realMadridScore.setText(String.valueOf(0));
        goalFromPenaltyRealMadrid = findViewById(R.id.goalFromPenaltyRealMadridTextView);
        goalFromPenaltyRealMadrid.setText(String.valueOf(0));
        foulsRealMadrid = findViewById(R.id.foulsRealMadridTextView);
        foulsRealMadrid.setText(String.valueOf(0));
        yellowCardsRealMadrid = findViewById(R.id.yellowCardsRealMadridTextView);
        yellowCardsRealMadrid.setText(String.valueOf(0));
        redCardsRealMadrid = findViewById(R.id.redCardsRealMadridTextView);
        redCardsRealMadrid.setText(String.valueOf(0));
        redCards2RealMadrid = findViewById(R.id.redCards2RealMadridTextView);
        redCards2RealMadrid.setText(String.valueOf(0));

        barcelonaScore = findViewById(R.id.barcelona_score);
        barcelonaScore.setText(String.valueOf(0));
        goalFromPenaltyBarcelona = findViewById(R.id.goalFromPenaltyBarcelonaTextView);
        goalFromPenaltyBarcelona.setText(String.valueOf(0));
        foulsBarcelona = findViewById(R.id.foulsBarcelonaTextView);
        foulsBarcelona.setText(String.valueOf(0));
        yellowCardsBarcelona = findViewById(R.id.yellowCardsBarcelonaTextView);
        yellowCardsBarcelona.setText(String.valueOf(0));
        redCardsBarcelona = findViewById(R.id.redCardsBarcelonaTextView);
        redCardsBarcelona.setText(String.valueOf(0));
        redCards2Barcelona = findViewById(R.id.redCards2BarcelonaTextView);
        redCards2Barcelona.setText(String.valueOf(0));
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

    public void resetAll(View v){
        displayForBarcelona(0);
        displayForRealMadrid(0);
        barcelonaScore.setText(String.valueOf(0));
        realMadridScore.setText(String.valueOf(0));
    }
}
