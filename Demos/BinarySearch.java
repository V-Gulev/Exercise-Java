package Demos;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = {7,21,67,334,878,7868,678768};
        int target = 878;
        int index = binarySearch(numbers, target);
        System.out.println(numbers[index]);

    }

    private static int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int step = 0;
        while (low <= high) {
            System.out.println(step++);
            int mid = low + (high - low) / 2;
            if (numbers[mid] == target) {
                return mid;
            }
            if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
