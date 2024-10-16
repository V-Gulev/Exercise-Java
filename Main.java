import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();
        boolean checkIfTrue = false;
        while (num1 > 0 && num2 > 0) {
            if (num1 % 10 == num2 % 10) {
                checkIfTrue = true;
                break;
            }
            num1 /= 10;
            num2 /= 10;
        }
        System.out.println(checkIfTrue);
    }
}
