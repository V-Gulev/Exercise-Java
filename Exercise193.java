import java.util.Scanner;

public class Exercise193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a positive number: ");
        int n = Integer.parseInt(sc.nextLine());
        int result = (n * (n + 1) / 2) * (1 << (n - 1));
        System.out.println("The result is: " + result);
    }
}
