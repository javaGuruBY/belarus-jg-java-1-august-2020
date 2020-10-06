package com.javaguru.student_vadim_migun.lesson_6.level_2_intern;
/*
Найдите логическую ошибку в программе и исправить её.
Программа должна выводить числа от 1 до 100 на консоль.

class WhileDefinition5 {

    public static void main(String[] args) {
        int i = 1;
        while (i >= 100) {
            System.out.println(i);
            i--;
        }
    }

}

 */

class WhileDefinition5 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

}
