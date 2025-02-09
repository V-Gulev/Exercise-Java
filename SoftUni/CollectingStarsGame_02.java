package SoftUni;

import java.util.Scanner;

public class CollectingStarsGame_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        char[][] matrix = new char[size][size];
        fillMatrix(matrix, sc);
        int collectedStars = 2;
        int[] coordinates = findStartPosition(matrix);
        int row = coordinates[0];
        int col = coordinates[1];
        matrix[row][col] = '.';

        while (collectedStars < 10 && collectedStars > 0) {
            String command = sc.nextLine();

            switch (command) {
                case "up":
                    row--;
                    break;
                case "down":
                    row++;
                    break;
                case "left":
                    col--;
                    break;
                case "right":
                    col++;
                    break;
            }

            if (isOut(row, col, size)) {
                row = 0;
                col = 0;
                if (matrix[row][col] == '*') {
                    matrix[row][col] = '.';
                    collectedStars++;
                }
            } else if (matrix[row][col] == '*') {
                matrix[row][col] = '.';
                collectedStars++;
            } else if (matrix[row][col] == '#') {
                int[] rowAndCol = moveOneStepBack(command, row, col);
                row = rowAndCol[0];
                col = rowAndCol[1];
                collectedStars--;
            }

        }
        matrix[row][col] = 'P';
        if (collectedStars == 0) {
            System.out.println("Game over! You are out of any stars.");
        } else {
            System.out.println("You won! You have collected 10 stars.");
        }
        System.out.printf("Your final position is [%d, %d]\n", row, col);
        printMatrix(matrix);

    }

    private static int[] moveOneStepBack(String command, int row, int col) {
        switch (command) {
            case "up":
                row++;
                break;
            case "down":
                row--;
                break;
            case "left":
                col++;
                break;
            case "right":
                col--;
                break;
        }
        int[] coordinates = new int[2];
        coordinates[0] = row;
        coordinates[1] = col;
        return coordinates;
    }

    private static boolean isOut(int row, int col, int size) {
        return row < 0 || row >= size || col < 0 || col >= size;
    }

    private static int[] findStartPosition(char[][] matrix) {
        int[] coordinates = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'P') {
                    coordinates[0] = i;
                    coordinates[1] = j;
                    break;
                }
            }
        }
        return coordinates;
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(char[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = sc.nextLine().replaceAll(" ", "").toCharArray();
        }
    }
}
