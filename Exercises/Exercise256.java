package Exercises;

import java.util.Scanner;

public class Exercise256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        int n = sc.nextInt();
        printPentagonalNumbers(n);
    }

    public static void printPentagonalNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%-6d", getPentagonalNumber(i));
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int i) {
        return i * (3 * i - 1) / 2;
    }
}
