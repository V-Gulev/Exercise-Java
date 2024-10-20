import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int amount = sc.nextInt();
        numbers.sort(Comparator.reverseOrder());
        for (int i = 0; i < amount; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
