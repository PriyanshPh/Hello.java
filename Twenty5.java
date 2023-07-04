package com.company;

public class Twenty5 {
    public static void main(String[] args) {
        /**for (int i = 5; i >0;i--)
            switch (i){
                case 5:
                    System.out.println("*****");
                    break;
                case 4:
                    System.out.println("****");
                    break;
                case 3:
                    System.out.println("***");
                    break;
                case 2:
                    System.out.println("**");
                    break;
                case 1:
                    System.out.println("*");
                    break;
                default:
                    System.out.println("Enjoy your life.");
            }**/
        int n = 4;
        for (int i = n; i>0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        /**int m = 5;
        for (int k = 1; k <= 10; k++){
            System.out.printf("%d X %d = %d\n", n, k, n*k);
        }**/
        int p=5;
        int i = 1;
        int fac = 1;
        while (i<=p){
            fac *= i;
            System.out.printf("%d*", n-i+2);
            i++;
        }
        System.out.printf("1=%d\n", fac);
        int q = 8;
        int a = 1;
        int l = 0;
        while (a<=10){
            l += q*a;
            a++;
        }
        System.out.println(l);
    }
}
