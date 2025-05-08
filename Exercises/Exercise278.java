package Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise278 {
    public static void main(String[] args) {
        try {
            testFile("testTextFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void testFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

        sc.close();
    }
}
