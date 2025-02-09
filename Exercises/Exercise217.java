package Exercises;

import java.util.Scanner;

public class Exercise217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number(n): ");
        int n = Integer.parseInt(sc.nextLine());
        int counter = 0;

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                counter++;
            }
        }
        System.out.printf("Number of prime numbers which are less than or equal to n.: %d", counter);
    }
}
