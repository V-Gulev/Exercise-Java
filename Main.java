import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = Integer.parseInt(sc.nextLine());
        int lastDigit1 = num1 % 10;
        System.out.print("Input the second number: ");
        int num2 = Integer.parseInt(sc.nextLine());
        int lastDigit2 = num2 % 10;
        System.out.print("Input the third number: ");
        int num3 = Integer.parseInt(sc.nextLine());
        int lastDigit3 = num3 % 10;

        boolean checkIfEqual = (lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3);
        System.out.println(checkIfEqual);
    }
}
