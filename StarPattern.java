package com.bridgelabz.pattern;

public class StarPattern {
    public static void main(String[] args) {
       StarPattern.getPattern(5);
    }
    public static void getPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } System.out.printf("\n");
        }
    }
}
