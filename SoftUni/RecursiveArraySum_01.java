package SoftUni;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(sum(numbers, 0));
    }

    private static int sum(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 0;
        }
        return numbers[index] + sum(numbers, index + 1);
    }
}