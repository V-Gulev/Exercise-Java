package Exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> buildings = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        buildings.sort(Comparator.reverseOrder());
        for (int i = 0; i < 3; i++) {
            System.out.println(buildings.get(i));
        }

    }
}
