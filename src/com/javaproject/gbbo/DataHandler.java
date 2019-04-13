package com.javaproject.gbbo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public final class DataHandler {
    //private Scanner fileIn = null;
    private BufferedReader br;
    private final ArrayList<Baker> Bakers;
    private final ArrayList<Episode> Episodes;
    private final ArrayList<Season> season;
    //private int seasonNum;
    
    public DataHandler() throws IOException{
        season = new ArrayList<>();
        Bakers = new ArrayList<>();
        Episodes = new ArrayList<>();
        dataIntoClasses();
    }
    
    public void dataIntoClasses() throws IOException{
        try
        {
            br = new BufferedReader(new FileReader("D:\\Fabian Hernandez\\Spring 2019 Semester\\CS 4332 Artificial Intelligence\\Projects\\Project1\\TSP_ProgramJava\\com.javaproject.gbbo\\src\\com\\javaproject\\gbbo\\GBBOInfo.txt"));
            
            String fileRead = br.readLine();
            int seasonNum = 1;
            while( fileRead != null ){
                String [] tokenize = fileRead.split("#");
                
               // seasonNum;
                int episodeNum = Integer.parseInt(tokenize[0]);
                String episodeType;
                String bakerName;
                String recipe;
                switch (seasonNum){
                case 1:
                    System.out.println("Season 1");
                    seasonNum = Integer.parseInt(tokenize[0]);
                    episodeNum = Integer.parseInt(tokenize[1]);
                    episodeType = tokenize[2];
                    bakerName = tokenize[3];
                    recipe = tokenize[4];
                    Bakers.add(new Baker(bakerName,recipe));
                    Episodes.add(new Episode(episodeNum,episodeType));
                    break;
                case 2:
                    System.out.println("Season 2");
                    seasonNum = Integer.parseInt(tokenize[0]);
                    episodeNum = Integer.parseInt(tokenize[1]);
                    episodeType = tokenize[2];
                    bakerName = tokenize[3];
                    recipe = tokenize[4];
                    Bakers.add(new Baker(bakerName,recipe));
                    Episodes.add(new Episode(episodeNum,episodeType));
                    break;
                }
                fileRead = br.readLine();
            }
            season.add(new Season(seasonNum,Bakers,Episodes));
            br.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
    public void displaySeasonInfo(){
//        switch (seasonNum){
//            case 1:
//                season.get(1).getSeason()
//                displayAllBakersName();
//                displayAllBakersRecipe();
//                displayAllEpisode();
//                displayAllEpisodeDescription();
//                
//            case 2:
//                System.out.println("Season:1"+seasonNum);
//                displayAllBakersName();
//                displayAllBakersRecipe();
//                displayAllEpisode();
//                displayAllEpisodeDescription();
//                break;
//        }
//        for(Season allSeasons: season){
//            allSeasons.showSeasonBelongs();
//        }
    }
    public void displaySeason(){
        System.out.println(season.size());
//        for(Season allSeasons: season){
//            //allSeasons.
//        }
    }
    public void displayAllEpisodes(){
        for(Season allSeasons: season){
            allSeasons.showEpisode();
        }
    }
    
    public void displayAllBakersName(){
        for(Season allSeasons: season){
             allSeasons.showAllBakers();
        }
    }
    public void displayAllBakersRecipe(){
        for(Season allSeasons: season){
             allSeasons.showAllBakerRecipes();
        }
    }
    
    public void displayAllEpisode(){
        for(Season allSeasons: season){
             allSeasons.showEpisode();
        }
    }
    
    public void displayAllEpisodeDescription(){
        for(Season allSeasons: season){
             allSeasons.showEpisodeDescription();
        }
    }
    public void modifyBakerInfo(int index, String newName, String newRecipe){
        Bakers.get(index).setBakerName(newName);
        Bakers.get(index).setRecipe(newRecipe);
    }
}