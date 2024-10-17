import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> nums2 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] result = new int[Math.min(nums2.size(), nums1.size())];
        for (int i = 0; i < Math.min(nums2.size(), nums1.size()); i++) {
            result[i] = nums1.get(i) * nums2.get(i);
        }
        System.out.println(Arrays.toString(result));
    }
}
