import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = sc.nextLine();
        char[] array = input.toCharArray();
        int numCounter = 0;
        int letterCounter = 0;
        int spaceCounter = 0;
        int otherCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (Character.isAlphabetic(array[i])) {
                letterCounter++;
            } else if (Character.isDigit(array[i])) {
                numCounter++;
            } else if (Character.isSpaceChar(array[i])) {
                spaceCounter++;
            } else otherCounter++;
        }
        System.out.println("The string is: " + input);
        System.out.println("letter: " + letterCounter);
        System.out.println("space: " + spaceCounter);
        System.out.println("number: " + numCounter);
        System.out.println("other: " + otherCounter);
    }
}
