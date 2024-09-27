import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfField = Integer.parseInt(scanner.nextLine());
        int[] ladyBugArray = new int[sizeOfField];

        String[] ladyBugsPosition = scanner.nextLine().split(" ");
        for (String pos : ladyBugsPosition) {
            int index = Integer.parseInt(pos);
            if (index >= 0 && index < sizeOfField) {
                ladyBugArray[index] = 1;
            }
        }

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {

                for (int i : ladyBugArray) {
                    System.out.print(i + " ");
                }
                break;
            } else {
                String[] command = input.split(" ");
                int ladyBugIndex = Integer.parseInt(command[0]);
                String direction = command[1];
                int flyLength = Integer.parseInt(command[2]);

                if (flyLength < 0) {
                    flyLength = Math.abs(flyLength);
                    if (direction.equals("right")) {
                        direction = "left";
                    } else direction = "right";
                }

                if (ladyBugIndex < 0 || ladyBugIndex >= sizeOfField || ladyBugArray[ladyBugIndex] == 0) {
                    continue;
                }

                ladyBugArray[ladyBugIndex] = 0;
                while (true) {
                    if (direction.equals("right")) {
                        ladyBugIndex += flyLength;
                    } else if (direction.equals("left")) {
                        ladyBugIndex -= flyLength;
                    }

                    if (ladyBugIndex < 0 || ladyBugIndex >= sizeOfField) {
                        break;
                    }

                    if (ladyBugArray[ladyBugIndex] == 0) {
                        ladyBugArray[ladyBugIndex] = 1;
                        break;
                    }

                }
            }
        }
    }
}
