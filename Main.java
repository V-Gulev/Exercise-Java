import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums1 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> nums2 = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] array = new int[2];
        array[0] = nums1.getFirst();
        array[1] = nums2.getLast();
        System.out.println(Arrays.toString(array).replaceAll("[\\[\\],]", ""));

    }
}
