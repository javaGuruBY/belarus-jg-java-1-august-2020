package com.javaguru.student_vadim_migun.lesson_9.level_1.task_2;
/*
Нужно ли в классе создавать дефолтный конструктор
или Java его автоматически добавит при компиляции
кода? Ответьте на вопрос примером кода!
 */

/*
Конструктор имеется в любом классе.
Даже если вы его не написали, компилятор Java сам создаст конструктор по умолчанию (default constructor).
Этот конструктор пустой и не делает ничего, кроме вызова конструктора суперкласса.
 */


class Person {
}



class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
    }
}