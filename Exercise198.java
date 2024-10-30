import java.util.Scanner;

public class Exercise198 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int position = 0;
        int num = 2;
        while (true) {
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                position++;

                if (num == n) {
                    break;
                }
            }
            num++;
        }

        System.out.println("Position: " + position);

    }
}