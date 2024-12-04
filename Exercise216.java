import java.util.Scanner;

public class Exercise216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if (n < 0 || n > 36) {
            System.out.println("Invalid input");
            return;
        }
        int count = 0;
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    int d = n - (a + b + c);
                    if (d >= 0 && d <= 9) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of combinations: " + count);
    }
}