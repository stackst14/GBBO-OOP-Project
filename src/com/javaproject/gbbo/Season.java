package com.javaproject.gbbo;
import java.util.ArrayList;

public class Season {
    private int seasonNum; // The season number.
    
    //Constructor that will create a Season with all the bakers
        public Season(int season){
        this.seasonNum = season;
       
        System.out.println("season " + seasonNum);
        Episode EpisodeCreate = new Episode();
        EpisodeCreate.printEpisodeNumAndName();
       
        System.out.println("Inside season class constructor");
    }
}
    