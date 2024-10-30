import java.util.Scanner;

public class Exercise195 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (side1 > 0 && side2 > 0 && side3 > 0 ) {
            System.out.println((side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2));
        } else System.out.println("Invalid input!");


    }
}
