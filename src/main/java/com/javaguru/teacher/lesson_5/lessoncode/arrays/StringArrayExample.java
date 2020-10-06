package com.javaguru.teacher.lesson_5.lessoncode.arrays;

import java.util.Arrays;
import java.util.UUID;

class StringArrayExample {

    public static void main(String[] args) {
        String[] stringArray = new String[5];
        System.out.println(stringArray);

        System.out.println(Arrays.toString(stringArray));

        stringArray[0] = "Hello";
        stringArray[1] = "Ruslan";
        stringArray[2] = "a";
        stringArray[3] = UUID.randomUUID().toString();
        stringArray[4] = UUID.randomUUID().toString();

        System.out.println(Arrays.toString(stringArray));
    }
}
