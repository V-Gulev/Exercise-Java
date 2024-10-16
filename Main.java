import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String shortString = "";
        String longString = "";
        if (word1.length() > word2.length()) {
            shortString = word2;
            longString = word1;
        } else {
            shortString = word1;
            longString = word2;
        }
        System.out.println(shortString + longString + shortString);

    }
}
