package Exercises;

public class Exercise273 {
    public enum NamesOfTheDaysInTheWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String[] args) {
        NamesOfTheDaysInTheWeek today = NamesOfTheDaysInTheWeek.WEDNESDAY;
        System.out.println("Today is " + today);
    }
}
