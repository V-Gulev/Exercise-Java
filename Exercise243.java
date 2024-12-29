import java.util.*;

public class Exercise243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Double>> wordPages = new TreeMap<>();

        System.out.println("Input pairs of a word and a page number (type 'done' to finish):");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            String[] parts = input.split(" ");
            String word = parts[0];
            double page = Integer.parseInt(parts[1]);
            wordPages.putIfAbsent(word, new ArrayList<>());
            wordPages.get(word).add(page);
        }

        System.out.println("Word and page number in alphabetical order:");
        for (Map.Entry<String, List<Double>> entry : wordPages.entrySet()) {
            System.out.println(entry.getKey());
            for (double page : entry.getValue()) {
                System.out.println(page);
            }
        }

    }
}
