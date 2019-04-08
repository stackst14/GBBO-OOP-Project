package com.javaproject.gbbo;


public class Baker {
    Recipe recipe; // Has access to the Recipe class
    private int bakerID; //ID to better access bakers instead of using Their name
    private String bakerName; // Baker's name
    
    public Baker(int bakerIdef, String name, String recipeName){ // Constructor that will create an ID, their name, and their recipe.
        recipe = new Recipe(recipeName); // A recipe of Type Recipe for said baker. ** This could be change to an arrayList if there is more than one recipe in one episode. **
        this.bakerID = bakerIdef;
        this.bakerName = name;
        System.out.println("inside baker constructor");
    }
    
    public void setBakerID(int bakerIdef){ //Change ID
        this.bakerID = bakerIdef;
    }
    public int getBakerID(){ //View ID
        return this.bakerID;
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
}
