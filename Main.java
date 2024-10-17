import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Current system environment:");
        System.out.println(System.getenv());
        System.out.println("Current system properties:");
        System.out.println(System.getProperties());
    }
}