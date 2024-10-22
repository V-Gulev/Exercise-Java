import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else oddNumbers.add(num);
        }
        evenNumbers.addAll(oddNumbers);
        System.out.println(evenNumbers);
    }
}
