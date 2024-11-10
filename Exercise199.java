import java.util.LinkedHashMap;
import java.util.Scanner;

public class Exercise199 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        char[] patternElements = pattern.toCharArray();
        String[] stringElements = sc.nextLine().split(" ");
        LinkedHashMap<String, Character> charToString = new LinkedHashMap<>();
        boolean validPattern = true;
        for (int i = 0; i < patternElements.length; i++) {
            String word = stringElements[i];
            char patternChar = patternElements[i];
            if (!charToString.containsKey(word)) {
                if (charToString.containsValue(patternChar)) {
                    validPattern = false;
                    break;
                }
                charToString.put(word, patternChar);
            } else if (charToString.get(word) != patternChar) {
                validPattern = false;
                break;
            }
        }


        System.out.println(validPattern);

    }
}
