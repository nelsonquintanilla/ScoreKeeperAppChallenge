package com.applaudostudios.scorekeeperappchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Team barcelona;

    TextView scoreBarcelonaTextView;
    TextView goalsFromPenaltyBarcelonaTextView;
    TextView foulsBarcelonaTextView;
    TextView yellowCardsBarcelonaTextView;
    TextView redCardsBarcelonaTextView;
    TextView redCards2BarcelonaTextView;

    Button goalBarcelonaButton;
    Button goalsFromPenaltyBarcelonaButton;
    Button foulsBarcelonaButton;
    Button yellowCardsBarcelonaButton;
    Button redCardsBarcelonaButton;
    Button redCards2BarcelonaButton;

    Team realMadrid;

    TextView scoreRealMadridTextView;
    TextView goalsFromPenaltyRealMadridTextView;
    TextView foulsRealMadridTextView;
    TextView yellowCardsRealMadridTextView;
    TextView redCardsRealMadridTextView;
    TextView redCards2RealMadridTextView;

    Button goalRealMadridButton;
    Button goalsFromPenaltyRealMadridButton;
    Button foulsRealMadridButton;
    Button yellowCardsRealMadridButton;
    Button redCardsRealMadridButton;
    Button redCards2RealMadridButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barcelona = new Team();

        scoreBarcelonaTextView = findViewById(R.id.barcelona_score);
        goalsFromPenaltyBarcelonaTextView = findViewById(R.id.goalFromPenaltyBarcelonaTextView);
        foulsBarcelonaTextView = findViewById(R.id.foulsBarcelonaTextView);
        yellowCardsBarcelonaTextView = findViewById(R.id.yellowCardsBarcelonaTextView);
        redCardsBarcelonaTextView = findViewById(R.id.redCardsBarcelonaTextView);
        redCards2BarcelonaTextView = findViewById(R.id.redCards2BarcelonaTextView);

        goalBarcelonaButton = findViewById(R.id.goalBarcelonaButton);
        goalsFromPenaltyBarcelonaButton = findViewById(R.id.goalsFromPenaltyBarcelonaButton);
        foulsBarcelonaButton = findViewById(R.id.foulsBarcelonaButton);
        yellowCardsBarcelonaButton = findViewById(R.id.yellowCardsBarcelonaButton);
        redCardsBarcelonaButton = findViewById(R.id.redCardsBarcelonaButton);
        redCards2BarcelonaButton = findViewById(R.id.redCards2BarcelonaButton);

        goalBarcelonaButton.setOnClickListener(this);
        goalsFromPenaltyBarcelonaButton.setOnClickListener(this);
        foulsBarcelonaButton.setOnClickListener(this);
        yellowCardsBarcelonaButton.setOnClickListener(this);
        redCardsBarcelonaButton.setOnClickListener(this);
        redCards2BarcelonaButton.setOnClickListener(this);

        realMadrid = new Team();

        scoreRealMadridTextView = findViewById(R.id.real_madrid_score);
        goalsFromPenaltyRealMadridTextView = findViewById(R.id.goalFromPenaltyRealMadridTextView);
        foulsRealMadridTextView = findViewById(R.id.foulsRealMadridTextView);
        yellowCardsRealMadridTextView = findViewById(R.id.yellowCardsRealMadridTextView);
        redCardsRealMadridTextView = findViewById(R.id.redCardsRealMadridTextView);
        redCards2RealMadridTextView = findViewById(R.id.redCards2RealMadridTextView);

        goalRealMadridButton = findViewById(R.id.goalRealMadridButton);
        goalsFromPenaltyRealMadridButton = findViewById(R.id.goalsFromPenaltyRealMadridButton);
        foulsRealMadridButton = findViewById(R.id.foulsRealMadridButton);
        yellowCardsRealMadridButton = findViewById(R.id.yellowCardsRealMadridButton);
        redCardsRealMadridButton = findViewById(R.id.redCardsRealMadridButton);
        redCards2RealMadridButton = findViewById(R.id.redCards2RealMadridButton);

        goalRealMadridButton.setOnClickListener(this);
        goalsFromPenaltyRealMadridButton.setOnClickListener(this);
        foulsRealMadridButton.setOnClickListener(this);
        yellowCardsRealMadridButton.setOnClickListener(this);
        redCardsRealMadridButton.setOnClickListener(this);
        redCards2RealMadridButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.goalBarcelonaButton:
                barcelona.addGoal();
                scoreBarcelonaTextView.setText(String.valueOf(barcelona.getGoals()));
                break;
            case R.id.goalsFromPenaltyBarcelonaButton:
                barcelona.addGoalFromPenalty();
                goalsFromPenaltyBarcelonaTextView.setText(String.valueOf(barcelona.getGoalsFromPenalty()));
                break;
            case R.id.foulsBarcelonaButton:
                barcelona.addFoul();
                foulsBarcelonaTextView.setText(String.valueOf(barcelona.getFouls()));
                break;
            case R.id.yellowCardsBarcelonaButton:
                barcelona.addYellowCard();
                yellowCardsBarcelonaTextView.setText(String.valueOf(barcelona.getYellowCards()));
                break;
            case R.id.redCardsBarcelonaButton:
                barcelona.addRedCard();
                redCardsBarcelonaTextView.setText(String.valueOf(barcelona.getRedCards()));

                break;
            case R.id.redCards2BarcelonaButton:
                barcelona.addRedCard2();
                redCards2BarcelonaTextView.setText(String.valueOf(barcelona.getRedCards2()));
                break;


            case R.id.goalRealMadridButton:
                realMadrid.addGoal();
                scoreRealMadridTextView.setText(String.valueOf(realMadrid.getGoals()));
                break;
            case R.id.goalsFromPenaltyRealMadridButton:
                realMadrid.addGoalFromPenalty();
                goalsFromPenaltyRealMadridTextView.setText(String.valueOf(realMadrid.getGoalsFromPenalty()));
                break;
            case R.id.foulsRealMadridButton:
                realMadrid.addFoul();
                foulsRealMadridTextView.setText(String.valueOf(realMadrid.getFouls()));
                break;
            case R.id.yellowCardsRealMadridButton:
                realMadrid.addYellowCard();
                yellowCardsRealMadridTextView.setText(String.valueOf(realMadrid.getYellowCards()));
                break;
            case R.id.redCards2RealMadridButton:
                realMadrid.addRedCard2();
                redCards2RealMadridTextView.setText(String.valueOf(realMadrid.getRedCards2()));
                break;
        }

    }
}

