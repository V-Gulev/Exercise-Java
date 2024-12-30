import java.util.Scanner;

public class Exercise244 {
    public static boolean isValidString(String input) {
        String regex = "^(X*)XY(Z(X*)Y)*Z(X*)$";
        return input.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to validate:");
        String input = scanner.nextLine();

        if (isValidString(input)) {
            System.out.println("Correct format...");
        } else {
            System.out.println("Incorrect format...");
        }


    }
}

