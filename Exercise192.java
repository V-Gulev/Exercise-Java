import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercise192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] textList = text.toCharArray();
        List<String> sortedText = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < textList.length; i++) {
            if (Character.isAlphabetic(textList[i])) {
                sortedText.add(String.valueOf(textList[i]));
            } else {
                sum += Integer.parseInt(String.valueOf(textList[i]));
            }
        }
        sortedText.sort(Comparator.naturalOrder());
        sortedText.add(String.valueOf(sum));
        System.out.print(String.join("", sortedText));
    }
}
