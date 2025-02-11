package SoftUni;

import java.util.Arrays;
import java.util.Scanner;

public class ClearSkies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int armour = 300;
        char[][] matrix = new char[size][size];
        fillMatrix(matrix, sc);
        int[] coordinates = findJet(matrix);
        int row = coordinates[0];
        int col = coordinates[1];
        matrix[row][col] = '-';
        while (armour != 0 && enemyCount(matrix) > 0) {
            String command = sc.nextLine();

            switch (command) {
                case "up" -> row--;
                case "down" -> row++;
                case "left" -> col--;
                case "right" -> col++;
            }

            if (matrix[row][col] == 'E') {
                if (enemyCount(matrix) > 1) {
                    armour -= 100;
                }
            } else if (matrix[row][col] == 'R') {
                armour = 300;
            }
            matrix[row][col] = '-';

        }
        matrix[row][col] = 'J';

        if (armour <= 0) {
            System.out.printf("Mission failed, your jetfighter was shot down! Last coordinates [%d, %d]!\n", row, col);
        } else System.out.println("Mission accomplished, you neutralized the aerial threat!");

        printMatrix(matrix);

    }

    private static int enemyCount(char[][] matrix) {
        int enemyCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'E') {
                    enemyCount++;
                }
            }
        }
        return enemyCount;
    }

    private static int[] findJet(char[][] matrix) {
        int[] coordinates = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'J') {
                    coordinates[0] = i;
                    coordinates[1] = j;
                }
            }
        }
        return coordinates;
    }

    private static void fillMatrix(char[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = sc.nextLine().toCharArray();
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
