package com.javaguru.student_sergey_kazyanin.lesson_2.lessoncode;

import java.math.BigDecimal;

public class Variables {
    public static void main(String[] args) {
        int age = 27;
        System.out.println(age);
        boolean tired = false;
        System.out.println(tired);

        String userName = "sergey.k";
//        System.out.println(userName);

        String stringConcatExample = age + " " + tired + " " + userName;

        System.out.println(stringConcatExample);

        float weight = 55.3f;
        double price = 70.1;
        double sumResult = weight + price;
        double secondSumResult = price + price;
        System.out.println(sumResult);
        System.out.println(secondSumResult);

        BigDecimal bigDecimalPrice = new BigDecimal("125.39999923706054");
        System.out.println(bigDecimalPrice);

        char a = 'a';
        char b = 66; // ASCII - B
        System.out.println(a);
        System.out.println(b);

    }
}
