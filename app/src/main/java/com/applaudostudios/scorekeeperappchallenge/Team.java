package com.applaudostudios.scorekeeperappchallenge;

public class Team {

    private int mGoals;
    private int mGoalsFromPenalty;

    private int mFouls;
    private int mYellowCards;
    private int mRedCards;
    private int mRedCards2;

    public Team(){
        this.mGoals = 0;
        this.mGoalsFromPenalty = 0;
        this.mFouls = 0;
        this.mYellowCards = 0;
        this.mRedCards = 0;
        this.mRedCards2 = 0;
    }

    public void setmGoals(int mGoals) {
        this.mGoals = mGoals;
    }

    public void setmGoalsFromPenalty(int mGoalsFromPenalty) {
        this.mGoalsFromPenalty = mGoalsFromPenalty;
    }

    public void setmFouls(int mFouls) {
        this.mFouls = mFouls;
    }

    public void setmYellowCards(int mYellowCards) {
        this.mYellowCards = mYellowCards;
    }

    public void setmRedCards(int mRedCards) {
        this.mRedCards = mRedCards;
    }

    public void setmRedCards2(int mRedCards2) {
        this.mRedCards2 = mRedCards2;
    }

    public int getGoals() {
        return mGoals;
    }

    public int getGoalsFromPenalty() {
        return mGoalsFromPenalty;
    }

    public int getFouls() {
        return mFouls;
    }

    public int getYellowCards() {
        return mYellowCards;
    }

    public int getRedCards() {
        return mRedCards;
    }

    public int getRedCards2() {
        return mRedCards2;
    }


    public void addGoal() {
        this.mGoals++;
    }

    public void addGoalFromPenalty() {
        this.mGoalsFromPenalty++;
        this.mGoals++;
    }

    public void addFoul() {
        this.mFouls++;
    }

    public void addYellowCard() {
        this.mFouls++;
        this.mYellowCards++;
    }

    public void addRedCard() {
        this.mFouls++;
        this.mRedCards++;
    }

    public void addRedCard2() {
        this.mRedCards2++;
    }

}
