package com.javaproject.gbbo;

import com.javaproject.forms.gbbo.MainMenu;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public final class DataHandler {

    private BufferedReader br;
    private ArrayList<Baker> Bakers;
    
    // Constructor to create an arrayList of Bakers, calls the dataIntoClasses method, and opens a jFrame window
    public DataHandler() throws IOException {
        Bakers = new ArrayList<>();
        dataIntoClasses();
        new MainMenu().setVisible(true);
    }
    
    // Constructor used in JFrame to avoid any recursive problem that the original Constructor was doing
    public DataHandler(int num) throws IOException {
        Bakers = new ArrayList<>();
        dataIntoClasses();
    }
    
    // Mathod used to read a Text file containing baker's information and populating the data into multiple baker objects.
    public void dataIntoClasses() throws IOException {
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\silen\\Desktop\\SCHOOL\\OOP\\Final Project\\F I N A L\\com.javaproject.gbbo_TSfinal\\src\\com\\javaproject\\gbbo\\GBBOInfo.txt"));
            String fileRead = br.readLine();
            while (fileRead != null) {
                String[] tokenize = fileRead.split("#");

                int seasonEpisodeBelongs = Integer.parseInt(tokenize[0]);
                int episodeNum = Integer.parseInt(tokenize[1]);
                String episodeType = tokenize[2];
                String bakerName = tokenize[3];
                String recipe = tokenize[4];
                Bakers.add(new Baker(seasonEpisodeBelongs, episodeNum, episodeType, bakerName, recipe));

                fileRead = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    //Methods Used in console Application
    public void displayBakerInfo() {
        for (Baker allBakers : Bakers) {
            System.out.println(allBakers.recipe.getNameOfRecipe());
        }
    }

    public void displayEpisodeInfo() {
        for (Baker allBakers : Bakers) {
            allBakers.showAllEpisodeDescription();
            allBakers.showAllBakerName();
        }
    }

    public void displayEpisodes() {
        for (Baker allBakers : Bakers) {
            allBakers.showAllEpisodeDescription();
        }
    }

    public void displaySeasonEpisode() {
        for (Baker allBakers : Bakers) {
            allBakers.showSeasonBelongs();
        }
    }

    public void displayAllInfo() {
        for (Baker allBakers : Bakers) {
            allBakers.showSeasonBelongs();
            System.out.println(allBakers.getEpisodeNum());
            System.out.println(allBakers.getBakerName());
            System.out.println(allBakers.recipe.getNameOfRecipe());
        }
    }

    public void displayAllRecipes() {
        for (Baker allBakers : Bakers) {
            allBakers.showAllRecipeName();
        }
    }

    public String displaySingleBakerRecipe(int num) {
        return Bakers.get(num).recipe.getNameOfRecipe();
    }
    // Method used in our JFrame to access Bakers Data.
    public ArrayList<Baker> getBakerArray() {
        return this.Bakers;
    }
}
