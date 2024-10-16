import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = sc.nextInt();

        int factorCount = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorCount++;
            }
        }
        System.out.println(factorCount);
    }
}
