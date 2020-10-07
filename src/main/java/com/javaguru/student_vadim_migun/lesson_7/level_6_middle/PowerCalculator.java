package com.javaguru.student_vadim_migun.lesson_7.level_6_middle;
/*
Разработать класс PowerCalculator, который реализует единственный функциональный метод
для возведения заданного числа в заданную степень.
Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

class PowerCalculator {

   public int pow(int value, int powValue) {
    int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;

        }
        return result;
    }

}

