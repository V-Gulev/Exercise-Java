import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String str1 = "###";
        if (word1.length() >= 3) {
            str1 = word1.substring(0, 3);
        } else if (word1.length() == 2) {
            str1 = word1.substring(0, 2) + "#";
        } else if (word1.length() == 1) {
            str1 = word1.charAt(0) + "##";
        }
        System.out.println(str1);
    }
}
