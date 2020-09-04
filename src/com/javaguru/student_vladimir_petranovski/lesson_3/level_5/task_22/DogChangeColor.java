package com.javaguru.student_vladimir_petranovski.lesson_3.level_5.task_22;
/*
Тема: создание класса Dog. Продолжение.
Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.
Бизнес требования:
- Должна быть возможность менять цвет собаки на другой.
PS: создайте в классе Dog метод:
    public void changeColor(String newColor) {
        // напишите тут команду сохранения нового цвета в свойство класса
    }
Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
Создайте собаку,
заставьте её подать голос,
заставте её поменять цвет,
заставьте её подать голос снова и убедитесь в том,
что собака изменила свой цвет.
 */

public class DogChangeColor {
    String newColor;
    public void voice() {
        System.out.println("Гав-гав!");
    }
    public void changeColor(String newColor) {
        System.out.println(newColor);
    }
}
