import java.util.Scanner;

public class Exercise248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a word: ");
        String input = sc.nextLine();
        boolean isAbecedarian = true;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) > input.charAt(i + 1)) {
                isAbecedarian = false;
                break;
            }
        }

        System.out.println("Is Abecedarian word? " + isAbecedarian);


    }
}
