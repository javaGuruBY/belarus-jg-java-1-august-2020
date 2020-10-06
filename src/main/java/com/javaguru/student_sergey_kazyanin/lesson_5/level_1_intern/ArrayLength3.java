/*
Найдите ошибку в программе и исправить её:

class ArrayLength3 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers.length());
    }

}

 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_1_intern;

class ArrayLength3 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(numbers.length);
    }
}
