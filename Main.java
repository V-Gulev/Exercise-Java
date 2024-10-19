import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = sc.nextInt();
        int trailingZeros = 0;

        while (num > 0) {
            trailingZeros = trailingZeros + num / 5;
            num /= 5;
        }

        System.out.println("Number of trailing zeros: " + trailingZeros);
    }
}