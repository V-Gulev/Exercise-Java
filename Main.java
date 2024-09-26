import java.util.Scanner;

public class Main {

    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static int findHighestGrade(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int findLowestGrade(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public static void printBetterStudents(String[] names, int[] grades, double average) {
        System.out.println("Students who scored above average:");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > average) {
                System.out.println(names[i] + " - " + grades[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of students: ");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        String[] studentNames = new String[numberOfStudents];
        int[] studentGrades = new int[numberOfStudents];


        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
            System.out.println("Enter grade of " + studentNames[i] + ": ");
            studentGrades[i] = scanner.nextInt();
            scanner.nextLine();
        }
        double average = calculateAverage(studentGrades);
        int highestGrade = findHighestGrade(studentGrades);
        int lowestGrade = findLowestGrade(studentGrades);

        System.out.println("Class Results:");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);

        printBetterStudents(studentNames, studentGrades, average);
    }
}
