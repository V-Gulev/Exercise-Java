import java.util.Scanner;

public class Exercise252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        String input = sc.nextLine();
        System.out.println("The middle character/s is/are: " + findMiddleCharacter(input));
    }

    public static String findMiddleCharacter(String input) {

        if (input.length() % 2 == 0) {
            int index = input.length() / 2 - 1;
            return input.substring(index, index + 2);
        } else {
            int index = input.length() / 2;
            return input.substring(index, index + 1);
        }

    }
}
