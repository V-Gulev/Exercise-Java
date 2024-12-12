import java.util.Scanner;

public class Exercise223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum sum of the said contiguous subsequence: " + max);
    }
}
