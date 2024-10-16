import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number:  ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Input the second number:  ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Input the third number:  ");
        int num3 = Integer.parseInt(sc.nextLine());
        if (num1 + num2 == num3) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
