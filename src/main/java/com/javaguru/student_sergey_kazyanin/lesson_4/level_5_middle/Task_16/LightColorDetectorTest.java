package com.javaguru.student_sergey_kazyanin.lesson_4.level_5_middle.Task_16;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleLightTest();

    }

    public void violetTest() {
        int color = 449;
        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(color);
        String expectedResult = "Violet";
        printTestResult(actualResult, expectedResult, "Violet color");
    }

    public void blueTest() {
        int color = 494;
        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(color);
        String expectedResult = "Blue";
        printTestResult(actualResult, expectedResult, "Blue color");
    }

    public void greenTest() {
        int color = 569;
        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(color);
        String expectedResult = "Green";
        printTestResult(actualResult, expectedResult, "Green color");
    }

    public void yellowTest() {
        int color = 589;
        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(color);
        String expectedResult = "Yellow";
        printTestResult(actualResult, expectedResult, "Yellow color");
    }

    public void orangeTest() {
        int color = 619;
        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(color);
        String expectedResult = "Orange";
        printTestResult(actualResult, expectedResult, "Orange color");
    }

    public void redTest() {
        int color = 750;
        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(color);
        String expectedResult = "Red";
        printTestResult(actualResult, expectedResult, "Red color");
    }

    public void invisibleLightTest() {
        int color = 751;
        LightColorDetector lightColorDetector = new LightColorDetector();

        String actualResult = lightColorDetector.detect(color);
        String expectedResult = "Invisible Light";
        printTestResult(actualResult, expectedResult, "Invisible Light");
    }

    public void printTestResult(String actualResult, String expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " test = PASSED");
        } else {
            System.out.println(testName + " test = FAILURE!!! actualResult = " + actualResult + " | expectedResult = " + expectedResult);
        }
    }
}
