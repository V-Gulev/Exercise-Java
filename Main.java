import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int divider = Integer.parseInt(sc.nextLine());
        int result = 0;
        int remainder = number;
        while (remainder >= divider) {
            remainder -= divider;
            result++;
        }
        System.out.println(result);
        System.out.println("Remainder: " + remainder);
    }
}
