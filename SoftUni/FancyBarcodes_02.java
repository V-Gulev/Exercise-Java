package SoftUni;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfBarcodes = Integer.parseInt(sc.nextLine());
        String regex = "@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern1 = Pattern.compile(regex);

        for (int i = 0; i < numberOfBarcodes; i++) {
            String input = sc.nextLine();
            Matcher matcher1 = pattern1.matcher(input);
            if (matcher1.find()) {
                StringBuilder result = new StringBuilder();
                char[] inputToChar = input.toCharArray();
                for (char ch : inputToChar) {
                    if (Character.isDigit(ch)) {
                        result.append(ch);
                    }
                }
                if (result.isEmpty()) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + result);
                }


            } else {
                System.out.println("Invalid barcode");
            }


        }
    }
}
