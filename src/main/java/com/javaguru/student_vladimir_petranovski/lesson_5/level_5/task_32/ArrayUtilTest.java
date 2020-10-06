package com.javaguru.student_vladimir_petranovski.lesson_5.level_5.task_32;
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
        int[] expected = new int[5];
        int[] actual = arrayUtil.createArray(5);
        if (expected.length == actual.length) {
            System.out.println("Test -- passed");
        } else {
            System.out.println("Test -- fail");
        }
    }
}
