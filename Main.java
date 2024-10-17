import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else oddNumbers.add(number);
        }
        oddNumbers.addAll(evenNumbers);
        System.out.println(oddNumbers);

    }
}