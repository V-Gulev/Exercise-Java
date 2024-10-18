import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int count10 = 0;
        int count20 = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == 10) {
                count10++;
            } else if (list1.get(i) == 20) {
                count20++;
            }
        }
        System.out.println(count10 > count20);
    }
}