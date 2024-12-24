import java.util.Scanner;

public class Exercise241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a positive integer:");
        int n = sc.nextInt();
        int combinations = countCombinations(n);
        System.out.println("Number of combinations of a,b,c,d:");
        System.out.println(combinations);
    }

    private static int countCombinations(int n) {
        int counter = 0;
        for (int p = 0; p <= Math.min(n, 1000); p++) {
            for (int q = 0; q <= Math.min(n - p, 1000); q++) {
                for (int r = 0; r <= Math.min(n - p - q, 1000); r++) {
                    int s = n - p - q - r;
                    if (s >= 0 && s <= 1000) {
                        counter++;
                    }
                }
            }
        }

        return counter;
    }
}

