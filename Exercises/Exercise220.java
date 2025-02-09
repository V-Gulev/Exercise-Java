package Exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        BigInteger b1 = new BigInteger(input1);
        BigInteger b2 = new BigInteger(input2);
        BigInteger result = new BigInteger(String.valueOf(0));
        result = result.add(b1);
        result = result.add(b2);
        String s3 = "" + result;

        if (input1.length() > 80 || input2.length() > 80 || s3.length() > 80) {
            System.out.println("Overflow");
        } else {
            System.out.println("Sum of the said two integers:");
            System.out.println(result);
        }
    }
}