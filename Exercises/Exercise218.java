package Exercises;

import java.util.Scanner;

public class Exercise218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double a = x2 - x1;
        double b = y2 - y1;
        double C = (y2 * y2 - y1 * y1 + x2 * x2 - x1 * x1) / 2;
        double c = x3 - x1;
        double d = y3 - y1;
        double q = (y3 * y3 - y1 * y1 + x3 * x3 - x1 * x1) / 2;

        double centerX = (d * C - b * q) / (a * d - b * c);
        double centerY = (a * q - c * C) / (a * d - b * c);
        double radius = Math.sqrt(Math.pow(centerX - x1, 2.0) + Math.pow(centerY - y1, 2.0));


        System.out.println("Radius and the central coordinate:");
        System.out.printf("%.3f (%.3f %.3f)\n", radius, centerX, centerY);

    }
}
