import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d x %d = %d%n", a, b, a * b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        System.out.printf("%d mod %d = %d%n", a, b, a % b);

    }
}
