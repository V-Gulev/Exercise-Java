import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your first number:");
        int a = sc.nextInt();
        System.out.println("Insert your second number:");
        int b = sc.nextInt();
        if (a == b)
            System.out.printf("%d == %d\n", a, b);
        if (a != b)
            System.out.printf("%d != %d\n", a, b);
        if (a < b)
            System.out.printf("%d < %d\n", a, b);
        if (a > b)
            System.out.printf("%d > %d\n", a, b);
        if (a <= b)
            System.out.printf("%d <= %d\n", a, b);
        if (a >= b)
            System.out.printf("%d >= %d\n", a, b);


    }
}
