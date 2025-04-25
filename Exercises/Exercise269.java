package Exercises;

import java.util.Scanner;

public class Exercise269 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer(positive/negative):");
        int n = in.nextInt();
        System.out.print("Extract the first digit from the said integer:\n");
        System.out.print(test(n));
    }

    public static int test(int n) {
        int num = 10;
        while (n / num != 0) {
            num *= 10;
        }
        return Math.abs(n / (num / 10));
    }
}
