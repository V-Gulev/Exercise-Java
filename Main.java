import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        boolean checkFor10 = false;
        boolean checkFor20 = false;
        if (numbers.contains(10)) {
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i) == 10 && numbers.get(i + 1) == 10) {
                    checkFor10 = true;
                }
            }
        }
        if (numbers.contains(20)) {
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i) == 20 && numbers.get(i + 1) == 20) {
                    checkFor20 = true;
                }
            }
        }
        if (checkFor10 && !checkFor20) {
            System.out.println("Found 10");
        } else if (!checkFor10 && checkFor20) {
            System.out.println("Found 20");
        } else System.out.println("Nothing found");
    }
}