import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(sc.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        int groupAmount = Integer.parseInt(sc.nextLine());
        List<Integer> leftGroup = new ArrayList<>();
        List<Integer> rightGroup = new ArrayList<>();

        leftGroup = list1.subList(0, groupAmount);
        rightGroup = list1.subList(list1.size() - groupAmount, list1.size());

        System.out.println(leftGroup.equals(rightGroup));
    }
}