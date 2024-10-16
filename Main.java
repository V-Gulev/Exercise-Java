import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String number = sc.nextLine();
        System.out.println("The integer value is: " + Integer.parseInt(number));
    }
}
