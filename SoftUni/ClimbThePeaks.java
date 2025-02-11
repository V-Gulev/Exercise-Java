package SoftUni;

import java.lang.reflect.Array;
import java.util.*;

public class ClimbThePeaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Integer> foodPortions = new ArrayDeque<>();
        Deque<Integer> dailyStamina = new ArrayDeque<>();

        Arrays.stream(sc.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(foodPortions::push);
        Arrays.stream(sc.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(dailyStamina::offer);
        String[] peeks = {"Vihren", "Kutelo", "Banski Suhodol", "Polezhan", "Kamenitza"};
        int[] difficulty = {80, 90, 100, 60, 70};
        int index = 0;
        boolean conqueredAllPeeks = false;
        List<String> conqueredPeeks = new ArrayList<>();
        int dayCounter = 1;
        while (dayCounter <= 7) {
            int food = foodPortions.pop();
            int stamina = dailyStamina.poll();
            int sum = food + stamina;

            if (sum >= difficulty[index]) {
                conqueredPeeks.add(peeks[index]);
                index++;
                if (index == peeks.length) {
                    conqueredAllPeeks = true;
                    break;
                }
            }

            dayCounter++;
        }
        if (conqueredAllPeeks) {
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
        } else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }
        if (!conqueredPeeks.isEmpty()) {
            System.out.println("Conquered peaks:");
            conqueredPeeks.forEach(System.out::println);
        }
    }
}
