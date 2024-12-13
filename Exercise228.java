import java.util.Scanner;

public class Exercise228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of combinations and sum (separated by a space in a line):");
        int numberOfCombinations = sc.nextInt();
        int targetSum = sc.nextInt();
        int c1 = calculateCombinations(0, numberOfCombinations, targetSum, 0);
        System.out.println("Number of combinations:");
        System.out.println(c1);
    }


    public static int calculateCombinations(int elements, int elementsLeft, int targetSum, int sum) {
        if (targetSum == sum && elementsLeft == 0) {
            return 1;
        }
        if (elements >= 10) {
            return 0;
        }

        if (sum > targetSum) {
            return 0;
        }

        int c1 = calculateCombinations(elements + 1, elementsLeft - 1, targetSum, sum + elements);
        int c2 = calculateCombinations(elements + 1, elementsLeft, targetSum, sum);

        return c1 + c2;
    }
}