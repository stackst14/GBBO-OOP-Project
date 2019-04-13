package com.javaproject.gbbo;
import java.util.ArrayList;

public class Season {
    private ArrayList<Baker> bakers; //An arraylist that will hold all the Bakers information.
    private ArrayList<Episode> episode;
    private int seasonNum; // The season number.
    
    public Season(){   
    }
    //Constructor that will create a Season with all the bakers
    public Season(int season, ArrayList<Baker> allBakers, ArrayList<Episode> allEpisodes){
        this.seasonNum = season;
        bakers = new ArrayList<Baker>();
        this.bakers = allBakers;
        episode = new ArrayList<Episode>();
        this.episode = allEpisodes;
    }
    
    public void setSeason(int season){//Set the season if for some reason the season was set wrong
        this.seasonNum = season;
    }
    
    public int getSeason(){// Get the current season
        return this.seasonNum;
    }
    public void showSeasonBelongs(){
        System.out.println("Season: " + this.seasonNum);
    }
    public void showAllBakers(){
        for(Baker allbakers: bakers){
            allbakers.showAllBakerName();
        }
    }
    
    public void showAllBakerRecipes(){
        for(Baker allbakers: bakers){
            allbakers.showAllRecipeName();
        }
    }
    
//    public void showEpisodeAndSeason(){
//        for(Episode allEpisodes: episode){
//            allEpisodes.showAllEpisodeInfo();
//            //System.out.print("Season:"+this.seasonNum);
//        }
//    }
    public void showEpisode(){
        for(Episode allEpisodes: episode){
            allEpisodes.showAllEpisodeNum();
        }
    }
    
    public void showEpisodeDescription(){
        for(Episode allEpisodes: episode){
            allEpisodes.showAllEpisodeDescription();
        }
    }
}
