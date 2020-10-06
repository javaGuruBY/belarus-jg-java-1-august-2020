//        Команда System.out.println("text"); выводит указанный "text"
//        на консоль, и переводит курсор на новую строку.
//
//        Для того, что бы выводить текст на консоль без перевода курсора на
//        новую строку можно воспользоваться командой
//        System.out.print("text");
//        эта команда распечатает текст на консоль и оставит курсор в той же строке.
//
//        Напишите программу, которая демонстрирует использование команды
//        System.out.print("text");

package com.javaguru.student_sergey_kazyanin.lesson_2.level_5;

class Task_15 {
    public static void main(String[] args){
        String text = "TEXT";
        System.out.println("Вывод текста без переноса:");
        System.out.print(text);
        System.out.print(text);
        System.out.print(text);

    }
}
