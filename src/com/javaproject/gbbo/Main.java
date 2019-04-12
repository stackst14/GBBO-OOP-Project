package com.javaproject.gbbo;
import java.io.IOException;
//import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        DataHandler data = new DataHandler();
        //data.showSeasonData();
        data.modifySeason().setSeason(2);
        System.out.println(data.modifySeason().getSeason());
        //data.modifyBaker();
    }  
}
