package com.bridgelabz.pattern;

public class NumericPattern1 {
    public static void main(String[] args) {
        NumericPattern1.getPattern(5);

    }

    public static void getPattern(int n) {
        int num = 1;
        for (int i=0; i<n; i++)
             { for (int j=n-i; j>1; j--)
        {
            System.out.print(" ");
        }
        for (int j=0; j<=i; j++ )
        {
            System.out.print(num);
            num++;
        }
        System.out.println(); //ending line after each row
    }
}

}