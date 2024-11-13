import java.util.Arrays;
import java.util.Scanner;

public class Exercise201 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 3, 5, 6, 6};
        int target = 4;
        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Target of subsets: " + target);
        System.out.println("After removing duplicate characters: " + partition_k_subsets(numbers, target));
    }


    static boolean findSubset(int used, int n, boolean[] flag, int[] numbers, int target) {
        if (n == 0) {
            return true;
        }
        if (!flag[used]) {
            flag[used] = true;

            int remain_num = (n - 1) % target + 1;


            for (int i = 0; i < numbers.length; i++) {
                if ((((used >> i) & 1) == 0) && numbers[i] <= remain_num) {
                    if (findSubset(used | (1 << i), n - numbers[i], flag, numbers, target)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static boolean partition_k_subsets(int[] numbers, int k) {
        int sum = Arrays.stream(numbers).sum();
        if (sum % k > 0) {
            return false;
        }
        boolean[] flag = new boolean[1 << numbers.length];
        return findSubset(0, sum, flag, numbers, sum / k);
    }
} 