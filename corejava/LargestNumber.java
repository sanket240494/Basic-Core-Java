package com.day5.corejava;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int largest;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        a = sc.nextInt();
        System.out.println("Enter the Second Number");
        b = sc.nextInt();
        System.out.println("Enter the Three Number");
        c = sc.nextInt();
        temp = a > b ? a : b;
        largest = c > temp ? c : temp;
        System.out.println("The Largest Number Is  : " + largest);
    }
}
