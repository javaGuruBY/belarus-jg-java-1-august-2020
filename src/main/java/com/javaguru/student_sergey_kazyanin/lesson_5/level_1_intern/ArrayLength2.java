/*
Найдите ошибку в программе и исправить её:

class ArrayLength2 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }

}

 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_1_intern;

class ArrayLength2 {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
