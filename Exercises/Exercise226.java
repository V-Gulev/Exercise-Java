package Exercises;

import java.util.Scanner;

public class Exercise226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] frequencies = new int[100];

        System.out.println("How many integers would you like to input(Max.100?)");
        int count = sc.nextInt();

        if (count <= 0 || count > 100) {
            System.out.println("Invalid number of elements.");
            return;
        }

        System.out.println("Input the integers:");
        for (int i = 0; i < count; i++) {
            int value = sc.nextInt();
            if (value >= 1 && value <= 100) {
                frequencies[value - 1]++;
            } else {
                System.out.println("Invalid input: " + value + ". Please enter values between 1 and 100.");
                return;
            }
        }
        int highestFrequency = 0;
        for (int frequency : frequencies) {
            if (frequency > highestFrequency) {
                highestFrequency = frequency;
            }
        }
        System.out.println("Mode value(s) in ascending order:");
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] == highestFrequency) {
                System.out.println(i + 1);
            }
        }
    }
}
