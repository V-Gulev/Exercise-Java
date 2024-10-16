import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String[] words = sc.nextLine().split(" ");
        String capitalWord = "";
        String result = "";
        int index = 0;
        for (String word : words) {
            if (Character.isAlphabetic(word.charAt(0))) {
                capitalWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            } else capitalWord = word;
            result = result + capitalWord + " ";
        }
        System.out.println(result.trim());
    }
}
