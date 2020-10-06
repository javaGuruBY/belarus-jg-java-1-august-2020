package com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_19.bean;
/*
Тема: создание класса Dog. Продолжение.
Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.
Бизнес требования:
- Должна быть возможность указывать возраст собаки.
- Возраст указывается в годах (целам числом).
- Возраст собаке дают в момент создания.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки и ее возраст.
Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
 */
public class Dog {
    private String name;
    private byte age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
}
