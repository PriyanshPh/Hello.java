package com.company;

public class Arrays26 {
    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
        We have 2 options:
        1. Create 500 variables (✕)
        2. Use Arrays (✓)
         */
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 75;
        marks[3] = 90;
        marks[4] = 86;
        System.out.println(marks[4]);
        System.out.println(marks[2]);
        int [] num = {11, 33, 55, 77, 99};
        System.out.println(marks[1]);
        System.out.println(marks[0]);
    }
}
