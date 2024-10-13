import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int decimalNumber = sc.nextInt();
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        System.out.println("Binary number is: " + binaryNumber);
    }
}
