import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int finalSum = sumToSingleDigit(Math.abs(number));
        System.out.println("Single digit sum of the digits: " + finalSum);
        printSumDigitsInEnglish(finalSum);
        sc.close();
    }

    public static String digitToWord(int digit) {
        return switch (digit) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "";
        };
    }

    public static int sumToSingleDigit(int number) {
        int sum = number;
        while (sum >= 10) {
            sum = sumOfDigits(sum);
        }
        return sum;
    }


    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void printSumDigitsInEnglish(int sum) {
        System.out.print("The sum of the digits in English: ");
        System.out.println(digitToWord(sum));
    }


}