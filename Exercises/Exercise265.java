package Exercises;

public class Exercise265 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int) (totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;
        long currentMinute = (int) (totalMinutes % 60);

        long totalHours = totalMinutes / 60;
        long currentHour = (int) (totalHours % 24);

        long totalDays = totalHours / 24;
        int currentYear = (int) (totalDays / 365) + 1970;
        long daysInCurrentYear = (totalDays - numberOfLeapYearsSince1970(currentYear)) % 365;

        if (currentHour > 0) {
            daysInCurrentYear++;
        }

        int currentMonthNum = getMonthFromDays(currentYear, (int) daysInCurrentYear);
        String month = getMonthName(currentMonthNum);

        int daysTillCurrentMonth = getNumOfDaysToReachThatMonth(currentYear, currentMonthNum);
        int startDay = getStartDay(currentYear, currentMonthNum);
        int today = (int) daysInCurrentYear - daysTillCurrentMonth;
        String dayOfWeek = dayNameOfWeek(((startDay + today) % 7));

        System.out.println("Current date and time: " + dayOfWeek + " " + month + " " + today + ", " + currentYear
                + " " + currentHour + ":"
                + currentMinute + ":" + currentSecond);

    }

    public static String dayNameOfWeek(int dayOfWeek) {
        return switch (dayOfWeek) {
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            case 1 -> "Sunday";
            default -> null;
        };
    }

    public static int numberOfLeapYearsSince1970(long year) {
        int count = 0;
        for (int i = 1970; i <= year; i++) {
            if (isLeapYear(i)) {
                count++;
            }
        }
        return count;
    }


    public static int getMonthFromDays(int year, int days) {
        int dayTracker = 0;
        for (int i = 1; i <= 12; i++) {
            dayTracker += getNumberOfDaysInMonth(year, i);
            if (dayTracker > days) {
                return i;
            }
        }
        return 12;
    }

    public static int getNumOfDaysToReachThatMonth(int year, int month) {
        int dayTracker = 0;
        for (int i = 1; i < month; i++) {
            dayTracker += getNumberOfDaysInMonth(year, i);
        }
        return dayTracker;
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) {
                total = total + 366;
            } else {
                total = total + 365;
            }
        }
        for (int i = 1; i < month; i++) {
            total = total + getNumberOfDaysInMonth(year, i);
        }
        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        return 0;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
    }

}
