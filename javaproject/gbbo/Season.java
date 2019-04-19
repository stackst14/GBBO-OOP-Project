package com.javaproject.gbbo;

public class Season {

    private int seasonNum; // The season number.

    public Season(int season) {
        this.seasonNum = season;
    }

    public void setSeason(int season) {//Set the season if for some reason the season was set wrong
        this.seasonNum = season;
    }

    public int getSeason() {// Get the current season
        return this.seasonNum;
    }
    //Additional Methods for Console Applications
    public void showSeasonBelongs() {
        System.out.println("Season:" + this.seasonNum);
    }
}
