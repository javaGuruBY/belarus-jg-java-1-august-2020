package com.javaguru.student_vadim_migun.lesson_6.level_1_intern.Task_3;
/*
Разберитесь, что делает класс указанный ниже.
Это реализация одного из супер тасков предыдущего урока.
Создайте класс FizzBuzzTest и напишите автоматические тесты
на все сценарии. Упростите FizzBuzz класс!
Убедитесь, что после упрощения автоматические тесты все проходят.

PS: а нужно ли свойство класса initialNumber?
Или метод detect можно реализовать без него?

class FizzBuzz {

    private int initialNumber;

    public String detect(int number) {
        this.initialNumber = number;
        if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) return "FizzBuzz";
        else if (initialNumber % 3 == 0) return "Fizz";
        else if (initialNumber % 5 == 0) return "Buzz";
        else return "" + initialNumber; // Integer.toString(initialNumber);
    }

}
 */

class FizzBuzz {

//    private int initialNumber;

    public String detect(int initialNumber) {
        //       this.initialNumber = number;
        if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) return "FizzBuzz";
        else if (initialNumber % 3 == 0) return "Fizz";
        else if (initialNumber % 5 == 0) return "Buzz";
        else return "" + initialNumber; // Integer.toString(initialNumber);
    }

}