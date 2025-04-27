package Exercises;

import java.util.Scanner;

public class Exercise271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer:");
        int n = sc.nextInt();
        System.out.print("Check whether every digit of the said integer is even or not!\n");
        System.out.print(test(n));
    }

    public static boolean test(int n) {
        int m = 10;
        if (n == 0) {
            return false;
        }
        while (n != 0) {
            if ((n % m) % 2 != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
