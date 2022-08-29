package com.day5.corejava;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        n = sc.nextInt();
        int output = 1;
        for (int i = 2; i <= n; i++){
            output = output+1/i;
        }
        System.out.println("Harmonic Number Is : " +output);
    }
}
