import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> smallerThanNumbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < smallerThanNumbers.size(); i++) {
            int counter = 0;
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(j) < smallerThanNumbers.get(i)) {
                    counter++;
                }
            }
            System.out.println(counter);
        }

    }
}
