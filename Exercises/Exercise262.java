package Exercises;

import java.util.Scanner;

public class Exercise262 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Side-1: ");
        double side1 = in.nextDouble();
        System.out.print("Input Side-2: ");
        double side2 = in.nextDouble();
        System.out.print("Input Side-3: ");
        double side3 = in.nextDouble();
        if (isValid(side1, side2, side3))
            System.out.println("The area of the triangle is " + triangleArea(side1, side2, side3));
        else System.out.println("Invalid triangle");
    }

    public static boolean isValid(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
    }

    public static double triangleArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

