import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        boolean checkIfThereIs20 = false;
        if (numbers.contains(10)) {
            int indexOf10 = numbers.indexOf(10);
            for (int i = indexOf10; i < numbers.size(); i++) {
                if (numbers.get(i) == 20) {
                    checkIfThereIs20 = true;
                    break;
                }
            }
        }
        System.out.println(checkIfThereIs20);

    }
}