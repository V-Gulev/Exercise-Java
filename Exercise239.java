import java.util.Scanner;

public class Exercise239 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().replaceAll(",", "").replaceAll("\\.", "").replaceAll("!", "").replaceAll("\\?", "").replaceAll("-", "").replaceAll("'", "").split("\\s+");
        for (String word : input) {
            if (word.length() <= 6 && word.length() >= 3) {
                System.out.println(word);
            }
        }


    }
}
