import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reversed = "";
        String[] elements = input.split(" ");

        for (int i = elements.length - 1; i >= 0 ; i--) {
            reversed += elements[i] + " ";
        }
        System.out.println(reversed);
    }
}
