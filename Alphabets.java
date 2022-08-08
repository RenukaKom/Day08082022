package com.bridgelabz.pattern;

public class Alphabets {
    static int height = 5;
    static int width = (2 * height) - 1;

    public static void main(String[] args) {
        char character = 'E';
        printPattern(character);
    }

    static void printA() {
        int n = width / 2, i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j <= width; j++) {
                if (j == n || j == (width - n)
                        || (i == height / 2 && j > n
                        && j < (width - n)))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
            n--;
        }
    }

    // Function to print the pattern of 'B'
    static void printB() {
        int i, j, half = (height / 2);
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < width; j++) {
                if ((i == 0 || i == height - 1 || i == half)
                        && j < (width - 2))
                    System.out.printf("*");
                else if (j == (width - 2)
                        && !(i == 0 || i == height - 1
                        || i == half))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    // Function to print the pattern of 'C'
    static void printC() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < (height - 1); j++) {
                if (i == 0 || i == height - 1)
                    System.out.printf("*");
                else
                    continue;
            }
            System.out.printf("\n");
        }
    }

    // Function to print the pattern of 'D'
    static void printD() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < height; j++) {
                if ((i == 0 || i == height - 1)
                        && j < height - 1)
                    System.out.printf("*");
                else if (j == height - 1 && i != 0
                        && i != height - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    // Function to print the pattern of 'E'
    static void printE() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < height; j++) {
                if ((i == 0 || i == height - 1)
                        || (i == height / 2
                        && j <= height / 2))
                    System.out.printf("*");
                else
                    continue;
            }
            System.out.printf("\n");
        }
    }

    // Function to print the pattern of 'F'
    static void printF() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < height; j++) {
                if ((i == 0) || (i == height / 2
                        && j <= height / 2))
                    System.out.printf("*");
                else
                    continue;
            }
            System.out.printf("\n");
        }
    }

    // Function to print the pattern of 'G'
    static void printG() {
        int i, j;
        width--;
        for (i = 0; i < height; i++) {
            for (j = 0; j < width; j++) {
                if ((i == 0 || i == height - 1)
                        && (j == 0 || j == width - 1))
                    System.out.printf(" ");
                else if (j == 0)
                    System.out.printf("*");
                else if (i == 0 && j <= height)
                    System.out.printf("*");
                else if (i == height / 2
                        && j > height / 2)
                    System.out.printf("*");
                else if (i > height / 2
                        && j == width - 1)
                    System.out.printf("*");
                else if (i == height - 1
                        && j < width)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    // Function to print the pattern of 'H'
    static void printH() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j < height; j++) {
                if ((j == height - 1)
                        || (i == height / 2))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    // Function to print the pattern of 'I'
    static void printI() {
        int i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j < height; j++) {
                if (i == 0 || i == height - 1)
                    System.out.printf("*");
                else if (j == height / 2)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    // Function to print the pattern of 'J'
    static void printJ() {
        int i, j;
        for (i = 0; i < height; i++) {
            for (j = 0; j < height; j++) {
                if (i == height - 1 && (j > 0
                        && j < height - 1))
                    System.out.printf("*");
                else if ((j == height - 1
                        && i != height - 1)
                        || (i > (height / 2) - 1
                        && j == 0 && i != height - 1))
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }

    // Function to print the pattern of 'L'
    static void printL() {
        int i, j;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j <= height; j++) {
                if (i == height - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }


    static void printPattern(char character) {
        switch (character) {
            case 'A':
                printA();
                break;
            case 'B':
                printB();
                break;
            case 'C':
                printC();
                break;
            case 'D':
                printD();
                break;
            case 'E':
                printE();
                break;
            case 'F':
                printF();
                break;
            case 'G':
                printG();
                break;
            case 'H':
                printH();
                break;
            case 'I':
                printI();
                break;
            case 'J':
                printJ();
                break;
            case 'L':
                printL();
                break;
        }
    }
}