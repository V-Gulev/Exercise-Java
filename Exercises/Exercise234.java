package Exercises;

import java.util.Scanner;

public class Exercise234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of straight lines:");
        int n = sc.nextInt();
        System.out.println("Number of regions:");
        System.out.println((n * (n + 1) >> 1) + 1);
    }
}