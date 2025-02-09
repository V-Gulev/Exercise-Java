package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = Integer.parseInt(sc.nextLine());

        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        int index = 0;
        int combinationCount = 0;
        while (primeNumbers.size() > 1) {
            int firstNum = primeNumbers.get(index);
            for (int i = index + 1; i < primeNumbers.size(); i++) {
                if (n == firstNum + primeNumbers.get(i)) {
                    combinationCount++;
                }
            }

            primeNumbers.remove(0);
        }
        System.out.printf("Number of combinations: %d", combinationCount);
    }
}
