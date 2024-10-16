import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("/user/Developer/Java-Exercise : " + new File("exercise.txt").length() + " bytes");
        System.out.println("/user/Developer/Java-Exercise : " + new File("exam.txt").length() + " bytes");
    }
}
