package com.javaguru.student_vladimir_petranovski.lesson_4.level_7.super_task_4;

class LightColorDetectorTest {
    private LightColorDetector lightColorDetector = new LightColorDetector();
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
    }
    public void testViolet(int wavelength) {
        checkResults(lightColorDetector.detect(wavelength).equals("Violet"), "LightColorDetector test - Violet");
    }
    public void testBlue(int wavelength) {
        checkResults(lightColorDetector.detect(wavelength).equals("Blue"), "LightColorDetector test - Blue");
    }
    public void testGreen(int wavelength) {
        checkResults(lightColorDetector.detect(wavelength).equals("Green"), "LightColorDetector test - Green");
    }
    public void testYellow(int wavelength) {
        checkResults(lightColorDetector.detect(wavelength).equals("Yellow"), "LightColorDetector test - Yellow");
    }
    public void testOrange(int wavelength) {
        checkResults(lightColorDetector.detect(wavelength).equals("Orange"), "LightColorDetector test - Orange");
    }
    public void testRed(int wavelength) {
        checkResults(lightColorDetector.detect(wavelength).equals("Red"), "LightColorDetector test - Red");
    }
    public void testInvisible(int wavelength) {
        checkResults(lightColorDetector.detect(wavelength).equals("Invisible Light"), "LightColorDetector test - Invisible Light ");
    }
    public void checkResults(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " = OK");
        }else {
            System.out.println(testName + " = Fail");
        }
    }
}
