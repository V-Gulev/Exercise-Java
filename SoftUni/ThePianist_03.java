package SoftUni;

import java.util.*;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPieces = Integer.parseInt(sc.nextLine());
        Map<String, List<String>> pieces = new LinkedHashMap<>();

        for (int i = 0; i < numberOfPieces; i++) {
            String[] input = sc.nextLine().split("\\|");
            String piece = input[0];
            String composer = input[1];
            String key = input[2];
            List<String> composerKey = new ArrayList<>();
            composerKey.add(composer);
            composerKey.add(key);
            pieces.put(piece, composerKey);

        }

        String input = sc.nextLine();

        while (!input.equals("Stop")) {
            String[] splitInput = input.split("\\|");
            String command = splitInput[0];
            String piece = splitInput[1];

            switch (command) {
                case "Add":
                    String composer = splitInput[2];
                    String key = splitInput[3];

                    if (pieces.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!\n", piece);
                    } else {
                        List<String> composerKey = new ArrayList<>();
                        composerKey.add(composer);
                        composerKey.add(key);
                        pieces.put(piece, composerKey);
                        System.out.printf("%s by %s in %s added to the collection!\n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    if (pieces.containsKey(piece)) {
                        pieces.remove(piece);
                        System.out.printf("Successfully removed %s!\n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = splitInput[2];

                    if (pieces.containsKey(piece)) {
                        List<String> newList = pieces.get(piece);
                        newList.removeLast();
                        newList.add(newKey);
                        pieces.put(piece, newList);
                        System.out.printf("Changed the key of %s to %s!\n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    }
                    break;
                default:
                    break;
            }


            input = sc.nextLine();
        }

        pieces.entrySet().forEach(entry -> {
            System.out.printf("%s -> Composer: %s, Key: %s\n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        });
    }
}
