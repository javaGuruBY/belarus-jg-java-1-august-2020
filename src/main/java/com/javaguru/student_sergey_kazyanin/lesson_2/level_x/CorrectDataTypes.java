/*
********************************************************
*Super_Task_3
*
* Исправьте ошибки компиляции в данной программе.
*
*public class CorrectDataTypes {
*
*	public static void main(String[] args) {
*
*		int numberOne = 10;
*		double numberTwo = 20.0;
*
*		System.out.println("Number 1 = " + numberOne);
*		System.out.println("Number 2 = " + numberTwo);
*
*		float sum = numberOne + numberTwo;
*
*		System.out.println("Sum = " + sum);
*	}
*
*}
********************************************************
 */

package com.javaguru.student_sergey_kazyanin.lesson_2.level_x;

class CorrectDataTypes {
    public static void main(String[] args){

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        //numberTwo в выражении нужно явно преобразовать к типу float, т.к. double больше float
        float sum = numberOne + (float)numberTwo;

        System.out.println("Sum = " + sum);
    }
}
