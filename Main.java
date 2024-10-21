import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int count0 = 0;
        for (int num : numbers) {
            if (num == 0) {
                count0++;

            }
        }
        for (int i = 0; i < count0; i++) {
            numbers.remove((Integer) 0);
            numbers.add(0);
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
