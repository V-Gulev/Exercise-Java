import java.util.Scanner;

public class Exercise255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        int number = sc.nextInt();
        System.out.println("The sum of the digits in the number is: " + sumOfDigitsInNumber(number));

    }

    public static int sumOfDigitsInNumber(int number){
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }

        return sum;
    }
}
