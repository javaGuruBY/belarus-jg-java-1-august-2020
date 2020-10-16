package com.javaguru.student_vadim_migun.lesson_9.level_1.task_3;
/*
Какие значения принимают свойства класса
(ссылки на объекты и примитивные типы данных)
при вызове дефолтного конструктора?

class Person {

    private String fullName;
    private int age;
    private Address address;

}

Напишите программу, которая продемонстрирует
ответ на этот вопрос.
 */

class Person {

    private String fullName;
    private int age;
    private String  address;

    // Если нет конструктора в классе который инициализирует эти поля какими-то значениями,
    // то поля инициализируются значениями по умолчанию null или 0. Это делает конструктор по умолчанию.


    // создание конструктора с инициализацией полей

 /*   public Person(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }
 */

    @Override
    public String toString() {
        return fullName + ", " + age + ", " + address;
    }
}