import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String wordToMultiply = input.substring(input.length() - 3);
        for (int i = 0; i < 4; i++) {
            System.out.print(wordToMultiply);
        }

    }
}
