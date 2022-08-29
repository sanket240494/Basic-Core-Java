package com.day5.corejava;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println("Number is a Odd Number");
        } else if (n % 2 == 0) {
            System.out.println("Number is a Even Number");

        } else {
            System.out.println("Enter a Proper Number");
        }

    }
}
