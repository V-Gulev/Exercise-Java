import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Console cons;

        if ((cons = System.console()) != null) {
            char[] password = null;
            try {
                password = cons.readPassword("Input your Password:");
                System.out.println("Your password was: " + new String(password));
            } finally {
                if (password != null) {
                    java.util.Arrays.fill(password, ' ');
                }
            }
        } else {
            throw new RuntimeException("Can't get the password... No console");
        }
    }
}
