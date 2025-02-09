package Exercises;

import java.util.Scanner;

public class Exercise237 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[10][10];

        System.out.println("Input 10 rows of 10 numbers representing green squares (island) as 1 and blue squares (sea) as zeros");

        for (int i = 0; i < 10; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 10; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        boolean[][] visited = new boolean[10][10];
        int islandCount = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    islandCount++;
                    checkForIsland(map, visited, i, j);
                }
            }
        }

        System.out.println("Number of islands:");
        System.out.println(islandCount);
    }

    public static void checkForIsland(int[][] grid, boolean[][] visited, int x, int y) {
        if (x < 0 || y < 0 || x >= 10 || y >= 10 || grid[x][y] == 0 || visited[x][y]) {
            return;
        }

        visited[x][y] = true;

        checkForIsland(grid, visited, x - 1, y); // up
        checkForIsland(grid, visited, x + 1, y); // down
        checkForIsland(grid, visited, x, y - 1); // left
        checkForIsland(grid, visited, x, y + 1); // right
    }
}
