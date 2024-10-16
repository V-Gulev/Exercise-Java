import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String str1 = "";
        str1 += (!word1.isEmpty()) ? word1.charAt(0) : "#";
        str1 += (!word2.isEmpty()) ? word2.charAt(word2.length() - 1) : "#";
        System.out.println(str1);
    }
}
