package com.bridgelabz.pattern;

public class StarPattern2 {
    public static void main(String[] args) {
        StarPattern2.getPattern(5);
    }

    public static void getPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == j) || (j == n - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.printf("\n");
        }
    }
}
