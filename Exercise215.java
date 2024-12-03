import java.util.Scanner;

public class Exercise215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double loan = Double.parseDouble(sc.nextLine());
        double interestRate = Double.parseDouble(sc.nextLine());
        int months = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < months; i++) {
            loan += loan * interestRate;
            loan = Math.round(loan / 1000) * 1000;
        }

        System.out.printf("Debt: %.2f", loan);


    }
}
