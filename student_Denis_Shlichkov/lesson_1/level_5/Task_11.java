package lesson_1.level_5;

/*import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;


@CodeReview(approved = true)*/

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
//        @CodeReviewComment(teacher = "Названия непринято сокращать. Лучше использовать названия firstNumber, secondNumber & etc")
        int num1 = in.nextInt();
        System.out.print("Input a second number: ");
        int num2 = in.nextInt();
        System.out.println(num1 + num2);
    }
}
