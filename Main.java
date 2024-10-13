import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int j = Integer.parseInt(scanner.nextLine());
            sum += n;
        }
        System.out.println(sum / n);
    }
}
