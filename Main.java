import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the third number: ");
        int num3 = sc.nextInt();

        System.out.println((Math.abs(num1 - num2) >= 20 || Math.abs(num2 - num3) >= 20 || Math.abs(num3 - num1) >= 20));
    }
}
