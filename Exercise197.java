import java.util.Scanner;

public class Exercise197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        boolean isPerfect = false;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                isPerfect = true;
                break;
            }
        }
        System.out.println(isPerfect);
    }
}
