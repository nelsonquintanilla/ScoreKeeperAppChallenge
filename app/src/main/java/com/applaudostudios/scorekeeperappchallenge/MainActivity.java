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

    Button resetAll;

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

        resetAll = findViewById(R.id.resetAll);
        resetAll.setOnClickListener(this);

        textViewsSetter();

    }

    public void textViewsSetter() {
        scoreBarcelonaTextView.setText(String.valueOf(barcelona.getGoals()));
        goalsFromPenaltyBarcelonaTextView.setText(String.valueOf(barcelona.getGoalsFromPenalty()));
        foulsBarcelonaTextView.setText(String.valueOf(barcelona.getFouls()));
        yellowCardsBarcelonaTextView.setText(String.valueOf(barcelona.getYellowCards()));
        redCardsBarcelonaTextView.setText(String.valueOf(barcelona.getRedCards()));
        redCards2BarcelonaTextView.setText(String.valueOf(barcelona.getRedCards2()));

        scoreRealMadridTextView.setText(String.valueOf(realMadrid.getGoals()));
        goalsFromPenaltyRealMadridTextView.setText(String.valueOf(realMadrid.getGoalsFromPenalty()));
        foulsRealMadridTextView.setText(String.valueOf(realMadrid.getFouls()));
        yellowCardsRealMadridTextView.setText(String.valueOf(realMadrid.getYellowCards()));
        redCardsRealMadridTextView.setText(String.valueOf(realMadrid.getRedCards()));
        redCards2RealMadridTextView.setText(String.valueOf(realMadrid.getRedCards2()));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putParcelable("realMadrid", realMadrid);
        outState.putParcelable("barcelona", barcelona);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        realMadrid = savedInstanceState.getParcelable("realMadrid");
        barcelona = savedInstanceState.getParcelable("barcelona");
        textViewsSetter();
        super.onRestoreInstanceState(savedInstanceState);
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
                scoreBarcelonaTextView.setText(String.valueOf(barcelona.getGoals()));
                break;
            case R.id.foulsBarcelonaButton:
                barcelona.addFoul();
                foulsBarcelonaTextView.setText(String.valueOf(barcelona.getFouls()));
                break;
            case R.id.yellowCardsBarcelonaButton:
                barcelona.addYellowCard();
                yellowCardsBarcelonaTextView.setText(String.valueOf(barcelona.getYellowCards()));
                foulsBarcelonaTextView.setText(String.valueOf(barcelona.getFouls()));
                break;
            case R.id.redCardsBarcelonaButton:
                barcelona.addRedCard();
                redCardsBarcelonaTextView.setText(String.valueOf(barcelona.getRedCards()));
                foulsBarcelonaTextView.setText(String.valueOf(barcelona.getFouls()));
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
                scoreRealMadridTextView.setText(String.valueOf(realMadrid.getGoals()));
                break;
            case R.id.foulsRealMadridButton:
                realMadrid.addFoul();
                foulsRealMadridTextView.setText(String.valueOf(realMadrid.getFouls()));
                break;
            case R.id.yellowCardsRealMadridButton:
                realMadrid.addYellowCard();
                yellowCardsRealMadridTextView.setText(String.valueOf(realMadrid.getYellowCards()));
                foulsRealMadridTextView.setText(String.valueOf(realMadrid.getFouls()));
                break;
            case R.id.redCardsRealMadridButton:
                realMadrid.addRedCard();
                redCardsRealMadridTextView.setText(String.valueOf(realMadrid.getRedCards()));
                foulsRealMadridTextView.setText(String.valueOf(realMadrid.getFouls()));
                break;
            case R.id.redCards2RealMadridButton:
                realMadrid.addRedCard2();
                redCards2RealMadridTextView.setText(String.valueOf(realMadrid.getRedCards2()));
                break;

            case R.id.resetAll:
                scoreBarcelonaTextView.setText(String.valueOf(0));
                goalsFromPenaltyBarcelonaTextView.setText(String.valueOf(0));
                foulsBarcelonaTextView.setText(String.valueOf(0));
                yellowCardsBarcelonaTextView.setText(String.valueOf(0));
                redCardsBarcelonaTextView.setText(String.valueOf(0));
                redCards2BarcelonaTextView.setText(String.valueOf(0));

                barcelona.setGoals(0);
                barcelona.setGoalsFromPenalty(0);
                barcelona.setFouls(0);
                barcelona.setYellowCards(0);
                barcelona.setRedCards(0);
                barcelona.setRedCards2(0);

                scoreRealMadridTextView.setText(String.valueOf(0));
                goalsFromPenaltyRealMadridTextView.setText(String.valueOf(0));
                foulsRealMadridTextView.setText(String.valueOf(0));
                yellowCardsRealMadridTextView.setText(String.valueOf(0));
                redCardsRealMadridTextView.setText(String.valueOf(0));
                redCards2RealMadridTextView.setText(String.valueOf(0));

                realMadrid.setGoals(0);
                realMadrid.setGoalsFromPenalty(0);
                realMadrid.setFouls(0);
                realMadrid.setYellowCards(0);
                realMadrid.setRedCards(0);
                realMadrid.setRedCards2(0);
                break;
        }

    }
}

