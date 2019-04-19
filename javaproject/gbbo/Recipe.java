package com.javaproject.gbbo;

public class Recipe {

    private String nameOfRecipe; // Name of recipe

    public Recipe(String recipeName) { //constructor set the recipe name.
        this.nameOfRecipe = recipeName;
    }
    
    //Setters and Getters
    public void setNameOfRecipe(String recipeName) { //Change the recipe name 
        this.nameOfRecipe = recipeName;
    }

    public String getNameOfRecipe() { //View the recipe name.
        return nameOfRecipe;
    }
}
