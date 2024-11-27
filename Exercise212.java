import java.util.Scanner;

public class Exercise212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = sc.nextInt();
        String sum = String.valueOf(firstNumber + secondNumber);
        System.out.print("The digit number of the sum of the previous two integers: ");
        System.out.println(sum.length());

    }
}
