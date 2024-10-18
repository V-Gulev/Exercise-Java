import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.print((number == 0 ? 0 : (number % 9 == 0 ? 9 : number % 9)));

    }
}