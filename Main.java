import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Divided by 3: ");
        for (int i = 3; i < 100; i += 3) {
            System.out.print(i + ", ");
        }


        System.out.println("\nDivided by 5: ");
        for (int i = 5; i < 100; i += 5) {
            System.out.print(i + ", ");
        }

        System.out.println("\nDivided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + ", ");
        }
        
    }
}
