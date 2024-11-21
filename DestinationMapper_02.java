import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String regex = "([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        List<String> destinations = new ArrayList<>();
        int travelPoints = 0;
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String destination = matcher.group("destination");
            destinations.add(destination);
            travelPoints += destination.length();
        }

        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Travel Points: " + travelPoints);

    }
}
