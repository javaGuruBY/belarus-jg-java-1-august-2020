package com.javaguru.student_Pavel_Buben.lesson_2.level_1.level_2;

import java.util.Scanner;
/*Проеверно Артемом:
название класса начинается с большой буквы!! Это Code Convention. Правила программистов по стилю написания кода. И желательно без цифр. Например TaskEight*/
class Task_8 {
    public static void main(String[] args) {
        System.out.println("Имя пользователя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

    }
}
