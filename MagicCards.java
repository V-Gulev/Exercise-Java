import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MagicCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> originalDeck = Arrays.stream(sc.nextLine().split(":")).collect(Collectors.toList());
        List<String> newDeck = new ArrayList<>();
        while (true) {
            String input = sc.nextLine();
            if (input.equals("Ready")) {
                break;
            }
            String[] elements = input.split(" ");
            String command = elements[0];
            String cardName = elements[1];

            switch (command) {
                case "Add":
                    if (originalDeck.contains(cardName)) {
                        newDeck.add(cardName);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(elements[2]);
                    if (originalDeck.contains(cardName) && index >= 0 && index < newDeck.size()) {
                        newDeck.add(index, cardName);
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                case "Remove":
                    if (newDeck.contains(cardName)) {
                        newDeck.remove(cardName);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Swap":
                    String cardName2 = elements[2];
                    int indexOfCard2 = newDeck.indexOf(cardName2);
                    newDeck.set(newDeck.indexOf(cardName), cardName2);
                    newDeck.set(indexOfCard2, cardName);
                    break;
                case "Shuffle":
                    List<String> reversed = new ArrayList<>();
                    for (int i = newDeck.size() - 1; i >= 0; i--) {
                        reversed.add(newDeck.get(i));
                    }
                    newDeck = reversed;
                    break;
                default:
                    break;
            }

        }
        for (String card : newDeck) {
            System.out.print(card + " ");
        }

    }
}
