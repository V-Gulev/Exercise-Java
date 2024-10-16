import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        time.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("Now: " + time.format(System.currentTimeMillis()));
    }
}
