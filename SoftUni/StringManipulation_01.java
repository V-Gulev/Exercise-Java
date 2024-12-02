package SoftUni;

import java.util.Scanner;

public class StringManipulation_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringInput = new StringBuilder(sc.nextLine());

        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] splitInput = input.split(" ");
            String command = splitInput[0];

            switch (command) {
                case "Translate":
                    String textToReplace = splitInput[1];
                    String replacement = splitInput[2];
                    stringInput = new StringBuilder(stringInput.toString().replaceAll(textToReplace, replacement));
                    System.out.println(stringInput);
                    break;
                case "Includes":
                    String givenString = splitInput[1];
                    if (stringInput.toString().contains(givenString)) {
                        System.out.println("True");
                    } else System.out.println("False");

                    break;
                case "Start":
                    String staringString = splitInput[1];
                    if (stringInput.toString().startsWith(staringString)) {
                        System.out.println("True");
                    } else System.out.println("False");
                    break;
                case "Lowercase":
                    stringInput = new StringBuilder(stringInput.toString().toLowerCase());
                    System.out.println(stringInput);
                    break;
                case "FindIndex":
                    String substring = splitInput[1];
                    System.out.println(stringInput.lastIndexOf(substring));
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(splitInput[1]);
                    int count = Integer.parseInt(splitInput[2]);
                    stringInput.delete(startIndex, startIndex + count);
                    System.out.println(stringInput);
                    break;
                default:
                    break;
            }


            input = sc.nextLine();
        }


    }
}
