package com.javaproject.gbbo;


public class Baker {
    Recipe recipe; // Has access to the Recipe class
    private String bakerName; // Baker's name
    
    public Baker(String name, String recipeName){ // Constructor that will create an ID, their name, and their recipe.
        recipe = new Recipe(recipeName); // A recipe of Type Recipe for said baker. ** This could be change to an arrayList if there is more than one recipe in one episode. **
        this.bakerName = name;
    }
    
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
    
    public void showAllBakerInfo(){
        System.out.println(this.bakerName);
        System.out.println(this.recipe.getNameOfRecipe());
    }
}
