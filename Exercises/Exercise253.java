package Exercises;

import java.util.Scanner;

public class Exercise253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your text: ");
        String text = sc.nextLine();
        System.out.println("The number of vowels is: " + countVowels(text));

    }

    public static int countVowels(String input) {
        int counter = 0;
        if (!input.isEmpty()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a' || input.charAt(i) == 'o' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'u') {
                    counter++;
                }
            }
        }
        return counter;
    }
}
