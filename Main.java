import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(sc.nextLine());
        int countWonBattles = 0;
        String input = sc.nextLine();
        boolean noEnergyLeft = false;
        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (initialEnergy < distance) {
                noEnergyLeft = true;
                break;
            } else {
                initialEnergy -= distance;
                countWonBattles++;
            }
            if (countWonBattles % 3 == 0) {
                initialEnergy += countWonBattles;
            }
            input = sc.nextLine();
        }

        if (noEnergyLeft) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countWonBattles, initialEnergy);
        } else {
            System.out.printf("Won battles: %d. Energy left: %d", countWonBattles, initialEnergy);
        }

    }
}
