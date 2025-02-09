package Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Integer> numbers = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            numbers.add(Integer.parseInt(String.valueOf(ch)));
        }
        numbers.sort(Comparator.naturalOrder());
        String smallest = "";
        String biggest = "";
        for (int i : numbers) {
            smallest += String.valueOf(i);
        }
        numbers.sort(Comparator.reverseOrder());
        for (int i : numbers) {
            biggest += String.valueOf(i);
        }
        int num1 = Integer.parseInt(smallest);
        int num2 = Integer.parseInt(biggest);
        int result = num2 - num1;
        System.out.println("Difference between the largest and the smallest integer from the given integer: " + result);


    }
}
