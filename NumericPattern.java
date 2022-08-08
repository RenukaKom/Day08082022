package com.bridgelabz.pattern;

public class NumericPattern {

    public static void main(String[] args) {

        NumericPattern.getPattern(5);
    }
    public static void getPattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

        }
    }
}

