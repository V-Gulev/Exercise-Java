import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder text = new StringBuilder(sc.nextLine());
        String input = sc.nextLine();

        while (!input.equals("Decode")) {
            String[] splitInput = input.split("\\|");
            String command = splitInput[0];

            switch (command) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(splitInput[1]);
                    numberOfLetters = Math.min(numberOfLetters, text.length());
                    String substring = text.substring(0, numberOfLetters);
                    text.replace(0, numberOfLetters, "");
                    text.append(substring);
                    break;
                case "Insert":
                    int index = Integer.parseInt(splitInput[1]);
                    if (index >= 0 && index <= text.length()) {
                        String value = splitInput[2];
                        text.insert(index, value);
                    }
                    break;
                case "ChangeAll":
                    String textToReplace = splitInput[1];
                    String replacement = splitInput[2];
                    if (!textToReplace.isEmpty()) {
                        text = new StringBuilder(text.toString().replace(textToReplace, replacement));
                    }
                    break;
                default:
                    break;
            }
            input = sc.nextLine();
        }
        System.out.printf("The decrypted message is: %s", text.toString());

    }
}
