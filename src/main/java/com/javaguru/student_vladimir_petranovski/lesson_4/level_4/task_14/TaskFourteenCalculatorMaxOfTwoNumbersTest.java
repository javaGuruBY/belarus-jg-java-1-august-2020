package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_14;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "тесты написаны неверно. Нет вызова класса," +
        " который тестируют. Для работы используют переменные, которые хранят какие-то значения")
public class TaskFourteenCalculatorMaxOfTwoNumbersTest {
    private TaskFourteenCalculatorMaxOfTwoNumbers test = new TaskFourteenCalculatorMaxOfTwoNumbers();

    public void maxOfTwoNumbersTest1() {
        int firstNumber = 3, secondNumber = 1;
        int expected = 3;
        int actual = test.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expected == actual) {
            System.out.println("Первое число больше второго. Test == SUCCESS");
        } else {
            System.out.println("Первое число больше второго. Test == FAILED");
        }
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 2, secondNumber = 7;
        int expected = 7;
        int actual = test.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expected == actual) {
            System.out.println("Второе число больше первого. Test == SUCCESS");
        } else {
            System.out.println("Второе число больше первого. Test == FAILED");
        }
    }

    public void maxOfTwoNumbersTest3() {
        int firstNumber = -5, secondNumber = -5;
        int expected = -5;
        int actual = test.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expected == actual) {
            System.out.println("Числа равны. Test == SUCCESS");
        } else {
            System.out.println("Числа равныю Test == FAILED");
        }
    }

    public static void main(String[] args) {
        TaskFourteenCalculatorMaxOfTwoNumbersTest max = new TaskFourteenCalculatorMaxOfTwoNumbersTest();
        max.maxOfTwoNumbersTest1();
        max.maxOfTwoNumbersTest2();
        max.maxOfTwoNumbersTest3();
    }
}
