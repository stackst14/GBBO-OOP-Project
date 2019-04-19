package com.javaproject.gbbo;

public class Baker extends Episode{
    Recipe recipe; // Has access to the Recipe class
    private String bakerName; // Baker's name
    
    // Constructor
    public Baker(int season,int episodeNumber, String typeOfEpi, String name, String recipeName){
        super(season,episodeNumber,typeOfEpi);
        recipe = new Recipe(recipeName); // A recipe of Type Recipe for said baker.
        this.bakerName = name;
    }
    // Setters and Getters
    public void setBakerName(String name){ //Modify Name
        this.bakerName = name;
    }
    
    public String getBakerName(){ // View Name
        return this.bakerName;
    }
    
    public void setRecipe(String recipeName){ // Set Recipe Name
        this.recipe = new Recipe(recipeName);
    }
    
    public String getRecipe(){ //View recipe Name
        return this.recipe.getNameOfRecipe();
    }
    
    //Additional methods used for console
    public void showAllBakerName(){
        System.out.println("Baker:" + this.bakerName);
    }
    public void showAllRecipeName(){
        System.out.println(this.recipe.getNameOfRecipe());
    }
}
