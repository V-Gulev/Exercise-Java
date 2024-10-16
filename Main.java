import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int divider = sc.nextInt();
        int counter = 0;
        for (int i = start; i <= end; i++) {
            if (i % divider == 0) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
