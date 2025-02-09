package Exercises;

import java.util.Scanner;

public class Exercise181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] elements = input.split(" ");
        System.out.println(elements[elements.length - 1].length());
    }
}
