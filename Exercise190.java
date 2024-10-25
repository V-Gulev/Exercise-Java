import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] string1 = sc.nextLine().split(" ");
        String[] string2 = sc.nextLine().split(" ");
        checkForMissingString(string1, string2);
    }

    public static void checkForMissingString(String[] string1, String[] string2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list1, string1);
        Collections.addAll(list2, string2);
        if (list1.size() < list2.size()) {
            for (int i = 0; i < list2.size(); i++) {
                if (!list1.contains(list2.get(i))) {
                    System.out.println(list2.get(i));
                    break;
                }
            }
        } else {
            for (int i = 0; i < list1.size(); i++) {
                if (!list2.contains(list1.get(i))) {
                    System.out.println(list1.get(i));
                    break;
                }
            }
        }

    }
}
