import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        double average = 0;
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        average = (double) sum / numbers.size();
        List<Integer> biggerThanAverage = new ArrayList<>();
        for (int num : numbers) {
            if (num > average) {
                biggerThanAverage.add(num);
            }
        }
        biggerThanAverage.sort(Comparator.reverseOrder());

        if (biggerThanAverage.size() > 5) {
            int intsToRemove = biggerThanAverage.size() - 5;
            for (int i = 0; i < intsToRemove; i++) {
                biggerThanAverage.removeLast();
            }
        }

        if (biggerThanAverage.isEmpty()) {
            System.out.println("No");
        } else {
            for (int num : biggerThanAverage) {
                System.out.print(num + " ");
            }
        }
    }
}
