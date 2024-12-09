import java.util.Scanner;

public class Exercise219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double totalArea = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
        double a1 = Math.abs(x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2)) / 2.0;
        double a2 = Math.abs(x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y)) / 2.0;
        double a3 = Math.abs(x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2)) / 2.0;
        if (Math.abs(totalArea - (a1 + a2 + a3)) < 1e-6) {
            System.out.println("The point is inside the triangle.");
        } else {
            System.out.println("The point isn't inside the triangle.");
        }
    }
}