import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int n = sc.nextInt();
        System.out.print("Input the length of a side  of the hexagon: ");
        int s = sc.nextInt();
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area of the hexagon is: " + area);


    }
}
