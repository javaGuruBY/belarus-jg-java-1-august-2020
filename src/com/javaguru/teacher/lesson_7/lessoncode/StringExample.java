package com.javaguru.teacher.lesson_7.lessoncode;

import java.util.Arrays;

class StringExample {

    public static void main(String[] args) {
        String text = "a, b, c, d, e, f, g, h";
        System.out.println(text);
        String replacedString = text.replace("b", "_");
        System.out.println(replacedString);
        System.out.println(text);


        if (text.contains("b")) {
            System.out.println("Contains B");
        } else {
            System.out.println("Not contains B");
        }

        String[] strings = text.split(", ");

        System.out.println(Arrays.toString(strings));

        String name1 = "Vasya";
        String name2 = "vasya";

        if (name1.equals(name2)) {
            System.out.println("EQUALS - EQUALS");
        } else {
            System.out.println("EQUALS - NOT EQUALS");
        }

        String newName1 = name1.toLowerCase();
        if (newName1.equals(name2)) {
            System.out.println("LOWER CASE - EQUALS");
        } else {
            System.out.println("LOWER CASE - NOT EQUALS");
        }

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("EQUALS IGN. - EQUALS");
        } else {
            System.out.println("EQUALS IGN. - NOT EQUALS");
        }

        int indexOfA = name1.indexOf("a");
        System.out.println("Index of a = " + indexOfA);
    }
}
