import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println(0);
        } else if (num1 % 6 == num2 % 6) {
            System.out.println(Math.min(num2, num1));
        } else System.out.println(Math.max(num1, num2));
    }
}
