import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int multiply = Integer.parseInt(sc.nextLine());
        int multiplier = number;
        for (int i = 0; i < multiply - 1; i++) {
            number += multiplier;
        }
        System.out.println(number);
    }
}
