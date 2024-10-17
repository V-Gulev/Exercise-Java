import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(nums1);
        int[] rotated = {nums1.get(1), nums1.getLast(), nums1.getFirst()};
        System.out.println(Arrays.toString(rotated));


    }
}
