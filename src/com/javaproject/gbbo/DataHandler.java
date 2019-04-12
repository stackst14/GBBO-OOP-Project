package com.javaproject.gbbo;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DataHandler {
    private Scanner fileIn = null;
    private void dataIntoClasses(){
        try
        {
            fileIn = new Scanner(
            new FileInputStream("GBBOInfo.txt"));
            String num = fileIn.next();
            System.out.println(num);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
    
    public void hasAllSeasons(ArrayList<Baker> bakers, ArrayList<Episode> episodes){
        
    }
}
