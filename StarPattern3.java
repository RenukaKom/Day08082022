package com.bridgelabz.pattern;

public class StarPattern3 {
    public static void main(String[] args) {
        StarPattern3.getPattern(5,5);
    }

    public static void getPattern(int n, int m) {
        int i,j ;
        for ( i = 1; i <= n; i++) {

            for ( j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.printf("\n");
    }
}

