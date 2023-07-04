package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Thirteen {
    public static void main(String[] args) {
        String name = new String("PRIYANSH");
        String naam = "PRIYANSH.";
        System.out.println(name);
        System.out.println(naam);
        String ls = naam.toLowerCase();
        System.out.println(ls);
        System.out.println(name.substring(4));
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 4));
        int value = naam.length();
        System.out.println(value);
        System.out.println(naam.replace('H', '.'));
        System.out.println(naam.replace("RIYANS", "."));
        String myStr = "P  RIYA    ANSH";
        System.out.println(myStr.indexOf("  "));
        System.out.println(myStr.indexOf("    "));
        System.out.println(myStr.indexOf("     "));
        int a = 1;
        float b = 1.1f;
        System.out.printf("The value of a is %d & value of b is %f", a, b);

    }
}
