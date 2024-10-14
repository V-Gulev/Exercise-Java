import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != k && i != j && j != k) {
                        counter++;
                        System.out.println(i + "" + j + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is: " + counter);
    }
}
