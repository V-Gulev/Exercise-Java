package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int currentSequence = 1;
        int longestSequence = 0;

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i + 1) == numbers.get(i) + 1) {
                currentSequence++;
            } else currentSequence = 1;
            if (currentSequence > longestSequence) {
                longestSequence = currentSequence;
            }
        }
        System.out.println(longestSequence);

    }
}
