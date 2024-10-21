import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int totalSum = 0;
        double average = 0;
        for (int num : numbers) {
            totalSum += num;
        }
        average = (double) totalSum / numbers.size();
        System.out.println(average);
        for (int num : numbers) {
            if (num > average) {
                System.out.println(num);
            }
        }
    }
}
