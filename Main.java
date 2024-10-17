import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String word = input.substring(input.length() - 3);
        System.out.println(word + input + word);
    }
}
