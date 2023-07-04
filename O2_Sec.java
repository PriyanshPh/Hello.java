package com.company;
import java.util.Scanner;
public class O2_Sec {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        //int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        //int sum = a=b;
        float sum = a+b;
        System.out.println("The sum of these numbers is: ");
        System.out.println(sum);

        boolean b1 = sc.hasNextInt(); // to check input is integer or not
        System.out.println(b1);

        System.out.println("Taking input from the user");
        Scanner st = new Scanner(System.in);
        String str = st.next(); // it's used to read only one word or first word of line
        System.out.println(str);
        Scanner strg = new Scanner(System.in);
        String strng = strg.nextLine(); // it's used to read a whole line
        System.out.println(strng);
    }

}
