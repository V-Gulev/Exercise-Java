import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PATH: ");
        System.out.println(System.getenv("PATH"));
        System.out.println("TEMP: ");
        System.out.println(System.getenv("TEMP"));
        System.out.println("USERNAME: ");
        System.out.println(System.getenv("USERNAME"));
    }
}