import java.util.HashMap;
import java.util.Scanner;

public class Exercise214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Double> givenNumbers = new HashMap<>();
        givenNumbers.put('a', sc.nextDouble());
        givenNumbers.put('b', sc.nextDouble());
        givenNumbers.put('c', sc.nextDouble());
        givenNumbers.put('d', sc.nextDouble());
        givenNumbers.put('e', sc.nextDouble());
        givenNumbers.put('f', sc.nextDouble());

        double z = givenNumbers.get('a') * givenNumbers.get('e') - givenNumbers.get('b') * givenNumbers.get('d');
        if (z == 0) {
            System.out.println("The system of equations has no unique solution.");
        } else {
            double x = (givenNumbers.get('c') * givenNumbers.get('e') - givenNumbers.get('b') * givenNumbers.get('f')) / z;
            double y = (givenNumbers.get('a') * givenNumbers.get('f') - givenNumbers.get('c') * givenNumbers.get('d')) / z;

            System.out.printf("%.3f %.3f%n", x, y);
        }
    }
}