import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double x1 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double y1 = sc.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double x2 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double y2 = sc.nextDouble();

        double lat1 = Math.toRadians(x1);
        double lon1 = Math.toRadians(y1);
        double lat2 = Math.toRadians(x2);
        double lon2 = Math.toRadians(y2);
        double earthRadius = 6371.01;
        double d = earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
        System.out.println("The distance between those points is: " + d + " km");


    }
}
