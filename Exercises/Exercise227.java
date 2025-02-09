package Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a text in a line:");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        Map<String, Integer> wordFrequency = new HashMap<>();
        String longestWord = "";

        for (String word : words) {
            word = word.toLowerCase();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        String mostFrequentWord = "";
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }
        System.out.println("Most frequent text and the word which has the maximum number of letters:");
        System.out.println(mostFrequentWord);
        System.out.println(longestWord);
    }
}

