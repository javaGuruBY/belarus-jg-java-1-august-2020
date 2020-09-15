/*
Найдите логическую ошибку в программе и исправить её:

class ForLoopDefinition4 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i--) {
            System.out.println(i);
        }
    }

}

PS: программа должна выводить на консоль числа от 0 до 9.
 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_3_junior;

class ForLoopDefinition4 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
