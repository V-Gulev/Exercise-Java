package Exercises;

import java.util.Scanner;
import java.util.zip.CRC32;

public class Exercise206 {
    public static long computeCRC32(byte[] data) {
        CRC32 crc = new CRC32();
        crc.update(data);
        return crc.getValue();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        byte[] inputData = input.getBytes();
        long checksum = computeCRC32(inputData);
        System.out.printf("The CRC32 checksum for the input is: %08X\n", checksum);
    }
}