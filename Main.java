import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a octal number: ");
        String octalNumber = sc.nextLine();
        int decimalNumber = Integer.parseInt(octalNumber, 8);
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary number: " + binaryNumber);
    }
}
