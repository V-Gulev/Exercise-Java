import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String target = sc.nextLine();
        if (string.contains(target)) {
            System.out.println(string.indexOf(target) + target.length() - 1);
        }
    }
}