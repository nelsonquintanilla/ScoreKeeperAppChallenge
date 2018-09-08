package com.applaudostudios.scorekeeperappchallenge;

import android.os.Parcel;
import android.os.Parcelable;

//It has all fields and methods needed for each Team
public class Team implements Parcelable {

    private int mGoals;
    private int mGoalsFromPenalty;

    private int mFouls;
    private int mYellowCards;
    private int mRedCards;
    private int mRedCards2;

    Team() {
        this.mGoals = 0;
        this.mGoalsFromPenalty = 0;
        this.mFouls = 0;
        this.mYellowCards = 0;
        this.mRedCards = 0;
        this.mRedCards2 = 0;
    }

    public void setGoals(int mGoals) {
        this.mGoals = mGoals;
    }

    public void setGoalsFromPenalty(int mGoalsFromPenalty) {
        this.mGoalsFromPenalty = mGoalsFromPenalty;
    }

    public void setFouls(int mFouls) {
        this.mFouls = mFouls;
    }

    public void setYellowCards(int mYellowCards) {
        this.mYellowCards = mYellowCards;
    }

    public void setRedCards(int mRedCards) {
        this.mRedCards = mRedCards;
    }

    public void setRedCards2(int mRedCards2) {
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

    /**
     * Increment the score for the Team
     */
    public void addGoal() {
        this.mGoals++;
    }

    /**
     * Increment the textView that shows the number of goals from penalties
     */
    public void addGoalFromPenalty() {
        this.mGoalsFromPenalty++;
        this.mGoals++;
    }

    /**
     * Increment the textView that shows the number of fouls
     */
    public void addFoul() {
        this.mFouls++;
    }

    /**
     * Increment the textView that shows the number of yellow cards
     */
    public void addYellowCard() {
        this.mFouls++;
        this.mYellowCards++;
    }

    /**
     * Increment the textView that shows the number of red cards
     */
    public void addRedCard() {
        this.mFouls++;
        this.mRedCards++;
    }

    /**
     * Increment the textView that shows the number of red cards by accumulation of yellow cards
     */
    public void addRedCard2() {
        this.mRedCards2++;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.mGoals);
        dest.writeInt(this.mGoalsFromPenalty);
        dest.writeInt(this.mFouls);
        dest.writeInt(this.mYellowCards);
        dest.writeInt(this.mRedCards);
        dest.writeInt(this.mRedCards2);
    }

    private Team(Parcel in) {
        this.mGoals = in.readInt();
        this.mGoalsFromPenalty = in.readInt();
        this.mFouls = in.readInt();
        this.mYellowCards = in.readInt();
        this.mRedCards = in.readInt();
        this.mRedCards2 = in.readInt();
    }

    public static final Parcelable.Creator<Team> CREATOR = new Parcelable.Creator<Team>() {
        @Override
        public Team createFromParcel(Parcel source) {
            return new Team(source);
        }

        @Override
        public Team[] newArray(int size) {
            return new Team[size];
        }
    };
}
