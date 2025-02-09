package Exercises;

import java.util.Scanner;

public class Exercise232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = Integer.parseInt(sc.nextLine());
        int counter = 0;
        int sum = 0;

        for (int i = 2; counter < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                counter++;
            }
        }
        System.out.printf("Sum of first %d prime numbers: %d", n, sum);
    }
}