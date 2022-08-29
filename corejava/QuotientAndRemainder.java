package com.day5.corejava;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        float n;
        float div;
        System.out.print("Enter The Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextFloat();
        System.out.print("Enter Divisor Number :");
        div = sc.nextFloat();
        float quo = n/div;
        float rem = n%div;
        System.out.println("Quotient of a Number is" +n+ "is" +quo);
        System.out.println("Remainder of a Number is" +n+ "is" +rem);
    }
}
