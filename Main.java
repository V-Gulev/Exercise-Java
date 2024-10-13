import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryNumber = sc.nextLine();
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        String hexNumber = Integer.toHexString(decimalNumber).toUpperCase();
        System.out.println("HexaDecimal value: " + hexNumber);
    }
}
