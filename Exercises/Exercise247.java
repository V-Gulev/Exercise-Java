package Exercises;

import java.util.Scanner;

public class Exercise247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the numbers: a, b, c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("Check if a + b is greater than c: ");
        System.out.println(a + b > c);




    }
}
