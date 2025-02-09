package Exercises;

import java.util.Scanner;

public class Exercise259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a year: ");
        int year = Integer.parseInt(sc.nextLine());

        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
