package com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_18.bean;
/*
Тема: создание класса Dog.
Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.
Бизнес требования:
- У собаки должна быть кличка.
- Кличку собаке дают в момент создания и потом ее изменить нельзя.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки три раза.
Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Do
 */
public class Dog {
    private  final String name = "Bobic";
    public String getName() {
        return name;
    }
}
