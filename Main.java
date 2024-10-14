import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert your first number: ");
        int a = sc.nextInt();
        int sumOfDigits = 0;

        while (a > 0) {
            int lastDigit = a % 10;
            sumOfDigits += lastDigit;
            a /= 10;
        }
        System.out.println("The sum of the digits is: " + sumOfDigits);


    }
}
