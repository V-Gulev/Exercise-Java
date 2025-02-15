import java.util.Scanner;

public class Pacman_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int health = 100;
        int size = Integer.parseInt(sc.nextLine());
        char[][] matrix = new char[size][size];
        fillMatrix(matrix, sc);
        String command = sc.nextLine();
        int[] coordinates = getPacmanLocation(matrix);
        int row = coordinates[0];
        int col = coordinates[1];
        matrix[row][col] = '-';
        boolean immunity = false;
        while (health > 0 && !command.equals("END") && getStarCount(matrix) > 0) {
            switch (command) {
                case "up" -> row--;
                case "down" -> row++;
                case "left" -> col--;
                case "right" -> col++;
            }
            int[] newLocation = checkCoordinates(row, col, size);
            row = newLocation[0];
            col = newLocation[1];

            if (matrix[row][col] == 'G') {
                if (!immunity) {
                    health -= 50;
                } else {
                    immunity = false;
                }
            } else if (matrix[row][col] == 'F') {
                immunity = true;
            }
            matrix[row][col] = '-';
            command = sc.nextLine();
        }

        matrix[row][col] = 'P';
        int starCount = getStarCount(matrix);
        if (health <= 0) {
            System.out.printf("Game over! Pacman last coordinates [%d,%d]\n", row, col);
        } else if (starCount == 0) {
            System.out.println("Pacman wins! All the stars are collected.");
        } else {
            System.out.println("Pacman failed to collect all the stars.");
        }

        System.out.printf("Health: %d\n", health);
        if (starCount > 0) {
            System.out.printf("Uncollected stars: %d\n", starCount);
        }
        printMatrix(matrix);

    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(char[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = sc.nextLine().toCharArray();
        }
    }

    private static int getStarCount(char[][] matrix) {
        int starCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == '*') {
                    starCount++;
                }
            }
        }
        return starCount;
    }

    private static int[] getPacmanLocation(char[][] matrix) {
        int[] coordinates = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'P') {
                    coordinates[0] = i;
                    coordinates[1] = j;
                }
            }
        }
        return coordinates;
    }

    private static int[] checkCoordinates(int row, int col, int size) {
        int[] coordinates = new int[2];
        if (row >= size) {
            coordinates[0] = 0;
            coordinates[1] = col;
        } else if (row < 0) {
            coordinates[0] = size - 1;
            coordinates[1] = col;
        } else if (col >= size) {
            coordinates[0] = row;
            coordinates[1] = 0;
        } else if (col < 0) {
            coordinates[0] = row;
            coordinates[1] = size - 1;
        } else {
            coordinates[0] = row;
            coordinates[1] = col;
        }

        return coordinates;
    }
}
