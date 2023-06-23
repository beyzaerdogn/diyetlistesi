package com.company;


   public class Bread extends food{
        private String type;
        private int tastyScore;

        public Bread(double protein, double fat, double carbohydrate) {
            super(protein, fat, carbohydrate);
            this.type = "Vegetarian";
            this.tastyScore = 8;
        }

        public String getType() {
            return type;
        }

        public int getTastyScore() {
            return tastyScore;
        }


   }

