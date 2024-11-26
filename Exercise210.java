import java.util.Scanner;

public class Exercise210 {
    static boolean patternMatch(String string, String pattern) {
        int i = 0;
        int j = 0;
        int starIndex = -1;
        int currentIndex = -1;

        while (i < string.length()) {

            if (j < pattern.length() && (pattern.charAt(j) == '?' || pattern.charAt(j) == string.charAt(i))) {
                i++;
                j++;
            } else if (j < pattern.length() && pattern.charAt(j) == '*') {
                starIndex = j;
                currentIndex = i;
                j++;
            } else if (starIndex != -1) {
                j = starIndex + 1;
                i = currentIndex + 1;
                currentIndex++;
            } else {
                return false;
            }
        }

        while (j < pattern.length() && pattern.charAt(j) == '*') {
            j++;
        }

        return j == pattern.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = in.nextLine();
        System.out.println("Enter a pattern:");
        String pattern = in.nextLine();

        if (patternMatch(string, pattern)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
