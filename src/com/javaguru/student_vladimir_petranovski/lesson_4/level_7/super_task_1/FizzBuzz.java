package com.javaguru.student_vladimir_petranovski.lesson_4.level_7.super_task_1;
/*
Создайте класс FizzBuzz.
В классе FizzBuzz создайте метод со следующей сигнатурой:
class FizzBuzz {
    public String detect(int number) {
        // Реализуйте следующие требования:
        // - если переданное число делится на три возвращайте "Fizz"
        // - если переданное число делится на пять возвращайте "Buzz"
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
    }
}
Создайте класс FizzBuzzTest и напишите автоматические тесты,
которые покрывают все возможные сценарии.
 */
class FizzBuzz {
    public String detect(int number) {
        if (((number % 3) == 0) && ((number) % 5) == 0) {
            return "FizzBuzz";
        } else if ((number % 3) == 0) {
            return "Fizz";
        } else if ((number % 5) == 0) {
            return "Buzz";
        }
            return "" + number;
    }
}
