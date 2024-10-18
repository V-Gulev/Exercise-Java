import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int specifiedNumber = Integer.parseInt(sc.nextLine());
        boolean twoNumbersTogether = false;
        if (numbers.contains(specifiedNumber)) {
            for (int i = numbers.indexOf(specifiedNumber); i < numbers.size() - 2; i++) {
                if (numbers.get(i) == specifiedNumber && numbers.get(i + 1) == specifiedNumber) {
                    twoNumbersTogether = true;
                    break;
                } else if (numbers.get(i) == specifiedNumber && i <= numbers.size() - 3 && numbers.get(i + 2) == specifiedNumber) {
                    twoNumbersTogether = true;
                    break;
                }
            }
        }
        System.out.println(twoNumbersTogether);
    }
}