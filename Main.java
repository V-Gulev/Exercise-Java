import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int offset = sc.nextInt();
        int length = input.length();
        offset = offset % length;
        String rotated = "";
        for (int i = length - offset; i < length; i++) {
            rotated += input.charAt(i);
        }
        for (int i = 0; i < length - offset; i++) {
            rotated += input.charAt(i);
        }
        System.out.println("Rotated string: " + rotated);
    }
}