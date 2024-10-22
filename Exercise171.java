import java.util.Scanner;

public class Exercise171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String searchString = sc.nextLine();
        String text = sc.nextLine();
        System.out.println(text.contains(searchString));
    }
}
