package com.javaguru.student_vladimir_petranovski.lesson_7.level_6.task_10;
/*
Разработать класс PowerCalculator, который реализует единственный функциональный метод
для возведения заданного числа в заданную степень.
Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

class PowerCalculator {
    double raiseNumberToPower(double number, double power) {
        if (power == 0) {
            return 1;
        }
        if (number == 0) {
            return 0;
        }
        double value = number;
        for (int i = 0; i < power - 1; i++) {
            value = value * number;
        }
        return value;
    }

}
