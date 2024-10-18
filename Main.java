import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        boolean together20 = false;
        int count20 = 0;
        if (numbers.contains(20)) {
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i) == 20) {
                    count20++;
                }
                if (numbers.get(i + 1) == 20 && numbers.get(i) == 20) {
                    together20 = true;
                    break;
                }

            }
        }
        if (numbers.getLast() == 20) count20++;
        System.out.println(count20 == 3 && !together20);

    }
}