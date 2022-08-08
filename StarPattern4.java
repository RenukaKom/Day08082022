package com.bridgelabz.pattern;

public class StarPattern4 {
    public static void main(String[] args) {
        StarPattern4.getPattern(5);
    }
    public static void getPattern(int n) {
        for (int i=1; i<=n; i++)
        {
            for (int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=(i * 2) -1; k++)
            {
                if( k == 1 || k == (i * 2) -1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
