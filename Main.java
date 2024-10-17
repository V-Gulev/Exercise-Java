import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int timesShot = 0;
        String command = sc.nextLine();
        while (!command.equals("End")) {
            int index = Integer.parseInt(command);
            int currentValue = 0;
            if (index >= 0 && index < targets.size() && targets.get(index) != -1) {
                currentValue = targets.get(index);
                timesShot++;
                targets.set(index, -1);

                for (int i = 0; i < targets.size(); i++) {
                    if (targets.get(i) > currentValue && targets.get(i) != -1) {
                        targets.set(i, targets.get(i) - currentValue);
                    } else if (targets.get(i) <= currentValue && targets.get(i) != -1) {
                        targets.set(i, targets.get(i) + currentValue);
                    }

                }


            }
            command = sc.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", timesShot);
        for (Integer target : targets) {
            System.out.print(target + " ");
        }
    }
}
