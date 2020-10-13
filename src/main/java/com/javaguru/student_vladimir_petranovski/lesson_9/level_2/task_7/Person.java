package com.javaguru.student_vladimir_petranovski.lesson_9.level_2.task_7;
/*
Как вызвать конструктор родительского класса?
Когда это нужно делать?
Приведите пример кода.
 */
// Он вызывается при помощи ключевого слова super, это нужно делать всегда, иначе выдаст компиляциооную ошибку
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {

    }
}
