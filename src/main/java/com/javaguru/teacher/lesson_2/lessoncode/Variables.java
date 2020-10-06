package com.javaguru.teacher.lesson_2.lessoncode;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Variables {

    public static void main(String[] args) {
        int age = 27;
        System.out.println(age);
        boolean tired = false;
        System.out.println(tired);

        String userName = "ruslans.t";
//        System.out.println(userName);

        String stringConcatExample = age + " " + tired + " " + userName;
/*
        System.out.print ln();
        System.out.print ln();
        System.out.print ln();
        System.out.print ln();
        System.out.print ln();
        System.out.print ln();
        System.out.print ln();
        System.out.print ln();
        System.ou t.println();
        */
        System.out.println(stringConcatExample);

        float weight = 55.4f;
        double price = 70.1;
        double sumResult = weight + price;
        double secondSumResult = price + price;

        System.out.println(sumResult);
        System.out.println(secondSumResult);

        BigDecimal bigDecimalPrice = new BigDecimal("125.5000015258789").setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(bigDecimalPrice);

        char a = 'a';
        //плохое название переменной - не несет смысловой нагрузки
        char b = 66; //ASCII - B
        System.out.println(a);
        System.out.println(b);

        System.out.println("Hello");

        System.out.print("A\n");
        System.out.print("A");
        System.out.print("A");
        System.out.print("A");
        System.out.println("A");
        System.out.println("A");
    }
}
