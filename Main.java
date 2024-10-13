import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp = a;
        System.out.println("a = " + a + " and b = " + b);
        a = b;
        b = temp;
        System.out.println("a = " + a + " and b = " + b);
    }
}
