/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.github.starboyisunkown.apps;

/**
 *
 * @author makho
 */
public class Apps {

    public static void main(String[] args) {
        
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        //Main print heading
        System.out.println("----------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-18s %-12s %-12s %-12s%n", "", consoles[0], consoles[1], consoles[2]);

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %-12d %-12d %-12d%n", 
                cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("CONSOLE SALE FOR EACH CITY");
        System.out.println("----------------------------------------------------------------");

        //Declarations for calculation
        int[] cityTotals = new int[cities.length];
        int maxSales = -1;
        String topCity = "";

        //Total calculation and Display
        for (int i = 0; i < cities.length; i++) {
            int currentTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                currentTotal += sales[i][j];
            }
            cityTotals[i] = currentTotal;

            System.out.printf("%-18s %-12d%n", cities[i], currentTotal);

            //City with higj sales
            if (currentTotal > maxSales) {
                maxSales = currentTotal;
                topCity = cities[i];
            }
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("----------------------------------------------------------------");
    }
}