import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(sc.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        int temp = list1.getFirst();
        list1.removeFirst();
        list1.add(temp);
        System.out.println(list1);
    }
}