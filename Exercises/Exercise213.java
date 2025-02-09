package Exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> triangleSides = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        triangleSides.sort(Comparator.naturalOrder());

        if (triangleSides.get(2) * triangleSides.get(2) == triangleSides.get(1) * triangleSides.get(1) + triangleSides.get(0) * triangleSides.get(0)) {
            System.out.println("The given sides form a right triangle");
        } else System.out.println("The given sides don't form a right triangle");
    }
}
