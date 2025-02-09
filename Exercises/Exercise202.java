package Exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int k = Integer.parseInt(sc.nextLine());
        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Value of k: " + k);
        System.out.println("Total number of continuous subarrays: " + substring(numbers, k));
    }

    public static int substring(int[] nums, int k) {
        int amount = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                amount += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return amount;
    }
}


