import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        String wordToAdd = sc.nextLine();
        int index = input.size() / 2;
        input.add(index, wordToAdd);
        System.out.println(input.toString().replaceAll("[\\[\\],]", ""));
    }

}
