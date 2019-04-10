package com.javaproject.gbbo;
import java.util.ArrayList;
import java.util.Arrays;

public class Episode {
    private int[] episodeNumber;
    private  String[] episodeNames;
    
    

    public Episode(){ // Constructor with episode Number and type of episode
        episodeNumber = new int[] {1, 2, 3, 4, 5, 6};
        episodeNames = new String[] {"Biscuit Week", "Cake Week", "Bread Week", "Dessert Week", "Pastry Week", "Final"};
    }
    
    public void printEpisodeNumAndName(){
        for(int i=0; i<episodeNumber.length; i++){
            //System.out.println("Episode " + episodeNumber[i]);
            System.out.printf("%-10s %-10s\n", "Episode "+ episodeNumber[i], episodeNames[i]);  
        }

}
}

