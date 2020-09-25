package com.javaguru.student_vladimir_petranovski.lesson_6.level_4.task_18;

class TwoDimensionalArrayTest {

    private final TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

    public static void main(String[] args) {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.sumAllNumbersArrayTestOne();
        twoDimensionalArrayTest.sumAllNumbersArrayTestTwo();
        twoDimensionalArrayTest.sumAllNumbersArrayTestThree();
    }

    public void sumAllNumbersArrayTestOne() {
        int[][] twoArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int expectedSum = 45;
        int actualSum = twoDimensionalArray.sumAllNumbersArray(twoArray);
        checkResult(expectedSum == actualSum, "sumAllNumbersArrayTestOne");
    }

    public void sumAllNumbersArrayTestTwo() {
        int[][] twoArray = {{4, 2, 3}, {7, 5, 6}, {10, 8, 9}};
        int expectedSum = 54;
        int actualSum = twoDimensionalArray.sumAllNumbersArray(twoArray);
        checkResult(expectedSum == actualSum, "sumAllNumbersArrayTestTwo");
    }

    public void sumAllNumbersArrayTestThree() {
        int[][] twoArray = {{-11, 2, -1}, {4, -3, 6}, {7, 10, 9}};
        int expectedSum = 23;
        int actualSum = twoDimensionalArray.sumAllNumbersArray(twoArray);
        checkResult(expectedSum == actualSum, "sumAllNumbersArrayTestThree");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = Ok");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
