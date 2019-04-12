package com.javaproject.gbbo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataHandler {
    //private Scanner fileIn = null;
    private BufferedReader br;
    private final ArrayList<Baker> Bakers;
    private final ArrayList<Episode> Episodes;
    private Season season;
    
    public DataHandler() throws IOException{
        season = new Season();
        Bakers = new ArrayList<>();
        Episodes = new ArrayList<>();
        dataIntoClasses();
    }
    public void dataIntoClasses() throws IOException{
        try
        {
            br = new BufferedReader(new FileReader("D:\\Fabian Hernandez\\Spring 2019 Semester\\CS 4332 Artificial Intelligence\\Projects\\Project1\\TSP_ProgramJava\\com.javaproject.gbbo\\src\\com\\javaproject\\gbbo\\GBBOInfo.txt"));
            
            String fileRead = br.readLine();
            while( fileRead != null){
                String [] tokenize = fileRead.split("#");
                
                int episodeNum = Integer.parseInt(tokenize[0]);
                String episodeType = tokenize[1];
                int chefID = Integer.parseInt(tokenize[2]);
                String chefName = tokenize[3];
                String recipe = tokenize[4];
                Bakers.add(new Baker(chefID,chefName,recipe));
                Episodes.add(new Episode(episodeNum,episodeType));
               
                fileRead = br.readLine();
            }
            br.close();
            season = new Season(1,10,Bakers,Episodes);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
    public void showSeasonData(){
        season.showAllBakersInfo();
        season.showEpisodeAndSeason();
    }
    public Season modifySeason(){
        return this.season;
    }
//    public void modifyBaker(int index){
//        Bakers.get(index).setBakerID();
//        Bakers.get(index).getBakerID();
//    }
}
