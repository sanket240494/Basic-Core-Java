package com.day5.corejava;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int a;
        float tailCount = 0;
        float headCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            double toss = Math.floor(Math.random() * 10) / 10;
            System.out.println("Toss Value is : " + toss);
            if (toss < 0.5) {
                tailCount++;
                System.out.println("Toss is :" + "Tails");

            } else {
                headCount++;
                System.out.println("Toss is : " + "Head");
            }

        }
        float tailpercentage = (float)((tailCount/a)*100);
        float headpercentage = (float) ((headCount/a)*100);
        System.out.println("Percentage of tail is: " +tailpercentage);
        System.out.println("Percentage of Head is: " +headpercentage);
    }
}
