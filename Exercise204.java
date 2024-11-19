import java.util.Scanner;

public class Exercise204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int y = sc.nextInt();
        double result = Math.pow(x, n);
        double result1 = result % y;

        System.out.println("x^n % y = " + result1);
    }
}
