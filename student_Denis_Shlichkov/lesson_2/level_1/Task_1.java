package lesson_2.level_1;

//import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

//@CodeReview(approved = true)
public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int num1 = in.nextInt();
        System.out.print("Input a second number: ");
        int num2 = in.nextInt();
        System.out.println("Сумма: " + (num1 + num2));
        System.out.println("Разность: " + (num1 - num2));
        System.out.println("Произведение: " + (num1 * num2));
        System.out.println("Частное: " + (num1 / num2));
        in.close();
    }
}
