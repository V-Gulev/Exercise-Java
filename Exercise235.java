import java.util.Scanner;

public class Exercise235 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input xp, yp, xq, yq, xr, yr, xs, ys:");
        double xp = sc.nextDouble();
        double yp = sc.nextDouble();
        double xq = sc.nextDouble();
        double yq = sc.nextDouble();
        double xr = sc.nextDouble();
        double yr = sc.nextDouble();
        double xs = sc.nextDouble();
        double ys = sc.nextDouble();

        double line1 = (xp - xq) * (xr - xs);
        double line2 = (yp - yq) * (yr - ys);


        if (line1 + line2 == 0) {
            System.out.println("The lines are orthogonal");
        } else System.out.println("The lines aren't orthogonal");
    }
}
