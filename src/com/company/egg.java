package com.company;

public class egg extends food{
    private String type;
    private int tastyScore;

    public egg(double protein, double fat, double carbohydrate) {
        super(protein, fat, carbohydrate);
        this.type = "Non-Vegetarian";
        this.tastyScore = 9;
    }

    public String getType() {
        return type;
    }

    public int getTastyScore() {
        return tastyScore;
    }
}

