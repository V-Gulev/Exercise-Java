package Exercises;

import java.util.Scanner;

public class Exercise224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input x1, y1, r1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double r1 = sc.nextDouble();
        System.out.println("Input x2, y2, r2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distance + r2 <= r1) {
            System.out.println("C2 is in C1");
        } else if (distance + r1 <= r2) {
            System.out.println("C1 is in C2");
        } else if (distance <= r1 + r2) {
            System.out.println("Circumference of C1 and C2 intersect");
        } else {
            System.out.println("C1 and C2 do not overlap");
        }

    }
}
