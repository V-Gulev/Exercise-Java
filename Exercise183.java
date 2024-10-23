import java.util.Scanner;

public class Exercise183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        while (number > 9) {
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        System.out.println(number);
    }
}
