package Exercises;

import java.util.Scanner;

public class Exercise225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] daysInMonths = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysNames = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        System.out.print("Input the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Input the date (1-31): ");
        int day = sc.nextInt();
        if (month < 1 || month > 12 || day < 1 || day > daysInMonths[month - 1]) {
            System.out.println("Invalid date.");
        } else {
            int dayOfYear = day;
            for (int i = 0; i < month - 1; i++) {
                dayOfYear += daysInMonths[i];
            }

            int dayIndex = (dayOfYear - 1) % 7;
            System.out.println("Name of the date: " + daysNames[dayIndex]);
        }
    }
}

