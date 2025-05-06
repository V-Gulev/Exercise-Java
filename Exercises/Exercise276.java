package Exercises;

public class Exercise276 {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(5, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide the given number by zero!");
        }
        return a / b;
    }
}

