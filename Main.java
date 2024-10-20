import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a == b && a == c & a == d) {
            System.out.println("Numbers are equal");
        } else System.out.println("Numbers are not equal");
    }
}
