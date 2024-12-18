import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String regex = "(?<numbers>[0-9]+)";
        Pattern pattern1 = Pattern.compile(regex);
        int sum = 0;
        Matcher matcher1 = pattern1.matcher(input);
        while (matcher1.find()) {
            int number = Integer.parseInt(matcher1.group("numbers"));
            sum += number;
        }
        System.out.println("Sum of the numeric values:");
        System.out.println(sum);
    }
}
