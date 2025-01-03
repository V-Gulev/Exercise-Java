import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise245 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, String> nameAndId = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> nameAndScore = new LinkedHashMap<>();
        System.out.println("Input number of students:");
        int numberOfStudents = Integer.parseInt(sc.nextLine());
        System.out.println("Input Student Name, ID, Score:");
        for (int i = 0; i < numberOfStudents; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            String id = input[1];
            int score = Integer.parseInt(input[2]);
            nameAndId.put(name, id);
            nameAndScore.put(name, score);

        }

        int maxScore = nameAndScore.values().stream().max(Integer::compare).orElse(0);
        int minScore = nameAndScore.values().stream().min(Integer::compare).orElse(0);
        String maxScoreName = "";
        String minScoreName = "";
        for (Map.Entry<String, Integer> entry : nameAndScore.entrySet()) {
            if (entry.getValue().equals(maxScore)) {
                maxScoreName = entry.getKey();
            } else if (entry.getValue().equals(minScore)) {
                minScoreName = entry.getKey();
            }
        }
        System.out.println("Name, ID of the highest score and the lowest score:");
        System.out.println("Max: " + maxScoreName + " Id: " + nameAndId.get(maxScoreName));
        System.out.println("Min: " + minScoreName + " Id: " + nameAndId.get(minScoreName));

    }
}
