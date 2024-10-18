import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int row = 1;
        int usedCoins = 0;
        while (usedCoins + row <= number) {
            usedCoins += row;
            row++;
        }
        System.out.println("Rows: " + (row - 1));

    }
}