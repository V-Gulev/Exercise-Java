import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String binary1 = sc.nextLine();
        System.out.print("Input second binary number: ");
        String binary2 = sc.nextLine();
        int number1 = Integer.parseInt(binary1, 2);
        int number2 = Integer.parseInt(binary2, 2);
        int result = number1 * number2;

        String binarySum = Integer.toBinaryString(result);

        System.out.println("Sum of two binary numbers: " + binarySum);
    }
}
