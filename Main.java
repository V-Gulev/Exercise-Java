import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(sc.nextLine().split("!")).collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] commands = input.split(" ");
            String action = commands[0];
            String item = commands[1];

            switch (action) {
                case "Urgent":
                    if (!shoppingList.contains(item)) {
                        shoppingList.addFirst(item);
                    }
                    break;
                case "Unnecessary":
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                    }
                    break;
                case "Correct":
                    String item2 = commands[2];
                    if (shoppingList.contains(item)) {
                        shoppingList.set(shoppingList.indexOf(item), item2);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                    break;
                default:
                    break;

            }
            input = sc.nextLine();
        }
        System.out.println(shoppingList.toString().replaceAll("[\\[\\]]", ""));
    }
}
