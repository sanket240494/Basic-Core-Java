package com.day5.corejava;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.print("Enter a Character : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Given Character id Vowel");
        } else {
            System.out.println("Given Character id Consinant");
        }
    }
}
