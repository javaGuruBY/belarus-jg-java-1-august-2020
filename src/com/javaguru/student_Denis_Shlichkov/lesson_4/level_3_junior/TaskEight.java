/*
Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.
 */
package lesson_4.level_3_junior;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        if (numberOne == numberTwo && numberOne == numberThree) System.out.println("All numbers are equal");
        else if (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree)
            System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }
}
