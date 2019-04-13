package com.javaproject.gbbo;

public class Episode {
    private int episodeNumber;
    private String typeOfEpisode;
    
    public Episode (int episodeNumber, String typeOfEpi){ // Constructor with episode Number and type of episode
        this.episodeNumber = episodeNumber;
        this.typeOfEpisode = typeOfEpi;
    }
    
    public void setEpisodeNum(int episodeNumber){ // Modify the episode Number
        this.episodeNumber = episodeNumber;
    }
    public int getEpisodeNum(){ // View the episode Number
        return this.episodeNumber;
    }
    
    public void setTypeOfEpisode(String typeOfEpi){ //Modify the Type of Episode i.e. Cake Episode <-- If thats even an episode type
        this.typeOfEpisode = typeOfEpi;
    }
    
    public String getTypeOfEpisode(){ // View the type of Episode
        return this.typeOfEpisode;
    }
    
    public void showAllEpisodeInfo(){
        System.out.println("Episode:" + this.episodeNumber);
        System.out.println("Description:" + this.typeOfEpisode);
    }
    
    public void showAllEpisodeNum(){
        System.out.println("Episode:" + this.episodeNumber);
    }
    
    public void showAllEpisodeDescription(){
        System.out.println("Description:" + this.typeOfEpisode);
    }
}
