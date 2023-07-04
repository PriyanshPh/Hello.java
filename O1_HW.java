// Write a program to Calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)
package com.company;

import java.util.Scanner;

public class O1_HW {
    public static void main(String[] args) {
        System.out.println("Enter your all 5 subject marks 1 by 1 to find out total percentage:");
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter First Subject Marks:");
        float a = sr.nextFloat();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Second Subject Marks:");
        float b = sc.nextFloat();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Third Subject Marks:");
        float c = scn.nextFloat();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Forth Subject Marks:");
        float d = scnr.nextFloat();
        Scanner snr = new Scanner(System.in);
        System.out.println("Enter Fifth Subject Marks:");
        float e = snr.nextFloat();
        float i = (a+b+c+d+e)/5;
        System.out.println(i+"%");


    }
}
