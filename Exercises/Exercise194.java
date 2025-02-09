package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = sc.nextInt();

        List<String> positions = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    positions.add("(" + i + "," + j + ")");
                }
            }
        }

        if (positions.isEmpty()) {
            System.out.println("Number not found!");
        } else {
            for (String position : positions) {
                System.out.println(position);
            }
        }


    }
}

