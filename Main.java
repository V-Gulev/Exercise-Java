import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(sc.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        boolean consecutiveNumbers = false;

        for (int i = 0; i < list1.size() - 3; i++) {
            if (list1.get(i + 1) == list1.get(i) + 1 && list1.get(i + 2) == list1.get(i + 1) + 1 && list1.get(i + 3) == list1.get(i + 2) + 1) {
                consecutiveNumbers = true;
                break;
            }
        }
        System.out.println(consecutiveNumbers);
    }
}