package com.javaguru.teacher.lesson_5.lessoncode.arrays;

import java.util.Random;

class IntArrayExample {

    public static void main(String[] args) {
        int[] intArray = new int[10];

        System.out.println(intArray);

        System.out.println();

        for (int i = 0; i <= intArray.length - 1; i++) {
            System.out.println("Index = " + i);
            System.out.println("Value = " + intArray[i]);

            System.out.println();
        }

        Random randomGenerator = new Random();

        System.out.println("Filled array");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = randomGenerator.nextInt();
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index = " + i);
            System.out.println("Value = " + intArray[i]);

            System.out.println();
        }

    }
}
