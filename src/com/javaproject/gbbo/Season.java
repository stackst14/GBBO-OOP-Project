package com.javaproject.gbbo;
import java.util.ArrayList;

public class Season {
    private  ArrayList<String> bakers; //An arraylist that will hold all the Bakers information.
    private int seasonNum; // The season number.
    
    //Constructor that will create a Season with all the bakers
        public Season(int season, ArrayList<String> bakers){
        this.seasonNum = season;
        this.bakers = bakers;
        
        System.out.println("Inside season class constructor");
        System.out.println("season " + seasonNum);
        System.out.println("list of bakers in season class" + bakers);
    }
    
    public void setSeason(int season){//Set the season if for some reason the season was set wrong
        this.seasonNum = season;
    }
    
    public int getSeason(){// Get the current season
        return this.seasonNum;
    }
}
