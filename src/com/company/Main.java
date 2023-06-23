package com.company;
import java.security.PublicKey;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
         class Solution {
       public void main(String[] args) throws Exception {
           Scanner sc = new Scanner(System.in);
           int cnt = Integer.parseInt(sc.nextLine());
           for (int i = 0; i < cnt; i++) {
               String name = sc.nextLine();

               if (name.equals("Bread")) {
                   Bread breadObj = new Bread(4.0, 1.1, 13.8);
                   for (int j = 0; j < 3; j++) {
                       String command = sc.nextLine();
                       if (command.equals("getMacros")) {
                           breadObj.getMacroNutrients();
                       } else if (command.equals("getTaste")) {
                           System.out.println("Taste: " + breadObj.getTastyScore());
                       } else if (command.equals("getType")) {
                           System.out.println("Bread is " + breadObj.getType());
                       }
                   }
               } else if (name.equals("Egg")) {
                   egg eggObj = new egg(6.3, 5.3, 0.6);
                   for (int j = 0; j < 3; j++) {
                       String command = sc.nextLine();
                       if (command.equals("getMacros")) {
                           eggObj.getMacroNutrients();
                       } else if (command.equals("getTaste")) {
                           System.out.println("Taste: " + eggObj.getTastyScore());
                       } else if (command.equals("getType")) {
                           System.out.println("Egg is " + eggObj.getType());
                       }
                       else {
                           System.out.print("unable");
                       }


                   }
               }
           }
       }
   }}}



