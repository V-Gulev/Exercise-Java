import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int startingNumber = number;
        while (number % 4 == 0) {
            number /= 4;
        }
        if (number == 1) {
            System.out.println(startingNumber + " is a power of 4");
        } else System.out.println(startingNumber + " is not a power of 4");
    }
}