package Exercises;

public class Exercise277 {
    public static void main(String[] args) {
        int n = 4;
        tryEvenOrElseOdd(n);
        n = 5;
        tryEvenOrElseOdd(n);
    }

    public static void tryEvenOrElseOdd(int n) {
        try {
            checkIfEven(n);
            System.out.println(n + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkIfEven(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is odd.");
        }
    }
}
