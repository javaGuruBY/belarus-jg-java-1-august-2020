package com.javaguru.student_vladimir_petranovski.lesson_3.level_2;
/*
Тема: Самостоятельное изучение класса String.
Поищите в интернете информацию про класс String в Java.
Прочтите несколько статей. Попробуйте найти ответы на
следующие вопросы:
- Где ханитятся обьекты класса String?
- Как определить длину строки?
- Как сравнивать две строки?
 */

public class TaskTenSaveLengthEquals {
    public static void main(String[] args) {
        // Это неизменяемый (immutable) и финализированный тип данных
        // в Java и все объекты класса String виртуальная машина хранит в пуле строк

        String str = "Моя строка";
        System.out.println(str.length()); // определяем длину строки

        String sqr = "VVV";
        String sqr1 = "NNN";
        System.out.println(sqr == sqr1);
        // а если сравнивать через создание новых обьектов то
        String phrase = new String("CCC");
        String phrase1 = new String("CCC");
        System.out.println(phrase.equals(phrase1));

    }
}
