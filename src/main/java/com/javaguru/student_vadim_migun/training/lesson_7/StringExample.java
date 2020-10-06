package com.javaguru.student_vadim_migun.training.lesson_7;

import java.util.Arrays;

class StringExample {

    public static void main(String[] args) {
        String text = "a, b, c, d, e, f, g, h";
        System.out.println(text);
        text = text.replace("b","_");
        System.out.println(text);

        if (text.contains("c")) {
            System.out.println("Contains C");
        } else {
            System.out.println("Not contains C");
        }
        String[] strings = text.split(",  ");
        System.out.println(Arrays.toString(strings));

        
    }
}
