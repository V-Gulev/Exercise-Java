import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String[] words = sc.nextLine().split(" ");

        System.out.println(words[words.length - 2]);
    }
}
