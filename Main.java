import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        String binaryNumber = Integer.toBinaryString(number);
        int count0 = 0;
        for (char ch : binaryNumber.toCharArray()) {
            if (ch == 48) {
                count0++;
            }
        }
        System.out.println(count0);
    }
}
