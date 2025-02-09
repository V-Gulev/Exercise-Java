package Exercises;

import java.util.Scanner;

public class Exercise230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replaceAll("python", "j1ava");
        input = input.replaceAll("java", "python");
        input = input.replaceAll("j1ava", "java");
        System.out.println("Result: " + input);


    }
}
