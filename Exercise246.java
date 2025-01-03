import java.util.Scanner;

public class Exercise246 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a positive three digit number:");
        String number = sc.nextLine();
        char[] numToChar = new char[number.length()];
        for (int i = 0; i < number.length(); i++) {
            numToChar[i] = number.charAt(i);
        }
        StringBuilder result = new StringBuilder();
        result.repeat("H", Integer.parseInt(String.valueOf(numToChar[0])));
        result.repeat("T", Integer.parseInt(String.valueOf(numToChar[1])));
        for (int i = 1; i <= Integer.parseInt(String.valueOf(numToChar[2])); i++) {
            result.append(i);
        }
        System.out.println("Result:\n" + result);


    }
}
