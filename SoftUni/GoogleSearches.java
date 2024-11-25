package SoftUni;

import java.util.Scanner;

public class GoogleSearches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double incomeFromSingleSearch = Double.parseDouble(sc.nextLine());
        int numberOfUsers = Integer.parseInt(sc.nextLine());
        double earnedMoney = 0;
        for (int i = 0; i < numberOfUsers; i++) {
            int searches = Integer.parseInt(sc.nextLine());
            if ((i + 1) % 3 == 0 && searches > 5) {
                earnedMoney = earnedMoney + searches * (incomeFromSingleSearch * 3 * 2);
            } else if ((i + 1) % 3 == 0 && searches > 1) {
                earnedMoney = earnedMoney + searches * (incomeFromSingleSearch * 3);
            } else if (searches > 5) {
                earnedMoney = earnedMoney + searches * incomeFromSingleSearch * 2;
            } else if (searches > 1) {
                earnedMoney = earnedMoney + searches * incomeFromSingleSearch;
            }


        }
        System.out.printf("Total money earned: %.2f", earnedMoney);
    }
}

