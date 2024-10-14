import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] input = sc.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = input.length - 1; i >= 0; i--) {
            System.out.print(input[i]);
        }
    }
}
