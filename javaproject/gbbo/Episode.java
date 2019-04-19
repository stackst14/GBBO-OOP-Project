package com.javaproject.gbbo;

public class Episode extends Season {

    private int episodeNumber;
    private String typeOfEpisode;
    
    //Constructor
    public Episode(int season, int episodeNumber, String typeOfEpi) {
        super(season);
        this.episodeNumber = episodeNumber;
        this.typeOfEpisode = typeOfEpi;
    }
    
    //Setters and Getters
    public void setEpisodeNum(int episodeNumber) { // Modify the episode Number
        this.episodeNumber = episodeNumber;
    }

    public int getEpisodeNum() { // View the episode Number
        return this.episodeNumber;
    }

    public void setTypeOfEpisode(String typeOfEpi) { //Modify the Type of Episode i.e. Cake Episode <-- If thats even an episode type
        this.typeOfEpisode = typeOfEpi;
    }

    public String getTypeOfEpisode() { // View the type of Episode
        return this.typeOfEpisode;
    }
    
    //Additional Methods for Console Application
    public void showAllEpisodeInfo() {
        System.out.println("Episode:" + this.episodeNumber);
        System.out.println("Description:" + this.typeOfEpisode);
    }

    public void showAllEpisodeNum() {
        System.out.println("Episode:" + this.episodeNumber);
    }

    public void showAllEpisodeDescription() {
        System.out.println("Description:" + this.typeOfEpisode);
    }
}
