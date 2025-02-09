package Exercises;

import java.util.Scanner;

public class Exercise191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int sumNumber = sc.nextInt();
        System.out.println(Math.pow(number1, 2) + Math.pow(number2, 2) == sumNumber);
    }
}
