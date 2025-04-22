package Exercises;

import java.util.Scanner;

public class Exercise266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println(test(n));
        }
    }

    public static int test(int num) {
        int result = 0;
        int n = num;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 2) {
                result++;
            }
            n /= 10;
        }
        return result;
    }
}
