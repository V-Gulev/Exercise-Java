package Exercises;

import java.util.Scanner;

public class Exercise270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer(positive/negative):");
        int n = sc.nextInt();
        System.out.print("\nFactors of 3 of the said integer:\n");
        test(n);
    }

    public static void test(int n) {
        System.out.print(n + " = ");
        int result = n;
        while (result % 3 == 0) {
            System.out.print("3 * ");
            result = result / 3;
        }
        System.out.print(result);
    }
}
