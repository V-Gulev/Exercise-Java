import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> memoryList = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        String input = sc.nextLine();
        int moveCounter = 0;
        boolean checkIfWon = false;

        while (!input.equals("end")) {
            String[] array = input.split(" ");
            int int1 = Integer.parseInt(array[0]);
            int int2 = Integer.parseInt(array[1]);
            moveCounter++;

            if (int1 == int2 || int1 < 0 || int1 >= memoryList.size() || int2 < 0 || int2 >= memoryList.size()) {
                System.out.println("Invalid input! Adding additional elements to the board");
                String element = "-" + moveCounter + "a";
                int index = memoryList.size() / 2;
                memoryList.add(index, element);
                memoryList.add(index, element);
            } else {
                if (memoryList.get(int1).equals(memoryList.get(int2))) {
                    System.out.printf("Congrats! You have found matching elements - %s!\n", memoryList.get(int1));

                    if (int1 > int2) {
                        memoryList.remove(int1);
                        memoryList.remove(int2);
                    } else {
                        memoryList.remove(int2);
                        memoryList.remove(int1);
                    }
                    if (memoryList.isEmpty()) {
                        System.out.printf("You have won in %d turns!\n", moveCounter);
                        checkIfWon = true;
                        break;
                    }

                } else {
                    System.out.println("Try again!");
                }
            }

            input = sc.nextLine();
        }

        if (!checkIfWon) {
            System.out.println("Sorry you lose :(");
            System.out.println(memoryList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
