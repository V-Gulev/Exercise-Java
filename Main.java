import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the amount of seconds: ");
        int input = Integer.parseInt(sc.nextLine());
        int seconds = input % 60;
        int hours = input / 60 / 60;
        int minutes = input / 60 % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
