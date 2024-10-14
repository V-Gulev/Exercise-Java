import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("List of available character sets: ");

        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}
