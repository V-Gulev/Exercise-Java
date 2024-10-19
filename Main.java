import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        result.sort(Comparator.naturalOrder());
        System.out.println(result);
    }
}