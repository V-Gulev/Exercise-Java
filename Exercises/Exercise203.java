package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {4, 2, 3, 3, 7, 2, 4};
        int k = 3;

        System.out.println(Arrays.toString(numbers));
        System.out.println("Maximum average value: " + averageMax(numbers, k));
    }

    public static double averageMax(int[] numbers, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        int max = sum;
        for (int i = n; i < numbers.length; i++) {
            sum = sum - numbers[i - n] + numbers[i];
            max = Math.max(max, sum);
        }

        return (double) max / n;
    }
}
