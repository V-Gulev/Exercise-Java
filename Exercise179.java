import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int addNumbers = 1;

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) == 9 && addNumbers == 1) {
                numbers.set(i, 0);
            } else {
                numbers.set(i, numbers.get(i) + addNumbers);
                addNumbers = 0;
            }
        }

        if (addNumbers == 1) {
            numbers.add(0, 1);
        }

        System.out.println(numbers);
    }
}