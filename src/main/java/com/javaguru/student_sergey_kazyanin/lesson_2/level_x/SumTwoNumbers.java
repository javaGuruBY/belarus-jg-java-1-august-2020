/*
*******************************************************
* Super_Task_2
*Исправьте ошибки компиляции в данной программе.
*
*public class SumTwoNumbers {
*
*	public static void main(String[] args) {
*
*		int numberOne;
*		int numberTwo;
*
*		System.out.println("Number 1 = " + numberOne);
*		System.out.println("Number 2 = " + numberTwo);
*
*		int numberOne = 10;
*		int numberTwo = 20;
*
*		int sum = numberOne + numberTwo;
*
*		System.out.println("Sum = " + sum);
*	}
*
*}
* *******************************************************
 */

package com.javaguru.student_sergey_kazyanin.lesson_2.level_x;

class SumTwoNumbers {
    public static void main(String[] args){
//  Хорошая практика инициализировать переменную вместе с ее объявлением,
//  до того как будет попытка ее вывести
        int numberOne = 10;
        int numberTwo = 20;
//  В случае, если попытаться вывести не проинициализированную переменную, компилятор выдаст ошибку
        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

//        int numberOne = 10;
//        int numberTwo = 20;

        int sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }

}
