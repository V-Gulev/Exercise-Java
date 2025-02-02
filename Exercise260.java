import java.util.Scanner;

public class Exercise260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                        "2. A password consists of only letters and digits.\n" +
                        "3. A password must contain at least two digits \n" +
                        "Input a password (You are agreeing to the above Terms and Conditions.): ");

        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else System.out.println("Not a valid password: " + password);
    }

    private static boolean isValidPassword(String password) {
        boolean checkSize = password.length() >= 8;
        int digitsCount = 0;

        for (char c : password.toCharArray()) {
            if (!Character.isDigit(c) && !Character.isAlphabetic(c)) {
                return false;
            } else if (Character.isDigit(c)) {
                digitsCount++;
            }
        }

        return checkSize && digitsCount >= 2;
    }

}
