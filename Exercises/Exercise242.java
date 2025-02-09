package Exercises;

import java.util.Scanner;

public class Exercise242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input number of rows/columns (0 to exit)");
            int size = sc.nextInt();

            if (size == 0) {
                System.out.println("You have exited");
                break;
            }

            int[][] table = new int[size][size];
            int[] rowSums = new int[size];
            int[] columnSums = new int[size];
            int totalSum = 0;

            System.out.println("Enter the table values:");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    table[i][j] = sc.nextInt();
                    rowSums[i] += table[i][j];
                    columnSums[j] += table[i][j];
                    totalSum += table[i][j];
                }
            }

            System.out.println("Result:");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.printf("%5d", table[i][j]);
                }
                System.out.printf("%5d%n", rowSums[i]);
            }

            for (int j = 0; j < size; j++) {
                System.out.printf("%5d", columnSums[j]);
            }
            System.out.printf("%5d%n", totalSum);
        }
    }
}
