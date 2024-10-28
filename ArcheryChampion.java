import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArcheryChampion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(sc.nextLine().split("\\|")).map(Integer::parseInt).collect(Collectors.toList());
        int points = 0;

        while (true) {
            String input = sc.nextLine();


            if (input.equals("Game over")) {
                break;
            }


            if (input.equals("Reverse")) {
                List<Integer> reversed = new ArrayList<>();
                for (int i = targets.size() - 1; i >= 0; i--) {
                    reversed.add(targets.get(i));
                }
                targets = reversed;
                continue;
            }

            String[] elements = input.split("@");
            String leftOrRight = elements[0].substring(6).trim();
            int startIndex = Integer.parseInt(elements[1].trim());
            int length = Integer.parseInt(elements[2].trim());


            if (startIndex >= 0 && startIndex < targets.size()) {
                if (leftOrRight.equals("Left")) {
                    int index = startIndex;
                    for (int i = 0; i < length; i++) {
                        index--;
                        if (index < 0) {
                            index = targets.size() - 1;
                        }
                    }
                    if (targets.get(index) < 5) {
                        points += targets.get(index);
                        targets.set(index, 0);
                    } else {
                        points += 5;
                        targets.set(index, targets.get(index) - 5);
                    }

                } else if (leftOrRight.equals("Right")) {
                    int index = startIndex;
                    for (int i = 0; i < length; i++) {
                        index++;
                        if (index == targets.size()) {
                            index = 0;
                        }
                    }
                    if (targets.get(index) < 5) {
                        points += targets.get(index);
                        targets.set(index, 0);
                    } else {
                        points += 5;
                        targets.set(index, targets.get(index) - 5);
                    }

                }
            }
        }

        for (int i = 0; i < targets.size() - 1; i++) {
            System.out.print(targets.get(i) + " - ");
        }
        System.out.println(targets.getLast());
        System.out.printf("John finished the archery tournament with %d points!", points);


    }
}
