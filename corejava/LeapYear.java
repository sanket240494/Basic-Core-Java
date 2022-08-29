package com.day5.corejava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the Leap Year : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 4 == 0 && n % 100 != 0) {
            System.out.println(n + " " + "Is a Leap Year");
        } else if (n % 4 == 0 && n % 100 == 0 && n % 400 == 0) {
            System.out.println(n + " " + "Is a Leap Year");
        } else if (n % 4 == 0 && n % 400 == 0 && n % 100 == 0) {
            System.out.println(n + " " + "Is a Leap Year");
        } else {
            System.out.println(n + " " + "Is Not a Leap Year");
        }
    }
}
