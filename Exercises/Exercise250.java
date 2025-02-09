package Exercises;

import java.util.Scanner;

public class Exercise250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("The smallest number is: " + smallestNumber(n1, n2, n3));
    }

    public static int smallestNumber(int n1, int n2, int n3) {
        int n4 = Math.min(n1, n2);
        return Math.min(n4, n3);
    }
}
