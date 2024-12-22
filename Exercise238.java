import java.util.Scanner;

public class Exercise238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '#') {
                int times = Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                for (int j = 0; j < times; j++) {
                    result.append(String.valueOf(input.charAt(i + 2)));
                }
                i += 2;
            } else {
                result.append(input.charAt(i));
            }

        }
        System.out.println(result);

    }
}
