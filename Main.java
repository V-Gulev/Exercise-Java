import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        boolean numAppearsInPairs = true;
        int specifiedNumber = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) != specifiedNumber && numbers.get(i + 1) != specifiedNumber) {
                numAppearsInPairs = false;
                break;
            }
        }
        System.out.println(numAppearsInPairs);
    }
}