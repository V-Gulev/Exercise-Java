import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> number = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        boolean flag = false;
        int result = 0;
        int start = 0, end = 0;

        for (int i = 1; i < number.size(); i++) {

            if (number.get(i - 1) < number.get(i)) {
                end = i;
            } else {
                start = i;
            }

            if (end - start > result) {
                flag = true;
                result = end - start;
            }
        }

        if (flag) {
            System.out.println(result + 1);
        } else {
            System.out.println(result);
        }
    }
}