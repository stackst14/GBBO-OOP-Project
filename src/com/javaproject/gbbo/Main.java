package com.javaproject.gbbo;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DataHandler data = new DataHandler();
        data.displaySeasonInfo();
        data.displaySeason();
        data.displayAllBakersName();
        //System.out.println(data.displaySeason());
        System.out.println();
    }  
}
