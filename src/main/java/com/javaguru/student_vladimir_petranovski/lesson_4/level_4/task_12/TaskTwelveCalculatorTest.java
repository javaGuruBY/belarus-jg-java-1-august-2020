package com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_12;
/*
Создайте класс CalculatorTest и напишите тесты для
всех методов класса Calculator из предыдущего задания.
Подсказка:
class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        // по аналогии реализуйте тесты для остальных методов
    }
    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
}
 */

import com.javaguru.student_vladimir_petranovski.lesson_4.level_4.task_11.TaskElevenCalculator;

public class TaskTwelveCalculatorTest {
    public void sumTest() {
        int firstName = 3;
        int secondName = 5;
        TaskElevenCalculator taskElevenCalculator = new TaskElevenCalculator();
        int result = taskElevenCalculator.sum(3, 5);
        if(result == 8) {
            System.out.println("Sum test = Ok");
        } else {
            System.out.println("Sum test = Fail");
        }
    }
    public void subtractionTest() {
        int firstName = 7;
        int secondName = 4;
        TaskElevenCalculator taskElevenCalculator = new TaskElevenCalculator();
        int result = taskElevenCalculator.subtraction(7, 4);
        if(result == 25) {// специально неправильно поставил, чтобы проверить метод
            System.out.println("Subtraction test = Ok");
        } else {
            System.out.println("Subtraction test = Fail");
        }
    }
    public void divisionTest() {
        int firstName = 9;
        int secondName = 3;
        TaskElevenCalculator taskElevenCalculator = new TaskElevenCalculator();
        int result = taskElevenCalculator.division(9, 3);
        if(result == 3) {
            System.out.println("Division test = Ok");
        } else {
            System.out.println("Division test = Fail");
        }
    }
    public void multiplicationTest() {
        int firstName = 4;
        int secondName = 4;
        TaskElevenCalculator taskElevenCalculator = new TaskElevenCalculator();
        int result = taskElevenCalculator.multiplication(4, 4);
        if(result == 16) {
            System.out.println("Sum test = Ok");
        } else {
            System.out.println("Sum test = Fail");
        }
    }

    public static void main(String[] args) {
        TaskTwelveCalculatorTest taskTwelveCalculatorTest = new TaskTwelveCalculatorTest();
        taskTwelveCalculatorTest.sumTest();
        taskTwelveCalculatorTest.subtractionTest();
        taskTwelveCalculatorTest.divisionTest();
        taskTwelveCalculatorTest.multiplicationTest();
    }
}
