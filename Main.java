import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numberString = sc.nextLine();
        char[] array = numberString.toCharArray();
        String palindrome = "";
        for (int i = array.length - 1; i >= 0; i--) {
            palindrome += array[i];
        }
        System.out.println(palindrome.equals(numberString));

    }
}