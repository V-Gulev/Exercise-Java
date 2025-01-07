import java.util.Scanner;

public class Exercise254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your text: ");
        String[] text = sc.nextLine().replaceAll(",", " ").replaceAll("\\.", " ")
                .replaceAll("!", " ").replaceAll("\\?", " ")
                .split("\\s+");

        System.out.println("The amount of words in the text is: " + getWordsAmount(text));


    }

    public static int getWordsAmount(String[] text) {
        return text.length;
    }
}
