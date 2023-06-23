package com.company;

public class food {
    protected double protein;
    protected double fat;
    protected double carbohydrate;

    public food(double protein, double fat, double carbohydrate) {
        this.protein = protein;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
    }

    public void getMacroNutrients() {
        System.out.println("Protein: " + protein + " gr");
        System.out.println("Fat: " + fat + " gr");
        System.out.println("Carbohydrate: " + carbohydrate + " gr");
        System.out.println("A slice of bread has " + protein + " gms of protein, " + fat + " gms of fats and " + carbohydrate + " gms of carbohydrates.");
    }
}

