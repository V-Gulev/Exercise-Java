package SoftUni;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder concealedMessage = new StringBuilder(sc.nextLine());
        String input = sc.nextLine();
        while (!input.equals("Reveal")) {
            String[] splitInput = input.split(":\\|:");
            String command = splitInput[0];

            switch (command) {
                case "InsertSpace":
                    concealedMessage.insert(Integer.parseInt(splitInput[1]), " ");
                    System.out.println(concealedMessage);
                    break;
                case "Reverse":
                    StringBuilder givenText = new StringBuilder(splitInput[1]);
                    if (concealedMessage.toString().contains(givenText)) {
                        concealedMessage.delete(concealedMessage.indexOf(String.valueOf(givenText)), concealedMessage.indexOf(String.valueOf(givenText)) + givenText.length());
                        concealedMessage.append(givenText.reverse());
                        System.out.println(concealedMessage);
                    } else {
                        System.out.println("error");
                    }

                    break;
                case "ChangeAll":
                    String substring = splitInput[1];
                    String replacement = splitInput[2];
                    concealedMessage = new StringBuilder(concealedMessage.toString().replaceAll(substring, replacement));

                    System.out.println(concealedMessage);
                    break;
                default:
                    break;

            }


            input = sc.nextLine();
        }

        System.out.println("You have a new text message: " + concealedMessage);
    }
}
