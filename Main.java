import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        int dailyPlunder = Integer.parseInt(sc.nextLine());
        double expectedPlunder = Double.parseDouble(sc.nextLine());
        double totalPlunder = 0;

        for (int i = 1; i <= days; i++) {
            totalPlunder += dailyPlunder;

            if (i % 3 == 0) {
                totalPlunder += (double) dailyPlunder / 2;
            }
            if (i % 5 == 0) {
                totalPlunder = totalPlunder * 0.7;
            }

        }
        if (totalPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            double percent = totalPlunder / expectedPlunder * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percent);
        }

    }
}
