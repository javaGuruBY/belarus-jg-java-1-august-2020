package com.javaguru.student_vladimir_petranovski.lesson_9.level_1.task_3;

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
    private String address;

/*    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return  age;
    }

    public String getAddress() {
        return address;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
