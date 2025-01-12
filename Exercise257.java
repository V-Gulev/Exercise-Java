import java.util.Scanner;

public class Exercise257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the investment amount: ");
        double investmentAmount = sc.nextDouble();

        System.out.print("Input the rate of interest: ");
        double interestRate = sc.nextDouble();

        System.out.print("Input number of years: ");
        int years = sc.nextInt();

        System.out.printf("%-10s%-15s%n", "Years", "FutureValue");

        for (int year = 1; year <= years; year++) {
            double value = calculateInvestmentValue(investmentAmount, interestRate, year);
            System.out.printf("%-10d%-15.2f%n", year, value);
        }
    }

    public static double calculateInvestmentValue(double investment, double rate, int years) {
        double monthlyRate = rate / 100 / 12;
        int months = years * 12;
        return investment * Math.pow(1 + monthlyRate, months);
    }
}