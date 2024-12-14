import java.util.Scanner;

public class Exercise229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rectangle = 0;
        int rhombus = 0;
        System.out.println("Input two adjoined sides and the diagonal of a parallelogram (comma separated):");

        int len1 = sc.nextInt();
        int len2 = sc.nextInt();
        int len3 = sc.nextInt();

        if (len3 * len3 == len1 * len1 + len2 * len2) {
            rectangle++;
        }
        if (len1 == len2) {
            rhombus++;
        }
        if (rectangle > 0) {
            System.out.println("This is a rectangle.");
        } else if (rhombus > 0) {
            System.out.println("This is a rhombus.");
        }
    }
}