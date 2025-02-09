package Exercises;

import java.util.Scanner;

public class Exercise258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        int charsPerLine = sc.nextInt();
        printCharsInRange(a, b, charsPerLine);
    }

    private static void printCharsInRange(char a, char b, int charsPerLine) {
        int charsOnLine = 0;
        for (char i = a; i <= b; i++) {
            System.out.print(i + " ");
            charsOnLine++;
            if (charsOnLine == charsPerLine) {
                System.out.println();
                charsOnLine = 0;
            }
        }
    }
}
