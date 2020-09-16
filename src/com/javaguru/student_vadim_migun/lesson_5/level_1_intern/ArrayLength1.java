package com.javaguru.student_vadim_migun.lesson_5.level_1_intern;
/*
Найдите ошибку в программе и исправить её:

class ArrayLength1 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers[-1]);
    }

}
 */
class ArrayLength1 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
     //   numbers[0] = 3;
     //   numbers[1] = 4;

        System.out.println(numbers[1]);

    }

}
