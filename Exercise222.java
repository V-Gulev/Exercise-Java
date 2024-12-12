import java.util.Scanner;

public class Exercise222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input P(x1, y1), separated by a space.");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Input Q(x2, y2), separated by a space.");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Input R(x3, y3), separated by a space.");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        System.out.println("Input S(x4, y4), separated by a space.");
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();

        double PQ = (y2 - y1) / (x2 - x1);
        double RS = (y4 - y3) / (x4 - x3);

        if (PQ == RS) {
            System.out.println("The lines PQ and RS are parallel.");
        } else {
            System.out.println("The lines PQ and RS are not parallel.");
        }
    }
}
