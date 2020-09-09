/*
Write a Java program that accepts three numbers and prints:
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.
 */
package com.javaguru.student_sergey_kazyanin.lesson_4.level_3_junior.Task_8;

class EqualThreeNumbers {
    public static void main(String[] args) {
        EqualThreeNumbers numEq = new EqualThreeNumbers();
        numEq.EqualNumber(3, 3,3);
        numEq.EqualNumber(3, 1,2);
        numEq.EqualNumber(3, 3,2);

    }

    public void EqualNumber(double firstNumber, double secondNumber, double thirdNumber) {
        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
