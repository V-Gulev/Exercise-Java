import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(sc.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        if (list1.contains(10)) {
            int index = list1.lastIndexOf(10);
            for (int i = 0; i < index; i++) {
                result.add(list1.get(i));
            }
        }
        System.out.println(result);
    }
}