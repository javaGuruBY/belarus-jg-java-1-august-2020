package com.javaguru.student_vadim_migun.lesson_5.level_5_middle;
/*
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
метода int[] createArray(int arrayLength)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
    }

}
 */

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();

    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] expected = new int[5];
        int [] actual = arrayUtil.createArray(5);
        if (expected.length == actual.length) {
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - Fail");
        }
    }

}
