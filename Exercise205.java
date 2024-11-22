import java.util.Scanner;

public class Exercise205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        boolean isPowerOf2;

        if (number <= 0) {
            isPowerOf2 = false;
        } else {
            double check = Math.log(number) / Math.log(2);
            isPowerOf2 = check == Math.floor(check);
        }

        System.out.println(isPowerOf2);


    }
}
