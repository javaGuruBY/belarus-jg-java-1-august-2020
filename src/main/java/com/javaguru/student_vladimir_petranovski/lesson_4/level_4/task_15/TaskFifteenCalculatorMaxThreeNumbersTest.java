package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_15;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "тесты написаны неверно. Лучше посмотреть пример и сдалть по аналогии.")
public class TaskFifteenCalculatorMaxThreeNumbersTest {
    private TaskFifteenCalculatorMaxThreeNumbers test = new TaskFifteenCalculatorMaxThreeNumbers();

    public void maxOfThreeNumbersTest1() {
        int firstNumber = 3, secondNumber = 5, thirdNumber = 7;
        int expected = 7;
        int actual = test.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expected == actual) {
            System.out.println("Третье число больше первого и второго. Test == SUCCESS");
        } else {
            System.out.println("Третье число больше первого и второго. Test == FAILED");
        }
    }

    public void maxOfThreeNumbersTest2() {
        int firstNumber = 10, secondNumber = -2, thirdNumber = 5;
        int expected = 10;
        int actual = test.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expected == actual) {
            System.out.println("Петвое число больше третьего и второго. Test == SUCCESS");
        } else {
            System.out.println("Петвое число больше третьего и второго. Test == FAILED");
        }
    }

    public void maxOfThreeNumbersTest3() {
        int firstNumber = -17, secondNumber = 0, thirdNumber = -10;
        int expected = 0;
        int actual = test.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expected == actual) {
            System.out.println("Второе число больше третьего и первого. Test == SUCCESS");
        } else {
            System.out.println("Второе число больше третьего и первого. Test == FAILED");
        }
    }

    public void maxOfThreeNumbersTest4() {
        int firstNumber = 10, secondNumber = 10, thirdNumber = 5;
        int expected = 10;
        int actual = test.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expected == actual) {
            System.out.println("Первые два числа равны и больше третьего. Test == SUCCESS");
        } else {
            System.out.println("Первые два числа равны и больше третьего. Test == FAILED");
        }
    }

    public void maxOfThreeNumbersTest5() {
        int firstNumber = 10, secondNumber = 1, thirdNumber = 10;
        int expected = 10;
        int actual = test.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expected == actual) {
            System.out.println("Первое и третье числа равны и больше второго. Test == SUCCESS");
        } else {
            System.out.println("Первое и третье числа равны и больше второго. Test == FAILED");
        }
    }

    public void maxOfThreeNumbersTest6() {
        int firstNumber = 1, secondNumber = 3, thirdNumber = 3;
        int expected = 3;
        int actual = test.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expected == actual) {
            System.out.println("Второе и третье числа равны и больше первого. Test == SUCCESS");
        } else {
            System.out.println("Второе и третье числа равны и больше первого. Test == FAILED");
        }
    }

    public void maxOfThreeNumbersTest7() {
        int firstNumber = -2, secondNumber = -2, thirdNumber = -2;
        int expected = -2;
        int actual = test.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expected == actual) {
            System.out.println("Числа равны. Test == SUCCESS");
        } else {
            System.out.println("Числа равны. Test == FAILED");
        }
    }

    public static void main(String[] args) {
        TaskFifteenCalculatorMaxThreeNumbersTest test = new TaskFifteenCalculatorMaxThreeNumbersTest();
        test.maxOfThreeNumbersTest1();
        test.maxOfThreeNumbersTest2();
        test.maxOfThreeNumbersTest3();
        test.maxOfThreeNumbersTest4();
        test.maxOfThreeNumbersTest5();
        test.maxOfThreeNumbersTest6();
        test.maxOfThreeNumbersTest7();
    }
}
