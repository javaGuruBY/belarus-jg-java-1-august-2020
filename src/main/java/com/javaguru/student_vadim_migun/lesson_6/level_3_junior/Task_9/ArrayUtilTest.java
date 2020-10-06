package com.javaguru.student_vadim_migun.lesson_6.level_3_junior.Task_9;

import java.util.Arrays;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.findTheNumberTrue();
        test.findTheNumberFalse();

    }

    ArrayUtil array = new ArrayUtil();


    void findTheNumberTrue() {

        boolean expected = true;
        boolean actual = array.findTheNumber(5, 3);
        if (actual) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }

    }
    void findTheNumberFalse() {

        boolean expected = false;
        boolean actual = array.findTheNumber(5, 6);
        if (!actual) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }

    }
}

