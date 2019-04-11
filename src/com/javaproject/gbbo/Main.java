package com.javaproject.gbbo;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Baker baker1 = new Baker(1,"Juan","Pound Cake");
        Baker baker2 = new Baker(1,"Fabian","Carrot Cake");
        Baker baker3 = new Baker(1,"John","White Cake");
        Episode epi1 = new Episode(1,"Cake Episode");
        Episode epi2 = new Episode(2,"Bread Episode");
        Episode epi3 = new Episode(3,"Cookies Episode");
        ArrayList<Baker> Bakers = new ArrayList<Baker>();
        ArrayList<Episode> Episodes = new ArrayList<Episode>();
        Episodes.add(epi1);
        Episodes.add(epi2);
        Episodes.add(epi3);
        Bakers.add(baker1);
        Bakers.add(baker2);
        Bakers.add(baker3);
        Season Season1 = new Season(1,10,Bakers,Episodes); // I barely started implementing arrayList of Baker objects so this currently doesnt work as of right now.
        System.out.println(Season1.getSeason());
        Season1.showAllBakersInfo();
        Season1.showEpisodeAndSeason();
    }  
}
