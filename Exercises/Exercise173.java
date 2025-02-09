package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int k = Integer.parseInt(sc.nextLine());
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size() - k + 1; i++) {
            List<Integer> window = new ArrayList<>();
            for (int j = i; j < i + k; j++) {
                window.add(numbers.get(j));
            }
            result.add(window.get(window.size() / 2));

        }

        System.out.println(result);

    }
}
