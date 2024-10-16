import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if (n % 2 == 0) {
            System.out.println(1);
        } else System.out.println(0);
    }
}
