import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int counter = 0;
        for (int i = 0; i < list1.size(); i++) {
            int diff = list1.get(i) - list2.get(i);
            if (Math.abs(diff) <= 1 && !list1.get(i).equals(list2.get(i))) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}