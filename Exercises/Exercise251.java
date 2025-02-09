package Exercises;

import java.util.Scanner;

public class Exercise251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your three numbers: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        System.out.println("The average is: " + average(n1, n2, n3));
    }

    public static double average(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}
