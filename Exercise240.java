import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise240 {
    public static void main(String[] args) {
        System.out.println("Input the numbers (Ctrl+C to exit):");
        Scanner sc = new Scanner(System.in);
        List<String> diamond = new ArrayList<>();
        while (true) {
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            diamond.add(input);
        }
        int size = diamond.size();
        int[][] grid = new int[size][];
        for (int i = 0; i < size; i++) {
            String[] text = diamond.get(i).split(",");
            int length = text.length;
            grid[i] = new int[length];
            for (int j = 0; j < length; j++) {
                grid[i][j] = Integer.parseInt(text[j]);
            }
        }
        int[] arr = {grid[0][0]};
        for (int i = 1; i < size; i++) {
            int[] temp = new int[grid[i].length];
            for (int j = 0; j < temp.length; j++) {
                if (i <= size / 2) {
                    if (j == 0) temp[j] = arr[j] + grid[i][j];
                    else if (j == temp.length - 1) temp[j] = arr[j - 1] + grid[i][j];
                    else temp[j] = Math.max(arr[j - 1] + grid[i][j], arr[j] + grid[i][j]);
                } else {
                    temp[j] = Math.max(arr[j] + grid[i][j], arr[j + 1] + grid[i][j]);
                }
            }
            arr = temp;
        }
        System.out.println("Maximum value of the sum of integers passing according to the rule on one line.");
        System.out.println(arr[0]);
    }
}