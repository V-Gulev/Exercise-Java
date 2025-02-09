package Exercises;

import java.util.Scanner;

public class Exercise200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean[] viewedLetters = new boolean[26];
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!viewedLetters[currentChar - 'a']) {
                viewedLetters[currentChar - 'a'] = true;
                result += currentChar;
            }
        }
        char[] resultArray = result.toCharArray();

        for (int i = 0; i < resultArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < resultArray.length; j++) {
                if (resultArray[j] < resultArray[minIndex]) {
                    minIndex = j;
                }
            }
            char temp = resultArray[i];
            resultArray[i] = resultArray[minIndex];
            resultArray[minIndex] = temp;
        }
        System.out.println(new String(resultArray));

    }
}
