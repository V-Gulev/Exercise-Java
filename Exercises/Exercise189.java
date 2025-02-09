package Exercises;

import java.util.Scanner;

public class Exercise189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        System.out.printf("'%s' + '%s' = %d", num1, num2, number1 + number2);
    }
}
