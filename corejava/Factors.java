package com.day5.corejava;

import java.util.*;

import java.util.Scanner;

public class Factors {
    public static int fact = 1;

    public static void main(String[] args) {
        int n;
        System.out.print("Enter The NUmber : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("Factorial of" + n + " " + "is : " + 1);
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;

            }
            System.out.println("Factorial of " + n + "is : " + fact);
        }
    }
}
