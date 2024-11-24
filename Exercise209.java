import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int target = scanner.nextInt();
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(numbers, target, 0, new ArrayList<>(), result);
        System.out.println("A solution set is:");
        if (result.isEmpty()) {
            System.out.println("No combination found");
        } else System.out.println(result);
    }

    private static void findCombinations(int[] numbers, int target, int start, List<Integer> combination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = start; i < numbers.length; i++) {
            if (numbers[i] > target) continue;
            combination.add(numbers[i]);
            findCombinations(numbers, target - numbers[i], i + 1, combination, result);
            combination.removeLast();
        }
    }
}