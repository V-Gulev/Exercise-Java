package Exercises;

import java.util.Scanner;

public class Exercise249 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        String input = sc.nextLine();
        int counter = 0;
        for (char ch : input.toCharArray()) {
            if (ch != '0') {
                counter++;
            }
        }
        System.out.println("Hamming weight: " + counter);

    }
}
