import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int firstLast = Math.max(nums1.getFirst(), nums1.getLast());
        int max = Math.max(firstLast, nums1.get(nums1.size() / 2));
        System.out.println(max);
    }
}
