import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the length of a side  of the hexagon: ");
        int s = sc.nextInt();
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is: " + area);


    }
}
