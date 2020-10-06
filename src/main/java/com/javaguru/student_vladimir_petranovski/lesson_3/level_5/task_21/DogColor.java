package com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_21;
/*
Тема: создание класса Dog. Продолжение.
Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.
Бизнес требования:
- Сделайте возможность указывать цвет собаки.
- Пусть цвет задаётся просто строкой: "Red", "Black", etc.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки, ее возраст и цвет.
PS: добавте свойство color в класс Dog,
добавте в конструктор класса новое свойство и сохраните его,
дополните метод voice() выводом цвета на консоль
Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
 */
public class DogColor {
    private String name;
    private int age;
    private String color;
    public DogColor(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void voice() {
        System.out.println("Кличка собаки " + name + ", ее возраст " + age + ", ее цвет " + color);
    }
}

